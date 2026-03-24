package defpackage;

/* renamed from: yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3712yf {
    public static final C0237Nd b = new C0237Nd();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final C0220Md e = new C0220Md(6);
    public final C3040mC a;

    public C3712yf(C3040mC c3040mC) {
        this.a = c3040mC;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
