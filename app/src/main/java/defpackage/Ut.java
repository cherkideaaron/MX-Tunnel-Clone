package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Ut<S> extends Uy {
    public int b;
    public C2871j8 c;
    public C3512uv d;
    public int e;
    public R2 f;
    public RecyclerView m;
    public RecyclerView n;
    public View o;
    public View p;
    public View q;
    public View r;
    public MaterialButton s;
    public AccessibilityManager t;

    public final void f(C3512uv c3512uv) {
        RecyclerView recyclerView;
        RunnableC3256q8 runnableC3256q8;
        c cVar = (c) this.n.getAdapter();
        int iD = cVar.d.a.d(c3512uv);
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - cVar.d.a.d(this.d);
            boolean z = Math.abs(iD2) > 3;
            boolean z2 = iD2 > 0;
            this.d = c3512uv;
            if (z && z2) {
                this.n.a0(iD - 3);
                recyclerView = this.n;
                runnableC3256q8 = new RunnableC3256q8(iD, 2, this);
            } else if (z) {
                this.n.a0(iD + 3);
                recyclerView = this.n;
                runnableC3256q8 = new RunnableC3256q8(iD, 2, this);
            } else {
                recyclerView = this.n;
                runnableC3256q8 = new RunnableC3256q8(iD, 2, this);
            }
            recyclerView.post(runnableC3256q8);
        } else {
            this.d = c3512uv;
            this.n.a0(iD);
        }
        h(iD);
    }

    public final void g(int i) {
        this.e = i;
        if (i == 2) {
            this.m.getLayoutManager().p0(this.d.c - ((KO) this.m.getAdapter()).d.c.a.c);
            this.q.setVisibility(0);
            this.r.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.o.setVisibility(0);
            this.p.setVisibility(0);
            f(this.d);
        }
    }

    public final void h(int i) {
        this.p.setEnabled(i + 1 < this.n.getAdapter().a());
        this.o.setEnabled(i - 1 >= 0);
    }

    @Override // androidx.fragment.app.l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        Vs.t(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.c = (C2871j8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        Vs.t(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.d = (C3512uv) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        Hy hy;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.f = new R2((Context) contextThemeWrapper, 10);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.t = (AccessibilityManager) requireContext().getSystemService("accessibility");
        C3512uv c3512uv = this.c.a;
        if (C0504au.i(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.mxtunnel.pro.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.mxtunnel.pro.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.mxtunnel.pro.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.mxtunnel.pro.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C3566vv.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.mxtunnel.pro.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.mxtunnel.pro.R.id.mtrl_calendar_days_of_week);
        UL.l(gridView, new C3390sh(1));
        int i4 = this.c.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0035Bf(i4) : new C0035Bf()));
        gridView.setNumColumns(c3512uv.d);
        gridView.setEnabled(false);
        this.n = (RecyclerView) viewInflate.findViewById(com.mxtunnel.pro.R.id.mtrl_calendar_months);
        getContext();
        this.n.setLayoutManager(new Rt(this, i2, i2));
        this.n.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.c, new C0607co(this));
        this.n.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.mxtunnel.pro.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.mxtunnel.pro.R.id.mtrl_calendar_year_selector_frame);
        this.m = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.m.setLayoutManager(new GridLayoutManager(integer));
            this.m.setAdapter(new KO(this));
            this.m.g(new St(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.mxtunnel.pro.R.id.month_navigation_fragment_toggle);
        C2871j8 c2871j8 = cVar.d;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.mxtunnel.pro.R.id.month_navigation_fragment_toggle);
            this.s = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            UL.l(this.s, new C3090n7(this, 3));
            View viewFindViewById2 = viewInflate.findViewById(com.mxtunnel.pro.R.id.month_navigation_previous);
            this.o = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.mxtunnel.pro.R.id.month_navigation_next);
            this.p = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.q = viewInflate.findViewById(com.mxtunnel.pro.R.id.mtrl_calendar_year_selector_frame);
            this.r = viewInflate.findViewById(com.mxtunnel.pro.R.id.mtrl_calendar_day_selector_frame);
            g(1);
            this.s.setText(this.d.c());
            this.n.h(new Tt(this, cVar));
            this.s.setOnClickListener(new ViewOnClickListenerC0510b(this, 5));
            this.p.setOnClickListener(new Qt(this, cVar, 1));
            this.o.setOnClickListener(new Qt(this, cVar, 0));
            h(c2871j8.a.d(this.d));
        }
        if (!C0504au.i(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (hy = new Hy()).a) != (recyclerView = this.n)) {
            C2934kG c2934kG = hy.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.l0;
                if (arrayList != null) {
                    arrayList.remove(c2934kG);
                }
                hy.a.setOnFlingListener(null);
            }
            hy.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                hy.a.h(c2934kG);
                hy.a.setOnFlingListener(hy);
                new Scroller(hy.a.getContext(), new DecelerateInterpolator());
                hy.f();
            }
        }
        this.n.a0(c2871j8.a.d(this.d));
        UL.l(this.n, new C3390sh(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.l
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.d);
    }
}
