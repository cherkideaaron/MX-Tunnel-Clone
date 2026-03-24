package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class WG extends J implements Sv, InterfaceC3067ml, InterfaceC0111Fn {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(WG.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public WG(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0144, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00c5, B:52:0x00cd, B:55:0x00d4, B:56:0x00d8, B:58:0x00db, B:68:0x00fc, B:71:0x010c, B:72:0x0126, B:78:0x0138, B:75:0x012f, B:77:0x0135, B:60:0x00e1, B:64:0x00e8, B:21:0x0053, B:24:0x005e, B:49:0x00b6), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00c5, B:52:0x00cd, B:55:0x00d4, B:56:0x00d8, B:58:0x00db, B:68:0x00fc, B:71:0x010c, B:72:0x0126, B:78:0x0138, B:75:0x012f, B:77:0x0135, B:60:0x00e1, B:64:0x00e8, B:21:0x0053, B:24:0x005e, B:49:0x00b6), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00c5, B:52:0x00cd, B:55:0x00d4, B:56:0x00d8, B:58:0x00db, B:68:0x00fc, B:71:0x010c, B:72:0x0126, B:78:0x0138, B:75:0x012f, B:77:0x0135, B:60:0x00e1, B:64:0x00e8, B:21:0x0053, B:24:0x005e, B:49:0x00b6), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010b -> B:50:0x00c5). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC3067ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.InterfaceC3177ol r17, defpackage.InterfaceC3493uc r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WG.b(ol, uc):java.lang.Object");
    }

    public final void c(Object obj) {
        if (obj == null) {
            obj = AbstractC0500aq.e;
        }
        e(null, obj);
    }

    @Override // defpackage.InterfaceC3177ol
    public final Object d(Object obj, InterfaceC3493uc interfaceC3493uc) {
        c(obj);
        return DK.a;
    }

    public final boolean e(Object obj, Object obj2) {
        int i;
        XG[] xgArr;
        C3337ri c3337ri;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC0500aq.b(obj3, obj)) {
                return false;
            }
            if (AbstractC0500aq.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            XG[] xgArr2 = this.a;
            while (true) {
                if (xgArr2 != null) {
                    for (XG xg : xgArr2) {
                        if (xg != null) {
                            AtomicReference atomicReference = xg.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c3337ri = AbstractC0115Ga.i)) {
                                    C3337ri c3337ri2 = AbstractC0115Ga.h;
                                    if (obj4 != c3337ri2) {
                                        while (!atomicReference.compareAndSet(obj4, c3337ri2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((B8) obj4).resumeWith(DK.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c3337ri)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    xgArr = this.a;
                }
                xgArr2 = xgArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.InterfaceC0111Fn
    public final InterfaceC3067ml i(InterfaceC0168Jc interfaceC0168Jc, int i, N7 n7) {
        return ((((i < 0 || i >= 2) && i != -2) || n7 != N7.b) && !((i == 0 || i == -3) && n7 == N7.a)) ? new C0520b9(this, interfaceC0168Jc, i, n7, 1) : this;
    }
}
