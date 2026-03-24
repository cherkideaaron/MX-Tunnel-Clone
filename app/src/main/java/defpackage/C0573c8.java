package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573c8 implements InterfaceC0106Fi {
    public static final String c;
    public static final Set d;
    public static final C0573c8 e;
    public static final C0573c8 f;
    public final String a;
    public final String b;

    static {
        String strQ = AbstractC0500aq.Q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strQ;
        String strQ2 = AbstractC0500aq.Q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strQ3 = AbstractC0500aq.Q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C0174Ji("proto"), new C0174Ji("json"))));
        e = new C0573c8(strQ, null);
        f = new C0573c8(strQ2, strQ3);
    }

    public C0573c8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C0573c8 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C0573c8(str2, str3);
    }
}
