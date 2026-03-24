package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzf extends zza {
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zza() throws RemoteException {
        String strM;
        String interfaceDescriptor;
        BaseGmsClient baseGmsClient;
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            baseGmsClient = this.zzf;
        } catch (RemoteException unused) {
            strM = "service probably died";
        }
        if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
            String serviceDescriptor = baseGmsClient.getServiceDescriptor();
            strM = AbstractC3264qG.m(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor);
            Log.w("GmsClient", strM);
            return false;
        }
        IInterface iInterfaceCreateServiceInterface = baseGmsClient.createServiceInterface(this.zze);
        if (iInterfaceCreateServiceInterface == null || !(baseGmsClient.zze(2, 4, iInterfaceCreateServiceInterface) || baseGmsClient.zze(3, 4, iInterfaceCreateServiceInterface))) {
            return false;
        }
        baseGmsClient.zzn(null);
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacksZzk = baseGmsClient.zzk();
        Bundle connectionHint = baseGmsClient.getConnectionHint();
        if (baseConnectionCallbacksZzk == null) {
            return true;
        }
        baseGmsClient.zzk().onConnected(connectionHint);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzf;
        if (baseGmsClient.zzl() != null) {
            baseGmsClient.zzl().onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }
}
