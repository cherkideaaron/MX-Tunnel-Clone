package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;

/* loaded from: classes.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfb(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == 0) {
            sb = new StringBuilder(String.valueOf(i2).length() + 46);
            str = "Player stuck buffering and not loading for ";
        } else if (i == 1) {
            sb = new StringBuilder(String.valueOf(i2).length() + 47);
            str = "Player stuck buffering with no progress for ";
        } else if (i == 2) {
            sb = new StringBuilder(String.valueOf(i2).length() + 45);
            str = "Player stuck playing with no progress for ";
        } else if (i != 3) {
            sb = new StringBuilder(String.valueOf(i2).length() + 31);
            str = "Player stuck suppressed for ";
        } else {
            sb = new StringBuilder(String.valueOf(i2).length() + 43);
            str = "Player stuck playing without ending for ";
        }
        super(AbstractC3219pQ.e(sb, str, i2, " ms"));
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }
}
