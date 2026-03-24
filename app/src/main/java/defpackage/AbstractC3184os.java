package defpackage;

/* renamed from: os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3184os {
    public static final C3129ns a;
    public static final C3129ns b;

    static {
        C2928kA c2928kA = C2928kA.c;
        C3129ns c3129ns = null;
        try {
            c3129ns = (C3129ns) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c3129ns;
        b = new C3129ns();
    }
}
