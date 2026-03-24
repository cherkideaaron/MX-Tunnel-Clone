package defpackage;

/* renamed from: qI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3266qI implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public C3266qI(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3266qI c3266qI = (C3266qI) obj;
        int i = this.a - c3266qI.a;
        return i == 0 ? this.b - c3266qI.b : i;
    }
}
