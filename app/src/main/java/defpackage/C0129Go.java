package defpackage;

/* renamed from: Go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129Go extends ZM {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0233, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // defpackage.InterfaceC0053Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.InterfaceC0053Cg r24) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0129Go.a(Cg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    @Override // defpackage.ZM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0129Go.d():void");
    }

    @Override // defpackage.ZM
    public final void e() {
        C0121Gg c0121Gg = this.h;
        if (c0121Gg.j) {
            this.b.X = c0121Gg.g;
        }
    }

    @Override // defpackage.ZM
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ZM
    public final boolean k() {
        return this.d != 3 || this.b.q == 0;
    }

    public final void n() {
        this.g = false;
        C0121Gg c0121Gg = this.h;
        c0121Gg.c();
        c0121Gg.j = false;
        C0121Gg c0121Gg2 = this.i;
        c0121Gg2.c();
        c0121Gg2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
