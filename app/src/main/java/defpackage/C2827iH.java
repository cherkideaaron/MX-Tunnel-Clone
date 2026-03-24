package defpackage;

import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import androidx.fragment.app.t;
import androidx.fragment.app.x;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.appbar.AppBarLayout;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: iH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2827iH implements Uw, Ou, InterfaceC3627x1, InterfaceC3067ml, InterfaceC0554bp, Tw, InterfaceC0143Hl, N0, Lt, Tz, GL, InterfaceC0406Xc {
    public static C2827iH c;
    public final /* synthetic */ int a;
    public Object b;

    public C2827iH(int i) {
        this.a = 10;
        G(i);
    }

    public static synchronized C2827iH s() {
        try {
            if (c == null) {
                C2827iH c2827iH = new C2827iH(0, (byte) 0);
                C2772hH c2772hH = new C2772hH();
                c2772hH.f();
                c2827iH.b = c2772hH;
                c = c2827iH;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static String x(String str, String str2) {
        return AbstractC3264qG.h(str2, ".", str);
    }

    public void A(C3373sH c3373sH, C0312Rk c0312Rk, RunnableC3680y0 runnableC3680y0) {
        c3373sH.o = true;
        c3373sH.a("post-response");
        ((ExecutorC3065mj) this.b).execute(new RunnableC0354Ub(c3373sH, c0312Rk, runnableC3680y0, 2));
    }

    public JSONObject B() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC0115Ga.T(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        AbstractC0115Ga.m(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    AbstractC0115Ga.m(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC0115Ga.m(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC0115Ga.m(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void C(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void D(String str, boolean z) {
        XD xd = (XD) ((YD) this.b).edit();
        xd.putBoolean(str, z);
        Log.d("PrefUtil", "set_boolean: " + str + "=" + z);
        xd.apply();
    }

    public void E(String str, String str2) {
        XD xd = (XD) ((YD) this.b).edit();
        xd.putString(str, str2);
        Log.d("PrefUtil", "set_string: " + str + "='" + str2 + "'");
        xd.apply();
    }

    public void F(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = ((YD) this.b).edit();
        String strX = x(str, str2);
        Log.d("PrefUtil", Vs.m("set_string_by_profile: key='", strX, "' value='", str3, "'"));
        XD xd = (XD) editorEdit;
        xd.putString(strX, str3);
        xd.apply();
    }

    public void G(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // defpackage.Ou
    public void a(MenuC3511uu menuC3511uu, boolean z) {
        ((F2) this.b).r(menuC3511uu);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.InterfaceC3067ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.InterfaceC3177ol r7, defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 9: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof defpackage.C2972l
            if (r0 == 0) goto L18
            r0 = r8
            l r0 = (defpackage.C2972l) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.d = r1
            goto L1d
        L18:
            l r0 = new l
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            DK r3 = defpackage.DK.a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            lD r7 = r0.a
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.AbstractC0115Ga.U(r8)
            lD r8 = new lD
            Jc r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.a = r8     // Catch: java.lang.Throwable -> L63
            r0.d = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> L63
            sn r7 = (defpackage.InterfaceC3396sn) r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r1) goto L55
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 != r1) goto L59
            goto L5e
        L59:
            r7 = r8
        L5a:
            r7.releaseIntercepted()
            r1 = r3
        L5e:
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            af r0 = new af
            r1 = 0
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.b
            ml r7 = (defpackage.InterfaceC3067ml) r7
            java.lang.Object r7 = r7.b(r0, r8)
            Sc r8 = defpackage.EnumC0321Sc.a
            if (r7 != r8) goto L7c
            goto L7e
        L7c:
            DK r7 = defpackage.DK.a
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2827iH.b(ol, uc):java.lang.Object");
    }

    @Override // defpackage.N0
    public void c(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        t tVar = (t) this.b;
        C3503um c3503um = (C3503um) tVar.C.pollFirst();
        if (c3503um == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        x xVar = tVar.c;
        String str = c3503um.a;
        l lVarC = xVar.c(str);
        if (lVarC != null) {
            lVarC.onRequestPermissionsResult(c3503um.b, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.InterfaceC0143Hl
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.Tw
    public void d(Object obj) {
        if (((Or) obj) != null) {
            g gVar = (g) this.b;
            if (gVar.mShowsDialog) {
                View viewRequireView = gVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (gVar.mDialog != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + gVar.mDialog);
                    }
                    gVar.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }

    @Override // defpackage.GL
    public int e(View view) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        ((AbstractC3529vB) this.b).getClass();
        return (view.getLeft() - ((C3583wB) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) c3583wB).leftMargin;
    }

    public void f(String str) {
        SharedPreferences.Editor editorEdit = ((YD) this.b).edit();
        Log.d("PrefUtil", "delete_key: key='" + str + "'");
        XD xd = (XD) editorEdit;
        xd.remove(str);
        xd.apply();
    }

    @Override // defpackage.GL
    public int g() {
        return ((AbstractC3529vB) this.b).E();
    }

    @Override // defpackage.InterfaceC0406Xc
    public Object h(C0389Wc c0389Wc) {
        return ((InterfaceC2631en) this.b).invoke(c0389Wc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Uw
    public AN j(View view, AN an) {
        int i = 0;
        switch (this.a) {
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) this.b;
                AN an2 = appBarLayout.getFitsSystemWindows() ? an : null;
                if (!Objects.equals(appBarLayout.m, an2)) {
                    appBarLayout.m = an2;
                    if (appBarLayout.C != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                if (!Objects.equals(coordinatorLayout.t, an)) {
                    coordinatorLayout.t = an;
                    boolean z = an.d() > 0;
                    coordinatorLayout.u = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    C3703yN c3703yN = an.a;
                    if (!c3703yN.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = UL.a;
                            if (!childAt.getFitsSystemWindows() || ((C0049Cc) childAt.getLayoutParams()).a == null || !c3703yN.m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return an;
    }

    public void k(String str, String str2) {
        SharedPreferences.Editor editorEdit = ((YD) this.b).edit();
        String strX = x(str, str2);
        Log.d("PrefUtil", "delete_key_by_profile: key='" + strX + "'");
        XD xd = (XD) editorEdit;
        xd.remove(strX);
        xd.apply();
    }

    @Override // defpackage.InterfaceC0143Hl
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.GL
    public int m() {
        AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.b;
        return abstractC3529vB.n - abstractC3529vB.F();
    }

    @Override // defpackage.InterfaceC3627x1
    public void n(Bundle bundle) {
        ((C3465u1) ((InterfaceC3411t1) this.b)).a("clx", "_ae", bundle);
    }

    @Override // defpackage.GL
    public View o(int i) {
        return ((AbstractC3529vB) this.b).u(i);
    }

    @Override // defpackage.GL
    public int p(View view) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        ((AbstractC3529vB) this.b).getClass();
        return view.getRight() + ((C3583wB) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) c3583wB).rightMargin;
    }

    @Override // defpackage.Ou
    public boolean q(MenuC3511uu menuC3511uu) {
        Window.Callback callback = ((F2) this.b).r.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, menuC3511uu);
        return true;
    }

    public synchronized C2772hH r() {
        return (C2772hH) this.b;
    }

    public boolean t(String str) {
        try {
            boolean z = ((YD) this.b).getBoolean(str, false);
            Log.d("PrefUtil", "get_boolean: " + str + "=" + z);
            return z;
        } catch (ClassCastException unused) {
            Log.d("PrefUtil", "get_boolean " + str + " class cast exception");
            return false;
        }
    }

    public boolean u(String str, String str2) {
        try {
            boolean z = ((YD) this.b).getBoolean(x(str, str2), false);
            Log.d("PrefUtil", "get_boolean_by_profile: key='" + str2 + "' value=" + z);
            return z;
        } catch (ClassCastException unused) {
            Log.d("PrefUtil", "get_boolean_by_profile class cast exception");
            return false;
        }
    }

    public String v(String str) {
        try {
            String string = ((YD) this.b).getString(str, null);
            Log.d("PrefUtil", "get_string: " + str + "='" + string + "'");
            return string;
        } catch (ClassCastException unused) {
            Log.d("PrefUtil", "get_string " + str + " class cast exception");
            return null;
        }
    }

    public String w(String str, String str2) {
        try {
            String string = ((YD) this.b).getString(x(str, str2), null);
            Log.d("PrefUtil", "get_string_by_profile: key='" + str2 + "' value='" + string + "'");
            return string;
        } catch (ClassCastException unused) {
            Log.d("PrefUtil", "get_string_by_profile class cast exception");
            return null;
        }
    }

    public void y(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((AbstractC3309r7) this.b).a(0);
    }

    public XE z(JSONObject jSONObject) throws JSONException {
        InterfaceC2605eF c3397so;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c3397so = new C0360Uh(13);
        } else {
            c3397so = new C3397so(26);
        }
        return c3397so.m((C0360Uh) this.b, jSONObject);
    }

    public /* synthetic */ C2827iH(int i, byte b) {
        this.a = i;
    }

    public C2827iH(C3121nk c3121nk) {
        this.a = 5;
        this.b = new File((File) c3121nk.c, "com.crashlytics.settings.json");
    }

    public C2827iH(Context context, Uri uri) {
        this.a = 15;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C2827iH(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 18;
        this.b = Build.VERSION.SDK_INT >= 25 ? new C0062Cp(uri, clipDescription, uri2) : new D3(uri, clipDescription, uri2, 11);
    }

    public C2827iH(Handler handler) {
        this.a = 14;
        this.b = new ExecutorC3065mj(handler, 0);
    }

    public C2827iH(View view) {
        C2524cp c2524cp;
        this.a = 29;
        if (Build.VERSION.SDK_INT >= 30) {
            C3209pG c3209pG = new C3209pG(view, 23);
            c3209pG.d = view;
            c2524cp = c3209pG;
        } else {
            c2524cp = new C2524cp(view, 23);
        }
        this.b = c2524cp;
    }

    public C2827iH(WindowInsetsController windowInsetsController) {
        this.a = 29;
        C3209pG c3209pG = new C3209pG(null, 23);
        c3209pG.e = windowInsetsController;
        this.b = c3209pG;
    }

    public C2827iH(EditText editText) {
        this.a = 12;
        AbstractC0136He.g(editText, "editText cannot be null");
        this.b = new R2(editText, 26);
    }

    public /* synthetic */ C2827iH(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public C2827iH(boolean z) {
        this.a = 3;
        this.b = new AtomicBoolean(z);
    }
}
