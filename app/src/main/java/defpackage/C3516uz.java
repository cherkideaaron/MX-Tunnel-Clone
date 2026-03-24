package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: uz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3516uz extends AbstractC0247Nn {
    private static final C3516uz DEFAULT_INSTANCE;
    private static volatile My PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0351Tp strings_ = C2983lA.d;

    static {
        C3516uz c3516uz = new C3516uz();
        DEFAULT_INSTANCE = c3516uz;
        AbstractC0247Nn.m(C3516uz.class, c3516uz);
    }

    public static void o(C3516uz c3516uz, Set set) {
        InterfaceC0351Tp interfaceC0351Tp = c3516uz.strings_;
        if (!((B) interfaceC0351Tp).a) {
            C2983lA c2983lA = (C2983lA) interfaceC0351Tp;
            int i = c2983lA.c;
            c3516uz.strings_ = c2983lA.c(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = c3516uz.strings_;
        Charset charset = AbstractC0368Up.a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((C2983lA) randomAccess).c);
        }
        C2983lA c2983lA2 = (C2983lA) randomAccess;
        int i2 = c2983lA2.c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (c2983lA2.c - i2) + " is null.";
                for (int i3 = c2983lA2.c - 1; i3 >= i2; i3--) {
                    c2983lA2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            c2983lA2.add(obj);
        }
    }

    public static C3516uz p() {
        return DEFAULT_INSTANCE;
    }

    public static C3462tz r() {
        return (C3462tz) ((AbstractC0213Ln) DEFAULT_INSTANCE.f(5));
    }

    @Override // defpackage.AbstractC0247Nn
    public final Object f(int i) {
        switch (AbstractC3264qG.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2821iB(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C3516uz();
            case 4:
                return new C3462tz(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                My c0230Mn = PARSER;
                if (c0230Mn == null) {
                    synchronized (C3516uz.class) {
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

    public final InterfaceC0351Tp q() {
        return this.strings_;
    }
}
