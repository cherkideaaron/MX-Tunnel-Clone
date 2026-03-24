package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhs extends zzhq {
    public final int zzc;

    public zzhs(int i, String str, IOException iOException, Map map, zzhf zzhfVar, byte[] bArr) {
        super(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 15), "Response code: ", i), iOException, zzhfVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzc = i;
    }
}
