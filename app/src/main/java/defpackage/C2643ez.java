package defpackage;

/* renamed from: ez, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2643ez extends C2588dz {
    public final Object c;

    public C2643ez() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.C2588dz
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.C2588dz
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
