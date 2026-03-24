package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Bz {
    public static final Bz a;
    public static final Bz b;
    public static final Bz c;
    public static final /* synthetic */ Bz[] d;

    static {
        Bz bz = new Bz("DEFAULT", 0);
        a = bz;
        Bz bz2 = new Bz("VERY_LOW", 1);
        b = bz2;
        Bz bz3 = new Bz("HIGHEST", 2);
        c = bz3;
        d = new Bz[]{bz, bz2, bz3};
    }

    public static Bz valueOf(String str) {
        return (Bz) Enum.valueOf(Bz.class, str);
    }

    public static Bz[] values() {
        return (Bz[]) d.clone();
    }
}
