package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Rk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0312Rk {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;

    public C0312Rk(C3429tJ c3429tJ, boolean z) {
        this.d = c3429tJ;
        this.c = new AtomicReference(null);
        this.a = z;
        this.b = new AtomicMarkableReference(new C3293qr(z ? 8192 : UserVerificationMethods.USER_VERIFY_ALL), false);
    }

    public synchronized void a() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolC = c();
            this.c = boolC;
            if (boolC == null) {
                C0220Md c0220Md = new C0220Md(21);
                C0378Vi c0378Vi = (C0378Vi) ((GH) this.b);
                c0378Vi.a(c0378Vi.c, c0220Md);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        Boolean bool;
        try {
            a();
            bool = (Boolean) this.c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.j();
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C3663xk c3663xk = ((FirebaseMessaging) this.d).a;
        c3663xk.a();
        Context context = c3663xk.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public C0312Rk(EM em) {
        this.a = false;
        this.b = null;
        this.c = null;
        this.d = em;
    }

    public C0312Rk(Context context, String str, N2 n2, boolean z) {
        this.b = context;
        this.c = str;
        this.d = n2;
        this.a = z;
    }

    public C0312Rk(FirebaseMessaging firebaseMessaging, GH gh) {
        this.d = firebaseMessaging;
        this.b = gh;
    }

    public C0312Rk(String str, C2653f8 c2653f8) {
        this.a = false;
        this.b = str;
        this.c = c2653f8;
        this.d = null;
    }
}
