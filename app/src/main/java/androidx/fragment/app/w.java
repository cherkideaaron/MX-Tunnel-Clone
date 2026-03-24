package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0076Dm;
import defpackage.AbstractC3123nm;
import defpackage.AbstractC3264qG;
import defpackage.C0059Cm;
import defpackage.C0093Em;
import defpackage.C3178om;
import defpackage.C3395sm;
import defpackage.EnumC0042Bm;
import defpackage.InterfaceC2722gM;
import defpackage.Ir;
import defpackage.J8;
import defpackage.KL;
import defpackage.UL;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w {
    public final C3178om a;
    public final x b;
    public final l c;
    public boolean d = false;
    public int e = -1;

    public w(C3178om c3178om, x xVar, l lVar) {
        this.a = c3178om;
        this.b = xVar;
        this.c = lVar;
    }

    public final void a() {
        View view;
        View view2;
        x xVar = this.b;
        xVar.getClass();
        l lVar = this.c;
        ViewGroup viewGroup = lVar.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = xVar.a;
            int iIndexOf = arrayList.indexOf(lVar);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        l lVar2 = (l) arrayList.get(iIndexOf);
                        if (lVar2.mContainer == viewGroup && (view = lVar2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    l lVar3 = (l) arrayList.get(i);
                    if (lVar3.mContainer == viewGroup && (view2 = lVar3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        lVar.mContainer.addView(lVar.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        l lVar = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + lVar);
        }
        l lVar2 = lVar.mTarget;
        w wVar = null;
        x xVar = this.b;
        if (lVar2 != null) {
            w wVar2 = (w) xVar.b.get(lVar2.mWho);
            if (wVar2 == null) {
                throw new IllegalStateException("Fragment " + lVar + " declared target fragment " + lVar.mTarget + " that does not belong to this FragmentManager!");
            }
            lVar.mTargetWho = lVar.mTarget.mWho;
            lVar.mTarget = null;
            wVar = wVar2;
        } else {
            String str = lVar.mTargetWho;
            if (str != null && (wVar = (w) xVar.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(lVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC3264qG.l(sb, lVar.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (wVar != null) {
            wVar.j();
        }
        t tVar = lVar.mFragmentManager;
        lVar.mHost = tVar.t;
        lVar.mParentFragment = tVar.v;
        C3178om c3178om = this.a;
        c3178om.m(false);
        lVar.performAttach();
        c3178om.g(false);
    }

    public final int c() {
        z zVar;
        l lVar = this.c;
        if (lVar.mFragmentManager == null) {
            return lVar.mState;
        }
        int iMin = this.e;
        int iOrdinal = lVar.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (lVar.mFromLayout) {
            if (lVar.mInLayout) {
                iMin = Math.max(this.e, 2);
                View view = lVar.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, lVar.mState) : Math.min(iMin, 1);
            }
        }
        if (!lVar.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = lVar.mContainer;
        if (viewGroup != null) {
            f fVarI = f.i(viewGroup, lVar.getParentFragmentManager());
            fVarI.getClass();
            z zVarF = fVarI.f(lVar);
            i = zVarF != null ? zVarF.b : 0;
            Iterator it = fVarI.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zVar = null;
                    break;
                }
                zVar = (z) it.next();
                if (zVar.c.equals(lVar) && !zVar.f) {
                    break;
                }
            }
            if (zVar != null && (i == 0 || i == 1)) {
                i = zVar.b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (lVar.mRemoving) {
            iMin = lVar.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (lVar.mDeferStart && lVar.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + lVar);
        }
        return iMin;
    }

    public final void d() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        l lVar = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + lVar);
        }
        if (lVar.mIsCreated) {
            lVar.restoreChildFragmentState(lVar.mSavedFragmentState);
            lVar.mState = 1;
        } else {
            C3178om c3178om = this.a;
            c3178om.n(false);
            lVar.performCreate(lVar.mSavedFragmentState);
            c3178om.h(false);
        }
    }

    public final void e() throws Resources.NotFoundException {
        String resourceName;
        l lVar = this.c;
        if (lVar.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + lVar);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = lVar.performGetLayoutInflater(lVar.mSavedFragmentState);
        ViewGroup viewGroup = lVar.mContainer;
        if (viewGroup == null) {
            int i = lVar.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(AbstractC3264qG.f("Cannot create fragment ", lVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) lVar.mFragmentManager.u.b(i);
                if (viewGroup == null) {
                    if (!lVar.mRestored) {
                        try {
                            resourceName = lVar.getResources().getResourceName(lVar.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(lVar.mContainerId) + " (" + resourceName + ") for fragment " + lVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0059Cm c0059Cm = AbstractC0076Dm.a;
                    AbstractC0076Dm.b(new C0093Em(lVar, viewGroup, 1));
                    AbstractC0076Dm.a(lVar).getClass();
                    Object obj = EnumC0042Bm.f;
                    if (obj instanceof Void) {
                    }
                }
            }
        }
        lVar.mContainer = viewGroup;
        lVar.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, lVar.mSavedFragmentState);
        View view = lVar.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            lVar.mView.setTag(R.id.fragment_container_view_tag, lVar);
            if (viewGroup != null) {
                a();
            }
            if (lVar.mHidden) {
                lVar.mView.setVisibility(8);
            }
            View view2 = lVar.mView;
            WeakHashMap weakHashMap = UL.a;
            if (view2.isAttachedToWindow()) {
                KL.c(lVar.mView);
            } else {
                View view3 = lVar.mView;
                view3.addOnAttachStateChangeListener(new J8(view3, 2));
            }
            lVar.performViewCreated();
            this.a.s(false);
            int visibility = lVar.mView.getVisibility();
            lVar.setPostOnViewCreatedAlpha(lVar.mView.getAlpha());
            if (lVar.mContainer != null && visibility == 0) {
                View viewFindFocus = lVar.mView.findFocus();
                if (viewFindFocus != null) {
                    lVar.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + lVar);
                    }
                }
                lVar.mView.setAlpha(0.0f);
            }
        }
        lVar.mState = 2;
    }

    public final void f() {
        l lVarB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        l lVar = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + lVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = lVar.mRemoving && !lVar.isInBackStack();
        x xVar = this.b;
        if (z && !lVar.mBeingSaved) {
        }
        if (!z) {
            u uVar = xVar.d;
            if (!((uVar.b.containsKey(lVar.mWho) && uVar.e) ? uVar.f : true)) {
                String str = lVar.mTargetWho;
                if (str != null && (lVarB = xVar.b(str)) != null && lVarB.mRetainInstance) {
                    lVar.mTarget = lVarB;
                }
                lVar.mState = 0;
                return;
            }
        }
        AbstractC3123nm abstractC3123nm = lVar.mHost;
        if (abstractC3123nm instanceof InterfaceC2722gM) {
            zIsChangingConfigurations = xVar.d.f;
        } else {
            Context context = abstractC3123nm.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z && !lVar.mBeingSaved) || zIsChangingConfigurations) {
            xVar.d.d(lVar);
        }
        lVar.performDestroy();
        this.a.i(false);
        Iterator it = xVar.d().iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar != null) {
                String str2 = lVar.mWho;
                l lVar2 = wVar.c;
                if (str2.equals(lVar2.mTargetWho)) {
                    lVar2.mTarget = lVar;
                    lVar2.mTargetWho = null;
                }
            }
        }
        String str3 = lVar.mTargetWho;
        if (str3 != null) {
            lVar.mTarget = xVar.b(str3);
        }
        xVar.h(this);
    }

    public final void g() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        l lVar = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + lVar);
        }
        ViewGroup viewGroup = lVar.mContainer;
        if (viewGroup != null && (view = lVar.mView) != null) {
            viewGroup.removeView(view);
        }
        lVar.performDestroyView();
        this.a.t(false);
        lVar.mContainer = null;
        lVar.mView = null;
        lVar.mViewLifecycleOwner = null;
        lVar.mViewLifecycleOwnerLiveData.h(null);
        lVar.mInLayout = false;
    }

    public final void h() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        l lVar = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + lVar);
        }
        lVar.performDetach();
        this.a.k(false);
        lVar.mState = -1;
        lVar.mHost = null;
        lVar.mParentFragment = null;
        lVar.mFragmentManager = null;
        if (!lVar.mRemoving || lVar.isInBackStack()) {
            u uVar = this.b.d;
            boolean z = true;
            if (uVar.b.containsKey(lVar.mWho) && uVar.e) {
                z = uVar.f;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + lVar);
        }
        lVar.initState();
    }

    public final void i() {
        l lVar = this.c;
        if (lVar.mFromLayout && lVar.mInLayout && !lVar.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + lVar);
            }
            lVar.performCreateView(lVar.performGetLayoutInflater(lVar.mSavedFragmentState), null, lVar.mSavedFragmentState);
            View view = lVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                lVar.mView.setTag(R.id.fragment_container_view_tag, lVar);
                if (lVar.mHidden) {
                    lVar.mView.setVisibility(8);
                }
                lVar.performViewCreated();
                this.a.s(false);
                lVar.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        l lVar = this.c;
        if (z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + lVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = lVar.mState;
                x xVar = this.b;
                if (iC == i) {
                    if (!z2 && i == -1 && lVar.mRemoving && !lVar.isInBackStack() && !lVar.mBeingSaved) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + lVar);
                        }
                        xVar.d.d(lVar);
                        xVar.h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + lVar);
                        }
                        lVar.initState();
                    }
                    if (lVar.mHiddenChanged) {
                        if (lVar.mView != null && (viewGroup = lVar.mContainer) != null) {
                            f fVarI = f.i(viewGroup, lVar.getParentFragmentManager());
                            if (lVar.mHidden) {
                                fVarI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + lVar);
                                }
                                fVarI.b(3, 1, this);
                            } else {
                                fVarI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + lVar);
                                }
                                fVarI.b(2, 1, this);
                            }
                        }
                        t tVar = lVar.mFragmentManager;
                        if (tVar != null && lVar.mAdded && t.G(lVar)) {
                            tVar.D = true;
                        }
                        lVar.mHiddenChanged = false;
                        lVar.onHiddenChanged(lVar.mHidden);
                        lVar.mChildFragmentManager.n();
                    }
                    this.d = false;
                    return;
                }
                C3178om c3178om = this.a;
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (lVar.mBeingSaved) {
                                if (((v) xVar.c.get(lVar.mWho)) == null) {
                                    m();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            lVar.mState = 1;
                            break;
                        case 2:
                            lVar.mInLayout = false;
                            lVar.mState = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + lVar);
                            }
                            if (lVar.mBeingSaved) {
                                m();
                            } else if (lVar.mView != null && lVar.mSavedViewState == null) {
                                n();
                            }
                            if (lVar.mView != null && (viewGroup2 = lVar.mContainer) != null) {
                                f fVarI2 = f.i(viewGroup2, lVar.getParentFragmentManager());
                                fVarI2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + lVar);
                                }
                                fVarI2.b(1, 3, this);
                            }
                            lVar.mState = 3;
                            break;
                        case 4:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + lVar);
                            }
                            lVar.performStop();
                            c3178om.r(false);
                            break;
                        case 5:
                            lVar.mState = 5;
                            break;
                        case 6:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + lVar);
                            }
                            lVar.performPause();
                            c3178om.l(false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + lVar);
                            }
                            lVar.performActivityCreated(lVar.mSavedFragmentState);
                            c3178om.f(false);
                            break;
                        case 4:
                            if (lVar.mView != null && (viewGroup3 = lVar.mContainer) != null) {
                                f fVarI3 = f.i(viewGroup3, lVar.getParentFragmentManager());
                                int iB = Vs.b(lVar.mView.getVisibility());
                                fVarI3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + lVar);
                                }
                                fVarI3.b(iB, 2, this);
                            }
                            lVar.mState = 4;
                            break;
                        case 5:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + lVar);
                            }
                            lVar.performStart();
                            c3178om.q(false);
                            break;
                        case 6:
                            lVar.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k(ClassLoader classLoader) {
        l lVar = this.c;
        Bundle bundle = lVar.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        lVar.mSavedViewState = lVar.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        lVar.mSavedViewRegistryState = lVar.mSavedFragmentState.getBundle("android:view_registry_state");
        lVar.mTargetWho = lVar.mSavedFragmentState.getString("android:target_state");
        if (lVar.mTargetWho != null) {
            lVar.mTargetRequestCode = lVar.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = lVar.mSavedUserVisibleHint;
        if (bool != null) {
            lVar.mUserVisibleHint = bool.booleanValue();
            lVar.mSavedUserVisibleHint = null;
        } else {
            lVar.mUserVisibleHint = lVar.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (lVar.mUserVisibleHint) {
            return;
        }
        lVar.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 3
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            androidx.fragment.app.l r2 = r6.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            om r1 = r6.a
            r3 = 0
            r1.o(r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.l():void");
    }

    public final void m() {
        l lVar = this.c;
        v vVar = new v(lVar);
        if (lVar.mState <= -1 || vVar.s != null) {
            vVar.s = lVar.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            lVar.performSaveInstanceState(bundle);
            this.a.p(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (lVar.mView != null) {
                n();
            }
            if (lVar.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", lVar.mSavedViewState);
            }
            if (lVar.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", lVar.mSavedViewRegistryState);
            }
            if (!lVar.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", lVar.mUserVisibleHint);
            }
            vVar.s = bundle;
            if (lVar.mTargetWho != null) {
                if (bundle == null) {
                    vVar.s = new Bundle();
                }
                vVar.s.putString("android:target_state", lVar.mTargetWho);
                int i = lVar.mTargetRequestCode;
                if (i != 0) {
                    vVar.s.putInt("android:target_req_state", i);
                }
            }
        }
    }

    public final void n() {
        l lVar = this.c;
        if (lVar.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + lVar + " with view " + lVar.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        lVar.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            lVar.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        lVar.mViewLifecycleOwner.d.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        lVar.mSavedViewRegistryState = bundle;
    }

    public w(C3178om c3178om, x xVar, l lVar, v vVar) {
        this.a = c3178om;
        this.b = xVar;
        this.c = lVar;
        lVar.mSavedViewState = null;
        lVar.mSavedViewRegistryState = null;
        lVar.mBackStackNesting = 0;
        lVar.mInLayout = false;
        lVar.mAdded = false;
        l lVar2 = lVar.mTarget;
        lVar.mTargetWho = lVar2 != null ? lVar2.mWho : null;
        lVar.mTarget = null;
        Bundle bundle = vVar.s;
        lVar.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public w(C3178om c3178om, x xVar, ClassLoader classLoader, C3395sm c3395sm, v vVar) {
        this.a = c3178om;
        this.b = xVar;
        l lVarInstantiate = l.instantiate(c3395sm.a.t.b, vVar.a, null);
        Bundle bundle = vVar.p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        lVarInstantiate.setArguments(bundle);
        lVarInstantiate.mWho = vVar.b;
        lVarInstantiate.mFromLayout = vVar.c;
        lVarInstantiate.mRestored = true;
        lVarInstantiate.mFragmentId = vVar.d;
        lVarInstantiate.mContainerId = vVar.e;
        lVarInstantiate.mTag = vVar.f;
        lVarInstantiate.mRetainInstance = vVar.m;
        lVarInstantiate.mRemoving = vVar.n;
        lVarInstantiate.mDetached = vVar.o;
        lVarInstantiate.mHidden = vVar.q;
        lVarInstantiate.mMaxState = Ir.values()[vVar.r];
        Bundle bundle2 = vVar.s;
        lVarInstantiate.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        this.c = lVarInstantiate;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + lVarInstantiate);
        }
    }
}
