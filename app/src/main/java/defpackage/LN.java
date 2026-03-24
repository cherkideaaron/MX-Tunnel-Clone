package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum LN {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0519b8.c),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    LN(Serializable serializable) {
    }
}
