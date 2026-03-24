package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* renamed from: hv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2804hv {
    public static final BitSet b;
    public final String a;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        b = bitSet;
    }

    public C2804hv(String str, C0360Uh c0360Uh) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0115Ga.i(lowerCase, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!(!lowerCase.isEmpty())) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        }
        if (lowerCase.equals("connection")) {
            AbstractC2857iv.a.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!b.get(cCharAt)) {
                throw new IllegalArgumentException(AbstractC3296qu.I("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.a = lowerCase;
        lowerCase.getBytes(AbstractC3257q9.a);
        if (!(!str.endsWith("-bin"))) {
            throw new IllegalArgumentException(AbstractC3296qu.I("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        AbstractC0115Ga.i(c0360Uh, "marshaller");
    }

    public static void a(String str, C0360Uh c0360Uh) {
        new C2804hv(str, c0360Uh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2804hv.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C2804hv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("Key{name='"), this.a, "'}");
    }
}
