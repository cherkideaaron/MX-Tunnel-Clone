package defpackage;

/* renamed from: sw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3405sw {
    public static final C3351rw a;
    public static final C3351rw b;

    static {
        C2928kA c2928kA = C2928kA.c;
        C3351rw c3351rw = null;
        try {
            c3351rw = (C3351rw) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c3351rw;
        b = new C3351rw();
    }
}
