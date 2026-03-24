package defpackage;

import org.json.JSONObject;

/* renamed from: cC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0577cC extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2602eC c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577cC(C2602eC c2602eC, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = c2602eC;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0577cC c0577cC = new C0577cC(this.c, interfaceC3493uc);
        c0577cC.b = obj;
        return c0577cC;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0577cC) create((JSONObject) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[RETURN] */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0577cC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
