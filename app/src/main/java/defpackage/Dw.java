package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.achartengine.ChartFactory;

/* loaded from: classes.dex */
public final class Dw {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public Ew l;
    public Bundle n;
    public String q;
    public final boolean r;
    public final Notification s;
    public final ArrayList t;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public Dw(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
        this.r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        KJ kj = new KJ();
        new ArrayList();
        kj.d = new Bundle();
        kj.c = this;
        Context context = this.a;
        kj.a = context;
        kj.b = Build.VERSION.SDK_INT >= 26 ? U1.a(context, this.q) : new Notification.Builder(this.a);
        Notification notification = this.s;
        int i3 = 0;
        ((Notification.Builder) kj.b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0).setNumber(this.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) kj.b;
        IconCompat iconCompat = this.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) kj.b).setSubText(null).setUsesChronometer(false).setPriority(this.j);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            C3675xw c3675xw = (C3675xw) it.next();
            int i4 = Build.VERSION.SDK_INT;
            if (c3675xw.b == null && (i2 = c3675xw.e) != 0) {
                c3675xw.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = c3675xw.b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(null) : null, c3675xw.f, c3675xw.g);
            Bundle bundle2 = c3675xw.a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z = c3675xw.c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            if (i4 >= 24) {
                AbstractC3600wb.h(builder2, z);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i4 >= 28) {
                AbstractC2897jg.o(builder2);
            }
            if (i4 >= 29) {
                N3.g(builder2);
            }
            if (i4 >= 31) {
                Fw.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c3675xw.d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) kj.b).addAction(builder2.build());
        }
        Bundle bundle4 = this.n;
        if (bundle4 != null) {
            ((Bundle) kj.d).putAll(bundle4);
        }
        int i5 = Build.VERSION.SDK_INT;
        ((Notification.Builder) kj.b).setShowWhen(this.k);
        ((Notification.Builder) kj.b).setLocalOnly(this.m);
        ((Notification.Builder) kj.b).setGroup(null);
        ((Notification.Builder) kj.b).setSortKey(null);
        ((Notification.Builder) kj.b).setGroupSummary(false);
        ((Notification.Builder) kj.b).setCategory(null);
        ((Notification.Builder) kj.b).setColor(this.o);
        ((Notification.Builder) kj.b).setVisibility(this.p);
        ((Notification.Builder) kj.b).setPublicVersion(null);
        ((Notification.Builder) kj.b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.t;
        ArrayList arrayList3 = this.c;
        if (i5 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    Vs.u(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C0569c4 c0569c4 = new C0569c4(arrayList2.size() + arrayList.size());
                    c0569c4.addAll(arrayList);
                    c0569c4.addAll(arrayList2);
                    arrayList2 = new ArrayList(c0569c4);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) kj.b).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.d;
        if (arrayList4.size() > 0) {
            if (this.n == null) {
                this.n = new Bundle();
            }
            Bundle bundle5 = this.n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList4.size()) {
                String string = Integer.toString(i6);
                C3675xw c3675xw2 = (C3675xw) arrayList4.get(i6);
                Bundle bundle8 = new Bundle();
                if (c3675xw2.b == null && (i = c3675xw2.e) != 0) {
                    c3675xw2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c3675xw2.b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i3);
                bundle8.putCharSequence(ChartFactory.TITLE, c3675xw2.f);
                bundle8.putParcelable("actionIntent", c3675xw2.g);
                Bundle bundle9 = c3675xw2.a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c3675xw2.c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c3675xw2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i6++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.n == null) {
                this.n = new Bundle();
            }
            this.n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) kj.d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            ((Notification.Builder) kj.b).setExtras(this.n);
            AbstractC3600wb.i((Notification.Builder) kj.b);
        }
        if (i7 >= 26) {
            U1.i((Notification.Builder) kj.b);
            U1.o((Notification.Builder) kj.b);
            U1.p((Notification.Builder) kj.b);
            U1.q((Notification.Builder) kj.b);
            U1.k((Notification.Builder) kj.b);
            if (!TextUtils.isEmpty(this.q)) {
                ((Notification.Builder) kj.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                Vs.u(it4.next());
                throw null;
            }
        }
        if (i7 >= 29) {
            N3.e((Notification.Builder) kj.b, this.r);
            N3.f((Notification.Builder) kj.b);
        }
        Dw dw = (Dw) kj.c;
        Ew ew = dw.l;
        if (ew != null) {
            ew.b(kj);
        }
        int i8 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) kj.b;
        if (i8 < 26 && i8 < 24) {
            builder3.setExtras((Bundle) kj.d);
        }
        Notification notificationBuild = builder3.build();
        if (ew != null) {
            dw.l.getClass();
        }
        if (ew != null && (bundle = notificationBuild.extras) != null) {
            ew.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(boolean z) {
        Notification notification = this.s;
        notification.flags = z ? notification.flags | 16 : notification.flags & (-17);
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(Ew ew) {
        if (this.l != ew) {
            this.l = ew;
            if (((Dw) ew.a) != this) {
                ew.a = this;
                e(ew);
            }
        }
    }
}
