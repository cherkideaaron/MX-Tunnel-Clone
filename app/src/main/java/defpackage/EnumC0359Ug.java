package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0359Ug implements Executor {
    public static final EnumC0359Ug a;
    public static final /* synthetic */ EnumC0359Ug[] b;

    static {
        EnumC0359Ug enumC0359Ug = new EnumC0359Ug("INSTANCE", 0);
        a = enumC0359Ug;
        b = new EnumC0359Ug[]{enumC0359Ug};
    }

    public static EnumC0359Ug valueOf(String str) {
        return (EnumC0359Ug) Enum.valueOf(EnumC0359Ug.class, str);
    }

    public static EnumC0359Ug[] values() {
        return (EnumC0359Ug[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
