package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mxtunnel.pro.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class KO extends AbstractC3149oB {
    public final Ut d;

    public KO(Ut ut) {
        this.d = ut;
    }

    @Override // defpackage.AbstractC3149oB
    public final int a() {
        return this.d.c.f;
    }

    @Override // defpackage.AbstractC3149oB
    public final void c(JB jb, int i) {
        Ut ut = this.d;
        int i2 = ut.c.a.c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((JO) jb).u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0477aL.c().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        R2 r2 = ut.f;
        if (AbstractC0477aL.c().get(1) == i2) {
            Object obj = r2.c;
        } else {
            Object obj2 = r2.b;
        }
        throw null;
    }

    @Override // defpackage.AbstractC3149oB
    public final JB d(RecyclerView recyclerView) {
        return new JO((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
