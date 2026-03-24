package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.C3566vv;
import defpackage.Ut;

/* loaded from: classes2.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        C3566vv c3566vvA = materialCalendarGridView.a();
        if (i < c3566vvA.a() || i > c3566vvA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((Ut) this.b.e.a).c.c.a) {
            throw null;
        }
    }
}
