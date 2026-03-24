package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568c3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0568c3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.a) {
            case 0:
                C2593e3 c2593e3 = (C2593e3) this.b;
                c2593e3.N.setSelection(i);
                if (c2593e3.N.getOnItemClickListener() != null) {
                    c2593e3.N.performItemClick(view, i, c2593e3.K.getItemId(i));
                }
                c2593e3.dismiss();
                break;
            default:
                Jt jt = (Jt) this.b;
                if (i < 0) {
                    C3725ys c3725ys = jt.e;
                    item = !c3725ys.F.isShowing() ? null : c3725ys.c.getSelectedItem();
                } else {
                    item = jt.getAdapter().getItem(i);
                }
                jt.setText(jt.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = jt.getOnItemClickListener();
                C3725ys c3725ys2 = jt.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c3725ys2.F.isShowing() ? c3725ys2.c.getSelectedView() : null;
                        i = !c3725ys2.F.isShowing() ? -1 : c3725ys2.c.getSelectedItemPosition();
                        j = !c3725ys2.F.isShowing() ? Long.MIN_VALUE : c3725ys2.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c3725ys2.c, view, i, j);
                }
                c3725ys2.dismiss();
                break;
        }
    }
}
