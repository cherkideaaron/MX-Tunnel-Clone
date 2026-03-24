package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F2 extends AbstractC3304r2 implements InterfaceC3403su, LayoutInflater.Factory2 {
    public static final WF n0 = new WF(0);
    public static final int[] o0 = {R.attr.windowBackground};
    public static final boolean p0 = !"robolectric".equals(Build.FINGERPRINT);
    public F0 A;
    public ActionBarContextView B;
    public PopupWindow C;
    public RunnableC3358s2 D;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public E2[] R;
    public E2 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public A2 c0;
    public A2 d0;
    public boolean e0;
    public int f0;
    public boolean h0;
    public Rect i0;
    public Rect j0;
    public B3 k0;
    public OnBackInvokedDispatcher l0;
    public OnBackInvokedCallback m0;
    public final Object p;
    public final Context q;
    public Window r;
    public WindowCallbackC3736z2 s;
    public final InterfaceC2812i2 t;
    public C2668fN u;
    public RH v;
    public CharSequence w;
    public InterfaceC0086Ef x;
    public C2827iH y;
    public C3412t2 z;
    public C2885jM E = null;
    public final RunnableC3358s2 g0 = new RunnableC3358s2(this, 0);

    public F2(Context context, Window window, InterfaceC2812i2 interfaceC2812i2, Object obj) {
        AbstractActivityC2592e2 abstractActivityC2592e2 = null;
        this.Y = -100;
        this.q = context;
        this.t = interfaceC2812i2;
        this.p = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC2592e2)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC2592e2 = (AbstractActivityC2592e2) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC2592e2 != null) {
                this.Y = ((F2) abstractActivityC2592e2.j()).Y;
            }
        }
        if (this.Y == -100) {
            WF wf = n0;
            Integer num = (Integer) wf.get(this.p.getClass().getName());
            if (num != null) {
                this.Y = num.intValue();
                wf.remove(this.p.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        I2.d();
    }

    public static Us p(Context context) {
        Us us;
        Us usB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (us = AbstractC3304r2.c) == null) {
            return null;
        }
        Us usZ = z(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        Xs xs = us.a;
        if (i < 24) {
            usB = xs.isEmpty() ? Us.b : Us.b(AbstractC3520v2.b(xs.get(0)));
        } else if (xs.isEmpty()) {
            usB = Us.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < usZ.a.size() + xs.size()) {
                Locale locale = i2 < xs.size() ? xs.get(i2) : usZ.a.get(i2 - xs.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            usB = Us.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return usB.a.isEmpty() ? usZ : usB;
    }

    public static Configuration t(Context context, int i, Us us, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (us != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC3574w2.d(configuration2, us);
            } else {
                Xs xs = us.a;
                configuration2.setLocale(xs.get(0));
                configuration2.setLayoutDirection(xs.get(0));
            }
        }
        return configuration2;
    }

    public static Us z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC3574w2.b(configuration) : Us.b(AbstractC3520v2.b(configuration.locale));
    }

    public final E2 A(int i) {
        E2[] e2Arr = this.R;
        if (e2Arr == null || e2Arr.length <= i) {
            E2[] e2Arr2 = new E2[i + 1];
            if (e2Arr != null) {
                System.arraycopy(e2Arr, 0, e2Arr2, 0, e2Arr.length);
            }
            this.R = e2Arr2;
            e2Arr = e2Arr2;
        }
        E2 e2 = e2Arr[i];
        if (e2 != null) {
            return e2;
        }
        E2 e22 = new E2();
        e22.a = i;
        e22.n = false;
        e2Arr[i] = e22;
        return e22;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            r3.w()
            boolean r0 = r3.L
            if (r0 == 0) goto L33
            fN r0 = r3.u
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            fN r1 = new fN
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.M
            r1.<init>(r2, r0)
        L1b:
            r3.u = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            fN r1 = new fN
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            fN r0 = r3.u
            if (r0 == 0) goto L33
            boolean r1 = r3.h0
            r0.X(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.B():void");
    }

    public final void C(int i) {
        this.f0 = (1 << i) | this.f0;
        if (this.e0) {
            return;
        }
        View decorView = this.r.getDecorView();
        WeakHashMap weakHashMap = UL.a;
        decorView.postOnAnimation(this.g0);
        this.e0 = true;
    }

    public final int D(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).e();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.d0 == null) {
                    this.d0 = new A2(this, context);
                }
                return this.d0.e();
            }
        }
        return i;
    }

    public final boolean E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0103Ff interfaceC0103Ff;
        C2937kJ c2937kJ;
        boolean z = this.T;
        this.T = false;
        E2 e2A = A(0);
        if (e2A.m) {
            if (!z) {
                s(e2A, true);
            }
            return true;
        }
        F0 f0 = this.A;
        if (f0 != null) {
            f0.a();
            return true;
        }
        B();
        C2668fN c2668fN = this.u;
        if (c2668fN == null || (interfaceC0103Ff = c2668fN.q) == null || (c2937kJ = ((C3212pJ) interfaceC0103Ff).a.R) == null || c2937kJ.b == null) {
            return false;
        }
        C2937kJ c2937kJ2 = ((C3212pJ) interfaceC0103Ff).a.R;
        Cu cu = c2937kJ2 == null ? null : c2937kJ2.b;
        if (cu != null) {
            cu.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r3.f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.E2 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.F(E2, android.view.KeyEvent):void");
    }

    public final boolean G(E2 e2, int i, KeyEvent keyEvent) {
        MenuC3511uu menuC3511uu;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((e2.k || H(e2, keyEvent)) && (menuC3511uu = e2.h) != null) {
            return menuC3511uu.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(E2 e2, KeyEvent keyEvent) {
        InterfaceC0086Ef interfaceC0086Ef;
        InterfaceC0086Ef interfaceC0086Ef2;
        Resources.Theme themeNewTheme;
        InterfaceC0086Ef interfaceC0086Ef3;
        InterfaceC0086Ef interfaceC0086Ef4;
        if (this.W) {
            return false;
        }
        if (e2.k) {
            return true;
        }
        E2 e22 = this.S;
        if (e22 != null && e22 != e2) {
            s(e22, false);
        }
        Window.Callback callback = this.r.getCallback();
        int i = e2.a;
        if (callback != null) {
            e2.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0086Ef4 = this.x) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0086Ef4;
            actionBarOverlayLayout.k();
            ((C3212pJ) actionBarOverlayLayout.e).l = true;
        }
        if (e2.g == null) {
            MenuC3511uu menuC3511uu = e2.h;
            if (menuC3511uu == null || e2.o) {
                if (menuC3511uu == null) {
                    Context context = this.q;
                    if ((i == 0 || i == 108) && this.x != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.mxtunnel.pro.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.mxtunnel.pro.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.mxtunnel.pro.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C3439tc c3439tc = new C3439tc(context, 0);
                            c3439tc.getTheme().setTo(themeNewTheme);
                            context = c3439tc;
                        }
                    }
                    MenuC3511uu menuC3511uu2 = new MenuC3511uu(context);
                    menuC3511uu2.e = this;
                    MenuC3511uu menuC3511uu3 = e2.h;
                    if (menuC3511uu2 != menuC3511uu3) {
                        if (menuC3511uu3 != null) {
                            menuC3511uu3.r(e2.i);
                        }
                        e2.h = menuC3511uu2;
                        C3294qs c3294qs = e2.i;
                        if (c3294qs != null) {
                            menuC3511uu2.b(c3294qs, menuC3511uu2.a);
                        }
                    }
                    if (e2.h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0086Ef2 = this.x) != null) {
                    if (this.y == null) {
                        this.y = new C2827iH(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0086Ef2).l(e2.h, this.y);
                }
                e2.h.w();
                if (!callback.onCreatePanelMenu(i, e2.h)) {
                    MenuC3511uu menuC3511uu4 = e2.h;
                    if (menuC3511uu4 != null) {
                        if (menuC3511uu4 != null) {
                            menuC3511uu4.r(e2.i);
                        }
                        e2.h = null;
                    }
                    if (z && (interfaceC0086Ef = this.x) != null) {
                        ((ActionBarOverlayLayout) interfaceC0086Ef).l(null, this.y);
                    }
                    return false;
                }
                e2.o = false;
            }
            e2.h.w();
            Bundle bundle = e2.p;
            if (bundle != null) {
                e2.h.s(bundle);
                e2.p = null;
            }
            if (!callback.onPreparePanel(0, e2.g, e2.h)) {
                if (z && (interfaceC0086Ef3 = this.x) != null) {
                    ((ActionBarOverlayLayout) interfaceC0086Ef3).l(null, this.y);
                }
                e2.h.v();
                return false;
            }
            e2.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            e2.h.v();
        }
        e2.k = true;
        e2.l = false;
        this.S = e2;
        return true;
    }

    public final void I() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedCallback onBackInvokedCallbackB;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.l0 != null && (A(0).m || this.A != null)) {
                z = true;
            }
            if (z && this.m0 == null) {
                onBackInvokedCallbackB = AbstractC3682y2.b(this.l0, this);
            } else {
                if (z || (onBackInvokedCallback = this.m0) == null) {
                    return;
                }
                AbstractC3682y2.c(this.l0, onBackInvokedCallback);
                onBackInvokedCallbackB = null;
            }
            this.m0 = onBackInvokedCallbackB;
        }
    }

    @Override // defpackage.AbstractC3304r2
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.q);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof F2) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.InterfaceC3403su
    public final boolean b(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        E2 e2;
        Window.Callback callback = this.r.getCallback();
        if (callback != null && !this.W) {
            MenuC3511uu menuC3511uuK = menuC3511uu.k();
            E2[] e2Arr = this.R;
            int length = e2Arr != null ? e2Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    e2 = e2Arr[i];
                    if (e2 != null && e2.h == menuC3511uuK) {
                        break;
                    }
                    i++;
                } else {
                    e2 = null;
                    break;
                }
            }
            if (e2 != null) {
                return callback.onMenuItemSelected(e2.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC3304r2
    public final void c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.u != null) {
            B();
            this.u.getClass();
            C(0);
        }
    }

    @Override // defpackage.AbstractC3304r2
    public final void e() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strY;
        this.U = true;
        n(false, true);
        x();
        Object obj = this.p;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strY = AbstractC2883jK.y(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strY = null;
            }
            if (strY != null) {
                C2668fN c2668fN = this.u;
                if (c2668fN == null) {
                    this.h0 = true;
                } else {
                    c2668fN.X(true);
                }
            }
            synchronized (AbstractC3304r2.n) {
                AbstractC3304r2.g(this);
                AbstractC3304r2.m.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.q.getResources().getConfiguration());
        this.V = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.AbstractC3304r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.p
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.AbstractC3304r2.n
            monitor-enter(r0)
            defpackage.AbstractC3304r2.g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.e0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.r
            android.view.View r0 = r0.getDecorView()
            s2 r1 = r3.g0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.W = r0
            int r0 = r3.Y
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            WF r0 = defpackage.F2.n0
            java.lang.Object r1 = r3.p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            WF r0 = defpackage.F2.n0
            java.lang.Object r1 = r3.p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            A2 r0 = r3.c0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            A2 r0 = r3.d0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.f():void");
    }

    @Override // defpackage.AbstractC3304r2
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.P && i == 108) {
            return false;
        }
        if (this.L && i == 1) {
            this.L = false;
        }
        if (i == 1) {
            I();
            this.P = true;
            return true;
        }
        if (i == 2) {
            I();
            this.J = true;
            return true;
        }
        if (i == 5) {
            I();
            this.K = true;
            return true;
        }
        if (i == 10) {
            I();
            this.N = true;
            return true;
        }
        if (i == 108) {
            I();
            this.L = true;
            return true;
        }
        if (i != 109) {
            return this.r.requestFeature(i);
        }
        I();
        this.M = true;
        return true;
    }

    @Override // defpackage.AbstractC3304r2
    public final void i(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.q).inflate(i, viewGroup);
        this.s.a(this.r.getCallback());
    }

    @Override // defpackage.AbstractC3304r2
    public final void j(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.s.a(this.r.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.InterfaceC3403su
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.MenuC3511uu r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.k(uu):void");
    }

    @Override // defpackage.AbstractC3304r2
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.s.a(this.r.getCallback());
    }

    @Override // defpackage.AbstractC3304r2
    public final void m(CharSequence charSequence) {
        this.w = charSequence;
        InterfaceC0086Ef interfaceC0086Ef = this.x;
        if (interfaceC0086Ef != null) {
            interfaceC0086Ef.setWindowTitle(charSequence);
            return;
        }
        C2668fN c2668fN = this.u;
        if (c2668fN == null) {
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C3212pJ c3212pJ = (C3212pJ) c2668fN.q;
        if (c3212pJ.g) {
            return;
        }
        c3212pJ.h = charSequence;
        if ((c3212pJ.b & 8) != 0) {
            Toolbar toolbar = c3212pJ.a;
            toolbar.setTitle(charSequence);
            if (c3212pJ.g) {
                UL.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.n(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.r
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof defpackage.WindowCallbackC3736z2
            if (r2 != 0) goto L7a
            z2 r1 = new z2
            r1.<init>(r7, r0)
            r7.s = r1
            r8.setCallback(r1)
            int[] r0 = defpackage.F2.o0
            android.content.Context r1 = r7.q
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            I2 r4 = defpackage.I2.a()
            monitor-enter(r4)
            wC r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.r = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.l0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.m0
            if (r0 == 0) goto L5f
            defpackage.AbstractC3682y2.c(r8, r0)
            r7.m0 = r2
        L5f:
            java.lang.Object r8 = r7.p
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.AbstractC3682y2.a(r8)
            r7.l0 = r8
            goto L76
        L74:
            r7.l0 = r2
        L76:
            r7.J()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.o(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:118:0x01df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, E2 e2, MenuC3511uu menuC3511uu) {
        if (menuC3511uu == null) {
            if (e2 == null && i >= 0) {
                E2[] e2Arr = this.R;
                if (i < e2Arr.length) {
                    e2 = e2Arr[i];
                }
            }
            if (e2 != null) {
                menuC3511uu = e2.h;
            }
        }
        if ((e2 == null || e2.m) && !this.W) {
            WindowCallbackC3736z2 windowCallbackC3736z2 = this.s;
            Window.Callback callback = this.r.getCallback();
            windowCallbackC3736z2.getClass();
            try {
                windowCallbackC3736z2.d = true;
                callback.onPanelClosed(i, menuC3511uu);
            } finally {
                windowCallbackC3736z2.d = false;
            }
        }
    }

    public final void r(MenuC3511uu menuC3511uu) {
        A0 a0;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.x;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C3212pJ) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (a0 = actionMenuView.z) != null) {
            a0.i();
            C3572w0 c3572w0 = a0.z;
            if (c3572w0 != null && c3572w0.b()) {
                c3572w0.j.dismiss();
            }
        }
        Window.Callback callback = this.r.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, menuC3511uu);
        }
        this.Q = false;
    }

    public final void s(E2 e2, boolean z) {
        D2 d2;
        InterfaceC0086Ef interfaceC0086Ef;
        A0 a0;
        if (z && e2.a == 0 && (interfaceC0086Ef = this.x) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0086Ef;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((C3212pJ) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (a0 = actionMenuView.z) != null && a0.k()) {
                r(e2.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager != null && e2.m && (d2 = e2.e) != null) {
            windowManager.removeView(d2);
            if (z) {
                q(e2.a, e2, null);
            }
        }
        e2.k = false;
        e2.l = false;
        e2.m = false;
        e2.f = null;
        e2.n = true;
        if (this.S == e2) {
            this.S = null;
        }
        if (e2.a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F2.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        E2 e2A = A(i);
        if (e2A.h != null) {
            Bundle bundle = new Bundle();
            e2A.h.t(bundle);
            if (bundle.size() > 0) {
                e2A.p = bundle;
            }
            e2A.h.w();
            e2A.h.clear();
        }
        e2A.o = true;
        e2A.n = true;
        if ((i == 108 || i == 0) && this.x != null) {
            E2 e2A2 = A(0);
            e2A2.k = false;
            H(e2A2, null);
        }
    }

    public final void w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        int[] iArr = AbstractC2547dB.j;
        Context context = this.q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.O = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.r.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.N ? com.mxtunnel.pro.R.layout.abc_screen_simple_overlay_action_mode : com.mxtunnel.pro.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.mxtunnel.pro.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.mxtunnel.pro.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3439tc(context, typedValue.resourceId) : context).inflate(com.mxtunnel.pro.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0086Ef interfaceC0086Ef = (InterfaceC0086Ef) viewGroup.findViewById(com.mxtunnel.pro.R.id.decor_content_parent);
            this.x = interfaceC0086Ef;
            interfaceC0086Ef.setWindowCallback(this.r.getCallback());
            if (this.M) {
                ((ActionBarOverlayLayout) this.x).j(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.x).j(2);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.x).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        C3412t2 c3412t2 = new C3412t2(this);
        WeakHashMap weakHashMap = UL.a;
        ML.k(viewGroup, c3412t2);
        if (this.x == null) {
            this.H = (TextView) viewGroup.findViewById(com.mxtunnel.pro.R.id.title);
        }
        boolean z = AbstractC3270qM.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            e = e;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            e = e2;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.mxtunnel.pro.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.r.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.r.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C2524cp(this, 4));
        this.G = viewGroup;
        Object obj = this.p;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.w;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0086Ef interfaceC0086Ef2 = this.x;
            if (interfaceC0086Ef2 != null) {
                interfaceC0086Ef2.setWindowTitle(title);
            } else {
                C2668fN c2668fN = this.u;
                if (c2668fN != null) {
                    C3212pJ c3212pJ = (C3212pJ) c2668fN.q;
                    if (!c3212pJ.g) {
                        c3212pJ.h = title;
                        if ((c3212pJ.b & 8) != 0) {
                            Toolbar toolbar = c3212pJ.a;
                            toolbar.setTitle(title);
                            if (c3212pJ.g) {
                                UL.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.r.getDecorView();
        contentFrameLayout2.m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.F = true;
        E2 e2A = A(0);
        if (this.W || e2A.h != null) {
            return;
        }
        C(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
    }

    public final void x() {
        if (this.r == null) {
            Object obj = this.p;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final C2 y(Context context) {
        if (this.c0 == null) {
            if (D3.j == null) {
                Context applicationContext = context.getApplicationContext();
                D3.j = new D3(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.c0 = new A2(this, D3.j);
        }
        return this.c0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
