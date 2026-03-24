package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import defpackage.AbstractC3123nm;
import defpackage.C2532cx;
import defpackage.C2667fM;
import defpackage.DD;
import defpackage.HD;
import defpackage.InterfaceC2586dx;
import defpackage.InterfaceC2722gM;
import defpackage.InterfaceC2806hx;
import defpackage.InterfaceC2840ic;
import defpackage.InterfaceC3024lx;
import defpackage.InterfaceC3079mx;
import defpackage.InterfaceC3189ox;
import defpackage.InterfaceC3619wu;
import defpackage.InterfaceC3773zm;
import defpackage.Jr;
import defpackage.Qu;
import defpackage.V0;
import defpackage.W0;

/* loaded from: classes.dex */
public final class p extends AbstractC3123nm implements InterfaceC2806hx, InterfaceC3189ox, InterfaceC3024lx, InterfaceC3079mx, InterfaceC2722gM, InterfaceC2586dx, W0, HD, InterfaceC3773zm, InterfaceC3619wu {
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(qVar);
        this.e = qVar;
    }

    @Override // defpackage.InterfaceC3773zm
    public final void a(l lVar) {
        this.e.onAttachFragment(lVar);
    }

    @Override // defpackage.InterfaceC3619wu
    public final void addMenuProvider(Qu qu) {
        this.e.addMenuProvider(qu);
    }

    @Override // defpackage.InterfaceC2806hx
    public final void addOnConfigurationChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.addOnConfigurationChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3024lx
    public final void addOnMultiWindowModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.addOnMultiWindowModeChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3079mx
    public final void addOnPictureInPictureModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.addOnPictureInPictureModeChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3189ox
    public final void addOnTrimMemoryListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.addOnTrimMemoryListener(interfaceC2840ic);
    }

    @Override // defpackage.AbstractC3013lm
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.AbstractC3013lm
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.W0
    public final V0 getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.Or
    public final Jr getLifecycle() {
        return this.e.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.InterfaceC2586dx
    public final C2532cx getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.HD
    public final DD getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.InterfaceC2722gM
    public final C2667fM getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.InterfaceC3619wu
    public final void removeMenuProvider(Qu qu) {
        this.e.removeMenuProvider(qu);
    }

    @Override // defpackage.InterfaceC2806hx
    public final void removeOnConfigurationChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.removeOnConfigurationChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3024lx
    public final void removeOnMultiWindowModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.removeOnMultiWindowModeChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3079mx
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.removeOnPictureInPictureModeChangedListener(interfaceC2840ic);
    }

    @Override // defpackage.InterfaceC3189ox
    public final void removeOnTrimMemoryListener(InterfaceC2840ic interfaceC2840ic) {
        this.e.removeOnTrimMemoryListener(interfaceC2840ic);
    }
}
