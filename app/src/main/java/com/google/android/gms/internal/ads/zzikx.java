package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import defpackage.AbstractC2950ke;
import defpackage.AbstractServiceConnectionC3280qe;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzikx extends AbstractServiceConnectionC3280qe {
    private final WeakReference zza;

    public zzikx(zzbif zzbifVar) {
        this.zza = new WeakReference(zzbifVar);
    }

    @Override // defpackage.AbstractServiceConnectionC3280qe
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2950ke abstractC2950ke) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzf(abstractC2950ke);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzg();
        }
    }
}
