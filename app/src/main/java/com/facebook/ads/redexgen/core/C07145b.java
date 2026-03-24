package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.5b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07145b extends IOException {
    public static String[] A01 = {"2Muqh70O6MOkp58pfFL5fqQgJ22LbaOG", "jD6cmMLG7Gavhvnx7CsfZCp0TtnTBkr3", "DkdpbG", "GPGghQKRhEx8Hs8G8MSTaC4gxGmWiueB", "QluhzvyI33CjLqJI0scNHkzBaYypVFTM", "0eVVwOHP6sRTPOkeFOg2FrcrRKf9zLzm", "eMagzz7TAm5jMGA4xfPZ9Gt9YCxRiChS", "Ni0AzA"};
    public final int A00;

    public C07145b(int i) {
        this.A00 = i;
    }

    public C07145b(String str, int i) {
        super(str);
        this.A00 = i;
    }

    public C07145b(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C07145b(Throwable th, int i) {
        super(th);
        this.A00 = i;
    }

    public static boolean A00(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            boolean z = cause instanceof C07145b;
            String[] strArr = A01;
            if (strArr[7].length() == strArr[2].length()) {
                String[] strArr2 = A01;
                strArr2[1] = "gKwk6czfyck41TVkhXYTi4dwxHvcIOpw";
                strArr2[0] = "KQxTdd6uLlHWGTHHNKbBjwUH99zdNbRE";
                if (z && ((C07145b) cause).A00 == 2008) {
                    String[] strArr3 = A01;
                    if (strArr3[1].charAt(5) != strArr3[0].charAt(5)) {
                        String[] strArr4 = A01;
                        strArr4[1] = "s9AyCo5pkNnOJPMRH26C6HS8hSDLq3Tq";
                        strArr4[0] = "XtuWgVHjqru9RvBQwhBnbYNcJk0iYMoO";
                        return true;
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }
}
