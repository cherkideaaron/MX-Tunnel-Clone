package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes2.dex */
final class bt {
    private final bn a;

    public bt(bn bnVar) {
        this.a = bnVar;
    }

    public final /* synthetic */ Task a(long j, long j2, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.a.d(standardIntegrityTokenRequest.a(), j, j2, 0);
    }
}
