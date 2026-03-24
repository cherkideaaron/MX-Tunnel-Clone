package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2791hi extends AbstractC0136He {
    public final /* synthetic */ AbstractC0136He w;
    public final /* synthetic */ ThreadPoolExecutor x;

    public C2791hi(AbstractC0136He abstractC0136He, ThreadPoolExecutor threadPoolExecutor) {
        this.w = abstractC0136He;
        this.x = threadPoolExecutor;
    }

    @Override // defpackage.AbstractC0136He
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.x;
        try {
            this.w.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.AbstractC0136He
    public final void C(C3532vE c3532vE) {
        ThreadPoolExecutor threadPoolExecutor = this.x;
        try {
            this.w.C(c3532vE);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
