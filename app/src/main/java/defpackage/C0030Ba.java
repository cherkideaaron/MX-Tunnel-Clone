package defpackage;

/* renamed from: Ba, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0030Ba implements InterfaceC3396sn {
    public final /* synthetic */ int a;

    public /* synthetic */ C0030Ba(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        C0047Ca c0047Ca;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                InterfaceC0134Hc interfaceC0134Hc = (InterfaceC0134Hc) obj2;
                AbstractC0500aq.m(str, "acc");
                AbstractC0500aq.m(interfaceC0134Hc, "element");
                if (str.length() == 0) {
                    return interfaceC0134Hc.toString();
                }
                return str + ", " + interfaceC0134Hc;
            case 1:
                InterfaceC0168Jc interfaceC0168Jc = (InterfaceC0168Jc) obj;
                InterfaceC0134Hc interfaceC0134Hc2 = (InterfaceC0134Hc) obj2;
                AbstractC0500aq.m(interfaceC0168Jc, "acc");
                AbstractC0500aq.m(interfaceC0134Hc2, "element");
                InterfaceC0168Jc interfaceC0168JcMinusKey = interfaceC0168Jc.minusKey(interfaceC0134Hc2.getKey());
                C0021Ai c0021Ai = C0021Ai.a;
                if (interfaceC0168JcMinusKey == c0021Ai) {
                    return interfaceC0134Hc2;
                }
                C3397so c3397so = C3397so.b;
                InterfaceC3601wc interfaceC3601wc = (InterfaceC3601wc) interfaceC0168JcMinusKey.get(c3397so);
                if (interfaceC3601wc == null) {
                    c0047Ca = new C0047Ca(interfaceC0134Hc2, interfaceC0168JcMinusKey);
                } else {
                    InterfaceC0168Jc interfaceC0168JcMinusKey2 = interfaceC0168JcMinusKey.minusKey(c3397so);
                    if (interfaceC0168JcMinusKey2 == c0021Ai) {
                        return new C0047Ca(interfaceC3601wc, interfaceC0134Hc2);
                    }
                    c0047Ca = new C0047Ca(interfaceC3601wc, new C0047Ca(interfaceC0134Hc2, interfaceC0168JcMinusKey2));
                }
                return c0047Ca;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return ((InterfaceC0168Jc) obj).plus((InterfaceC0134Hc) obj2);
            case 4:
                return ((InterfaceC0168Jc) obj).plus((InterfaceC0134Hc) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                InterfaceC0134Hc interfaceC0134Hc3 = (InterfaceC0134Hc) obj2;
                if (!(interfaceC0134Hc3 instanceof QI)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0134Hc3 : Integer.valueOf(iIntValue + 1);
            case 7:
                QI qi = (QI) obj;
                InterfaceC0134Hc interfaceC0134Hc4 = (InterfaceC0134Hc) obj2;
                if (qi != null) {
                    return qi;
                }
                return interfaceC0134Hc4 instanceof QI ? (QI) interfaceC0134Hc4 : null;
            default:
                return (TI) obj;
        }
    }
}
