package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Ir {
    public static final Ir a;
    public static final Ir b;
    public static final Ir c;
    public static final Ir d;
    public static final Ir e;
    public static final /* synthetic */ Ir[] f;

    static {
        Ir ir = new Ir("DESTROYED", 0);
        a = ir;
        Ir ir2 = new Ir("INITIALIZED", 1);
        b = ir2;
        Ir ir3 = new Ir("CREATED", 2);
        c = ir3;
        Ir ir4 = new Ir("STARTED", 3);
        d = ir4;
        Ir ir5 = new Ir("RESUMED", 4);
        e = ir5;
        Ir[] irArr = {ir, ir2, ir3, ir4, ir5};
        f = irArr;
        AbstractC2883jK.t(irArr);
    }

    public static Ir valueOf(String str) {
        return (Ir) Enum.valueOf(Ir.class, str);
    }

    public static Ir[] values() {
        return (Ir[]) f.clone();
    }

    public final boolean a(Ir ir) {
        return compareTo(ir) >= 0;
    }
}
