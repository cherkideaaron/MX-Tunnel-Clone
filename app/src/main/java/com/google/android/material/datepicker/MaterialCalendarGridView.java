package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.AbstractC0477aL;
import defpackage.C0504au;
import defpackage.C3390sh;
import defpackage.C3566vv;
import defpackage.UL;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0477aL.d(null);
        if (C0504au.i(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.mxtunnel.pro.R.id.cancel_button);
            setNextFocusRightId(com.mxtunnel.pro.R.id.confirm_button);
        }
        this.a = C0504au.i(getContext(), com.mxtunnel.pro.R.attr.nestedScrollable);
        UL.l(this, new C3390sh(3));
    }

    public final C3566vv a() {
        return (C3566vv) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C3566vv) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C3566vv) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C3566vv c3566vv = (C3566vv) super.getAdapter();
        c3566vv.getClass();
        int iMax = Math.max(c3566vv.a(), getFirstVisiblePosition());
        int iMin = Math.min(c3566vv.c(), getLastVisiblePosition());
        c3566vv.getItem(iMax);
        c3566vv.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iA;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            iA = ((C3566vv) super.getAdapter()).c();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iA = ((C3566vv) super.getAdapter()).a();
        }
        setSelection(iA);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((C3566vv) super.getAdapter()).a() && selectedItemPosition <= ((C3566vv) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C3566vv) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C3566vv) super.getAdapter()).a()) {
            i = ((C3566vv) super.getAdapter()).a();
        }
        super.setSelection(i);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C3566vv) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C3566vv)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3566vv.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
