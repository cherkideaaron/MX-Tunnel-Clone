package defpackage;

import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class Tt extends AbstractC3691yB {
    public final /* synthetic */ c a;
    public final /* synthetic */ Ut b;

    public Tt(Ut ut, c cVar) {
        this.b = ut;
        this.a = cVar;
    }

    @Override // defpackage.AbstractC3691yB
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iM0;
        Ut ut = this.b;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ut.n.getLayoutManager();
            View viewO0 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
            iM0 = viewO0 == null ? -1 : AbstractC3529vB.H(viewO0);
        } else {
            iM0 = ((LinearLayoutManager) ut.n.getLayoutManager()).M0();
        }
        c cVar = this.a;
        Calendar calendarB = AbstractC0477aL.b(cVar.d.a.a);
        calendarB.add(2, iM0);
        C3512uv c3512uv = new C3512uv(calendarB);
        ut.d = c3512uv;
        MaterialButton materialButton = ut.s;
        C2871j8 c2871j8 = cVar.d;
        Calendar calendarB2 = AbstractC0477aL.b(c2871j8.a.a);
        calendarB2.add(2, iM0);
        calendarB2.set(5, 1);
        Calendar calendarB3 = AbstractC0477aL.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        long timeInMillis = calendarB3.getTimeInMillis();
        materialButton.setText(Build.VERSION.SDK_INT >= 24 ? AbstractC0477aL.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
        ut.h(c2871j8.a.d(c3512uv));
    }
}
