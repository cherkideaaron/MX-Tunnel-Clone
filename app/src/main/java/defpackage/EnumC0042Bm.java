package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0042Bm {
    public static final EnumC0042Bm a;
    public static final EnumC0042Bm b;
    public static final EnumC0042Bm c;
    public static final EnumC0042Bm d;
    public static final EnumC0042Bm e;
    public static final EnumC0042Bm f;
    public static final /* synthetic */ EnumC0042Bm[] m;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0042Bm EF8;

    static {
        EnumC0042Bm enumC0042Bm = new EnumC0042Bm("PENALTY_LOG", 0);
        EnumC0042Bm enumC0042Bm2 = new EnumC0042Bm("PENALTY_DEATH", 1);
        EnumC0042Bm enumC0042Bm3 = new EnumC0042Bm("DETECT_FRAGMENT_REUSE", 2);
        a = enumC0042Bm3;
        EnumC0042Bm enumC0042Bm4 = new EnumC0042Bm("DETECT_FRAGMENT_TAG_USAGE", 3);
        b = enumC0042Bm4;
        EnumC0042Bm enumC0042Bm5 = new EnumC0042Bm("DETECT_RETAIN_INSTANCE_USAGE", 4);
        c = enumC0042Bm5;
        EnumC0042Bm enumC0042Bm6 = new EnumC0042Bm("DETECT_SET_USER_VISIBLE_HINT", 5);
        d = enumC0042Bm6;
        EnumC0042Bm enumC0042Bm7 = new EnumC0042Bm("DETECT_TARGET_FRAGMENT_USAGE", 6);
        e = enumC0042Bm7;
        EnumC0042Bm enumC0042Bm8 = new EnumC0042Bm("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f = enumC0042Bm8;
        m = new EnumC0042Bm[]{enumC0042Bm, enumC0042Bm2, enumC0042Bm3, enumC0042Bm4, enumC0042Bm5, enumC0042Bm6, enumC0042Bm7, enumC0042Bm8};
    }

    public static EnumC0042Bm valueOf(String str) {
        return (EnumC0042Bm) Enum.valueOf(EnumC0042Bm.class, str);
    }

    public static EnumC0042Bm[] values() {
        return (EnumC0042Bm[]) m.clone();
    }
}
