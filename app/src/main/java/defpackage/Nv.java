package defpackage;

import java.io.File;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Nv extends WH implements InterfaceC3396sn {
    public C3015lo a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ File d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nv(File file, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.d = file;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        Nv nv = new Nv(this.d, interfaceC3493uc);
        nv.c = obj;
        return nv;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((Nv) create((Sz) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        Sz sz;
        C3015lo c3015lo;
        int i = 1;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i2 = this.b;
        if (i2 == 0) {
            AbstractC0115Ga.U(obj);
            sz = (Sz) this.c;
            File file = this.d;
            C0117Gc c0117Gc = new C0117Gc(i, file, sz);
            Object obj2 = Ov.b;
            File parentFile = file.getParentFile();
            AbstractC0500aq.j(parentFile);
            String path = parentFile.getCanonicalFile().getPath();
            synchronized (Ov.b) {
                try {
                    LinkedHashMap linkedHashMap = Ov.c;
                    AbstractC0500aq.l(path, "key");
                    Object ov = linkedHashMap.get(path);
                    if (ov == null) {
                        ov = new Ov(path);
                        linkedHashMap.put(path, ov);
                    }
                    Ov ov2 = (Ov) ov;
                    ov2.a.add(c0117Gc);
                    if (ov2.a.size() == 1) {
                        ov2.startWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3015lo c3015lo2 = new C3015lo(i, path, c0117Gc);
            DK dk = DK.a;
            this.c = sz;
            this.a = c3015lo2;
            this.b = 1;
            if (((Rz) sz).d.d(this, dk) == enumC0321Sc) {
                return enumC0321Sc;
            }
            c3015lo = c3015lo2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
                return DK.a;
            }
            c3015lo = this.a;
            sz = (Sz) this.c;
            AbstractC0115Ga.U(obj);
        }
        C2793hk c2793hk = new C2793hk(c3015lo, i);
        this.c = null;
        this.a = null;
        this.b = 2;
        if (AbstractC2883jK.g(sz, c2793hk, this) == enumC0321Sc) {
            return enumC0321Sc;
        }
        return DK.a;
    }
}
