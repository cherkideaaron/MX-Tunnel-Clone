package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: sz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3408sz extends AbstractC0247Nn {
    private static final C3408sz DEFAULT_INSTANCE;
    private static volatile My PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private Dt preferences_ = Dt.b;

    static {
        C3408sz c3408sz = new C3408sz();
        DEFAULT_INSTANCE = c3408sz;
        AbstractC0247Nn.m(C3408sz.class, c3408sz);
    }

    public static Dt o(C3408sz c3408sz) {
        Dt dt = c3408sz.preferences_;
        if (!dt.a) {
            c3408sz.preferences_ = dt.c();
        }
        return c3408sz.preferences_;
    }

    public static C3301qz q() {
        return (C3301qz) ((AbstractC0213Ln) DEFAULT_INSTANCE.f(5));
    }

    public static C3408sz r(FileInputStream fileInputStream) {
        C3408sz c3408sz = DEFAULT_INSTANCE;
        C3056ma c3056ma = new C3056ma(fileInputStream);
        C3500uj c3500ujA = C3500uj.a();
        AbstractC0247Nn abstractC0247NnL = c3408sz.l();
        try {
            C2928kA c2928kA = C2928kA.c;
            c2928kA.getClass();
            PD pdA = c2928kA.a(abstractC0247NnL.getClass());
            C0463a7 c0463a7 = (C0463a7) c3056ma.d;
            if (c0463a7 == null) {
                c0463a7 = new C0463a7((AbstractC3111na) c3056ma);
            }
            pdA.e(abstractC0247NnL, c0463a7, c3500ujA);
            pdA.c(abstractC0247NnL);
            if (AbstractC0247Nn.i(abstractC0247NnL, true)) {
                return (C3408sz) abstractC0247NnL;
            }
            throw new C2744gq(new CK().getMessage());
        } catch (CK e) {
            throw new C2744gq(e.getMessage());
        } catch (C2744gq e2) {
            if (e2.a) {
                throw new C2744gq(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C2744gq) {
                throw ((C2744gq) e3.getCause());
            }
            throw new C2744gq(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C2744gq) {
                throw ((C2744gq) e4.getCause());
            }
            throw e4;
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
                return new C2821iB(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC3354rz.a});
            case 3:
                return new C3408sz();
            case 4:
                return new C3301qz(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                My c0230Mn = PARSER;
                if (c0230Mn == null) {
                    synchronized (C3408sz.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
