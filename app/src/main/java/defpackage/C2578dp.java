package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: dp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2578dp implements InterfaceC0164Ip {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final C3337ri a;
    public final Context b;
    public final String c;
    public final InterfaceC0227Mk d;
    public final C0102Fe e;
    public C3089n6 f;

    public C2578dp(Context context, String str, InterfaceC0227Mk interfaceC0227Mk, C0102Fe c0102Fe) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = interfaceC0227Mk;
        this.e = c0102Fe;
        this.a = new C3337ri();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final C0159Ik b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new C0322Sd(0, D3.i, C0339Td.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        InterfaceC0227Mk interfaceC0227Mk = this.d;
        if (z) {
            try {
                str = ((C3199p6) Tasks.await(((C0210Lk) interfaceC0227Mk).e(), 10000L, TimeUnit.MILLISECONDS)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((C0210Lk) interfaceC0227Mk).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new C0159Ik(str2, str);
    }

    public final synchronized C3089n6 c() {
        C3089n6 c3089n6;
        String str;
        C3089n6 c3089n62 = this.f;
        if (c3089n62 != null && (c3089n62.b != null || !this.e.a())) {
            return this.f;
        }
        C0360Uh c0360Uh = C0360Uh.f;
        c0360Uh.z("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c0360Uh.z("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            C0159Ik c0159IkB = b(false);
            c0360Uh.z("Fetched Firebase Installation ID: " + c0159IkB.a);
            if (c0159IkB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c0159IkB = new C0159Ik(str, null);
            }
            this.f = Objects.equals(c0159IkB.a, string) ? new C3089n6(sharedPreferences.getString("crashlytics.installation.id", null), c0159IkB.a, c0159IkB.b) : new C3089n6(a(sharedPreferences, c0159IkB.a), c0159IkB.a, c0159IkB.b);
        } else {
            if (string == null || !string.startsWith("SYN_")) {
                c3089n6 = new C3089n6(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
            } else {
                c3089n6 = new C3089n6(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
            }
            this.f = c3089n6;
        }
        c0360Uh.z("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        C3337ri c3337ri = this.a;
        Context context = this.b;
        synchronized (c3337ri) {
            try {
                if (c3337ri.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c3337ri.b = installerPackageName;
                }
                str = "".equals(c3337ri.b) ? null : c3337ri.b;
            } finally {
            }
        }
        return str;
    }
}
