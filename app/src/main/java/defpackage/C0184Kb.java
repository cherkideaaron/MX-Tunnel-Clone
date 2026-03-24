package defpackage;

/* renamed from: Kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184Kb {
    public boolean a = false;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public C0184Kb(C0184Kb c0184Kb, Object obj) {
        c0184Kb.getClass();
        this.b = c0184Kb.b;
        b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[PHI: r12
      0x0064: PHI (r12v4 int) = (r12v0 int), (r12v1 int) binds: [B:18:0x0062, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r16, android.content.res.XmlResourceParser r17, java.util.HashMap r18) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r17)
            int[] r1 = defpackage.WA.d
            r2 = r16
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r6
            r8 = r7
            r5 = r4
        L16:
            if (r6 >= r1) goto Lcc
            int r9 = r0.getIndex(r6)
            r10 = 1
            if (r9 != 0) goto L48
            java.lang.String r4 = r0.getString(r9)
            if (r4 == 0) goto Lc8
            int r9 = r4.length()
            if (r9 <= 0) goto Lc8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            char r11 = r4.charAt(r3)
            char r11 = java.lang.Character.toUpperCase(r11)
            r9.append(r11)
            java.lang.String r4 = r4.substring(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            goto Lc8
        L48:
            r11 = 10
            if (r9 != r11) goto L53
            java.lang.String r4 = r0.getString(r9)
            r8 = r10
            goto Lc8
        L53:
            r11 = 6
            if (r9 != r10) goto L61
            boolean r5 = r0.getBoolean(r9, r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7 = r11
            goto Lc8
        L61:
            r12 = 3
            if (r9 != r12) goto L6e
        L64:
            int r5 = r0.getColor(r9, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L6c:
            r7 = r12
            goto Lc8
        L6e:
            r12 = 4
            r13 = 2
            if (r9 != r13) goto L73
            goto L64
        L73:
            r14 = 7
            r15 = 0
            if (r9 != r14) goto L8d
            float r5 = r0.getDimension(r9, r15)
            android.content.res.Resources r7 = r16.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r5 = android.util.TypedValue.applyDimension(r10, r5, r7)
        L87:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7 = r14
            goto Lc8
        L8d:
            if (r9 != r12) goto L94
            float r5 = r0.getDimension(r9, r15)
            goto L87
        L94:
            r12 = 5
            if (r9 != r12) goto La3
            r5 = 2143289344(0x7fc00000, float:NaN)
            float r5 = r0.getFloat(r9, r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7 = r13
            goto Lc8
        La3:
            r13 = -1
            if (r9 != r11) goto Lb0
            int r5 = r0.getInteger(r9, r13)
        Laa:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = r10
            goto Lc8
        Lb0:
            r10 = 9
            if (r9 != r10) goto Lb9
            java.lang.String r5 = r0.getString(r9)
            goto L6c
        Lb9:
            r10 = 8
            if (r9 != r10) goto Lc8
            int r5 = r0.getResourceId(r9, r13)
            if (r5 != r13) goto Laa
            int r5 = r0.getInt(r9, r13)
            goto Laa
        Lc8:
            int r6 = r6 + 1
            goto L16
        Lcc:
            if (r4 == 0) goto Le1
            if (r5 == 0) goto Le1
            Kb r1 = new Kb
            r1.<init>()
            r1.b = r7
            r1.a = r8
            r1.b(r5)
            r2 = r18
            r2.put(r4, r1)
        Le1:
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0184Kb.a(android.content.Context, android.content.res.XmlResourceParser, java.util.HashMap):void");
    }

    public final void b(Object obj) {
        switch (AbstractC3264qG.A(this.b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                break;
            case 1:
            case 6:
                this.d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                break;
            case 4:
                this.e = (String) obj;
                break;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
