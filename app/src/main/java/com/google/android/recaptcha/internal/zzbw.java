package com.google.android.recaptcha.internal;

import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.B9;
import defpackage.C0166Ja;
import defpackage.C0216Lq;
import defpackage.C0233Mq;
import defpackage.C0267Oq;
import defpackage.C0565c0;
import defpackage.E9;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0029Aq;
import defpackage.InterfaceC0134Hc;
import defpackage.InterfaceC0149Ia;
import defpackage.InterfaceC0151Ic;
import defpackage.InterfaceC0168Jc;
import defpackage.InterfaceC0470aE;
import defpackage.InterfaceC0525bE;
import defpackage.InterfaceC2631en;
import defpackage.InterfaceC2680fh;
import defpackage.InterfaceC2877jE;
import defpackage.InterfaceC3117ng;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class zzbw implements InterfaceC3117ng {
    private final /* synthetic */ InterfaceC0149Ia zza;

    public zzbw(InterfaceC0149Ia interfaceC0149Ia) {
        this.zza = interfaceC0149Ia;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final B9 attachChild(E9 e9) {
        return this.zza.attachChild(e9);
    }

    @Override // defpackage.InterfaceC3117ng
    public final Object await(InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objL = ((C0166Ja) this.zza).l(interfaceC3493uc);
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objL;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        C0267Oq c0267Oq = (C0267Oq) this.zza;
        c0267Oq.getClass();
        AbstractC0500aq.m(interfaceC3396sn, "operation");
        return interfaceC3396sn.invoke(obj, c0267Oq);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        C0267Oq c0267Oq = (C0267Oq) this.zza;
        c0267Oq.getClass();
        return AbstractC2883jK.v(c0267Oq, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2877jE getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.InterfaceC3117ng
    public final Object getCompleted() {
        return ((C0166Ja) this.zza).u();
    }

    @Override // defpackage.InterfaceC3117ng
    public final Throwable getCompletionExceptionOrNull() {
        return ((C0267Oq) this.zza).getCompletionExceptionOrNull();
    }

    @Override // defpackage.InterfaceC0134Hc
    public final InterfaceC0151Ic getKey() {
        return this.zza.getKey();
    }

    public final InterfaceC0525bE getOnAwait() {
        C0166Ja c0166Ja = (C0166Ja) this.zza;
        c0166Ja.getClass();
        AbstractC2883jK.j(3, C0216Lq.a);
        AbstractC2883jK.j(3, C0233Mq.a);
        return new C0565c0(c0166Ja);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC0470aE getOnJoin() {
        return this.zza.getOnJoin();
    }

    public final InterfaceC0029Aq getParent() {
        C0267Oq c0267Oq = (C0267Oq) this.zza;
        c0267Oq.getClass();
        B9 b9 = (B9) C0267Oq.b.get(c0267Oq);
        if (b9 != null) {
            return b9.getParent();
        }
        return null;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2680fh invokeOnCompletion(InterfaceC2631en interfaceC2631en) {
        return this.zza.invokeOnCompletion(interfaceC2631en);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final Object join(InterfaceC3493uc interfaceC3493uc) {
        return this.zza.join(interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        return this.zza.minusKey(interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        return this.zza.plus(interfaceC0168Jc);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean start() {
        return this.zza.start();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2680fh invokeOnCompletion(boolean z, boolean z2, InterfaceC2631en interfaceC2631en) {
        return this.zza.invokeOnCompletion(z, z2, interfaceC2631en);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC0029Aq plus(InterfaceC0029Aq interfaceC0029Aq) {
        this.zza.plus(interfaceC0029Aq);
        return interfaceC0029Aq;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
