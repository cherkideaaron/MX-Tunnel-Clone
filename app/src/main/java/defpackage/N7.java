package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class N7 {
    public static final N7 a;
    public static final N7 b;
    public static final N7 c;
    public static final /* synthetic */ N7[] d;

    static {
        N7 n7 = new N7("SUSPEND", 0);
        a = n7;
        N7 n72 = new N7("DROP_OLDEST", 1);
        b = n72;
        N7 n73 = new N7("DROP_LATEST", 2);
        c = n73;
        N7[] n7Arr = {n7, n72, n73};
        d = n7Arr;
        AbstractC2883jK.t(n7Arr);
    }

    public static N7 valueOf(String str) {
        return (N7) Enum.valueOf(N7.class, str);
    }

    public static N7[] values() {
        return (N7[]) d.clone();
    }
}
