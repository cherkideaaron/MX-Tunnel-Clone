package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3241pu {
    public final MeasurementManager a;

    public AbstractC3241pu(MeasurementManager measurementManager) {
        AbstractC0500aq.m(measurementManager, "mMeasurementManager");
        this.a = measurementManager;
    }

    public static Object b(AbstractC3241pu abstractC3241pu, AbstractC3767zg abstractC3767zg, InterfaceC3493uc interfaceC3493uc) {
        new B8(1, AbstractC0069Df.C(interfaceC3493uc)).s();
        MeasurementManager measurementManager = abstractC3241pu.a;
        throw null;
    }

    public static Object d(AbstractC3241pu abstractC3241pu, InterfaceC3493uc interfaceC3493uc) {
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        abstractC3241pu.a.getMeasurementApiStatus(new P3(1), new C3655xc(b8));
        Object objR = b8.r();
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objR;
    }

    public static Object g(AbstractC3241pu abstractC3241pu, AbstractC3372sG abstractC3372sG, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objH = AbstractC0136He.h(new C3186ou(abstractC3241pu, null), interfaceC3493uc);
        return objH == EnumC0321Sc.a ? objH : DK.a;
    }

    public static Object h(AbstractC3241pu abstractC3241pu, Uri uri, InputEvent inputEvent, InterfaceC3493uc interfaceC3493uc) {
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        abstractC3241pu.a.registerSource(uri, inputEvent, new P3(1), new C3655xc(b8));
        Object objR = b8.r();
        return objR == EnumC0321Sc.a ? objR : DK.a;
    }

    public static Object j(AbstractC3241pu abstractC3241pu, Uri uri, InterfaceC3493uc interfaceC3493uc) {
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        abstractC3241pu.a.registerTrigger(uri, new P3(1), new C3655xc(b8));
        Object objR = b8.r();
        return objR == EnumC0321Sc.a ? objR : DK.a;
    }

    public static Object l(AbstractC3241pu abstractC3241pu, PM pm, InterfaceC3493uc interfaceC3493uc) {
        new B8(1, AbstractC0069Df.C(interfaceC3493uc)).s();
        MeasurementManager measurementManager = abstractC3241pu.a;
        throw null;
    }

    public static Object n(AbstractC3241pu abstractC3241pu, QM qm, InterfaceC3493uc interfaceC3493uc) {
        new B8(1, AbstractC0069Df.C(interfaceC3493uc)).s();
        MeasurementManager measurementManager = abstractC3241pu.a;
        throw null;
    }

    @Nullable
    public Object a(@NotNull AbstractC3767zg abstractC3767zg, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return b(this, abstractC3767zg, interfaceC3493uc);
    }

    @Nullable
    public Object c(@NotNull InterfaceC3493uc interfaceC3493uc) {
        return d(this, interfaceC3493uc);
    }

    @Nullable
    public Object e(@NotNull AbstractC3372sG abstractC3372sG, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return g(this, abstractC3372sG, interfaceC3493uc);
    }

    @Nullable
    public Object f(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return h(this, uri, inputEvent, interfaceC3493uc);
    }

    @Nullable
    public Object i(@NotNull Uri uri, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return j(this, uri, interfaceC3493uc);
    }

    @Nullable
    public Object k(@NotNull PM pm, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return l(this, pm, interfaceC3493uc);
    }

    @Nullable
    public Object m(@NotNull QM qm, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return n(this, qm, interfaceC3493uc);
    }
}
