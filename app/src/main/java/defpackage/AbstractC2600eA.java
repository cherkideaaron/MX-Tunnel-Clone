package defpackage;

/* renamed from: eA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2600eA extends AbstractC2981l8 implements InterfaceC2908jr {
    public final boolean a;

    public AbstractC2600eA(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = false;
    }

    @Override // defpackage.AbstractC2981l8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2908jr getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC2635er interfaceC2635erCompute = compute();
        if (interfaceC2635erCompute != this) {
            return (InterfaceC2908jr) interfaceC2635erCompute;
        }
        throw new C0372Vc("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // defpackage.AbstractC2981l8
    public final InterfaceC2635er compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2600eA) {
            AbstractC2600eA abstractC2600eA = (AbstractC2600eA) obj;
            return getOwner().equals(abstractC2600eA.getOwner()) && getName().equals(abstractC2600eA.getName()) && getSignature().equals(abstractC2600eA.getSignature()) && AbstractC0500aq.b(getBoundReceiver(), abstractC2600eA.getBoundReceiver());
        }
        if (obj instanceof InterfaceC2908jr) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC2635er interfaceC2635erCompute = compute();
        if (interfaceC2635erCompute != this) {
            return interfaceC2635erCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
