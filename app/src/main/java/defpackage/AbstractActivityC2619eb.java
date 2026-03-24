package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2619eb extends AbstractActivityC2565db implements InterfaceC2722gM, InterfaceC3235po, HD, InterfaceC2586dx, W0, InterfaceC2806hx, InterfaceC3189ox, InterfaceC3024lx, InterfaceC3079mx, InterfaceC3619wu {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final V0 mActivityResultRegistry;
    private int mContentLayoutId;
    private InterfaceC2612eM mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final C0552bn mFullyDrawnReporter;
    private final Au mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private C2532cx mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC2840ic> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2840ic> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2840ic> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2840ic> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2840ic> mOnTrimMemoryListeners;
    final InterfaceExecutorC0540bb mReportFullyDrawnExecutor;
    final ED mSavedStateRegistryController;
    private C2667fM mViewModelStore;
    final C3331rc mContextAwareHelper = new C3331rc();
    private final Qr mLifecycleRegistry = new Qr(this);

    public AbstractActivityC2619eb() {
        final q qVar = (q) this;
        this.mMenuHostHelper = new Au(new H0(qVar, 4));
        GD gd = new GD(this, new C0336Ta(this, 3));
        this.mSavedStateRegistryController = new ED(gd);
        this.mOnBackPressedDispatcher = null;
        ViewTreeObserverOnDrawListenerC0594cb viewTreeObserverOnDrawListenerC0594cb = new ViewTreeObserverOnDrawListenerC0594cb(qVar);
        this.mReportFullyDrawnExecutor = viewTreeObserverOnDrawListenerC0594cb;
        this.mFullyDrawnReporter = new C0552bn(viewTreeObserverOnDrawListenerC0594cb, new C0336Ta(qVar, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0387Wa(qVar);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        getLifecycle().a(new C0404Xa(qVar, 1));
        getLifecycle().a(new C0404Xa(qVar, 0));
        getLifecycle().a(new C0404Xa(qVar, 2));
        gd.a();
        AbstractC3296qu.o(this);
        if (i <= 23) {
            Jr lifecycle = getLifecycle();
            C2984lB c2984lB = new C2984lB();
            c2984lB.b = this;
            lifecycle.a(c2984lB);
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C0353Ua(qVar, 0));
        addOnContextAvailableListener(new InterfaceC2859ix() { // from class: Va
            @Override // defpackage.InterfaceC2859ix
            public final void a(Context context) {
                AbstractActivityC2619eb.g(qVar);
            }
        });
    }

    public static void g(AbstractActivityC2619eb abstractActivityC2619eb) {
        Bundle bundleA = abstractActivityC2619eb.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            V0 v0 = abstractActivityC2619eb.mActivityResultRegistry;
            v0.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            v0.d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = v0.g;
            bundle2.putAll(bundle);
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                HashMap map = v0.b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = v0.a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    public static Bundle h(AbstractActivityC2619eb abstractActivityC2619eb) {
        abstractActivityC2619eb.getClass();
        Bundle bundle = new Bundle();
        V0 v0 = abstractActivityC2619eb.mActivityResultRegistry;
        v0.getClass();
        HashMap map = v0.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(v0.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) v0.g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.InterfaceC3619wu
    public void addMenuProvider(Qu qu) {
        Au au = this.mMenuHostHelper;
        au.b.add(qu);
        au.a.run();
    }

    @Override // defpackage.InterfaceC2806hx
    public final void addOnConfigurationChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnConfigurationChangedListeners.add(interfaceC2840ic);
    }

    public final void addOnContextAvailableListener(InterfaceC2859ix interfaceC2859ix) {
        C3331rc c3331rc = this.mContextAwareHelper;
        c3331rc.getClass();
        AbstractC0500aq.m(interfaceC2859ix, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = c3331rc.b;
        if (context != null) {
            interfaceC2859ix.a(context);
        }
        c3331rc.a.add(interfaceC2859ix);
    }

    @Override // defpackage.InterfaceC3024lx
    public final void addOnMultiWindowModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC2840ic);
    }

    public final void addOnNewIntentListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnNewIntentListeners.add(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3079mx
    public final void addOnPictureInPictureModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3189ox
    public final void addOnTrimMemoryListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnTrimMemoryListeners.add(interfaceC2840ic);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0485ab c0485ab = (C0485ab) getLastNonConfigurationInstance();
            if (c0485ab != null) {
                this.mViewModelStore = c0485ab.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C2667fM();
            }
        }
    }

    @Override // defpackage.W0
    public final V0 getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // defpackage.InterfaceC3235po
    public AbstractC0424Yd getDefaultViewModelCreationExtras() {
        Pv pv = new Pv();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = pv.a;
        if (application != null) {
            linkedHashMap.put(C2558dM.e, getApplication());
        }
        linkedHashMap.put(AbstractC3296qu.e, this);
        linkedHashMap.put(AbstractC3296qu.f, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC3296qu.g, getIntent().getExtras());
        }
        return pv;
    }

    public InterfaceC2612eM getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new ID(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public C0552bn getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0485ab c0485ab = (C0485ab) getLastNonConfigurationInstance();
        if (c0485ab != null) {
            return c0485ab.a;
        }
        return null;
    }

    @Override // defpackage.Or
    public Jr getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // defpackage.InterfaceC2586dx
    public final C2532cx getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new C2532cx(new RunnableC2705g5(this, 2));
            getLifecycle().a(new C0404Xa(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.HD
    public final DD getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    @Override // defpackage.InterfaceC2722gM
    public C2667fM getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC0500aq.m(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0500aq.m(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0500aq.m(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0500aq.m(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0500aq.m(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC2840ic> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    @Override // defpackage.AbstractActivityC2565db, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.a(bundle);
        C3331rc c3331rc = this.mContextAwareHelper;
        c3331rc.getClass();
        c3331rc.b = this;
        Iterator it = c3331rc.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2859ix) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC2930kC.b;
        AbstractC0500aq.M(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        Au au = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = au.b.iterator();
        while (it.hasNext()) {
            ((C3341rm) ((Qu) it.next())).a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2840ic> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new Mv(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC2840ic> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C3341rm) ((Qu) it.next())).a.p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2840ic> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new Vy(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.mMenuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C3341rm) ((Qu) it.next())).a.s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0485ab c0485ab;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C2667fM c2667fM = this.mViewModelStore;
        if (c2667fM == null && (c0485ab = (C0485ab) getLastNonConfigurationInstance()) != null) {
            c2667fM = c0485ab.b;
        }
        if (c2667fM == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0485ab c0485ab2 = new C0485ab();
        c0485ab2.a = objOnRetainCustomNonConfigurationInstance;
        c0485ab2.b = c2667fM;
        return c0485ab2;
    }

    @Override // defpackage.AbstractActivityC2565db, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Jr lifecycle = getLifecycle();
        if (lifecycle instanceof Qr) {
            Ir ir = Ir.a;
            ((Qr) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC2840ic> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    public final <I, O> Q0 registerForActivityResult(O0 o0, N0 n0) {
        return registerForActivityResult(o0, this.mActivityResultRegistry, n0);
    }

    @Override // defpackage.InterfaceC3619wu
    public void removeMenuProvider(Qu qu) {
        this.mMenuHostHelper.b(qu);
    }

    @Override // defpackage.InterfaceC2806hx
    public final void removeOnConfigurationChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnConfigurationChangedListeners.remove(interfaceC2840ic);
    }

    public final void removeOnContextAvailableListener(InterfaceC2859ix interfaceC2859ix) {
        C3331rc c3331rc = this.mContextAwareHelper;
        c3331rc.getClass();
        AbstractC0500aq.m(interfaceC2859ix, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c3331rc.a.remove(interfaceC2859ix);
    }

    @Override // defpackage.InterfaceC3024lx
    public final void removeOnMultiWindowModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC2840ic);
    }

    public final void removeOnNewIntentListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnNewIntentListeners.remove(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3079mx
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3189ox
    public final void removeOnTrimMemoryListener(InterfaceC2840ic interfaceC2840ic) {
        this.mOnTrimMemoryListeners.remove(interfaceC2840ic);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0115Ga.F()) {
                AbstractC0115Ga.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2840ic> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                InterfaceC2840ic next = it.next();
                AbstractC0500aq.m(configuration, "newConfig");
                next.a(new Mv(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2840ic> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                InterfaceC2840ic next = it.next();
                AbstractC0500aq.m(configuration, "newConfig");
                next.a(new Vy(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> Q0 registerForActivityResult(O0 o0, V0 v0, N0 n0) {
        return v0.d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, o0, n0);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(final Qu qu, Or or) {
        final Au au = this.mMenuHostHelper;
        au.b.add(qu);
        au.a.run();
        Jr lifecycle = or.getLifecycle();
        HashMap map = au.c;
        C3781zu c3781zu = (C3781zu) map.remove(qu);
        if (c3781zu != null) {
            c3781zu.a.b(c3781zu.b);
            c3781zu.b = null;
        }
        map.put(qu, new C3781zu(lifecycle, new Mr() { // from class: yu
            @Override // defpackage.Mr
            public final void c(Or or2, Hr hr) {
                Au au2 = au;
                au2.getClass();
                if (hr == Hr.ON_DESTROY) {
                    au2.b(qu);
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final Qu qu, Or or, final Ir ir) {
        final Au au = this.mMenuHostHelper;
        au.getClass();
        Jr lifecycle = or.getLifecycle();
        HashMap map = au.c;
        C3781zu c3781zu = (C3781zu) map.remove(qu);
        if (c3781zu != null) {
            c3781zu.a.b(c3781zu.b);
            c3781zu.b = null;
        }
        map.put(qu, new C3781zu(lifecycle, new Mr() { // from class: xu
            @Override // defpackage.Mr
            public final void c(Or or2, Hr hr) {
                Au au2 = au;
                au2.getClass();
                Hr.Companion.getClass();
                Ir ir2 = ir;
                AbstractC0500aq.m(ir2, "state");
                int iOrdinal = ir2.ordinal();
                Hr hr2 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : Hr.ON_RESUME : Hr.ON_START : Hr.ON_CREATE;
                Runnable runnable = au2.a;
                CopyOnWriteArrayList copyOnWriteArrayList = au2.b;
                Qu qu2 = qu;
                if (hr == hr2) {
                    copyOnWriteArrayList.add(qu2);
                    runnable.run();
                } else if (hr == Hr.ON_DESTROY) {
                    au2.b(qu2);
                } else if (hr == Fr.a(ir2)) {
                    copyOnWriteArrayList.remove(qu2);
                    runnable.run();
                }
            }
        }));
    }
}
