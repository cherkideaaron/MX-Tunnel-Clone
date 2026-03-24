package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zaah implements Runnable {
    final /* synthetic */ zaar zaa;

    public zaah(zaar zaarVar) {
        Objects.requireNonNull(zaarVar);
        this.zaa = zaarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaar zaarVar = this.zaa;
        zaarVar.zau().cancelAvailabilityErrorNotifications(zaarVar.zat());
    }
}
