package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class CF extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CF(Set set, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = set;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        CF cf = new CF(this.b, interfaceC3493uc);
        cf.a = obj;
        return cf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((CF) create((Rv) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        Set setKeySet = ((Rv) this.a).a().keySet();
        ArrayList arrayList = new ArrayList(AbstractC3491ua.Z(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3081mz) it.next()).a);
        }
        LinkedHashSet linkedHashSet = DF.a;
        boolean z = true;
        Set set = this.b;
        if (set != linkedHashSet) {
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
