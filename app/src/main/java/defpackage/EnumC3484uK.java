package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3484uK implements Executor {
    public static final EnumC3484uK a;
    public static final Handler b;
    public static final /* synthetic */ EnumC3484uK[] c;

    static {
        EnumC3484uK enumC3484uK = new EnumC3484uK("INSTANCE", 0);
        a = enumC3484uK;
        c = new EnumC3484uK[]{enumC3484uK};
        b = new Handler(Looper.getMainLooper());
    }

    public static EnumC3484uK valueOf(String str) {
        return (EnumC3484uK) Enum.valueOf(EnumC3484uK.class, str);
    }

    public static EnumC3484uK[] values() {
        return (EnumC3484uK[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
