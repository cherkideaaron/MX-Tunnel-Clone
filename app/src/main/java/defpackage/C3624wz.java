package defpackage;

/* renamed from: wz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3624wz extends AbstractC0247Nn {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C3624wz DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile My PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C3624wz c3624wz = new C3624wz();
        DEFAULT_INSTANCE = c3624wz;
        AbstractC0247Nn.m(C3624wz.class, c3624wz);
    }

    public static C3570vz G() {
        return (C3570vz) ((AbstractC0213Ln) DEFAULT_INSTANCE.f(5));
    }

    public static void o(C3624wz c3624wz, long j) {
        c3624wz.valueCase_ = 4;
        c3624wz.value_ = Long.valueOf(j);
    }

    public static void p(C3624wz c3624wz, String str) {
        c3624wz.getClass();
        str.getClass();
        c3624wz.valueCase_ = 5;
        c3624wz.value_ = str;
    }

    public static void q(C3624wz c3624wz, C3516uz c3516uz) {
        c3624wz.getClass();
        c3624wz.value_ = c3516uz;
        c3624wz.valueCase_ = 6;
    }

    public static void r(C3624wz c3624wz, double d) {
        c3624wz.valueCase_ = 7;
        c3624wz.value_ = Double.valueOf(d);
    }

    public static void s(C3624wz c3624wz, C0519b8 c0519b8) {
        c3624wz.getClass();
        c3624wz.valueCase_ = 8;
        c3624wz.value_ = c0519b8;
    }

    public static void t(C3624wz c3624wz, boolean z) {
        c3624wz.valueCase_ = 1;
        c3624wz.value_ = Boolean.valueOf(z);
    }

    public static void u(C3624wz c3624wz, float f) {
        c3624wz.valueCase_ = 2;
        c3624wz.value_ = Float.valueOf(f);
    }

    public static void v(C3624wz c3624wz, int i) {
        c3624wz.valueCase_ = 3;
        c3624wz.value_ = Integer.valueOf(i);
    }

    public static C3624wz y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C3516uz E() {
        return this.valueCase_ == 6 ? (C3516uz) this.value_ : C3516uz.p();
    }

    public final int F() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC0247Nn
    public final Object f(int i) {
        switch (AbstractC3264qG.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2821iB(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C3516uz.class});
            case 3:
                return new C3624wz();
            case 4:
                return new C3570vz(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                My c0230Mn = PARSER;
                if (c0230Mn == null) {
                    synchronized (C3624wz.class) {
                        try {
                            c0230Mn = PARSER;
                            if (c0230Mn == null) {
                                c0230Mn = new C0230Mn();
                                PARSER = c0230Mn;
                            }
                        } finally {
                        }
                    }
                }
                return c0230Mn;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0519b8 x() {
        return this.valueCase_ == 8 ? (C0519b8) this.value_ : C0519b8.c;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
