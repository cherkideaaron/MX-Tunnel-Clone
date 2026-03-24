package defpackage;

import android.R;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.utils.PUtils;
import xyz.hasnat.sweettoast.SweetToast;

/* renamed from: pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3236pp implements Nr {
    public static C3236pp s;
    public final AbstractActivityC2592e2 a;
    public final AppUpdateManager b;
    public final int c;
    public InterfaceC3181op o;
    public C2771hG p;
    public final C3126np r;
    public String d = "An update has just been downloaded.";
    public String e = "RESTART";
    public int f = 1;
    public boolean m = true;
    public boolean n = false;
    public final C2524cp q = new C2524cp(16, false);

    public C3236pp(AbstractActivityC2592e2 abstractActivityC2592e2) {
        C3126np c3126np = new C3126np(this);
        this.r = c3126np;
        this.a = abstractActivityC2592e2;
        this.c = 530;
        k();
        this.b = AppUpdateManagerFactory.create(abstractActivityC2592e2);
        abstractActivityC2592e2.getLifecycle().a(this);
        if (this.f == 1) {
            this.b.registerListener(c3126np);
        }
        this.b.getAppUpdateInfo().addOnSuccessListener(new H7((Object) this, false));
    }

    public static void d(C3236pp c3236pp) {
        InterfaceC3181op interfaceC3181op = c3236pp.o;
        if (interfaceC3181op != null) {
            OpenVPNClient openVPNClient = (OpenVPNClient) interfaceC3181op;
            InstallState installState = (InstallState) c3236pp.q.b;
            if (installState == null || installState.installStatus() != 11) {
                return;
            }
            openVPNClient.getApplicationContext();
            PUtils.killProcess();
        }
    }

    public static void i(C3236pp c3236pp) {
        if (c3236pp.n) {
            return;
        }
        C2771hG c2771hG = c3236pp.p;
        if (c2771hG != null && c2771hG.b()) {
            c3236pp.p.a(3);
        }
        C2771hG c2771hG2 = c3236pp.p;
        c2771hG2.getClass();
        C3532vE c3532vED = C3532vE.d();
        int i = c2771hG2.k;
        int recommendedTimeoutMillis = -2;
        if (i != -2) {
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = c2771hG2.A;
            if (i2 >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i, 3 | (c2771hG2.B ? 4 : 0));
            } else {
                if (c2771hG2.B && accessibilityManager.isTouchExplorationEnabled()) {
                    i = -2;
                }
                recommendedTimeoutMillis = i;
            }
        }
        C3145o7 c3145o7 = c2771hG2.t;
        synchronized (c3532vED.a) {
            try {
                if (c3532vED.i(c3145o7)) {
                    C2879jG c2879jG = (C2879jG) c3532vED.c;
                    c2879jG.b = recommendedTimeoutMillis;
                    ((Handler) c3532vED.b).removeCallbacksAndMessages(c2879jG);
                    c3532vED.l((C2879jG) c3532vED.c);
                } else {
                    C2879jG c2879jG2 = (C2879jG) c3532vED.d;
                    if (c2879jG2 == null || c3145o7 == null || c2879jG2.a.get() != c3145o7) {
                        c3532vED.d = new C2879jG(recommendedTimeoutMillis, c3145o7);
                    } else {
                        ((C2879jG) c3532vED.d).b = recommendedTimeoutMillis;
                    }
                    C2879jG c2879jG3 = (C2879jG) c3532vED.c;
                    if (c2879jG3 == null || !c3532vED.a(c2879jG3, 4)) {
                        c3532vED.c = null;
                        c3532vED.n();
                    }
                }
            } finally {
            }
        }
    }

    public static void j(C3236pp c3236pp, AppUpdateInfo appUpdateInfo) {
        c3236pp.getClass();
        try {
            c3236pp.b.startUpdateFlowForResult(appUpdateInfo, 1, c3236pp.a, c3236pp.c);
        } catch (IntentSender.SendIntentException e) {
            Log.e("InAppUpdateManager", "error in startAppUpdateImmediate", e);
            InterfaceC3181op interfaceC3181op = c3236pp.o;
            if (interfaceC3181op != null) {
                SweetToast.error(((OpenVPNClient) interfaceC3181op).getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-51075103290298L));
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        View viewFindViewById = this.a.getWindow().getDecorView().findViewById(R.id.content);
        String str = this.d;
        int[] iArr = C2771hG.C;
        ViewGroup viewGroup2 = null;
        while (!(viewFindViewById instanceof CoordinatorLayout)) {
            if (viewFindViewById instanceof FrameLayout) {
                if (viewFindViewById.getId() == 16908290) {
                    break;
                } else {
                    viewGroup2 = (ViewGroup) viewFindViewById;
                }
            }
            if (viewFindViewById != null) {
                Object parent = viewFindViewById.getParent();
                viewFindViewById = parent instanceof View ? (View) parent : null;
            }
            if (viewFindViewById == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C2771hG.C);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? com.mxtunnel.pro.R.layout.design_layout_snackbar_include : com.mxtunnel.pro.R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        C2771hG c2771hG = new C2771hG(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        AbstractC3255q7 abstractC3255q7 = c2771hG.i;
        ((SnackbarContentLayout) abstractC3255q7.getChildAt(0)).getMessageView().setText(str);
        c2771hG.k = -2;
        this.p = c2771hG;
        String str2 = this.e;
        ViewOnClickListenerC0510b viewOnClickListenerC0510b = new ViewOnClickListenerC0510b(this, 4);
        Button actionView = ((SnackbarContentLayout) abstractC3255q7.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(str2)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            c2771hG.B = false;
        } else {
            c2771hG.B = true;
            actionView.setVisibility(0);
            actionView.setText(str2);
            actionView.setOnClickListener(new ViewOnClickListenerC3676xx(2, c2771hG, viewOnClickListenerC0510b));
        }
    }

    @InterfaceC2969kx(Hr.ON_DESTROY)
    public void onDestroy() {
        C3126np c3126np;
        AppUpdateManager appUpdateManager = this.b;
        if (appUpdateManager == null || (c3126np = this.r) == null) {
            return;
        }
        appUpdateManager.unregisterListener(c3126np);
    }

    @InterfaceC2969kx(Hr.ON_RESUME)
    public void onResume() {
        if (this.m) {
            this.b.getAppUpdateInfo().addOnSuccessListener(new C0607co(this));
        }
    }
}
