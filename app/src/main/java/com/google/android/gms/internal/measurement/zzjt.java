package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.WF;

/* loaded from: classes2.dex */
public final class zzjt {
    private final WF zza;

    public zzjt(WF wf) {
        this.zza = wf;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        WF wf = uri != null ? (WF) this.zza.get(uri.toString()) : null;
        if (wf == null) {
            return null;
        }
        return (String) wf.get("".concat(str3));
    }
}
