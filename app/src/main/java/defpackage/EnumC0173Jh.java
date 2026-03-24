package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0173Jh {
    public static final EnumC0173Jh b;
    public static final EnumC0173Jh c;
    public static final EnumC0173Jh d;
    public static final EnumC0173Jh e;
    public static final EnumC0173Jh f;
    public static final EnumC0173Jh m;
    public static final /* synthetic */ EnumC0173Jh[] n;
    public final TimeUnit a;

    static {
        EnumC0173Jh enumC0173Jh = new EnumC0173Jh("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        b = enumC0173Jh;
        EnumC0173Jh enumC0173Jh2 = new EnumC0173Jh("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC0173Jh enumC0173Jh3 = new EnumC0173Jh("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = enumC0173Jh3;
        EnumC0173Jh enumC0173Jh4 = new EnumC0173Jh("SECONDS", 3, TimeUnit.SECONDS);
        d = enumC0173Jh4;
        EnumC0173Jh enumC0173Jh5 = new EnumC0173Jh("MINUTES", 4, TimeUnit.MINUTES);
        e = enumC0173Jh5;
        EnumC0173Jh enumC0173Jh6 = new EnumC0173Jh("HOURS", 5, TimeUnit.HOURS);
        f = enumC0173Jh6;
        EnumC0173Jh enumC0173Jh7 = new EnumC0173Jh("DAYS", 6, TimeUnit.DAYS);
        m = enumC0173Jh7;
        EnumC0173Jh[] enumC0173JhArr = {enumC0173Jh, enumC0173Jh2, enumC0173Jh3, enumC0173Jh4, enumC0173Jh5, enumC0173Jh6, enumC0173Jh7};
        n = enumC0173JhArr;
        AbstractC2883jK.t(enumC0173JhArr);
    }

    public EnumC0173Jh(String str, int i, TimeUnit timeUnit) {
        this.a = timeUnit;
    }

    public static EnumC0173Jh valueOf(String str) {
        return (EnumC0173Jh) Enum.valueOf(EnumC0173Jh.class, str);
    }

    public static EnumC0173Jh[] values() {
        return (EnumC0173Jh[]) n.clone();
    }
}
