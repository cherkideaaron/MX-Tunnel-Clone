package rased.vpn.app.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.mxtunnel.pro.R;
import defpackage.AA;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3099nG;
import defpackage.B2;
import defpackage.BinderC3582wA;
import defpackage.C3430tK;
import defpackage.C3492ub;
import defpackage.C3690yA;
import defpackage.InterfaceC3154oG;
import defpackage.RunnableC2705g5;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Locale;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.service.vpn.TunnelManagerThread;
import rased.vpn.app.service.vpn.logger.ConnectionStatus;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class SocksDNSService extends Service implements SkStatus.StateListener {
    public static long q = 0;
    public static Thread r = null;
    public static TunnelManagerThread s = null;
    public static boolean t = false;
    public static InterfaceC3154oG u;
    public static final String v = SocksDNSService.class.getName().concat("::restartservicebroadcast");
    public static final String w = SocksDNSService.class.getName().concat("::stopservicebroadcast");
    public NotificationManager a;
    public Handler b;
    public ConnectivityManager c;
    public C3430tK e;
    public AA f;
    public C3492ub m;
    public String n;
    public final BinderC3582wA d = new BinderC3582wA(this, 1);
    public final C3690yA o = new C3690yA(1);
    public final B2 p = new B2(this, 4);

    public static PendingIntent b(Context context) {
        return PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) OpenVPNClient.class), 67108864);
    }

    public static String c() {
        long time = new Date().getTime();
        long j = q;
        long j2 = time - j;
        if (j == 0) {
            return "00:00:00";
        }
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf((j2 / 3600000) % 24), Long.valueOf((j2 / 60000) % 60), Long.valueOf((j2 / 1000) % 60));
    }

    public final void a() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel("openvpn_bg", getString(R.string.channel_name_background), 1);
        notificationChannel.setDescription(getString(R.string.channel_description_background));
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(R.color.primary_color);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("openvpn_newstat", getString(R.string.channel_name_status), 2);
        notificationChannel2.setDescription(getString(R.string.channel_description_status));
        notificationChannel2.enableLights(true);
        notificationChannel2.setLightColor(R.color.primary_color);
        notificationManager.createNotificationChannel(notificationChannel2);
        NotificationChannel notificationChannel3 = new NotificationChannel("openvpn_userreq", getString(R.string.channel_name_userreq), 1);
        notificationChannel3.setDescription(getString(R.string.channel_description_userreq));
        notificationChannel3.setLightColor(R.color.primary_color);
        notificationManager.createNotificationChannel(notificationChannel3);
    }

    public final void d() {
        String message;
        try {
            NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                message = "not connected";
            } else {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                String str = "";
                if (subtypeName == null) {
                    subtypeName = "";
                }
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo != null) {
                    str = extraInfo;
                }
                message = String.format("%2$s %4$s to %1$s %3$s", activeNetworkInfo.getTypeName(), activeNetworkInfo.getDetailedState(), str, subtypeName);
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        SkStatus.logInfo(message);
    }

    public final void e(String str, String str2, String str3, ConnectionStatus connectionStatus) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = AbstractC3099nG.a[connectionStatus.ordinal()] != 1 ? R.drawable.ic_connecting : R.drawable.ic_connected;
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && i2 < 28) {
            new Notification.Builder(this);
        } else {
            a();
            new Notification.Builder(this, "openvpn_newstat");
        }
        Notification.Builder ongoing = new Notification.Builder(this).setContentTitle(getString(R.string.app)).setOnlyAlertOnce(true).setOngoing(true);
        ongoing.setCategory("service");
        ongoing.setLocalOnly(true);
        int i3 = str3.equals("openvpn_bg") ? -2 : str3.equals("openvpn_userreq") ? 2 : 0;
        ongoing.setSmallIcon(i);
        if (SkStatus.getLastState().equals(SkStatus.SSH_CONNECTED)) {
            str = "Connected to " + this.m.e();
        }
        ongoing.setContentText(str);
        ongoing.setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) OpenVPNClient.class), 201326592));
        if (i3 != 0) {
            try {
                ongoing.getClass().getMethod("setPriority", Integer.TYPE).invoke(ongoing, Integer.valueOf(i3));
                ongoing.getClass().getMethod("setUsesChronometer", Boolean.TYPE).invoke(ongoing, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                SkStatus.logException(e);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ongoing.setChannelId(str3);
        }
        if (str2 != null && !str2.equals("")) {
            ongoing.setTicker(str2);
        }
        Notification notificationBuild = ongoing.build();
        int iHashCode = str3.hashCode();
        notificationManager.notify(iHashCode, notificationBuild);
        if (i4 >= 34) {
            startForeground(iHashCode, notificationBuild, 1073741824);
        } else {
            startForeground(iHashCode, notificationBuild);
        }
        String str4 = this.n;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.n.hashCode());
        }
        this.n = str3;
    }

    public final synchronized void f() {
        try {
            q = 0L;
            C3430tK c3430tK = this.e;
            if (c3430tK != null) {
                c3430tK.interrupt();
            }
            this.e = null;
            TunnelManagerThread tunnelManagerThread = s;
            if (tunnelManagerThread != null) {
                tunnelManagerThread.stopAll();
                d();
                Thread thread = r;
                if (thread != null) {
                    thread.interrupt();
                    SkStatus.logInfo(R.string.tunnel_stop, new Object[0]);
                }
                s = null;
                t = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        Log.i("SocksDNSService", "onCreate");
        super.onCreate();
        this.b = new Handler();
        this.c = (ConnectivityManager) getSystemService("connectivity");
        if (this.a == null) {
            this.a = (NotificationManager) getSystemService("notification");
        }
        this.m = C3492ub.c(this);
        AbstractC0500aq.i(getApplicationContext());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.i("SocksDNSService", "onDestroy");
        super.onDestroy();
        f();
        AA aa = this.f;
        if (aa != null) {
            aa.b = true;
        }
        try {
            unregisterReceiver(this.p);
        } catch (IllegalArgumentException unused) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.c.unregisterNetworkCallback(this.o);
            }
        } catch (IllegalArgumentException unused2) {
        }
        SkStatus.removeStateListener(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Log.i("SocksDNSService", "onStartCommand");
        if (Build.VERSION.SDK_INT >= 24) {
            this.c.registerDefaultNetworkCallback(this.o);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(w);
        intentFilter.addAction(v);
        AbstractC0115Ga.O(this, this.p, intentFilter);
        SkStatus.addStateListener(this);
        AA aa = new AA(1);
        aa.b = false;
        aa.c = 1000L;
        this.f = aa;
        new Thread(this.f, "Status Poller").start();
        if (intent != null && "com.mxtunnel.pro:startTunnel".equals(intent.getAction())) {
            return 2;
        }
        String string = getString(SkStatus.getLocalizedState(SkStatus.getLastState()));
        e(string, string, "openvpn_newstat", ConnectionStatus.LEVEL_START);
        new Thread(new RunnableC2705g5(this, 23)).start();
        return 2;
    }

    @Override // rased.vpn.app.service.vpn.logger.SkStatus.StateListener
    public final void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (r == null) {
            return;
        }
        String str3 = connectionStatus == ConnectionStatus.LEVEL_CONNECTED ? "openvpn_userreq" : "openvpn_newstat";
        String string = getString(SkStatus.getLocalizedState(SkStatus.getLastState()));
        e(string, string, str3, connectionStatus);
    }
}
