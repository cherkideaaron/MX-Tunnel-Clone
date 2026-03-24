package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zaat implements com.google.android.gms.common.internal.zam {
    final /* synthetic */ zaaz zaa;

    public zaat(zaaz zaazVar) {
        Objects.requireNonNull(zaazVar);
        this.zaa = zaazVar;
    }

    @Override // com.google.android.gms.common.internal.zam
    public final boolean isConnected() {
        return this.zaa.isConnected();
    }
}
