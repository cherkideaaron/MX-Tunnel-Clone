package defpackage;

/* renamed from: Dn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0077Dn extends AbstractC2981l8 implements InterfaceC0060Cn, InterfaceC2800hr {
    private final int arity;
    private final int flags;

    public AbstractC0077Dn(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.AbstractC2981l8
    public InterfaceC2635er computeReflected() {
        PB.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0077Dn) {
            AbstractC0077Dn abstractC0077Dn = (AbstractC0077Dn) obj;
            return getName().equals(abstractC0077Dn.getName()) && getSignature().equals(abstractC0077Dn.getSignature()) && this.flags == abstractC0077Dn.flags && this.arity == abstractC0077Dn.arity && AbstractC0500aq.b(getBoundReceiver(), abstractC0077Dn.getBoundReceiver()) && AbstractC0500aq.b(getOwner(), abstractC0077Dn.getOwner());
        }
        if (obj instanceof InterfaceC2800hr) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.InterfaceC0060Cn
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC2800hr
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.InterfaceC2800hr
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.InterfaceC2800hr
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.InterfaceC2800hr
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.InterfaceC2800hr
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2635er interfaceC2635erCompute = compute();
        if (interfaceC2635erCompute != this) {
            return interfaceC2635erCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.AbstractC2981l8
    public InterfaceC2800hr getReflected() {
        InterfaceC2635er interfaceC2635erCompute = compute();
        if (interfaceC2635erCompute != this) {
            return (InterfaceC2800hr) interfaceC2635erCompute;
        }
        throw new C0372Vc("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
