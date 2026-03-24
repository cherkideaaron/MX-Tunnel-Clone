package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class P3 implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ P3(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                Q3.X().s.t.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
