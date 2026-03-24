package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: fN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2668fN extends AbstractC2883jK implements InterfaceC3138o0 {
    public static final AccelerateInterpolator K = new AccelerateInterpolator();
    public static final DecelerateInterpolator L = new DecelerateInterpolator();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public C3623wy E;
    public boolean F;
    public boolean G;
    public final C2559dN H;
    public final C2559dN I;
    public final C3588wG J;
    public Context m;
    public Context n;
    public ActionBarOverlayLayout o;
    public ActionBarContainer p;
    public InterfaceC0103Ff q;
    public ActionBarContextView r;
    public final View s;
    public boolean t;
    public C2613eN u;
    public C2613eN v;
    public E0 w;
    public boolean x;
    public final ArrayList y;
    public int z;

    public C2668fN(Dialog dialog) {
        new ArrayList();
        this.y = new ArrayList();
        this.z = 0;
        this.A = true;
        this.D = true;
        this.H = new C2559dN(this, 0);
        this.I = new C2559dN(this, 1);
        this.J = new C3588wG(this);
        W(dialog.getWindow().getDecorView());
    }

    public final void U(boolean z) {
        C2885jM c2885jMI;
        C2885jM c2885jMI2;
        if (z) {
            if (!this.C) {
                this.C = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.o;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Z(false);
            }
        } else if (this.C) {
            this.C = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.o;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Z(false);
        }
        if (!this.p.isLaidOut()) {
            if (z) {
                ((C3212pJ) this.q).a.setVisibility(4);
                this.r.setVisibility(0);
                return;
            } else {
                ((C3212pJ) this.q).a.setVisibility(0);
                this.r.setVisibility(8);
                return;
            }
        }
        if (z) {
            C3212pJ c3212pJ = (C3212pJ) this.q;
            c2885jMI = UL.a(c3212pJ.a);
            c2885jMI.a(0.0f);
            c2885jMI.c(100L);
            c2885jMI.d(new C3157oJ(c3212pJ, 4));
            c2885jMI2 = this.r.i(0, 200L);
        } else {
            C3212pJ c3212pJ2 = (C3212pJ) this.q;
            C2885jM c2885jMA = UL.a(c3212pJ2.a);
            c2885jMA.a(1.0f);
            c2885jMA.c(200L);
            c2885jMA.d(new C3157oJ(c3212pJ2, 0));
            c2885jMI = this.r.i(8, 100L);
            c2885jMI2 = c2885jMA;
        }
        C3623wy c3623wy = new C3623wy();
        ArrayList arrayList = (ArrayList) c3623wy.c;
        arrayList.add(c2885jMI);
        View view = (View) c2885jMI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c2885jMI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c2885jMI2);
        c3623wy.b();
    }

    public final Context V() {
        if (this.n == null) {
            TypedValue typedValue = new TypedValue();
            this.m.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.n = new ContextThemeWrapper(this.m, i);
            } else {
                this.n = this.m;
            }
        }
        return this.n;
    }

    public final void W(View view) {
        InterfaceC0103Ff wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.o = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0103Ff) {
            wrapper = (InterfaceC0103Ff) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.q = wrapper;
        this.r = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.p = actionBarContainer;
        InterfaceC0103Ff interfaceC0103Ff = this.q;
        if (interfaceC0103Ff == null || this.r == null || actionBarContainer == null) {
            throw new IllegalStateException(C2668fN.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C3212pJ) interfaceC0103Ff).a.getContext();
        this.m = context;
        if ((((C3212pJ) this.q).b & 4) != 0) {
            this.t = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.q.getClass();
        Y(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.m.obtainStyledAttributes(null, AbstractC2547dB.a, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.o;
            if (!actionBarOverlayLayout2.m) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.G = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.p;
            WeakHashMap weakHashMap = UL.a;
            ML.j(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void X(boolean z) {
        if (this.t) {
            return;
        }
        int i = z ? 4 : 0;
        C3212pJ c3212pJ = (C3212pJ) this.q;
        int i2 = c3212pJ.b;
        this.t = true;
        c3212pJ.a((i & 4) | (i2 & (-5)));
    }

    public final void Y(boolean z) {
        if (z) {
            this.p.setTabContainer(null);
            ((C3212pJ) this.q).getClass();
        } else {
            ((C3212pJ) this.q).getClass();
            this.p.setTabContainer(null);
        }
        this.q.getClass();
        ((C3212pJ) this.q).a.setCollapsible(false);
        this.o.setHasNonEmbeddedTabs(false);
    }

    public final void Z(boolean z) {
        int i = 1;
        boolean z2 = this.C || !this.B;
        View view = this.s;
        C3588wG c3588wG = this.J;
        if (!z2) {
            if (this.D) {
                this.D = false;
                C3623wy c3623wy = this.E;
                if (c3623wy != null) {
                    c3623wy.a();
                }
                int i2 = this.z;
                C2559dN c2559dN = this.H;
                if (i2 != 0 || (!this.F && !z)) {
                    c2559dN.c();
                    return;
                }
                this.p.setAlpha(1.0f);
                this.p.setTransitioning(true);
                C3623wy c3623wy2 = new C3623wy();
                float f = -this.p.getHeight();
                if (z) {
                    this.p.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C2885jM c2885jMA = UL.a(this.p);
                c2885jMA.e(f);
                View view2 = (View) c2885jMA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c3588wG != null ? new C0458a2(i, c3588wG, view2) : null);
                }
                boolean z3 = c3623wy2.b;
                ArrayList arrayList = (ArrayList) c3623wy2.c;
                if (!z3) {
                    arrayList.add(c2885jMA);
                }
                if (this.A && view != null) {
                    C2885jM c2885jMA2 = UL.a(view);
                    c2885jMA2.e(f);
                    if (!c3623wy2.b) {
                        arrayList.add(c2885jMA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = K;
                boolean z4 = c3623wy2.b;
                if (!z4) {
                    c3623wy2.d = accelerateInterpolator;
                }
                if (!z4) {
                    c3623wy2.a = 250L;
                }
                if (!z4) {
                    c3623wy2.e = c2559dN;
                }
                this.E = c3623wy2;
                c3623wy2.b();
                return;
            }
            return;
        }
        if (this.D) {
            return;
        }
        this.D = true;
        C3623wy c3623wy3 = this.E;
        if (c3623wy3 != null) {
            c3623wy3.a();
        }
        this.p.setVisibility(0);
        int i3 = this.z;
        C2559dN c2559dN2 = this.I;
        if (i3 == 0 && (this.F || z)) {
            this.p.setTranslationY(0.0f);
            float f2 = -this.p.getHeight();
            if (z) {
                this.p.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.p.setTranslationY(f2);
            C3623wy c3623wy4 = new C3623wy();
            C2885jM c2885jMA3 = UL.a(this.p);
            c2885jMA3.e(0.0f);
            View view3 = (View) c2885jMA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c3588wG != null ? new C0458a2(i, c3588wG, view3) : null);
            }
            boolean z5 = c3623wy4.b;
            ArrayList arrayList2 = (ArrayList) c3623wy4.c;
            if (!z5) {
                arrayList2.add(c2885jMA3);
            }
            if (this.A && view != null) {
                view.setTranslationY(f2);
                C2885jM c2885jMA4 = UL.a(view);
                c2885jMA4.e(0.0f);
                if (!c3623wy4.b) {
                    arrayList2.add(c2885jMA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = L;
            boolean z6 = c3623wy4.b;
            if (!z6) {
                c3623wy4.d = decelerateInterpolator;
            }
            if (!z6) {
                c3623wy4.a = 250L;
            }
            if (!z6) {
                c3623wy4.e = c2559dN2;
            }
            this.E = c3623wy4;
            c3623wy4.b();
        } else {
            this.p.setAlpha(1.0f);
            this.p.setTranslationY(0.0f);
            if (this.A && view != null) {
                view.setTranslationY(0.0f);
            }
            c2559dN2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.o;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = UL.a;
            KL.c(actionBarOverlayLayout);
        }
    }

    public C2668fN(boolean z, Activity activity) {
        new ArrayList();
        this.y = new ArrayList();
        this.z = 0;
        this.A = true;
        this.D = true;
        this.H = new C2559dN(this, 0);
        this.I = new C2559dN(this, 1);
        this.J = new C3588wG(this);
        View decorView = activity.getWindow().getDecorView();
        W(decorView);
        if (z) {
            return;
        }
        this.s = decorView.findViewById(android.R.id.content);
    }
}
