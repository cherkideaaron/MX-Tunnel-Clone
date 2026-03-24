package defpackage;

import android.os.Bundle;

/* renamed from: ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2842ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ BinderC2895je m;

    public RunnableC2842ie(BinderC2895je binderC2895je, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.m = binderC2895je;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.b.onActivityLayout(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
