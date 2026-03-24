package defpackage;

/* renamed from: ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3497ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledExecutorServiceC3605wg b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ C0607co d;

    public /* synthetic */ RunnableC3497ug(ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg, Runnable runnable, C0607co c0607co, int i) {
        this.a = i;
        this.b = scheduledExecutorServiceC3605wg;
        this.c = runnable;
        this.d = c0607co;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg = this.b;
                scheduledExecutorServiceC3605wg.getClass();
                final Runnable runnable = this.c;
                final C0607co c0607co = this.d;
                final int i = 0;
                scheduledExecutorServiceC3605wg.a.execute(new Runnable() { // from class: sg
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3713yg) c0607co.a).i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3713yg) c0607co.a).i(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                C0607co c0607co2 = c0607co;
                                try {
                                    runnable2.run();
                                    ((ScheduledFutureC3713yg) c0607co2.a).h(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ScheduledFutureC3713yg) c0607co2.a).i(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg2 = this.b;
                scheduledExecutorServiceC3605wg2.getClass();
                final Runnable runnable2 = this.c;
                final C0607co c0607co2 = this.d;
                final int i2 = 2;
                scheduledExecutorServiceC3605wg2.a.execute(new Runnable() { // from class: sg
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3713yg) c0607co2.a).i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3713yg) c0607co2.a).i(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                C0607co c0607co22 = c0607co2;
                                try {
                                    runnable22.run();
                                    ((ScheduledFutureC3713yg) c0607co22.a).h(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ScheduledFutureC3713yg) c0607co22.a).i(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg3 = this.b;
                scheduledExecutorServiceC3605wg3.getClass();
                final Runnable runnable3 = this.c;
                final C0607co c0607co3 = this.d;
                final int i3 = 1;
                scheduledExecutorServiceC3605wg3.a.execute(new Runnable() { // from class: sg
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3713yg) c0607co3.a).i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3713yg) c0607co3.a).i(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                C0607co c0607co22 = c0607co3;
                                try {
                                    runnable22.run();
                                    ((ScheduledFutureC3713yg) c0607co22.a).h(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ScheduledFutureC3713yg) c0607co22.a).i(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
