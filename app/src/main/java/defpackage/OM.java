package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class OM {
    public final String a;
    public final int b;

    public OM(String str) {
        this.a = str;
        this.b = 0;
    }

    public OM(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }
}
