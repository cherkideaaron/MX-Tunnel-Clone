package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.mxtunnel.pro.R;
import java.util.ArrayList;

/* renamed from: ps, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3239ps extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ C3294qs b;

    public C3239ps(C3294qs c3294qs) {
        this.b = c3294qs;
        a();
    }

    public final void a() {
        MenuC3511uu menuC3511uu = this.b.c;
        Cu cu = menuC3511uu.v;
        if (cu != null) {
            menuC3511uu.i();
            ArrayList arrayList = menuC3511uu.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Cu) arrayList.get(i)) == cu) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Cu getItem(int i) {
        C3294qs c3294qs = this.b;
        MenuC3511uu menuC3511uu = c3294qs.c;
        menuC3511uu.i();
        ArrayList arrayList = menuC3511uu.j;
        c3294qs.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (Cu) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C3294qs c3294qs = this.b;
        MenuC3511uu menuC3511uu = c3294qs.c;
        menuC3511uu.i();
        int size = menuC3511uu.j.size();
        c3294qs.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((Ru) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
