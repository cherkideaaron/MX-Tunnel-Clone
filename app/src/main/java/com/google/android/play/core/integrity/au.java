package com.google.android.play.core.integrity;

import defpackage.UO;
import defpackage.WO;

/* loaded from: classes2.dex */
public final class au implements UO {
    private final WO a;
    private final WO b;

    public au(WO wo, WO wo2) {
        this.a = wo;
        this.b = wo2;
    }

    @Override // defpackage.WO
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.a, this.b);
    }
}
