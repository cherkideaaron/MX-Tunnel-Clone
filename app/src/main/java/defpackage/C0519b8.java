package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0519b8 implements Iterable, Serializable {
    public static final C0519b8 c = new C0519b8(AbstractC0368Up.b);
    public static final InterfaceC0464a8 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = AbstractC3735z1.a() ? new C0360Uh(9) : new C3397so(8);
    }

    public C0519b8(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(Vs.l(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC3264qG.e(i2, i3, "End index: ", " >= "));
    }

    public static C0519b8 c(int i, byte[] bArr, int i2) {
        b(i, i + i2, bArr.length);
        return new C0519b8(d.f(i, bArr, i2));
    }

    public byte a(int i) {
        return this.b[i];
    }

    public void d(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0519b8) || size() != ((C0519b8) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0519b8)) {
            return obj.equals(this);
        }
        C0519b8 c0519b8 = (C0519b8) obj;
        int i = this.a;
        int i2 = c0519b8.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0519b8.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0519b8.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0519b8.size());
        }
        int iE = e() + size;
        int iE2 = e();
        int iE3 = c0519b8.e();
        while (iE2 < iE) {
            if (this.b[iE2] != c0519b8.b[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte f(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int iE = e();
            int i2 = size;
            for (int i3 = iE; i3 < iE + size; i3++) {
                i2 = (i2 * 31) + this.b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Y7(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        C0519b8 z7;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0500aq.A(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iB = b(0, 47, size());
            if (iB == 0) {
                z7 = c;
            } else {
                z7 = new Z7(this.b, e(), iB);
            }
            sb.append(AbstractC0500aq.A(z7));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC3264qG.l(sb2, string, "\">");
    }
}
