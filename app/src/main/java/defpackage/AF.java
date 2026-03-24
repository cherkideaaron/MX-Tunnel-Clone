package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class AF {
    public final InterfaceC3396sn a;
    public final InterfaceC3504un b;
    public final Context c;
    public final String d;
    public final C0583cI e;
    public final LinkedHashSet f;

    public AF(Context context, String str, Set set, InterfaceC3396sn interfaceC3396sn, BF bf) {
        AbstractC0500aq.m(context, "context");
        AbstractC0500aq.m(set, "keysToMigrate");
        AbstractC0500aq.m(interfaceC3396sn, "shouldRunMigration");
        C2971kz c2971kz = new C2971kz(1, context, str);
        this.a = interfaceC3396sn;
        this.b = bf;
        this.c = context;
        this.d = str;
        this.e = AbstractC0069Df.G(c2971kz);
        this.f = set == EF.a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.InterfaceC3493uc r5, java.lang.Object r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C3749zF
            if (r0 == 0) goto L13
            r0 = r5
            zF r0 = (defpackage.C3749zF) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zF r0 = new zF
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            AF r6 = r0.a
            defpackage.AbstractC0115Ga.U(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC0115Ga.U(r5)
            r0.a = r4
            r0.d = r3
            sn r5 = r4.a
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r6 = r4
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.LinkedHashSet r5 = r6.f
            cI r6 = r6.e
            r0 = 0
            if (r5 != 0) goto L6c
            java.lang.Object r5 = r6.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            defpackage.AbstractC0500aq.l(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L8f
        L6a:
            r3 = r0
            goto L8f
        L6c:
            java.lang.Object r6 = r6.getValue()
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L79
            goto L6a
        L79:
            java.util.Iterator r5 = r5.iterator()
        L7d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L7d
        L8f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AF.a(uc, java.lang.Object):java.lang.Object");
    }
}
