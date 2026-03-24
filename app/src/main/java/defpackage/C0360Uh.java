package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.webkit.WebView;
import androidx.fragment.app.u;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;

/* renamed from: Uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0360Uh implements InterfaceC0151Ic, InterfaceC2892jb, XM, Ou, InterfaceC0464a8, SuccessContinuation, InterfaceC2605eF, InterfaceC0209Lj, InterfaceC0192Kj, InterfaceC2612eM, InterfaceC2574dk, InterfaceC3514ux, Uz {
    public static final C0360Uh b = new C0360Uh(1);
    public static final /* synthetic */ C0360Uh c = new C0360Uh(2);
    public static final C0360Uh d = new C0360Uh(3);
    public static final String[] e = new String[0];
    public static final C0360Uh f = new C0360Uh(5);
    public static final C0360Uh m = new C0360Uh(6);
    public static final C0360Uh n = new C0360Uh(7);
    public final /* synthetic */ int a;

    public /* synthetic */ C0360Uh(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(defpackage.C0360Uh r5, java.util.List r6, defpackage.C0323Se r7, defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof defpackage.C0204Le
            if (r0 == 0) goto L16
            r0 = r8
            Le r0 = (defpackage.C0204Le) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            Le r0 = new Le
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r5 = r0.c
            Sc r8 = defpackage.EnumC0321Sc.a
            int r1 = r0.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.util.Iterator r6 = r0.b
            java.io.Serializable r7 = r0.a
            OB r7 = (defpackage.OB) r7
            defpackage.AbstractC0115Ga.U(r5)     // Catch: java.lang.Throwable -> L33
            goto L69
        L33:
            r5 = move-exception
            goto L82
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.Serializable r6 = r0.a
            java.util.List r6 = (java.util.List) r6
            defpackage.AbstractC0115Ga.U(r5)
            goto L5f
        L45:
            defpackage.AbstractC0115Ga.U(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            Ne r1 = new Ne
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.a = r5
            r0.e = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r8) goto L5e
            goto L97
        L5e:
            r6 = r5
        L5f:
            OB r5 = new OB
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L69:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r6.next()
            en r5 = (defpackage.InterfaceC2631en) r5
            r0.a = r7     // Catch: java.lang.Throwable -> L33
            r0.b = r6     // Catch: java.lang.Throwable -> L33
            r0.e = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L33
            if (r5 != r8) goto L69
            goto L97
        L82:
            java.lang.Object r1 = r7.a
            if (r1 != 0) goto L89
            r7.a = r5
            goto L69
        L89:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.MO.a(r1, r5)
            goto L69
        L8f:
            java.lang.Object r5 = r7.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L98
            DK r8 = defpackage.DK.a
        L97:
            return r8
        L98:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0360Uh.o(Uh, java.util.List, Se, uc):java.lang.Object");
    }

    public static T5 p(C0360Uh c0360Uh, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c0360Uh.getClass();
        S5 s5 = new S5();
        s5.a = str;
        s5.b = i;
        byte b2 = (byte) (s5.e | 1);
        s5.c = i2;
        s5.d = false;
        s5.e = (byte) (((byte) (b2 | 2)) | 4);
        return s5.a();
    }

    public static XE u(C0360Uh c0360Uh) {
        C3130nt c3130nt = new C3130nt(8);
        WE we = new WE(true, false, false);
        c0360Uh.getClass();
        return new XE(System.currentTimeMillis() + 3600000, c3130nt, we, 10.0d, 1.2d, 60);
    }

    public static ArrayList v(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC0500aq.m(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C0055Ci.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC3491ua.Z(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            S5 s5 = new S5();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            s5.a = str2;
            s5.b = runningAppProcessInfo.pid;
            byte b2 = (byte) (s5.e | 1);
            s5.c = runningAppProcessInfo.importance;
            s5.e = (byte) (b2 | 2);
            s5.d = AbstractC0500aq.b(str2, str);
            s5.e = (byte) (s5.e | 4);
            arrayList3.add(s5.a());
        }
        return arrayList3;
    }

    public static Path x(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[EDGE_INSN: B:91:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089, LOOP_LABEL: LOOP:2: B:49:0x0072->B:60:0x0089], EDGE_INSN: B:94:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0360Uh.y(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public void A(String str, Exception exc) {
        if (r(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM b(Class cls) {
        switch (this.a) {
            case 18:
                return new u(true);
            default:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    @Override // defpackage.XM
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        Object objG = c2811i1.g(new KA(B7.class, Executor.class));
        AbstractC0500aq.l(objG, "get(...)");
        return new C3010lj((Executor) objG);
    }

    @Override // defpackage.InterfaceC2574dk
    public String e() {
        return null;
    }

    @Override // defpackage.InterfaceC0464a8
    public byte[] f(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM g(Class cls, Pv pv) {
        switch (this.a) {
            case 18:
                return b(cls);
            default:
                b(cls);
                throw null;
        }
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        switch (this.a) {
            case 15:
                return Integer.valueOf(RD.d);
            default:
                return C2884jL.a;
        }
    }

    @Override // defpackage.XM
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.XM
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM k(R9 r9, Pv pv) {
        switch (this.a) {
            case 18:
                return g(AbstractC0115Ga.y(r9), pv);
            default:
                return new AD();
        }
    }

    @Override // defpackage.XM
    public String[] l() {
        return e;
    }

    @Override // defpackage.InterfaceC2605eF
    public XE m(C0360Uh c0360Uh, JSONObject jSONObject) {
        return u(c0360Uh);
    }

    @Override // defpackage.Ou
    public boolean q(MenuC3511uu menuC3511uu) {
        return false;
    }

    public boolean r(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void s(InterfaceC0157Ii interfaceC0157Ii) {
        C2977l4 c2977l4 = C2977l4.a;
        C0386Vq c0386Vq = (C0386Vq) interfaceC0157Ii;
        c0386Vq.a(AbstractC3525v7.class, c2977l4);
        c0386Vq.a(C3253q5.class, c2977l4);
        C3360s4 c3360s4 = C3360s4.a;
        c0386Vq.a(AbstractC2965kt.class, c3360s4);
        c0386Vq.a(C3416t6.class, c3360s4);
        C3032m4 c3032m4 = C3032m4.a;
        c0386Vq.a(AbstractC0593ca.class, c3032m4);
        c0386Vq.a(C3307r5.class, c3032m4);
        C2922k4 c2922k4 = C2922k4.a;
        c0386Vq.a(B1.class, c2922k4);
        c0386Vq.a(C3143o5.class, c2922k4);
        C3306r4 c3306r4 = C3306r4.a;
        c0386Vq.a(AbstractC2747gt.class, c3306r4);
        c0386Vq.a(C3362s6.class, c3306r4);
        C3087n4 c3087n4 = C3087n4.a;
        c0386Vq.a(AbstractC0268Pa.class, c3087n4);
        c0386Vq.a(C3361s5.class, c3087n4);
        C3252q4 c3252q4 = C3252q4.a;
        c0386Vq.a(AbstractC3716yj.class, c3252q4);
        c0386Vq.a(C2979l6.class, c3252q4);
        C3197p4 c3197p4 = C3197p4.a;
        c0386Vq.a(AbstractC3662xj.class, c3197p4);
        c0386Vq.a(C2924k6.class, c3197p4);
        C3414t4 c3414t4 = C3414t4.a;
        c0386Vq.a(AbstractC2858iw.class, c3414t4);
        c0386Vq.a(C3524v6.class, c3414t4);
        C3142o4 c3142o4 = C3142o4.a;
        c0386Vq.a(AbstractC3285qj.class, c3142o4);
        c0386Vq.a(C2869j6.class, c3142o4);
    }

    public void t(String str) {
        if (r(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public AbstractC3764zd w(Context context) {
        Object next;
        String processName;
        AbstractC0500aq.m(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = v(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((T5) ((AbstractC3764zd) next)).b == iMyPid) {
                break;
            }
        }
        AbstractC3764zd abstractC3764zd = (AbstractC3764zd) next;
        if (abstractC3764zd != null) {
            return abstractC3764zd;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
            AbstractC0500aq.j(processName);
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return p(this, processName, iMyPid, 0, 12);
    }

    public void z(String str) {
        if (r(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public C0360Uh(AbstractC3238pr abstractC3238pr, AbstractC3238pr abstractC3238pr2) {
        this.a = 10;
        abstractC3238pr.getClass();
        abstractC3238pr2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.InterfaceC2574dk
    public void c() {
    }

    @Override // defpackage.InterfaceC3514ux
    public void h() {
    }

    @Override // defpackage.Uz
    public void i() {
    }

    @Override // defpackage.Ou
    public void a(MenuC3511uu menuC3511uu, boolean z) {
    }

    @Override // defpackage.Uz
    public void j(int i, Object obj) {
    }

    @Override // defpackage.InterfaceC2574dk
    public void n(long j, String str) {
    }
}
