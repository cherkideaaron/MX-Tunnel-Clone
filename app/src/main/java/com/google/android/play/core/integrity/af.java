package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractRunnableC3163oP;
import defpackage.C2725gP;
import defpackage.InterfaceC2835iP;
import defpackage.RO;
import defpackage.YO;

/* loaded from: classes2.dex */
final class af extends AbstractRunnableC3163oP {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ IntegrityTokenRequest d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void a(Exception exc) {
        if (exc instanceof RO) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() {
        try {
            aj ajVar = this.e;
            InterfaceC2835iP interfaceC2835iP = (InterfaceC2835iP) ajVar.a.n;
            Bundle bundleA = aj.a(ajVar, this.a, this.b, null);
            ai aiVar = new ai(this.e, this.c);
            C2725gP c2725gP = (C2725gP) interfaceC2835iP;
            c2725gP.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c2725gP.b);
            int i = YO.a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            c2725gP.b(2, parcelObtain);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestIntegrityToken(%s)", this.d);
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
