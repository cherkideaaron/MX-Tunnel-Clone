package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzhyl {
    @Deprecated
    public zzhyl() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzhzs zzhzsVar = new zzhzs(zzhzg.zza(sb));
            zzhzsVar.zza(zzhyq.LENIENT);
            zzhzo.zza.zza(zzhzsVar, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzhyn zze() {
        if (this instanceof zzhyn) {
            return (zzhyn) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzhyk zzf() {
        if (this instanceof zzhyk) {
            return (zzhyk) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzhyp zzg() {
        if (this instanceof zzhyp) {
            return (zzhyp) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
