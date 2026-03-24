package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbbo extends zzbby {
    private List zzh;
    private final Context zzi;

    public zzbbo(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context) {
        super(zzbakVar, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", zzawgVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzq(-1L);
        zzawgVar.zzr(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzawgVar) {
            zzawgVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzawgVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
