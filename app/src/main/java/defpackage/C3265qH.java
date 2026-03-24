package defpackage;

/* renamed from: qH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3265qH extends C3210pH {
    @Override // defpackage.C3210pH
    public final boolean b() {
        char cCharAt;
        int iS = s();
        String str = this.e;
        return (iS >= str.length() || iS == -1 || (cCharAt = str.charAt(iS)) == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
    }

    @Override // defpackage.C3210pH
    public final byte e() {
        int iS = s();
        String str = this.e;
        if (iS >= str.length() || iS == -1) {
            return (byte) 10;
        }
        this.a = iS + 1;
        return AbstractC0136He.d(str.charAt(iS));
    }

    @Override // defpackage.C3210pH
    public final void f(char c) {
        int iS = s();
        String str = this.e;
        if (iS >= str.length() || iS == -1) {
            this.a = -1;
            v(c);
            throw null;
        }
        char cCharAt = str.charAt(iS);
        this.a = iS + 1;
        if (cCharAt == c) {
            return;
        }
        v(c);
        throw null;
    }

    @Override // defpackage.C3210pH
    public final byte p() {
        int iS = s();
        String str = this.e;
        if (iS >= str.length() || iS == -1) {
            return (byte) 10;
        }
        this.a = iS;
        return AbstractC0136He.d(str.charAt(iS));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r9.a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return r0;
     */
    @Override // defpackage.C3210pH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s() {
        /*
            r9 = this;
            int r0 = r9.a
            r1 = -1
            if (r0 != r1) goto L6
            return r0
        L6:
            java.lang.String r2 = r9.e
            int r3 = r2.length()
            if (r0 >= r3) goto L67
            char r3 = r2.charAt(r0)
            r4 = 32
            if (r3 == r4) goto L64
            r4 = 10
            if (r3 == r4) goto L64
            r5 = 13
            if (r3 == r5) goto L64
            r5 = 9
            if (r3 != r5) goto L23
            goto L64
        L23:
            r5 = 47
            if (r3 != r5) goto L67
            int r3 = r0 + 1
            int r6 = r2.length()
            if (r3 >= r6) goto L67
            char r3 = r2.charAt(r3)
            r6 = 42
            r7 = 4
            r8 = 0
            if (r3 == r6) goto L49
            if (r3 == r5) goto L3c
            goto L67
        L3c:
            int r0 = r0 + 2
            int r0 = defpackage.AbstractC3481uH.g0(r2, r4, r0, r8, r7)
            if (r0 != r1) goto L64
            int r0 = r2.length()
            goto L6
        L49:
            int r0 = r0 + 2
        */
        //  java.lang.String r3 = "*/"
        /*
            int r0 = defpackage.AbstractC3481uH.h0(r2, r3, r0, r8, r7)
            if (r0 == r1) goto L56
            int r0 = r0 + 2
            goto L6
        L56:
            int r0 = r2.length()
            r9.a = r0
            r0 = 6
        */
        //  java.lang.String r1 = "Expected end of the block comment: \"*/\", but had EOF instead"
        /*
            r2 = 0
            defpackage.C3210pH.m(r9, r1, r8, r2, r0)
            throw r2
        L64:
            int r0 = r0 + 1
            goto L6
        L67:
            r9.a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3265qH.s():int");
    }
}
