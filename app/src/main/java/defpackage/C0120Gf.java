package defpackage;

import java.text.DecimalFormat;

/* renamed from: Gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120Gf {
    public final DecimalFormat a;
    public final int b;

    public C0120Gf(int i) {
        this.b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
