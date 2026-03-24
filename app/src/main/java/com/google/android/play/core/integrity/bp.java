package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.C3108nP;
import defpackage.UO;
import defpackage.WO;

/* loaded from: classes2.dex */
public final class bp implements UO {
    private final WO a;
    private final WO b;
    private final WO c;
    private final WO d;

    public bp(WO wo, WO wo2, WO wo3, WO wo4) {
        this.a = wo;
        this.b = wo2;
        this.c = wo3;
        this.d = wo4;
    }

    @Override // defpackage.WO
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.a.a(), (C3108nP) this.b.a(), ((au) this.c).a(), new j());
    }
}
