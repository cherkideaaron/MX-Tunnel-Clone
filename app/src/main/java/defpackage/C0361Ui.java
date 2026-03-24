package defpackage;

import java.io.Serializable;

/* renamed from: Ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0361Ui extends AbstractC3679y implements InterfaceC0344Ti, Serializable {
    public final Enum[] a;

    public C0361Ui(Enum[] enumArr) {
        AbstractC0500aq.m(enumArr, "entries");
        this.a = enumArr;
    }

    @Override // defpackage.AbstractC3679y
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.AbstractC3679y, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        AbstractC0500aq.m(r5, "element");
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.a;
        AbstractC0500aq.m(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.AbstractC3679y, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        AbstractC0500aq.m(r5, "element");
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.a;
        AbstractC0500aq.m(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC3679y, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        AbstractC0500aq.m(r2, "element");
        return indexOf(r2);
    }
}
