package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.WF;

/* loaded from: classes.dex */
public final class zzci {
    private final WF zza;

    public zzci(WF wf) {
        this.zza = wf;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        WF wf = (WF) this.zza.get(uri.toString());
        if (wf == null) {
            return null;
        }
        return (String) wf.get("".concat(String.valueOf(str3)));
    }
}
