package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3256q8 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ RunnableC3256q8(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AbstractC3296qu abstractC3296qu = (AbstractC3296qu) ((C3588wG) this.c).a;
                if (abstractC3296qu != null) {
                    abstractC3296qu.K(this.b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i = 0;
                if (this.b == 1) {
                    while (i < size) {
                        ((AbstractC0601ci) arrayList.get(i)).b();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC0601ci) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                }
            case 2:
                RecyclerView recyclerView = ((Ut) this.c).n;
                if (!recyclerView.B) {
                    AbstractC3529vB abstractC3529vB = recyclerView.r;
                    if (abstractC3529vB != null) {
                        abstractC3529vB.z0(recyclerView, this.b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            default:
                ((SystemForegroundService) this.c).e.cancel(this.b);
                break;
        }
    }

    public RunnableC3256q8(List list, int i, Throwable th) {
        this.a = 1;
        AbstractC0136He.g(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }
}
