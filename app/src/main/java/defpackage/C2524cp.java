package defpackage;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.l;
import androidx.fragment.app.t;
import androidx.fragment.app.x;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.activities.SplashActivity;

/* renamed from: cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2524cp implements InterfaceC3403su, InterfaceC2893jc, InterfaceC3251q3, Uw, InterfaceC3681y1, L7, InterfaceC3058mc, SuccessContinuation, InterfaceC0043Bn, N0, InterfaceC3514ux, OnCompleteListener, WebMessageListenerBoundaryInterface, XM {
    public static final C2611eL c = new C2611eL();
    public final /* synthetic */ int a;
    public Object b;

    public C2524cp(int i) {
        Handler handler;
        Handler handlerB;
        this.a = i;
        switch (i) {
            case 12:
                this.b = new ConcurrentHashMap(16);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerB = AbstractC2897jg.b(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handlerB = handler;
                        this.b = handlerB;
                        return;
                    } catch (InstantiationException e2) {
                        e = e2;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handlerB = handler;
                        this.b = handlerB;
                        return;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handlerB = handler;
                        this.b = handlerB;
                        return;
                    } catch (InvocationTargetException e4) {
                        Throwable cause = e4.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((Error) cause);
                    }
                    handlerB = handler;
                }
                this.b = handlerB;
                return;
        }
    }

    public static String v(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void A(int i, int i2) {
        ((C3221pa) this.b).O0(i, i2);
    }

    public void B(int i, int i2) {
        ((C3221pa) this.b).K0(i, i2);
    }

    public void C(int i, long j) {
        ((C3221pa) this.b).M0(i, j);
    }

    public void D(int i, float f) {
        C3221pa c3221pa = (C3221pa) this.b;
        c3221pa.getClass();
        c3221pa.K0(i, Float.floatToRawIntBits(f));
    }

    public void E(int i, Object obj, PD pd) {
        C3221pa c3221pa = (C3221pa) this.b;
        c3221pa.U0(i, 3);
        pd.b((AbstractC3733z) obj, c3221pa.j);
        c3221pa.U0(i, 4);
    }

    public void F(int i, int i2) {
        ((C3221pa) this.b).O0(i, i2);
    }

    public void G(int i, long j) {
        ((C3221pa) this.b).X0(i, j);
    }

    public void H(int i, Object obj, PD pd) {
        ((C3221pa) this.b).Q0(i, (AbstractC3733z) obj, pd);
    }

    public void I(int i, int i2) {
        ((C3221pa) this.b).K0(i, i2);
    }

    public void J(int i, long j) {
        ((C3221pa) this.b).M0(i, j);
    }

    public void K(int i, int i2) {
        ((C3221pa) this.b).V0(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void L(int i, long j) {
        ((C3221pa) this.b).X0(i, (j >> 63) ^ (j << 1));
    }

    public void M(int i, int i2) {
        ((C3221pa) this.b).V0(i, i2);
    }

    public void N(int i, long j) {
        ((C3221pa) this.b).X0(i, j);
    }

    @Override // defpackage.InterfaceC3058mc
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.InterfaceC0043Bn
    public Object apply() {
        return (V0) this.b;
    }

    @Override // defpackage.InterfaceC3403su
    public boolean b(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        switch (this.a) {
            case 2:
                D0 d0 = ((ActionMenuView) this.b).G;
                if (d0 == null || !((Toolbar) ((C0607co) d0).a).M.a(menuItem)) {
                }
                break;
            default:
                ((Toolbar) this.b).getClass();
                break;
        }
        return false;
    }

    @Override // defpackage.N0
    public void c(Object obj) {
        M0 m0 = (M0) obj;
        t tVar = (t) this.b;
        C3503um c3503um = (C3503um) tVar.C.pollFirst();
        if (c3503um == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        x xVar = tVar.c;
        String str = c3503um.a;
        l lVarC = xVar.c(str);
        if (lVarC != null) {
            lVarC.onActivityResult(c3503um.b, m0.a, m0.b);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // defpackage.XM
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // defpackage.L7
    public void d(C2731gd c2731gd) {
        this.b = c2731gd;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // defpackage.InterfaceC3681y1
    public void f(Bundle bundle, String str) {
        C2731gd c2731gd = (C2731gd) this.b;
        if (c2731gd != null) {
            try {
                String str2 = "$A$:" + v(bundle, str);
                C2841id c2841id = c2731gd.a;
                c2841id.getClass();
                ((ExecutorC0305Rd) c2841id.o.b).a(new RunnableC2786hd(c2841id, System.currentTimeMillis() - c2841id.d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // defpackage.InterfaceC3058mc
    public int g() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.XM
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getProfileStore());
    }

    @Override // defpackage.XM
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_ARRAY_BUFFER};
    }

    @Override // defpackage.InterfaceC3514ux
    public void h() {
        SplashActivity splashActivity = (SplashActivity) ((Ux) this.b).b;
        splashActivity.getClass();
        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) OpenVPNClient.class));
        splashActivity.finish();
    }

    @Override // defpackage.InterfaceC3058mc
    public ContentInfo i() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.Uw
    public AN j(View view, AN an) {
        int iA = an.a();
        AbstractC3309r7 abstractC3309r7 = (AbstractC3309r7) this.b;
        abstractC3309r7.m = iA;
        abstractC3309r7.n = an.b();
        abstractC3309r7.o = an.c();
        abstractC3309r7.f();
        return an;
    }

    @Override // defpackage.InterfaceC3403su
    public void k(MenuC3511uu menuC3511uu) {
        switch (this.a) {
            case 2:
                InterfaceC3403su interfaceC3403su = ((ActionMenuView) this.b).B;
                if (interfaceC3403su != null) {
                    interfaceC3403su.k(menuC3511uu);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                A0 a0 = toolbar.a.z;
                if (a0 == null || !a0.k()) {
                    Iterator it = toolbar.M.b.iterator();
                    while (it.hasNext()) {
                        ((C3341rm) ((Qu) it.next())).a.s(menuC3511uu);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.XM
    public String[] l() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // defpackage.InterfaceC3058mc
    public int n() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Object objN;
        Exception exception = task.getException();
        InterfaceC3742z8 interfaceC3742z8 = (InterfaceC3742z8) this.b;
        if (exception != null) {
            objN = AbstractC0115Ga.n(exception);
        } else {
            if (task.isCanceled()) {
                interfaceC3742z8.cancel(null);
                return;
            }
            objN = task.getResult();
        }
        interfaceC3742z8.resumeWith(objN);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            wG[] r1 = new defpackage.C3588wG[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L29
            wG r3 = new wG
            r4 = r0[r2]
            r3.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.a = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L29:
            X1 r0 = defpackage.VM.a
            boolean r0 = r0.b()
            if (r0 == 0) goto L5e
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L54
            r1 = 1
            if (r0 == r1) goto L49
            r9 = 0
            r3 = r9
            goto L68
        L49:
            OM r0 = new OM
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L52:
            r3 = r0
            goto L68
        L54:
            OM r0 = new OM
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L52
        L5e:
            OM r0 = new OM
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L52
        L68:
            if (r3 == 0) goto L8a
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            fd r12 = new fd
            r0 = 1
            r12.<init>(r9, r0)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            yq r6 = (defpackage.C3723yq) r6
            java.lang.Object r9 = r7.b
            r1 = r9
            RM r1 = (defpackage.RM) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2524cp.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public InterfaceC0100Fc p(InterfaceC0100Fc interfaceC0100Fc) {
        return interfaceC0100Fc instanceof ZB ? interfaceC0100Fc : new C2864j1(-((C2638eu) this.b).j(), interfaceC0100Fc);
    }

    public synchronized void q() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    public AbstractC0478aM r(Class cls) {
        String str;
        R9 r9A = PB.a(cls);
        Class cls2 = r9A.a;
        AbstractC0500aq.m(cls2, "jClass");
        String canonicalName = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean zIsArray = cls2.isArray();
            HashMap map = R9.c;
            if (zIsArray) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls2.getName());
                if (canonicalName == null) {
                    canonicalName = cls2.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return ((C3532vE) this.b).e(r9A, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public Object s(InterfaceC3207pE interfaceC3207pE, C0108Fk c0108Fk) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.b).get(interfaceC3207pE);
        Object obj = map != null ? map.get(c0108Fk) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public int t(int i) {
        WorkDatabase workDatabase;
        int i2;
        synchronized (C2524cp.class) {
            try {
                workDatabase = (WorkDatabase) this.b;
                workDatabase.c();
                Long lY = workDatabase.j().y("next_job_scheduler_id");
                i2 = 0;
                int iIntValue = lY != null ? lY.intValue() : 0;
                workDatabase.j().C(new C2808hz("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
                if (iIntValue < 0 || iIntValue > i) {
                    ((WorkDatabase) this.b).j().C(new C2808hz("next_job_scheduler_id", 1));
                } else {
                    i2 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((XE) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
        } else {
            R2 r2 = (R2) this.b;
            C2567dd.a((C2567dd) r2.c);
            C2567dd c2567dd = (C2567dd) r2.c;
            c2567dd.m.q((ExecutorC0305Rd) c2567dd.e.b, null);
            c2567dd.q.trySetResult(null);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            case 20:
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    stringBuffer.append(((C3677xy) it.next()).toString() + Deobfuscator$MHRTUNNELVPN$app.getString(-76162007266234L));
                }
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2524cp.u(java.lang.String):void");
    }

    public void w() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new H0(viewFindViewById, 15));
    }

    public void x(int i, boolean z) {
        ((C3221pa) this.b).G0(i, z);
    }

    public void y(int i, C0519b8 c0519b8) {
        ((C3221pa) this.b).I0(i, c0519b8);
    }

    public void z(int i, double d) {
        C3221pa c3221pa = (C3221pa) this.b;
        c3221pa.getClass();
        c3221pa.M0(i, Double.doubleToRawLongBits(d));
    }

    public /* synthetic */ C2524cp(int i, boolean z) {
        this.a = i;
    }

    public C2524cp(C3221pa c3221pa) {
        this.a = 8;
        AbstractC0368Up.a(c3221pa, "output");
        this.b = c3221pa;
        c3221pa.j = this;
    }

    public C2524cp(C2667fM c2667fM, InterfaceC2612eM interfaceC2612eM) {
        this.a = 1;
        AbstractC0500aq.m(c2667fM, "store");
        C0407Xd c0407Xd = C0407Xd.b;
        this.a = 1;
        AbstractC0500aq.m(c2667fM, "store");
        AbstractC0500aq.m(c0407Xd, "defaultCreationExtras");
        this.b = new C3532vE(c2667fM, interfaceC2612eM, c0407Xd);
    }

    public C2524cp(Context context) {
        boolean zIsEmpty;
        this.a = 25;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                q();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public C2524cp(ContentInfo contentInfo) {
        this.a = 9;
        contentInfo.getClass();
        this.b = AbstractC2817i7.l(contentInfo);
    }

    public C2524cp(TextView textView) {
        this.a = 13;
        AbstractC0136He.g(textView, "textView cannot be null");
        this.b = new C3499ui(textView);
    }

    public /* synthetic */ C2524cp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3251q3
    public void e(int i) {
    }

    @Override // defpackage.InterfaceC3251q3
    public void m(int i) {
    }

    @Override // defpackage.InterfaceC3251q3
    public void o(int i, float f) {
    }
}
