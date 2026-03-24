package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3391si {
    public int a = 1;
    public final C3077mv b;
    public C3077mv c;
    public C3077mv d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public C3391si(C3077mv c3077mv, boolean z, int[] iArr) {
        this.b = c3077mv;
        this.c = c3077mv;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        int[] iArr;
        C2967kv c2967kvC = this.c.b.c();
        int iA = c2967kvC.a(6);
        if ((iA == 0 || ((ByteBuffer) c2967kvC.d).get(iA + c2967kvC.a) == 0) && this.e != 65039) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.c.b.a(0)) < 0);
        }
        return true;
    }
}
