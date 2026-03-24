package defpackage;

/* loaded from: classes.dex */
public abstract class Ft {
    public static final Et a;
    public static final Et b;

    static {
        C2928kA c2928kA = C2928kA.c;
        Et et = null;
        try {
            et = (Et) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = et;
        b = new Et();
    }
}
