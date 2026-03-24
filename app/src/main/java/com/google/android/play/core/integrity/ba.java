package com.google.android.play.core.integrity;

import defpackage.UO;
import defpackage.WO;

/* loaded from: classes2.dex */
public final class ba implements UO {
    private final WO a;
    private final WO b;

    public ba(WO wo, WO wo2) {
        this.a = wo;
        this.b = wo2;
    }

    @Override // defpackage.WO
    public final /* bridge */ /* synthetic */ Object a() {
        WO wo = this.b;
        return new az((bn) this.a.a(), (bt) wo.a());
    }
}
