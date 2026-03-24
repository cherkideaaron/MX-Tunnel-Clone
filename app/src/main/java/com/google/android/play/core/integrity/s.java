package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.TO;
import defpackage.VO;
import defpackage.WO;

/* loaded from: classes2.dex */
final class s {
    private final s a = this;
    private final WO b;
    private final WO c;
    private final WO d;
    private final WO e;
    private final WO f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        VO vo = new VO(context);
        this.b = vo;
        TO toB = TO.b(ac.a);
        this.c = toB;
        au auVar = new au(vo, l.a);
        this.d = auVar;
        TO toB2 = TO.b(new al(vo, toB, auVar, l.a));
        this.e = toB2;
        this.f = TO.b(new ab(toB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
