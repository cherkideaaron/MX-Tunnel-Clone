package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3663xk {
    public static final Object k = new Object();
    public static final Z3 l = new Z3(0);
    public final Context a;
    public final String b;
    public final C0346Tk c;
    public final C3112nb d;
    public final C3562vr g;
    public final InterfaceC3258qA h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca A[LOOP:0: B:24:0x00c4->B:26:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3663xk(android.content.Context r9, java.lang.String r10, defpackage.C0346Tk r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3663xk.<init>(android.content.Context, java.lang.String, Tk):void");
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((S3) l.values()).iterator();
                while (it.hasNext()) {
                    C3663xk c3663xk = (C3663xk) it.next();
                    c3663xk.a();
                    arrayList.add(c3663xk.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static C3663xk d() {
        C3663xk c3663xk;
        synchronized (k) {
            try {
                c3663xk = (C3663xk) l.get("[DEFAULT]");
                if (c3663xk == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0256Of) c3663xk.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3663xk;
    }

    public static C3663xk e(String str) {
        C3663xk c3663xk;
        String str2;
        synchronized (k) {
            try {
                c3663xk = (C3663xk) l.get(str.trim());
                if (c3663xk == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((C0256Of) c3663xk.h.get()).b();
            } finally {
            }
        }
        return c3663xk;
    }

    public static C3663xk h(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                C0346Tk c0346TkA = C0346Tk.a(context);
                if (c0346TkA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, c0346TkA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3663xk i(Context context, C0346Tk c0346Tk) {
        C3663xk c3663xk;
        AtomicReference atomicReference = C3555vk.a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C3555vk.a;
            if (atomicReference2.get() == null) {
                C3555vk c3555vk = new C3555vk();
                while (true) {
                    if (atomicReference2.compareAndSet(null, c3555vk)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c3555vk);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Z3 z3 = l;
            Preconditions.checkState(!z3.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c3663xk = new C3663xk(context, "[DEFAULT]", c0346Tk);
            z3.put("[DEFAULT]", c3663xk);
        }
        c3663xk.g();
        return c3663xk;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3663xk)) {
            return false;
        }
        C3663xk c3663xk = (C3663xk) obj;
        c3663xk.a();
        return this.b.equals(c3663xk.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? AbstractC3600wb.g(this.a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = C3609wk.b;
            if (atomicReference.get() == null) {
                C3609wk c3609wk = new C3609wk(context);
                while (!atomicReference.compareAndSet(null, c3609wk)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(c3609wk, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        C3112nb c3112nb = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) c3112nb.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (c3112nb) {
                    map = new HashMap((HashMap) c3112nb.a);
                }
                c3112nb.d(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C0256Of) this.h.get()).b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        C0119Ge c0119Ge = (C0119Ge) this.g.get();
        synchronized (c0119Ge) {
            z = c0119Ge.a;
        }
        return z;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.b).add("options", this.c).toString();
    }
}
