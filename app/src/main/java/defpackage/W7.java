package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class W7 {
    public static final G3 e = new G3(1);
    public int a;
    public final int b;
    public final Cloneable c;
    public final Object d;

    public W7() {
        this.c = new LinkedList();
        this.d = new ArrayList(64);
        this.a = 0;
        this.b = 4096;
    }

    public synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.d).get(i2);
            if (bArr.length >= i) {
                this.a -= bArr.length;
                ((ArrayList) this.d).remove(i2);
                ((LinkedList) this.c).remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.b) {
                ((LinkedList) this.c).add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.d, bArr, e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.d).add(iBinarySearch, bArr);
                this.a += bArr.length;
                c();
            }
        }
    }

    public synchronized void c() {
        while (this.a > this.b) {
            byte[] bArr = (byte[]) ((LinkedList) this.c).remove(0);
            ((ArrayList) this.d).remove(bArr);
            this.a -= bArr.length;
        }
    }

    public W7(C0259Oi c0259Oi, D3 d3) {
        this.c = new SparseArray();
        this.d = c0259Oi;
        TypedArray typedArray = (TypedArray) d3.b;
        this.a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(53, 0);
    }
}
