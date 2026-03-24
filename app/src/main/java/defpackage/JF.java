package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class JF {
    public static final JF a;
    public static final JF b;
    public static final /* synthetic */ JF[] c;

    static {
        JF jf = new JF("GENERAL", 0);
        a = jf;
        JF jf2 = new JF("FALLBACK", 1);
        b = jf2;
        JF[] jfArr = {jf, jf2};
        c = jfArr;
        AbstractC2883jK.t(jfArr);
    }

    public static JF valueOf(String str) {
        return (JF) Enum.valueOf(JF.class, str);
    }

    public static JF[] values() {
        return (JF[]) c.clone();
    }
}
