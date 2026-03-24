package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2732ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ BinderC2895je e;

    public RunnableC2732ge(BinderC2895je binderC2895je, int i, Uri uri, boolean z, Bundle bundle) {
        this.e = binderC2895je;
        this.a = i;
        this.b = uri;
        this.c = z;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b.onRelationshipValidationResult(this.a, this.b, this.c, this.d);
    }
}
