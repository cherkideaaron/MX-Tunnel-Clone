package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.TO;
import defpackage.VO;
import defpackage.WO;

/* loaded from: classes2.dex */
final class w implements aw {
    private final w a = this;
    private final WO b;
    private final WO c;
    private final WO d;
    private final WO e;
    private final WO f;
    private final WO g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        VO vo = new VO(context);
        this.b = vo;
        TO toB = TO.b(bb.a);
        this.c = toB;
        au auVar = new au(vo, n.a);
        this.d = auVar;
        TO toB2 = TO.b(new bp(vo, toB, auVar, n.a));
        this.e = toB2;
        TO toB3 = TO.b(new bu(toB2));
        this.f = toB3;
        this.g = TO.b(new ba(toB2, toB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
