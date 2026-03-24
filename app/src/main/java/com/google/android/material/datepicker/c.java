package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0477aL;
import defpackage.AbstractC3149oB;
import defpackage.C0504au;
import defpackage.C0607co;
import defpackage.C2871j8;
import defpackage.C3512uv;
import defpackage.C3566vv;
import defpackage.C3583wB;
import defpackage.JB;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class c extends AbstractC3149oB {
    public final C2871j8 d;
    public final C0607co e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, C2871j8 c2871j8, C0607co c0607co) {
        C3512uv c3512uv = c2871j8.a;
        C3512uv c3512uv2 = c2871j8.d;
        if (c3512uv.a.compareTo(c3512uv2.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c3512uv2.a.compareTo(c2871j8.b.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C3566vv.d) + (C0504au.i(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = c2871j8;
        this.e = c0607co;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // defpackage.AbstractC3149oB
    public final int a() {
        return this.d.m;
    }

    @Override // defpackage.AbstractC3149oB
    public final long b(int i) {
        Calendar calendarB = AbstractC0477aL.b(this.d.a.a);
        calendarB.add(2, i);
        return new C3512uv(calendarB).a.getTimeInMillis();
    }

    @Override // defpackage.AbstractC3149oB
    public final void c(JB jb, int i) {
        b bVar = (b) jb;
        C2871j8 c2871j8 = this.d;
        Calendar calendarB = AbstractC0477aL.b(c2871j8.a.a);
        calendarB.add(2, i);
        C3512uv c3512uv = new C3512uv(calendarB);
        bVar.u.setText(c3512uv.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !c3512uv.equals(materialCalendarGridView.a().a)) {
            new C3566vv(c3512uv, c2871j8);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.AbstractC3149oB
    public final JB d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!C0504au.i(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C3583wB(-1, this.f));
        return new b(linearLayout, true);
    }
}
