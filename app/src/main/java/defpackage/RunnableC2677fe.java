package defpackage;

import android.os.Bundle;

/* renamed from: fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2677fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ BinderC2895je d;

    public /* synthetic */ RunnableC2677fe(BinderC2895je binderC2895je, String str, Bundle bundle, int i) {
        this.a = i;
        this.d = binderC2895je;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.d.b.extraCallback(this.b, this.c);
                break;
            default:
                this.d.b.onPostMessage(this.b, this.c);
                break;
        }
    }
}
