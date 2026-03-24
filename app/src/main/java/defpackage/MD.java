package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MD {
    public static final MD a;
    public static final MD b;
    public static final MD c;
    public static final /* synthetic */ MD[] d;

    static {
        MD md = new MD("NETWORK_UNMETERED", 0);
        a = md;
        MD md2 = new MD("DEVICE_IDLE", 1);
        b = md2;
        MD md3 = new MD("DEVICE_CHARGING", 2);
        c = md3;
        d = new MD[]{md, md2, md3};
    }

    public static MD valueOf(String str) {
        return (MD) Enum.valueOf(MD.class, str);
    }

    public static MD[] values() {
        return (MD[]) d.clone();
    }
}
