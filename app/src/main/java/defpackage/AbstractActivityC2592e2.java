package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2592e2 extends q implements InterfaceC2812i2 {
    public F2 a;

    public AbstractActivityC2592e2() {
        getSavedStateRegistry().c("androidx:appcompat", new C0567c2(this));
        addOnContextAvailableListener(new C2538d2(this));
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        initializeViewTreeOwners();
        F2 f2 = (F2) j();
        f2.w();
        ((ViewGroup) f2.G.findViewById(R.id.content)).addView(view, layoutParams);
        f2.s.a(f2.r.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        F2 f2 = (F2) j();
        f2.U = true;
        int i = f2.Y;
        if (i == -100) {
            i = AbstractC3304r2.b;
        }
        int iD = f2.D(context, i);
        if (AbstractC3304r2.d(context) && AbstractC3304r2.d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC3304r2.o) {
                    try {
                        Us us = AbstractC3304r2.c;
                        if (us == null) {
                            if (AbstractC3304r2.d == null) {
                                AbstractC3304r2.d = Us.b(AbstractC0136He.F(context));
                            }
                            if (!AbstractC3304r2.d.a.isEmpty()) {
                                AbstractC3304r2.c = AbstractC3304r2.d;
                            }
                        } else if (!us.equals(AbstractC3304r2.d)) {
                            Us us2 = AbstractC3304r2.c;
                            AbstractC3304r2.d = us2;
                            AbstractC0136He.D(context, us2.a.a());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC3304r2.f) {
                AbstractC3304r2.a.execute(new RunnableC3030m2(context, 0));
            }
        }
        Us usP = F2.p(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(F2.t(context, iD, usP, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C3439tc) {
            try {
                ((C3439tc) context).a(F2.t(context, iD, usP, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (F2.p0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        AbstractC3574w2.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration configurationT = F2.t(context, iD, usP, configuration, true);
            C3439tc c3439tc = new C3439tc(context, com.mxtunnel.pro.R.style.Theme_AppCompat_Empty);
            c3439tc.a(configurationT);
            try {
                if (context.getTheme() != null) {
                    AbstractC2883jK.J(c3439tc.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c3439tc;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((F2) j()).B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.AbstractActivityC2565db, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        ((F2) j()).B();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        F2 f2 = (F2) j();
        f2.w();
        return f2.r.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F2 f2 = (F2) j();
        if (f2.v == null) {
            f2.B();
            C2668fN c2668fN = f2.u;
            f2.v = new RH(c2668fN != null ? c2668fN.V() : f2.q);
        }
        return f2.v;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC3701yL.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        j().c();
    }

    public final AbstractC3304r2 j() {
        if (this.a == null) {
            ExecutorC3250q2 executorC3250q2 = AbstractC3304r2.a;
            this.a = new F2(this, null, this, this);
        }
        return this.a;
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        F2 f2 = (F2) j();
        if (f2.L && f2.F) {
            f2.B();
            C2668fN c2668fN = f2.u;
            if (c2668fN != null) {
                c2668fN.Y(c2668fN.m.getResources().getBoolean(com.mxtunnel.pro.R.bool.abc_action_bar_embed_tabs));
            }
        }
        I2 i2A = I2.a();
        Context context = f2.q;
        synchronized (i2A) {
            i2A.a.k(context);
        }
        f2.X = new Configuration(f2.q.getResources().getConfiguration());
        f2.n(false, false);
    }

    @Override // androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentW;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        F2 f2 = (F2) j();
        f2.B();
        C2668fN c2668fN = f2.u;
        if (menuItem.getItemId() == 16908332 && c2668fN != null && (((C3212pJ) c2668fN.q).b & 4) != 0 && (intentW = AbstractC2883jK.w(this)) != null) {
            if (!shouldUpRecreateTask(intentW)) {
                navigateUpTo(intentW);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentW2 = AbstractC2883jK.w(this);
            if (intentW2 == null) {
                intentW2 = AbstractC2883jK.w(this);
            }
            if (intentW2 != null) {
                ComponentName component = intentW2.getComponent();
                if (component == null) {
                    component = intentW2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent intentX = AbstractC2883jK.x(this, component);
                        if (intentX == null) {
                            break;
                        }
                        arrayList.add(size, intentX);
                        component = intentX.getComponent();
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(intentW2);
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((F2) j()).w();
    }

    @Override // androidx.fragment.app.q, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        F2 f2 = (F2) j();
        f2.B();
        C2668fN c2668fN = f2.u;
        if (c2668fN != null) {
            c2668fN.F = true;
        }
    }

    @Override // androidx.fragment.app.q, android.app.Activity
    public void onStart() {
        super.onStart();
        ((F2) j()).n(true, false);
    }

    @Override // androidx.fragment.app.q, android.app.Activity
    public void onStop() {
        super.onStop();
        F2 f2 = (F2) j();
        f2.B();
        C2668fN c2668fN = f2.u;
        if (c2668fN != null) {
            c2668fN.F = false;
            C3623wy c3623wy = c2668fN.E;
            if (c3623wy != null) {
                c3623wy.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((F2) j()).B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void setContentView(int i) {
        initializeViewTreeOwners();
        j().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((F2) j()).Z = i;
    }

    @Override // androidx.fragment.app.q
    public final void supportInvalidateOptionsMenu() {
        j().c();
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j().j(view);
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
