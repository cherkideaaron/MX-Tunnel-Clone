package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3279qd;
import defpackage.B7;
import defpackage.C0220Md;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C3002lb;
import defpackage.C3562vr;
import defpackage.InterfaceC3538vK;
import defpackage.KA;
import defpackage.Tr;
import defpackage.U6;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final C3562vr a = new C3562vr(new C3002lb(1));
    public static final C3562vr b = new C3562vr(new C3002lb(2));
    public static final C3562vr c = new C3562vr(new C3002lb(3));
    public static final C3562vr d = new C3562vr(new C3002lb(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        KA ka = new KA(U6.class, ScheduledExecutorService.class);
        KA[] kaArr = {new KA(U6.class, ExecutorService.class), new KA(U6.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(ka);
        for (KA ka2 : kaArr) {
            AbstractC3279qd.l(ka2, "Null interface");
        }
        Collections.addAll(hashSet, kaArr);
        C0319Sa c0319Sa = new C0319Sa(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0220Md(9), hashSet3);
        KA ka3 = new KA(B7.class, ScheduledExecutorService.class);
        KA[] kaArr2 = {new KA(B7.class, ExecutorService.class), new KA(B7.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(ka3);
        for (KA ka4 : kaArr2) {
            AbstractC3279qd.l(ka4, "Null interface");
        }
        Collections.addAll(hashSet4, kaArr2);
        C0319Sa c0319Sa2 = new C0319Sa(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0220Md(10), hashSet6);
        KA ka5 = new KA(Tr.class, ScheduledExecutorService.class);
        KA[] kaArr3 = {new KA(Tr.class, ExecutorService.class), new KA(Tr.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(ka5);
        for (KA ka6 : kaArr3) {
            AbstractC3279qd.l(ka6, "Null interface");
        }
        Collections.addAll(hashSet7, kaArr3);
        C0319Sa c0319Sa3 = new C0319Sa(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0220Md(11), hashSet9);
        C0302Ra c0302RaA = C0319Sa.a(new KA(InterfaceC3538vK.class, Executor.class));
        c0302RaA.f = new C0220Md(12);
        return Arrays.asList(c0319Sa, c0319Sa2, c0319Sa3, c0302RaA.b());
    }
}
