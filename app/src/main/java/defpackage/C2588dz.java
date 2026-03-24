package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: dz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2588dz {
    public final Object[] a;
    public int b;

    public C2588dz() {
        this.a = new Object[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        AbstractC0500aq.k(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z;
        AbstractC0500aq.m(obj, "instance");
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (!(!z)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i3 = this.b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }

    public C2588dz(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.a = new Object[i];
    }
}
