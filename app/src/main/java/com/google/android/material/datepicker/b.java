package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.IL;
import defpackage.JB;
import defpackage.UL;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class b extends JB {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = UL.a;
        new IL(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).D(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
