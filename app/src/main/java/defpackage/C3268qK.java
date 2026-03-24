package defpackage;

import java.nio.ByteBuffer;

/* renamed from: qK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3268qK {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final C3532vE b;
    public volatile int c = 0;

    public C3268qK(C3532vE c3532vE, int i) {
        this.b = c3532vE;
        this.a = i;
    }

    public final int a(int i) {
        C2967kv c2967kvC = c();
        int iA = c2967kvC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2967kvC.d;
        int i2 = iA + c2967kvC.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        C2967kv c2967kvC = c();
        int iA = c2967kvC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + c2967kvC.a;
        return ((ByteBuffer) c2967kvC.d).getInt(((ByteBuffer) c2967kvC.d).getInt(i) + i);
    }

    public final C2967kv c() {
        short s;
        ThreadLocal threadLocal = d;
        C2967kv c2967kv = (C2967kv) threadLocal.get();
        if (c2967kv == null) {
            c2967kv = new C2967kv(2);
            threadLocal.set(c2967kv);
        }
        C3022lv c3022lv = (C3022lv) this.b.a;
        int iA = c3022lv.a(6);
        if (iA != 0) {
            int i = iA + c3022lv.a;
            int i2 = (this.a * 4) + ((ByteBuffer) c3022lv.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c3022lv.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c3022lv.d;
            c2967kv.d = byteBuffer;
            if (byteBuffer != null) {
                c2967kv.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c2967kv.b = i4;
                s = ((ByteBuffer) c2967kv.d).getShort(i4);
            } else {
                s = 0;
                c2967kv.a = 0;
                c2967kv.b = 0;
            }
            c2967kv.c = s;
        }
        return c2967kv;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2967kv c2967kvC = c();
        int iA = c2967kvC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c2967kvC.d).getInt(iA + c2967kvC.a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
