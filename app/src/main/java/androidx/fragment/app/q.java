package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.AbstractActivityC2619eb;
import defpackage.AbstractC3123nm;
import defpackage.AbstractC3641xF;
import defpackage.C0365Um;
import defpackage.C3068mm;
import defpackage.C3665xm;
import defpackage.CD;
import defpackage.Hr;
import defpackage.I0;
import defpackage.InterfaceC2840ic;
import defpackage.InterfaceC2859ix;
import defpackage.Ir;
import defpackage.Ns;
import defpackage.Qr;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class q extends AbstractActivityC2619eb implements I0 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C3068mm mFragments = new C3068mm(new p(this));
    final Qr mFragmentLifecycleRegistry = new Qr(this);
    boolean mStopped = true;

    public q() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new CD() { // from class: androidx.fragment.app.m
            @Override // defpackage.CD
            public final Bundle a() {
                q qVar = this.a;
                qVar.markFragmentsCreated();
                qVar.mFragmentLifecycleRegistry.e(Hr.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC2840ic(this) { // from class: androidx.fragment.app.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.b.mFragments.a();
                        break;
                    default:
                        this.b.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC2840ic(this) { // from class: androidx.fragment.app.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.mFragments.a();
                        break;
                    default:
                        this.b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC2859ix() { // from class: androidx.fragment.app.o
            @Override // defpackage.InterfaceC2859ix
            public final void a(Context context) {
                AbstractC3123nm abstractC3123nm = this.a.mFragments.a;
                abstractC3123nm.d.b(abstractC3123nm, abstractC3123nm, null);
            }
        });
    }

    public static boolean i(t tVar) {
        Ir ir = Ir.a;
        boolean zI = false;
        for (l lVar : tVar.c.f()) {
            if (lVar != null) {
                if (lVar.getHost() != null) {
                    zI |= i(lVar.getChildFragmentManager());
                }
                C0365Um c0365Um = lVar.mViewLifecycleOwner;
                if (c0365Um != null) {
                    c0365Um.b();
                    if (c0365Um.c.c.compareTo(Ir.d) >= 0) {
                        lVar.mViewLifecycleOwner.c.g();
                        zI = true;
                    }
                }
                if (lVar.mLifecycleRegistry.c.compareTo(Ir.d) >= 0) {
                    lVar.mLifecycleRegistry.g();
                    zI = true;
                }
            }
        }
        return zI;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                Ns.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.a.d.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public t getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @Deprecated
    public Ns getSupportLoaderManager() {
        return Ns.a(this);
    }

    public void markFragmentsCreated() {
        t supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            Ir ir = Ir.a;
        } while (i(supportFragmentManager));
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(l lVar) {
    }

    @Override // defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(Hr.ON_CREATE);
        C3665xm c3665xm = this.mFragments.a.d;
        c3665xm.E = false;
        c3665xm.F = false;
        c3665xm.L.g = false;
        c3665xm.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.k();
        this.mFragmentLifecycleRegistry.e(Hr.ON_DESTROY);
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.t(5);
        this.mFragmentLifecycleRegistry.e(Hr.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(Hr.ON_RESUME);
        C3665xm c3665xm = this.mFragments.a.d;
        c3665xm.E = false;
        c3665xm.F = false;
        c3665xm.L.g = false;
        c3665xm.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C3665xm c3665xm = this.mFragments.a.d;
            c3665xm.E = false;
            c3665xm.F = false;
            c3665xm.L.g = false;
            c3665xm.t(4);
        }
        this.mFragments.a.d.x(true);
        this.mFragmentLifecycleRegistry.e(Hr.ON_START);
        C3665xm c3665xm2 = this.mFragments.a.d;
        c3665xm2.E = false;
        c3665xm2.F = false;
        c3665xm2.L.g = false;
        c3665xm2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C3665xm c3665xm = this.mFragments.a.d;
        c3665xm.F = true;
        c3665xm.L.g = true;
        c3665xm.t(4);
        this.mFragmentLifecycleRegistry.e(Hr.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC3641xF abstractC3641xF) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC3641xF abstractC3641xF) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(l lVar, Intent intent, int i) {
        startActivityFromFragment(lVar, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(l lVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            lVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // defpackage.I0
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(l lVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            lVar.startActivityForResult(intent, i, bundle);
        }
    }
}
