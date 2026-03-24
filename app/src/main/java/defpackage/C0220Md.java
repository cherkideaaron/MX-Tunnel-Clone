package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: Md, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0220Md implements LJ, InterfaceC2892jb, Continuation, OnFailureListener, InterfaceC0429Yi, InterfaceC3062mg, InterfaceC2658fD {
    public final /* synthetic */ int a;

    public /* synthetic */ C0220Md(int i) {
        this.a = i;
    }

    private final void c(InterfaceC3258qA interfaceC3258qA) {
    }

    public String a(Context context) {
        switch (this.a) {
            case 15:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 16:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return (applicationInfo2 == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo2.minSdkVersion);
            case 17:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // defpackage.LJ, defpackage.InterfaceC2658fD
    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                C3712yf.b.getClass();
                return C0237Nd.a.s((AbstractC0186Kd) obj).getBytes(Charset.forName("UTF-8"));
            case 25:
                C2584dv c2584dv = (C2584dv) obj;
                c2584dv.getClass();
                D3 d3 = AbstractC2655fA.a;
                d3.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    d3.r(c2584dv, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 28:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        D3 d3A = J6.a();
                        d3A.S(cursorRawQuery.getString(1));
                        d3A.T(Dz.b(cursorRawQuery.getInt(2)));
                        String string = cursorRawQuery.getString(3);
                        d3A.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(d3A.h());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }

    @Override // defpackage.InterfaceC3062mg
    public void b(InterfaceC3258qA interfaceC3258qA) {
        switch (this.a) {
            case 26:
                return;
            default:
                Vs.u(interfaceC3258qA.get());
                throw null;
        }
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        switch (this.a) {
            case 7:
                Set setA = c2811i1.A(C3254q6.class);
                C0607co c0607co = C0607co.b;
                if (c0607co == null) {
                    synchronized (C0607co.class) {
                        try {
                            c0607co = C0607co.b;
                            if (c0607co == null) {
                                c0607co = new C0607co(0);
                                C0607co.b = c0607co;
                            }
                        } finally {
                        }
                    }
                }
                return new C3007lg(setA, c0607co);
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 12:
                C3562vr c3562vr = ExecutorsRegistrar.a;
                return EnumC3484uK.a;
            case 20:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c2811i1);
            case 22:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c2811i1);
            case ConnectionResult.API_DISABLED /* 23 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c2811i1);
            default:
                return FirestoreRegistrar.lambda$getComponents$0(c2811i1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(android.util.JsonReader r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0220Md.e(android.util.JsonReader):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 13:
                return 403;
            default:
                return -1;
        }
    }
}
