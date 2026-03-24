package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractRunnableC3163oP;
import defpackage.C2725gP;
import defpackage.InterfaceC2835iP;
import defpackage.YO;

/* loaded from: classes2.dex */
final class ag extends AbstractRunnableC3163oP {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() {
        try {
            aj ajVar = this.e;
            InterfaceC2835iP interfaceC2835iP = (InterfaceC2835iP) ajVar.a.n;
            Bundle bundle = this.a;
            as asVarA = ajVar.d.a(this.b, this.c, ajVar.a);
            C2725gP c2725gP = (C2725gP) interfaceC2835iP;
            c2725gP.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c2725gP.b);
            int i = YO.a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            c2725gP.b(3, parcelObtain);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
