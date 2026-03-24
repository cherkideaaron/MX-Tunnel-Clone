package defpackage;

/* renamed from: pH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3210pH {
    public int a;
    public final N2 b;
    public String c;
    public final StringBuilder d;
    public final String e;

    public C3210pH(String str) {
        AbstractC0500aq.m(str, "source");
        N2 n2 = new N2();
        n2.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        n2.d = iArr;
        n2.b = -1;
        this.b = n2;
        this.d = new StringBuilder();
        this.e = str;
    }

    public static /* synthetic */ void m(C3210pH c3210pH, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c3210pH.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        c3210pH.l(i, str, str2);
        throw null;
    }

    public final int a(int i, String str) {
        int i2 = i + 4;
        if (i2 < str.length()) {
            this.d.append((char) (o(i + 3, str) + (o(i, str) << 12) + (o(i + 1, str) << 8) + (o(i + 2, str) << 4)));
            return i2;
        }
        this.a = i;
        if (i2 < str.length()) {
            return a(this.a, str);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        String str2 = this.e;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + i() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public final String d() {
        f('\"');
        int i = this.a;
        String str = this.e;
        int iG0 = AbstractC3481uH.g0(str, '\"', i, false, 4);
        if (iG0 == -1) {
            i();
            n((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iG0) {
            if (str.charAt(i2) == '\\') {
                int iR = this.a;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.d.append((CharSequence) str, iR, i2);
                        int iR2 = r(i2 + 1);
                        if (iR2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iR2 + 1;
                        char cCharAt2 = str.charAt(iR2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C2982l9.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.d.append(c);
                        }
                        iR = r(iA);
                        if (iR == -1) {
                            m(this, "Unexpected EOF", iR, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            this.d.append((CharSequence) str, iR, i2);
                            iR = r(i2);
                            if (iR == -1) {
                                m(this, "Unexpected EOF", iR, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i2);
                        }
                    }
                    i2 = iR;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                String string = !z ? str.subSequence(iR, i2).toString() : k(iR, i2);
                this.a = i2 + 1;
                return string;
            }
            i2++;
        }
        this.a = iG0 + 1;
        String strSubstring = str.substring(i, iG0);
        AbstractC0500aq.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte e() {
        /*
            r4 = this;
            int r0 = r4.a
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.e
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.a = r1
            byte r0 = defpackage.AbstractC0136He.d(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.a = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3210pH.e():byte");
    }

    public void f(char c) {
        int i = this.a;
        if (i == -1) {
            v(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                v(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i2;
                if (cCharAt == c) {
                    return;
                }
                v(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0178, code lost:
    
        r8 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017a, code lost:
    
        m(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0193, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
    
        m(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a0, code lost:
    
        throw new defpackage.C0234Na();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a1, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a8, code lost:
    
        if (r8 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ab, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ac, code lost:
    
        m(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b3, code lost:
    
        m(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
    
        m(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r12 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r1 == r12) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011d, code lost:
    
        if (r14 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0121, code lost:
    
        if (r1 == (r12 - 1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        if (r3 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        if (r2 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (r18.charAt(r12) != '\"') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013a, code lost:
    
        m(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0142, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        m(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014c, code lost:
    
        r19.a = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        if (r16 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        r7 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        if (r16 != true) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0161, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0163, code lost:
    
        r1 = r1 * java.lang.Math.pow(10.0d, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0168, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016e, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0176, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3210pH.g():long");
    }

    public final String h() {
        String str = this.c;
        if (str == null) {
            return d();
        }
        AbstractC0500aq.j(str);
        this.c = null;
        return str;
    }

    public final String i() {
        String str = this.c;
        if (str != null) {
            AbstractC0500aq.j(str);
            this.c = null;
            return str;
        }
        int iS = s();
        String str2 = this.e;
        if (iS >= str2.length() || iS == -1) {
            m(this, "EOF", iS, null, 4);
            throw null;
        }
        byte bD = AbstractC0136He.d(str2.charAt(iS));
        if (bD == 1) {
            return h();
        }
        if (bD != 0) {
            m(this, "Expected beginning of the string, but got " + str2.charAt(iS), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC0136He.d(str2.charAt(iS)) == 0) {
            iS++;
            if (iS >= str2.length()) {
                this.d.append((CharSequence) str2, this.a, iS);
                int iR = r(iS);
                if (iR == -1) {
                    this.a = iS;
                    return k(0, 0);
                }
                iS = iR;
                z = true;
            }
        }
        String string = !z ? str2.subSequence(this.a, iS).toString() : k(this.a, iS);
        this.a = iS;
        return string;
    }

    public final String j() {
        String strI = i();
        if (AbstractC0500aq.b(strI, "null")) {
            if (this.e.charAt(this.a - 1) != '\"') {
                m(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return strI;
    }

    public final String k(int i, int i2) {
        this.d.append((CharSequence) this.e, i, i2);
        StringBuilder sb = this.d;
        String string = sb.toString();
        AbstractC0500aq.l(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final void l(int i, String str, String str2) {
        AbstractC0500aq.m(str, "message");
        AbstractC0500aq.m(str2, "hint");
        throw AbstractC2883jK.d(i, str + " at path: " + this.b.e() + (str2.length() == 0 ? "" : "\n".concat(str2)), this.e);
    }

    public final void n(byte b, boolean z) {
        String strO = AbstractC0136He.O(b);
        int i = z ? this.a - 1 : this.a;
        int i2 = this.a;
        String str = this.e;
        m(this, Vs.m("Expected ", strO, ", but had '", (i2 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int o(int i, String str) {
        char cCharAt = str.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public byte p() {
        int i = this.a;
        while (true) {
            int iR = r(i);
            if (iR == -1) {
                this.a = iR;
                return (byte) 10;
            }
            char cCharAt = this.e.charAt(iR);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.a = iR;
                return AbstractC0136He.d(cCharAt);
            }
            i = iR + 1;
        }
    }

    public final String q(boolean z) {
        String strH;
        byte bP = p();
        if (z) {
            if (bP != 1 && bP != 0) {
                return null;
            }
            strH = i();
        } else {
            if (bP != 1) {
                return null;
            }
            strH = h();
        }
        this.c = strH;
        return strH;
    }

    public final int r(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    public int s() {
        char cCharAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    public final boolean t() {
        int iS = s();
        String str = this.e;
        if (iS >= str.length() || iS == -1 || str.charAt(iS) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final String toString() {
        return "JsonReader(source='" + ((Object) this.e) + "', currentPosition=" + this.a + ')';
    }

    public final boolean u(boolean z) {
        int iR = r(s());
        String str = this.e;
        int length = str.length() - iR;
        if (length < 4 || iR == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(iR + i)) {
                return false;
            }
        }
        if (length > 4 && AbstractC0136He.d(str.charAt(iR + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.a = iR + 4;
        return true;
    }

    public final void v(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String strI = i();
                this.a = i;
                if (AbstractC0500aq.b(strI, "null")) {
                    l(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        n(AbstractC0136He.d(c), true);
        throw null;
    }
}
