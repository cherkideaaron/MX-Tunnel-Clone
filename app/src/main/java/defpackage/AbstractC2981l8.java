package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: l8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2981l8 implements InterfaceC2635er, Serializable {
    public static final Object NO_RECEIVER = C2926k8.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2635er reflected;
    private final String signature;

    public AbstractC2981l8(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.InterfaceC2635er
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.InterfaceC2635er
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2635er compute() {
        InterfaceC2635er interfaceC2635er = this.reflected;
        if (interfaceC2635er != null) {
            return interfaceC2635er;
        }
        InterfaceC2635er interfaceC2635erComputeReflected = computeReflected();
        this.reflected = interfaceC2635erComputeReflected;
        return interfaceC2635erComputeReflected;
    }

    public abstract InterfaceC2635er computeReflected();

    @Override // defpackage.InterfaceC2580dr
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.InterfaceC2635er
    public String getName() {
        return this.name;
    }

    public InterfaceC2745gr getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return PB.a(cls);
        }
        PB.a.getClass();
        return new Gy(cls);
    }

    @Override // defpackage.InterfaceC2635er
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC2635er getReflected();

    @Override // defpackage.InterfaceC2635er
    public InterfaceC3018lr getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.InterfaceC2635er
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.InterfaceC2635er
    public EnumC3073mr getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.InterfaceC2635er
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.InterfaceC2635er
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.InterfaceC2635er
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
