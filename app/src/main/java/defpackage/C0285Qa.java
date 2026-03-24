package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mxtunnel.pro.R;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import rased.vpn.app.activities.OpenVPNClient;
import xyz.hasnat.sweettoast.SweetToast;

/* renamed from: Qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0285Qa implements InterfaceC2892jb, InterfaceC3062mg, Continuation, LJ, N0, InterfaceC2658fD, InterfaceC0474aI, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0285Qa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(C2827iH c2827iH, int i, Bundle bundle) {
        InterfaceC2948kc c0607co;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC0079Dp) c2827iH.b).b();
                Parcelable parcelable = (Parcelable) ((InterfaceC0079Dp) c2827iH.b).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription description = ((InterfaceC0079Dp) c2827iH.b).getDescription();
        InterfaceC0079Dp interfaceC0079Dp = (InterfaceC0079Dp) c2827iH.b;
        ClipData clipData = new ClipData(description, new ClipData.Item(interfaceC0079Dp.a()));
        if (i2 >= 31) {
            c0607co = new C0607co(clipData, 2);
        } else {
            C3003lc c3003lc = new C3003lc();
            c3003lc.b = clipData;
            c3003lc.c = 2;
            c0607co = c3003lc;
        }
        c0607co.h(interfaceC0079Dp.c());
        c0607co.setExtras(bundle);
        return UL.h((View) this.b, c0607co.build()) == null;
    }

    @Override // defpackage.LJ, defpackage.InterfaceC2658fD
    public Object apply(Object obj) throws IOException {
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                GE ge = (GE) obj;
                ((C0395Wi) obj2).getClass();
                String strS = HE.b.s(ge);
                AbstractC0500aq.l(strS, "encode(...)");
                ge.getClass();
                EnumC2792hj enumC2792hj = EnumC2792hj.b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strS.getBytes(AbstractC3202p9.a);
                AbstractC0500aq.l(bytes, "getBytes(...)");
                return bytes;
            default:
                Cursor cursor = (Cursor) obj;
                C2768hD c2768hD = (C2768hD) obj2;
                c2768hD.getClass();
                while (cursor.moveToNext()) {
                    c2768hD.f(cursor.getInt(0), EnumC2802ht.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
        }
    }

    @Override // defpackage.InterfaceC3062mg
    public void b(InterfaceC3258qA interfaceC3258qA) {
        C2949kd c2949kd = (C2949kd) this.b;
        c2949kd.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        c2949kd.b.set((C2949kd) interfaceC3258qA.get());
    }

    @Override // defpackage.N0
    public void c(Object obj) {
        String str = OpenVPNClient.Y0;
        OpenVPNClient openVPNClient = (OpenVPNClient) this.b;
        openVPNClient.getClass();
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        SweetToast.info(openVPNClient.getApplicationContext(), openVPNClient.getString(R.string.notif_msg));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:121|(7:123|(2:125|(1:127))|128|140|(0)|143|147)|129|130|170|131|(1:133)|134|147) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05e5, code lost:
    
        android.util.Log.e(r1, "Crashlytics was not started due to an exception during initialization", r0);
        r2.g = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x058d A[Catch: Exception -> 0x05c5, TryCatch #0 {Exception -> 0x05c5, blocks: (B:116:0x0501, B:118:0x055e, B:119:0x0563, B:121:0x058d, B:123:0x0597, B:125:0x05a5), top: B:164:0x0501 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0663  */
    @Override // defpackage.InterfaceC2892jb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(defpackage.C2811i1 r52) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0285Qa.d(i1):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0474aI
    public Object e() {
        SQLiteDatabase sQLiteDatabaseA;
        Object obj = this.b;
        switch (this.a) {
            case 13:
                C2768hD c2768hD = (C2768hD) ((InterfaceC0484aa) obj);
                c2768hD.getClass();
                int i = C2564da.e;
                C3532vE c3532vE = new C3532vE(2);
                HashMap map = new HashMap();
                sQLiteDatabaseA = c2768hD.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    C2564da c2564da = (C2564da) C2768hD.i(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0271Pd(c2768hD, map, c3532vE, 6));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return c2564da;
                } finally {
                }
            case 14:
                C2768hD c2768hD2 = (C2768hD) ((InterfaceC2682fj) obj);
                long jA = c2768hD2.b.a() - c2768hD2.d.d;
                sQLiteDatabaseA = c2768hD2.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    C2768hD.i(sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C0285Qa(c2768hD2, 10));
                    int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 15:
                C2768hD c2768hD3 = (C2768hD) ((UK) obj).i;
                sQLiteDatabaseA = c2768hD3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c2768hD3.b.a()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                C0535bO c0535bO = (C0535bO) obj;
                Iterator it = ((Iterable) ((C2768hD) c0535bO.b).c(new C0220Md(28))).iterator();
                while (it.hasNext()) {
                    c0535bO.c.a((J6) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 17:
                KM.a((Intent) this.b);
                break;
            case 18:
                ((NN) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        boolean z;
        switch (this.a) {
            case 3:
                return (Task) ((Callable) this.b).call();
            case 4:
                ((Runnable) this.b).run();
                return Tasks.forResult(null);
            case 6:
                ((H2) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 11:
                ((H2) this.b).getClass();
                if (task.isSuccessful()) {
                    C3523v5 c3523v5 = (C3523v5) task.getResult();
                    C0360Uh c0360Uh = C0360Uh.f;
                    c0360Uh.t("Crashlytics report successfully enqueued to DataTransport: " + c3523v5.b);
                    File file = c3523v5.c;
                    if (file.delete()) {
                        c0360Uh.t("Deleted report file: " + file.getPath());
                    } else {
                        c0360Uh.A("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((CountDownLatch) this.b).countDown();
                return null;
        }
    }
}
