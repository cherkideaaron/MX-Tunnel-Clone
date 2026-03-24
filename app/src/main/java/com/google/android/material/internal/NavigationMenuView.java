package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.MenuC3511uu;
import defpackage.Su;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements Su {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.Su
    public final void b(MenuC3511uu menuC3511uu) {
    }
}
