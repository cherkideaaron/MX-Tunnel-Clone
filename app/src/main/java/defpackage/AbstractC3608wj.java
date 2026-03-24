package defpackage;

/* renamed from: wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3608wj {
    public static final C3554vj a = new C3554vj();
    public static final C3554vj b;

    static {
        C2928kA c2928kA = C2928kA.c;
        C3554vj c3554vj = null;
        try {
            c3554vj = (C3554vj) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c3554vj;
    }
}
