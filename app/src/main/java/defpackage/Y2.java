package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                C2758h3 c2758h3 = (C2758h3) this.b;
                if (!c2758h3.getInternalPopup().b()) {
                    c2758h3.f.m(c2758h3.getTextDirection(), c2758h3.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c2758h3.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                C2593e3 c2593e3 = (C2593e3) this.b;
                C2758h3 c2758h32 = c2593e3.N;
                c2593e3.getClass();
                if (!c2758h32.isAttachedToWindow() || !c2758h32.getGlobalVisibleRect(c2593e3.L)) {
                    c2593e3.dismiss();
                    break;
                } else {
                    c2593e3.r();
                    c2593e3.show();
                    break;
                }
                break;
            case 2:
                M8 m8 = (M8) this.b;
                if (m8.b()) {
                    ArrayList arrayList = m8.o;
                    if (arrayList.size() > 0 && !((L8) arrayList.get(0)).a.E) {
                        View view = m8.v;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((L8) it.next()).a.show();
                            }
                            break;
                        } else {
                            m8.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                RG rg = (RG) this.b;
                if (rg.b() && !rg.o.E) {
                    View view2 = rg.t;
                    if (view2 != null && view2.isShown()) {
                        rg.o.show();
                        break;
                    } else {
                        rg.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
