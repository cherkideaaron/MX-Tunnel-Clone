package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.Cu;
import defpackage.D3;
import defpackage.InterfaceC3457tu;
import defpackage.MenuC3511uu;
import defpackage.Su;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC3457tu, Su, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public MenuC3511uu a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        D3 d3L = D3.L(R.attr.listViewStyle, 0, context, attributeSet, b);
        TypedArray typedArray = (TypedArray) d3L.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(d3L.x(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(d3L.x(1));
        }
        d3L.P();
    }

    @Override // defpackage.InterfaceC3457tu
    public final boolean a(Cu cu) {
        return this.a.q(cu, null, 0);
    }

    @Override // defpackage.Su
    public final void b(MenuC3511uu menuC3511uu) {
        this.a = menuC3511uu;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((Cu) getAdapter().getItem(i));
    }
}
