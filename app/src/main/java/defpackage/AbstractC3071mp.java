package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3071mp extends AbstractC2743gp implements Set {
    public static final /* synthetic */ int c = 0;
    public transient AbstractC2906jp b;

    public static int f(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC3071mp g(int i, Object... objArr) {
        if (i == 0) {
            return YB.p;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C0527bG(obj);
        }
        int iF = f(i);
        Object[] objArr2 = new Object[iF];
        int i2 = iF - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(Vs.k(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iY = AbstractC0069Df.Y(iHashCode);
            while (true) {
                int i6 = iY & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iY++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C0527bG(obj4);
        }
        if (f(i4) < iF / 2) {
            return g(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new YB(objArr, i3, objArr2, i2, i4);
    }

    public AbstractC2906jp e() {
        AbstractC2906jp abstractC2906jp = this.b;
        if (abstractC2906jp != null) {
            return abstractC2906jp;
        }
        AbstractC2906jp abstractC2906jpH = h();
        this.b = abstractC2906jpH;
        return abstractC2906jpH;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3071mp) && (this instanceof YB)) {
            AbstractC3071mp abstractC3071mp = (AbstractC3071mp) obj;
            abstractC3071mp.getClass();
            if ((abstractC3071mp instanceof YB) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public AbstractC2906jp h() {
        Object[] array = toArray(AbstractC2743gp.a);
        C2798hp c2798hp = AbstractC2906jp.b;
        return AbstractC2906jp.e(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }
}
