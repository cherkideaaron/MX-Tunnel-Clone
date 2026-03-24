package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Hr {
    private static final /* synthetic */ InterfaceC0344Ti $ENTRIES;
    private static final /* synthetic */ Hr[] $VALUES;

    @NotNull
    public static final Fr Companion;
    public static final Hr ON_ANY;
    public static final Hr ON_CREATE;
    public static final Hr ON_DESTROY;
    public static final Hr ON_PAUSE;
    public static final Hr ON_RESUME;
    public static final Hr ON_START;
    public static final Hr ON_STOP;

    static {
        Hr hr = new Hr("ON_CREATE", 0);
        ON_CREATE = hr;
        Hr hr2 = new Hr("ON_START", 1);
        ON_START = hr2;
        Hr hr3 = new Hr("ON_RESUME", 2);
        ON_RESUME = hr3;
        Hr hr4 = new Hr("ON_PAUSE", 3);
        ON_PAUSE = hr4;
        Hr hr5 = new Hr("ON_STOP", 4);
        ON_STOP = hr5;
        Hr hr6 = new Hr("ON_DESTROY", 5);
        ON_DESTROY = hr6;
        Hr hr7 = new Hr("ON_ANY", 6);
        ON_ANY = hr7;
        Hr[] hrArr = {hr, hr2, hr3, hr4, hr5, hr6, hr7};
        $VALUES = hrArr;
        $ENTRIES = AbstractC2883jK.t(hrArr);
        Companion = new Fr();
    }

    public static Hr valueOf(String str) {
        return (Hr) Enum.valueOf(Hr.class, str);
    }

    public static Hr[] values() {
        return (Hr[]) $VALUES.clone();
    }

    public final Ir a() {
        switch (Gr.a[ordinal()]) {
            case 1:
            case 2:
                return Ir.c;
            case 3:
            case 4:
                return Ir.d;
            case 5:
                return Ir.e;
            case 6:
                return Ir.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new C0234Na();
        }
    }
}
