package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MF extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ PF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = pf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        MF mf = new MF(this.b, interfaceC3493uc);
        mf.a = obj;
        return mf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((MF) create((BE) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        BE be = (BE) this.a;
        PF pf = this.b;
        boolean zE = pf.e(be);
        Iz iz = pf.f;
        Map mapB = be.c;
        if (mapB != null) {
            iz.getClass();
            z = false;
            if (!iz.f) {
                ArrayList arrayListV = AbstractC3296qu.v(iz.a);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListV.iterator();
                while (it.hasNext()) {
                    Jz jz = (Jz) it.next();
                    Gz gz = (Gz) mapB.get(jz.a);
                    Jy jy = gz != null ? new Jy(jz, gz) : null;
                    if (jy != null) {
                        arrayList.add(jy);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Jy jy2 = (Jy) it2.next();
                        Jz jz2 = (Jz) jy2.a;
                        Gz gz2 = (Gz) jy2.b;
                        boolean zB = AbstractC0500aq.b(iz.a(), jz2.a);
                        int i = jz2.b;
                        if (!zB) {
                            if (i == gz2.a) {
                                break;
                            }
                        } else if (i == gz2.a && AbstractC0500aq.b((String) iz.d.getValue(), gz2.b)) {
                            break;
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                Log.d("FirebaseSessions", "Cold app start detected");
            }
        } else {
            Log.d("FirebaseSessions", "No process data map");
            z = true;
        }
        boolean zD = pf.d(be);
        if (z) {
            mapB = iz.b(C0072Di.a);
        } else if (zD) {
            mapB = iz.b(mapB);
        }
        FE fe = z ? null : be.a;
        if (!zE && !z) {
            return zD ? BE.a(be, null, null, iz.b(mapB), 3) : be;
        }
        FE feA = pf.b.a(fe);
        LE le = (LE) pf.c;
        AbstractC0136He.y(AbstractC0136He.a(le.e), new JE(le, feA, null));
        iz.f = true;
        return new BE(feA, null, mapB);
    }
}
