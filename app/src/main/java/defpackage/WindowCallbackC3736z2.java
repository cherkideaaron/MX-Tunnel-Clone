package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.mxtunnel.pro.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowCallbackC3736z2 implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ F2 e;

    public WindowCallbackC3736z2(F2 f2, Window.Callback callback) {
        this.e = f2;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC0534bN.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.e.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            F2 r2 = r6.e
            r2.B()
            fN r3 = r2.u
            r4 = 0
            if (r3 == 0) goto L3d
            eN r3 = r3.u
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            uu r3 = r3.d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            E2 r0 = r2.S
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.G(r0, r3, r7)
            if (r0 == 0) goto L52
            E2 r7 = r2.S
            if (r7 == 0) goto L3b
            r7.l = r1
            goto L3b
        L52:
            E2 r0 = r2.S
            if (r0 != 0) goto L6a
            E2 r0 = r2.A(r4)
            r2.H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.G(r0, r3, r7)
            r0.k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WindowCallbackC3736z2.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC3511uu)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i, menu);
        F2 f2 = this.e;
        if (i == 108) {
            f2.B();
            C2668fN c2668fN = f2.u;
            if (c2668fN != null && true != c2668fN.x) {
                c2668fN.x = true;
                ArrayList arrayList = c2668fN.y;
                if (arrayList.size() > 0) {
                    Vs.u(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            f2.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        F2 f2 = this.e;
        if (i != 108) {
            if (i != 0) {
                f2.getClass();
                return;
            }
            E2 e2A = f2.A(i);
            if (e2A.m) {
                f2.s(e2A, false);
                return;
            }
            return;
        }
        f2.B();
        C2668fN c2668fN = f2.u;
        if (c2668fN == null || !c2668fN.x) {
            return;
        }
        c2668fN.x = false;
        ArrayList arrayList = c2668fN.y;
        if (arrayList.size() <= 0) {
            return;
        }
        Vs.u(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC0588cN.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC3511uu menuC3511uu = menu instanceof MenuC3511uu ? (MenuC3511uu) menu : null;
        if (i == 0 && menuC3511uu == null) {
            return false;
        }
        if (menuC3511uu != null) {
            menuC3511uu.x = true;
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (menuC3511uu != null) {
            menuC3511uu.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC3511uu menuC3511uu = this.e.A(0).h;
        if (menuC3511uu != null) {
            d(list, menuC3511uu, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0479aN.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i2 = 1;
        F2 f2 = this.e;
        f2.getClass();
        if (i != 0) {
            return AbstractC0479aN.b(this.a, callback, i);
        }
        Context context = f2.q;
        KJ kj = new KJ();
        kj.b = context;
        kj.a = callback;
        kj.c = new ArrayList();
        kj.d = new WF();
        F0 f0 = f2.A;
        if (f0 != null) {
            f0.a();
        }
        R2 r2 = new R2(7, f2, kj);
        f2.B();
        C2668fN c2668fN = f2.u;
        if (c2668fN != null) {
            C2613eN c2613eN = c2668fN.u;
            if (c2613eN != null) {
                c2613eN.a();
            }
            c2668fN.o.setHideOnContentScrollEnabled(false);
            c2668fN.r.e();
            C2613eN c2613eN2 = new C2613eN(c2668fN, c2668fN.r.getContext(), r2);
            MenuC3511uu menuC3511uu = c2613eN2.d;
            menuC3511uu.w();
            try {
                if (c2613eN2.e.d(c2613eN2, menuC3511uu)) {
                    c2668fN.u = c2613eN2;
                    c2613eN2.h();
                    c2668fN.r.c(c2613eN2);
                    c2668fN.U(true);
                } else {
                    c2613eN2 = null;
                }
                f2.A = c2613eN2;
            } finally {
                menuC3511uu.v();
            }
        }
        if (f2.A == null) {
            C2885jM c2885jM = f2.E;
            if (c2885jM != null) {
                c2885jM.b();
            }
            F0 f02 = f2.A;
            if (f02 != null) {
                f02.a();
            }
            if (f2.t != null) {
                boolean z = f2.W;
            }
            if (f2.B == null) {
                boolean z2 = f2.O;
                Context context2 = f2.q;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C3439tc c3439tc = new C3439tc(context2, 0);
                        c3439tc.getTheme().setTo(themeNewTheme);
                        context2 = c3439tc;
                    }
                    f2.B = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    f2.C = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    f2.C.setContentView(f2.B);
                    f2.C.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    f2.B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    f2.C.setHeight(-2);
                    f2.D = new RunnableC3358s2(f2, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) f2.G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        f2.B();
                        C2668fN c2668fN2 = f2.u;
                        Context contextV = c2668fN2 != null ? c2668fN2.V() : null;
                        if (contextV != null) {
                            context2 = contextV;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        f2.B = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (f2.B != null) {
                C2885jM c2885jM2 = f2.E;
                if (c2885jM2 != null) {
                    c2885jM2.b();
                }
                f2.B.e();
                Context context3 = f2.B.getContext();
                ActionBarContextView actionBarContextView = f2.B;
                PG pg = new PG();
                pg.c = context3;
                pg.d = actionBarContextView;
                pg.e = r2;
                MenuC3511uu menuC3511uu2 = new MenuC3511uu(actionBarContextView.getContext());
                menuC3511uu2.l = 1;
                pg.n = menuC3511uu2;
                menuC3511uu2.e = pg;
                if (((E0) r2.b).d(pg, menuC3511uu2)) {
                    pg.h();
                    f2.B.c(pg);
                    f2.A = pg;
                    if (f2.F && (viewGroup = f2.G) != null && viewGroup.isLaidOut()) {
                        f2.B.setAlpha(0.0f);
                        C2885jM c2885jMA = UL.a(f2.B);
                        c2885jMA.a(1.0f);
                        f2.E = c2885jMA;
                        c2885jMA.d(new C3466u2(f2, i2));
                    } else {
                        f2.B.setAlpha(1.0f);
                        f2.B.setVisibility(0);
                        if (f2.B.getParent() instanceof View) {
                            View view = (View) f2.B.getParent();
                            WeakHashMap weakHashMap = UL.a;
                            KL.c(view);
                        }
                    }
                    if (f2.C != null) {
                        f2.r.getDecorView().post(f2.D);
                    }
                } else {
                    f2.A = null;
                }
            }
            f2.J();
            f2.A = f2.A;
        }
        f2.J();
        F0 f03 = f2.A;
        if (f03 != null) {
            return kj.h(f03);
        }
        return null;
    }
}
