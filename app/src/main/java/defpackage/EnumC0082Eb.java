package defpackage;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Eb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0082Eb {
    public static final EnumC0082Eb a;
    public static final EnumC0082Eb b;
    public static final EnumC0082Eb c;
    public static final /* synthetic */ EnumC0082Eb[] d;

    static {
        EnumC0082Eb enumC0082Eb = new EnumC0082Eb("UNKNOWN", 0);
        a = enumC0082Eb;
        EnumC0082Eb enumC0082Eb2 = new EnumC0082Eb("NOT_REQUIRED", 1);
        b = enumC0082Eb2;
        EnumC0082Eb enumC0082Eb3 = new EnumC0082Eb("REQUIRED", 2);
        c = enumC0082Eb3;
        d = new EnumC0082Eb[]{enumC0082Eb, enumC0082Eb2, enumC0082Eb3};
    }

    @RecentlyNonNull
    public static EnumC0082Eb valueOf(@RecentlyNonNull String str) {
        return (EnumC0082Eb) Enum.valueOf(EnumC0082Eb.class, str);
    }

    @RecentlyNonNull
    public static EnumC0082Eb[] values() {
        return (EnumC0082Eb[]) d.clone();
    }
}
