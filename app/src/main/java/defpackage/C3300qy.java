package defpackage;

import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* renamed from: qy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3300qy {
    public String d;
    public String e;
    public String g;
    public InterfaceC3353ry j;
    public long a = 0;
    public int b = 0;
    public int c = -1;
    public int f = 1;
    public int h = 0;
    public int i = -1;
    public EnumC3245py k = EnumC3245py.a;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-73224249635770L), this.e));
        if (this.d.length() > 0) {
            stringBuffer.append(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-73267199308730L), this.d));
        }
        EnumC3245py enumC3245py = this.k;
        if (enumC3245py != EnumC3245py.a) {
            stringBuffer.append(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-73314443948986L), enumC3245py));
        }
        return stringBuffer.toString();
    }
}
