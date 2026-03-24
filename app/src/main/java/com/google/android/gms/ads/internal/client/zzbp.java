package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzbp extends zzbct implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZzf;
        if (i != 1) {
            if (i == 2) {
                strZzf = zzf();
            } else {
                if (i == 3) {
                    boolean zZzg = zzg();
                    parcel2.writeNoException();
                    int i3 = zzbcu.zza;
                    parcel2.writeInt(zZzg ? 1 : 0);
                    return true;
                }
                if (i == 4) {
                    strZzf = zzh();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    zzm zzmVar = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
                    int i4 = parcel.readInt();
                    zzbcu.zzh(parcel);
                    zzi(zzmVar, i4);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        zzm zzmVar2 = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
        zzbcu.zzh(parcel);
        zze(zzmVar2);
        parcel2.writeNoException();
        return true;
    }
}
