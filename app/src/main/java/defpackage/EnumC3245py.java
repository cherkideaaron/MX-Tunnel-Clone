package defpackage;

import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: py, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3245py {
    public static final EnumC3245py a;
    public static final EnumC3245py b;
    public static final EnumC3245py c;
    public static final /* synthetic */ EnumC3245py[] d;

    static {
        EnumC3245py enumC3245py = new EnumC3245py(Deobfuscator$MHRTUNNELVPN$app.getString(-72695968658362L), 0);
        a = enumC3245py;
        EnumC3245py enumC3245py2 = new EnumC3245py(Deobfuscator$MHRTUNNELVPN$app.getString(-72738918331322L), 1);
        b = enumC3245py2;
        EnumC3245py enumC3245py3 = new EnumC3245py(Deobfuscator$MHRTUNNELVPN$app.getString(-72794752906170L), 2);
        c = enumC3245py3;
        d = new EnumC3245py[]{enumC3245py, enumC3245py2, enumC3245py3};
    }

    public static EnumC3245py valueOf(String str) {
        return (EnumC3245py) Enum.valueOf(EnumC3245py.class, str);
    }

    public static EnumC3245py[] values() {
        return (EnumC3245py[]) d.clone();
    }
}
