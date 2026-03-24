package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3349ru extends BaseAdapter {
    public final MenuC3511uu a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public C3349ru(MenuC3511uu menuC3511uu, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = menuC3511uu;
        this.f = i;
        a();
    }

    public final void a() {
        MenuC3511uu menuC3511uu = this.a;
        Cu cu = menuC3511uu.v;
        if (cu != null) {
            menuC3511uu.i();
            ArrayList arrayList = menuC3511uu.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Cu) arrayList.get(i)) == cu) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Cu getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuC3511uu menuC3511uu = this.a;
        if (z) {
            menuC3511uu.i();
            arrayListL = menuC3511uu.j;
        } else {
            arrayListL = menuC3511uu.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (Cu) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuC3511uu menuC3511uu = this.a;
        if (z) {
            menuC3511uu.i();
            arrayListL = menuC3511uu.j;
        } else {
            arrayListL = menuC3511uu.l();
        }
        int i = this.b;
        int size = arrayListL.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        Ru ru = (Ru) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ru.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
