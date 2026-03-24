package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Q9 {
    public static final Q9 a;
    public static final /* synthetic */ Q9[] b;

    static {
        Q9 q9 = new Q9("NONE", 0);
        Q9 q92 = new Q9("ALL_JSON_OBJECTS", 1);
        Q9 q93 = new Q9("POLYMORPHIC", 2);
        a = q93;
        Q9[] q9Arr = {q9, q92, q93};
        b = q9Arr;
        AbstractC2883jK.t(q9Arr);
    }

    public static Q9 valueOf(String str) {
        return (Q9) Enum.valueOf(Q9.class, str);
    }

    public static Q9[] values() {
        return (Q9[]) b.clone();
    }
}
