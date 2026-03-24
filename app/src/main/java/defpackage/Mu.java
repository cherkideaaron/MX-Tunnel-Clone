package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class Mu extends C0054Ch {
    public final int s;
    public final int t;
    public Bu u;
    public Cu v;

    public Mu(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.s = 21;
            this.t = 22;
        } else {
            this.s = 22;
            this.t = 21;
        }
    }

    @Override // defpackage.C0054Ch, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C3349ru c3349ru;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c3349ru = (C3349ru) headerViewListAdapter.getWrappedAdapter();
            } else {
                c3349ru = (C3349ru) adapter;
                headersCount = 0;
            }
            Cu cuB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c3349ru.getCount()) ? null : c3349ru.getItem(i);
            Cu cu = this.v;
            if (cu != cuB) {
                MenuC3511uu menuC3511uu = c3349ru.a;
                if (cu != null) {
                    this.u.d(menuC3511uu, cu);
                }
                this.v = cuB;
                if (cuB != null) {
                    this.u.n(menuC3511uu, cuB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.t) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        ((C3349ru) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(Bu bu) {
        this.u = bu;
    }

    @Override // defpackage.C0054Ch, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
