package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import java.util.List;

/* renamed from: b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0512b1 extends ArrayAdapter {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ C0512b1(int i, Context context, List list) {
        super(context, i, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        switch (this.a) {
            case 1:
                return i;
            default:
                return super.getItemId(i);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.log_item, viewGroup, false);
                ((TextView) viewInflate.findViewById(R.id.log_item)).setText(Html.fromHtml(((C3461ty) getItem(i)).a));
                return viewInflate;
            default:
                return super.getView(i, view, viewGroup);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.hasStableIds();
        }
    }

    public /* synthetic */ C0512b1(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
    }
}
