package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class zzath extends zzijr implements Closeable {
    static {
        zzijy.zzb(zzath.class);
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzijr
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
