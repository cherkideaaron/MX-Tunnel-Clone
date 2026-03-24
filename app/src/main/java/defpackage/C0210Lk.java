package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0210Lk implements InterfaceC0227Mk {
    public static final Object m = new Object();
    public final C3663xk a;
    public final C0176Jk b;
    public final C3178om c;
    public final C2776hL d;
    public final C3562vr e;
    public final C2766hB f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public C0210Lk(C3663xk c3663xk, InterfaceC3258qA interfaceC3258qA, ExecutorService executorService, ExecutorC3152oE executorC3152oE) {
        c3663xk.a();
        C0176Jk c0176Jk = new C0176Jk(c3663xk.a, interfaceC3258qA);
        C3178om c3178om = new C3178om(c3663xk, 7);
        if (C3397so.n == null) {
            C3397so.n = new C3397so(27);
        }
        C3397so c3397so = C3397so.n;
        if (C2776hL.d == null) {
            C2776hL.d = new C2776hL(c3397so);
        }
        C2776hL c2776hL = C2776hL.d;
        C3562vr c3562vr = new C3562vr(new C2839ib(c3663xk, 2));
        C2766hB c2766hB = new C2766hB();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = c3663xk;
        this.b = c0176Jk;
        this.c = c3178om;
        this.d = c2776hL;
        this.e = c3562vr;
        this.f = c2766hB;
        this.h = executorService;
        this.i = executorC3152oE;
    }

    public final void a(InterfaceC2553dH interfaceC2553dH) {
        synchronized (this.g) {
            this.l.add(interfaceC2553dH);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        C3686y6 c3686y6J;
        synchronized (m) {
            try {
                C3663xk c3663xk = this.a;
                c3663xk.a();
                R2 r2J = R2.j(c3663xk.a);
                try {
                    c3686y6J = this.c.J();
                    int i = c3686y6J.b;
                    if (i == 2 || i == 1) {
                        String strH = h(c3686y6J);
                        C3178om c3178om = this.c;
                        C3632x6 c3632x6A = c3686y6J.a();
                        c3632x6A.a = strH;
                        c3632x6A.b(3);
                        c3686y6J = c3632x6A.a();
                        c3178om.B(c3686y6J);
                    }
                    if (r2J != null) {
                        r2J.C();
                    }
                } catch (Throwable th) {
                    if (r2J != null) {
                        r2J.C();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            C3632x6 c3632x6A2 = c3686y6J.a();
            c3632x6A2.c = null;
            c3686y6J = c3632x6A2.a();
        }
        k(c3686y6J);
        this.i.execute(new RunnableC0193Kk(this, z));
    }

    public final C3686y6 c(C3686y6 c3686y6) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        I6 i6;
        I6 i6F;
        C3663xk c3663xk = this.a;
        c3663xk.a();
        String str = c3663xk.c.a;
        c3663xk.a();
        String str2 = c3663xk.c.g;
        String str3 = c3686y6.d;
        C0176Jk c0176Jk = this.b;
        C3260qC c3260qC = c0176Jk.c;
        if (!c3260qC.b()) {
            throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C0176Jk.a("projects/" + str2 + "/installations/" + c3686y6.a + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = c0176Jk.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    C0176Jk.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    c3260qC.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = httpURLConnectionC;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    i6F = C0176Jk.f(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    C0176Jk.b(httpURLConnectionC, null, str, str2);
                    httpURLConnection = httpURLConnectionC;
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        i6 = new I6(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i6F = i6;
                    } else {
                        if (responseCode == 429) {
                            throw new C0244Nk("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            i6 = new I6(null, 0L, 2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i6F = i6;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int iA = AbstractC3264qG.A(i6F.c);
                if (iA != 0) {
                    if (iA == 1) {
                        C3632x6 c3632x6A = c3686y6.a();
                        c3632x6A.g = "BAD CONFIG";
                        c3632x6A.b(5);
                        return c3632x6A.a();
                    }
                    if (iA != 2) {
                        throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    l(null);
                    C3632x6 c3632x6A2 = c3686y6.a();
                    c3632x6A2.b(2);
                    return c3632x6A2.a();
                }
                C2776hL c2776hL = this.d;
                c2776hL.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c2776hL.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C3632x6 c3632x6A3 = c3686y6.a();
                c3632x6A3.c = i6F.a;
                c3632x6A3.e = i6F.b;
                byte b = (byte) (c3632x6A3.h | 1);
                c3632x6A3.f = seconds;
                c3632x6A3.h = (byte) (b | 2);
                return c3632x6A3.a();
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionC;
            }
        }
        throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new C0366Un(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new H0(this, 8));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new C0349Tn(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new RunnableC0193Kk(this, 0));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(C3686y6 c3686y6) {
        synchronized (m) {
            try {
                C3663xk c3663xk = this.a;
                c3663xk.a();
                R2 r2J = R2.j(c3663xk.a);
                try {
                    this.c.B(c3686y6);
                    if (r2J != null) {
                        r2J.C();
                    }
                } catch (Throwable th) {
                    if (r2J != null) {
                        r2J.C();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        C3663xk c3663xk = this.a;
        c3663xk.a();
        Preconditions.checkNotEmpty(c3663xk.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3663xk.a();
        Preconditions.checkNotEmpty(c3663xk.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3663xk.a();
        Preconditions.checkNotEmpty(c3663xk.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3663xk.a();
        String str = c3663xk.c.b;
        Pattern pattern = C2776hL.c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3663xk.a();
        Preconditions.checkArgument(C2776hL.c.matcher(c3663xk.c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(defpackage.C3686y6 r3) {
        /*
            r2 = this;
            xk r0 = r2.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            xk r0 = r2.a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
        L1e:
            r0 = 1
            int r3 = r3.b
            if (r3 != r0) goto L4f
            vr r3 = r2.e
            java.lang.Object r3 = r3.get()
            ep r3 = (defpackage.C2633ep) r3
            android.content.SharedPreferences r0 = r3.a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4d
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            goto L34
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4c
            hB r3 = r2.f
            r3.getClass()
            java.lang.String r1 = defpackage.C2766hB.a()
        L4c:
            return r1
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L4f:
            hB r3 = r2.f
            r3.getClass()
            java.lang.String r3 = defpackage.C2766hB.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0210Lk.h(y6):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [Jk] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o6] */
    public final C3686y6 i(C3686y6 c3686y6) throws C0244Nk {
        int responseCode;
        String str = c3686y6.a;
        int i = 0;
        String string = null;
        if (str != null && str.length() == 11) {
            C2633ep c2633ep = (C2633ep) this.e.get();
            synchronized (c2633ep.a) {
                try {
                    String[] strArr = C2633ep.c;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break;
                        }
                        String str2 = strArr[i2];
                        String string2 = c2633ep.a.getString("|T|" + c2633ep.b + "|" + str2, null);
                        if (string2 == null || string2.isEmpty()) {
                            i2++;
                        } else if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                    }
                } finally {
                }
            }
        }
        C0176Jk c0176Jk = this.b;
        C3663xk c3663xk = this.a;
        c3663xk.a();
        String str3 = c3663xk.c.a;
        String str4 = c3686y6.a;
        C3663xk c3663xk2 = this.a;
        c3663xk2.a();
        String str5 = c3663xk2.c.g;
        C3663xk c3663xk3 = this.a;
        c3663xk3.a();
        String str6 = c3663xk3.c.b;
        C3260qC c3260qC = c0176Jk.c;
        if (!c3260qC.b()) {
            throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C0176Jk.a("projects/" + str5 + "/installations");
        C3144o6 c3144o6 = c0176Jk;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c3144o6.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C0176Jk.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    c3260qC.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode < 200 || responseCode >= 300) {
                    try {
                        C0176Jk.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        c3144o6 = c3144o6;
                    }
                    if (responseCode == 429) {
                        throw new C0244Nk("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C3144o6 c3144o62 = new C3144o6(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c3144o6 = c3144o62;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        c3144o6 = c3144o6;
                    }
                } else {
                    C3144o6 c3144o6E = C0176Jk.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c3144o6 = c3144o6E;
                }
                int iA = AbstractC3264qG.A(c3144o6.e);
                if (iA != 0) {
                    if (iA != 1) {
                        throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C3632x6 c3632x6A = c3686y6.a();
                    c3632x6A.g = "BAD CONFIG";
                    c3632x6A.b(5);
                    return c3632x6A.a();
                }
                String str7 = c3144o6.b;
                String str8 = c3144o6.c;
                C2776hL c2776hL = this.d;
                c2776hL.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c2776hL.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                I6 i6 = c3144o6.d;
                String str9 = i6.a;
                long j = i6.b;
                C3632x6 c3632x6A2 = c3686y6.a();
                c3632x6A2.a = str7;
                c3632x6A2.b(4);
                c3632x6A2.c = str9;
                c3632x6A2.d = str8;
                c3632x6A2.e = j;
                byte b = (byte) (c3632x6A2.h | 1);
                c3632x6A2.f = seconds;
                c3632x6A2.h = (byte) (b | 2);
                return c3632x6A2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C0244Nk("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2553dH) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(C3686y6 c3686y6) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2553dH) it.next()).b(c3686y6)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(C3686y6 c3686y6, C3686y6 c3686y62) {
        if (this.k.size() != 0 && !TextUtils.equals(c3686y6.a, c3686y62.a)) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                Vs.u(it.next());
                throw null;
            }
        }
    }
}
