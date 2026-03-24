package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: mA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3038mA implements Qw {
    public static final Charset f = Charset.forName("UTF-8");
    public static final C0430Yj g = new C0430Yj("key", AbstractC3264qG.s(AbstractC3264qG.q(InterfaceC2873jA.class, new C2759h4(1))));
    public static final C0430Yj h = new C0430Yj(AppMeasurementSdk.ConditionalUserProperty.VALUE, AbstractC3264qG.s(AbstractC3264qG.q(InterfaceC2873jA.class, new C2759h4(2))));
    public static final C0335Sq i = new C0335Sq(1);
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final Pw d;
    public final C3093nA e = new C3093nA(this);

    public C3038mA(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, Pw pw) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = pw;
    }

    public static int j(C0430Yj c0430Yj) {
        InterfaceC2873jA interfaceC2873jA = (InterfaceC2873jA) ((Annotation) c0430Yj.b.get(InterfaceC2873jA.class));
        if (interfaceC2873jA != null) {
            return ((C2759h4) interfaceC2873jA).a;
        }
        throw new C0191Ki("Field has no @Protobuf config");
    }

    @Override // defpackage.Qw
    public final Qw a(C0430Yj c0430Yj, Object obj) {
        h(c0430Yj, obj, true);
        return this;
    }

    public final void b(C0430Yj c0430Yj, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        k((j(c0430Yj) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(C0430Yj c0430Yj, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        InterfaceC2873jA interfaceC2873jA = (InterfaceC2873jA) ((Annotation) c0430Yj.b.get(InterfaceC2873jA.class));
        if (interfaceC2873jA == null) {
            throw new C0191Ki("Field has no @Protobuf config");
        }
        k(((C2759h4) interfaceC2873jA).a << 3);
        k(i2);
    }

    @Override // defpackage.Qw
    public final Qw d(C0430Yj c0430Yj, boolean z) {
        c(c0430Yj, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw e(C0430Yj c0430Yj, int i2) {
        c(c0430Yj, i2, true);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw f(C0430Yj c0430Yj, double d) throws IOException {
        b(c0430Yj, d, true);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw g(C0430Yj c0430Yj, long j) throws IOException {
        if (j != 0) {
            InterfaceC2873jA interfaceC2873jA = (InterfaceC2873jA) ((Annotation) c0430Yj.b.get(InterfaceC2873jA.class));
            if (interfaceC2873jA == null) {
                throw new C0191Ki("Field has no @Protobuf config");
            }
            k(((C2759h4) interfaceC2873jA).a << 3);
            l(j);
        }
        return this;
    }

    public final void h(C0430Yj c0430Yj, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            k((j(c0430Yj) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(c0430Yj, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(i, c0430Yj, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(c0430Yj, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            k((j(c0430Yj) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            InterfaceC2873jA interfaceC2873jA = (InterfaceC2873jA) ((Annotation) c0430Yj.b.get(InterfaceC2873jA.class));
            if (interfaceC2873jA == null) {
                throw new C0191Ki("Field has no @Protobuf config");
            }
            k(((C2759h4) interfaceC2873jA).a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(c0430Yj, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            k((j(c0430Yj) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        Pw pw = (Pw) this.b.get(obj.getClass());
        if (pw != null) {
            i(pw, c0430Yj, obj, z);
            return;
        }
        InterfaceC3049mL interfaceC3049mL = (InterfaceC3049mL) this.c.get(obj.getClass());
        if (interfaceC3049mL != null) {
            C3093nA c3093nA = this.e;
            c3093nA.a = false;
            c3093nA.c = c0430Yj;
            c3093nA.b = z;
            interfaceC3049mL.a(obj, c3093nA);
            return;
        }
        if (obj instanceof InterfaceC2765hA) {
            c(c0430Yj, ((InterfaceC2765hA) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(c0430Yj, ((Enum) obj).ordinal(), true);
        } else {
            i(this.d, c0430Yj, obj, z);
        }
    }

    public final void i(Pw pw, C0430Yj c0430Yj, Object obj, boolean z) throws IOException {
        Er er = new Er();
        er.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = er;
            try {
                pw.a(obj, this);
                this.a = outputStream;
                long j = er.a;
                er.close();
                if (z && j == 0) {
                    return;
                }
                k((j(c0430Yj) << 3) | 2);
                l(j);
                pw.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                er.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
