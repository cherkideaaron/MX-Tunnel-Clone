package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238Ne extends WH implements InterfaceC3396sn {
    public Iterator a;
    public AF b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238Ne(List list, List list2, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.f = list;
        this.m = list2;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0238Ne c0238Ne = new C0238Ne(this.f, this.m, interfaceC3493uc);
        c0238Ne.e = obj;
        return c0238Ne;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0238Ne) create(obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r10.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.a
            java.lang.Object r4 = r10.e
            java.util.List r4 = (java.util.List) r4
            defpackage.AbstractC0115Ga.U(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.c
            AF r4 = r10.b
            java.util.Iterator r5 = r10.a
            java.lang.Object r6 = r10.e
            java.util.List r6 = (java.util.List) r6
            defpackage.AbstractC0115Ga.U(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            defpackage.AbstractC0115Ga.U(r11)
            java.lang.Object r11 = r10.e
            java.util.List r1 = r10.f
            java.util.Iterator r1 = r1.iterator()
            java.util.List r4 = r10.m
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r1.next()
            AF r5 = (defpackage.AF) r5
            r10.e = r4
            r10.a = r1
            r10.b = r5
            r10.c = r11
            r10.d = r3
            java.lang.Object r6 = r5.a(r10, r11)
            if (r6 != r0) goto L59
            return r0
        L59:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L93
            Me r11 = new Me
            r7 = 0
            r11.<init>(r6, r7)
            r4.add(r11)
            r10.e = r4
            r10.a = r5
            r10.b = r7
            r10.c = r7
            r10.d = r2
            FF r11 = new FF
            cI r7 = r6.e
            java.lang.Object r7 = r7.getValue()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.util.LinkedHashSet r8 = r6.f
            r11.<init>(r7, r8)
            un r6 = r6.b
            java.lang.Object r11 = r6.b(r11, r1, r10)
            if (r11 != r0) goto L91
            return r0
        L91:
            r1 = r5
            goto L3c
        L93:
            r11 = r1
            goto L91
        L95:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0238Ne.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
