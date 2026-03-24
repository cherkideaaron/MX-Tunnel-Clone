package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.C0536bP;
import defpackage.InterfaceC2561dP;
import defpackage.YO;

/* loaded from: classes2.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.a = j;
        this.b = taskCompletionSource2;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() {
        if (bn.k(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.c;
            InterfaceC2561dP interfaceC2561dP = (InterfaceC2561dP) bnVar.a.n;
            Bundle bundleB = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            C0536bP c0536bP = (C0536bP) interfaceC2561dP;
            c0536bP.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0536bP.b);
            int i = YO.a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            c0536bP.b(2, parcelObtain);
        } catch (RemoteException e) {
            this.c.b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
