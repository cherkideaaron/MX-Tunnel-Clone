package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class Qt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Ut c;

    public /* synthetic */ Qt(Ut ut, c cVar, int i) {
        this.a = i;
        this.c = ut;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Ut ut = this.c;
                int iM0 = ((LinearLayoutManager) ut.n.getLayoutManager()).M0() - 1;
                Calendar calendarB = AbstractC0477aL.b(this.b.d.a.a);
                calendarB.add(2, iM0);
                ut.f(new C3512uv(calendarB));
                break;
            default:
                Ut ut2 = this.c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ut2.n.getLayoutManager();
                View viewO0 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
                int iH = viewO0 == null ? -1 : AbstractC3529vB.H(viewO0);
                Calendar calendarB2 = AbstractC0477aL.b(this.b.d.a.a);
                calendarB2.add(2, iH + 1);
                ut2.f(new C3512uv(calendarB2));
                break;
        }
    }
}
