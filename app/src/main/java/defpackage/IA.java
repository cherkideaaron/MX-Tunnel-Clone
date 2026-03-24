package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IA {
    public static final IA a;
    public static final /* synthetic */ IA[] b;

    static {
        IA ia = new IA("DEFAULT", 0);
        a = ia;
        IA ia2 = new IA("UNMETERED_ONLY", 1);
        IA ia3 = new IA("UNMETERED_OR_DAILY", 2);
        IA ia4 = new IA("FAST_IF_RADIO_AWAKE", 3);
        IA ia5 = new IA("NEVER", 4);
        IA ia6 = new IA("UNRECOGNIZED", 5);
        b = new IA[]{ia, ia2, ia3, ia4, ia5, ia6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ia);
        sparseArray.put(1, ia2);
        sparseArray.put(2, ia3);
        sparseArray.put(3, ia4);
        sparseArray.put(4, ia5);
        sparseArray.put(-1, ia6);
    }

    public static IA valueOf(String str) {
        return (IA) Enum.valueOf(IA.class, str);
    }

    public static IA[] values() {
        return (IA[]) b.clone();
    }
}
