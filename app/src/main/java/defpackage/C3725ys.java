package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;

/* renamed from: ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3725ys implements RF {
    public static final Method G;
    public static final Method H;
    public static final Method I;
    public final Handler B;
    public Rect D;
    public boolean E;
    public final Q2 F;
    public final Context a;
    public ListAdapter b;
    public C0054Ch c;
    public int f;
    public int m;
    public boolean o;
    public boolean p;
    public boolean q;
    public C3563vs t;
    public View u;
    public AdapterView.OnItemClickListener v;
    public AdapterView.OnItemSelectedListener w;
    public final int d = -2;
    public int e = -2;
    public final int n = 1002;
    public int r = 0;
    public final int s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final RunnableC3509us x = new RunnableC3509us(this, 1);
    public final ViewOnTouchListenerC3671xs y = new ViewOnTouchListenerC3671xs(this, 0);
    public final C3617ws z = new C3617ws(this);
    public final RunnableC3509us A = new RunnableC3509us(this, 0);
    public final Rect C = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C3725ys(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.o, i, i2);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.o = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        Q2 q2 = new Q2(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.s, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            q2.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        q2.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0500aq.F(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.F = q2;
        q2.setInputMethodMode(1);
    }

    public C0054Ch a(Context context, boolean z) {
        return new C0054Ch(context, z);
    }

    @Override // defpackage.RF
    public final boolean b() {
        return this.F.isShowing();
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.RF
    public final void dismiss() {
        Q2 q2 = this.F;
        q2.dismiss();
        q2.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.x);
    }

    public final void e(int i) {
        this.f = i;
    }

    public final Drawable g() {
        return this.F.getBackground();
    }

    @Override // defpackage.RF
    public final C0054Ch i() {
        return this.c;
    }

    public final void j(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.m = i;
        this.o = true;
    }

    public final int o() {
        if (this.o) {
            return this.m;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        C3563vs c3563vs = this.t;
        if (c3563vs == null) {
            this.t = new C3563vs(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c3563vs);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        C0054Ch c0054Ch = this.c;
        if (c0054Ch != null) {
            c0054Ch.setAdapter(this.b);
        }
    }

    public final void q(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.C;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    @Override // defpackage.RF
    public final void show() {
        int i;
        int iA;
        int paddingBottom;
        C0054Ch c0054Ch;
        C0054Ch c0054Ch2 = this.c;
        Q2 q2 = this.F;
        Context context = this.a;
        if (c0054Ch2 == null) {
            C0054Ch c0054ChA = a(context, !this.E);
            this.c = c0054ChA;
            c0054ChA.setAdapter(this.b);
            this.c.setOnItemClickListener(this.v);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new C3347rs(this));
            this.c.setOnScrollListener(this.z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.w;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            q2.setContentView(this.c);
        }
        Drawable background = q2.getBackground();
        Rect rect = this.C;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.o) {
                this.m = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = q2.getInputMethodMode() == 2;
        View view = this.u;
        int i3 = this.m;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(q2, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = q2.getMaxAvailableHeight(view, i3);
            }
        } else {
            iA = AbstractC3401ss.a(q2, view, i3, z);
        }
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.e;
            int iA2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.F.getInputMethodMode() == 2;
        q2.setWindowLayoutType(this.n);
        if (q2.isShowing()) {
            if (this.u.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.u.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        q2.setWidth(this.e == -1 ? -1 : 0);
                        q2.setHeight(0);
                    } else {
                        q2.setWidth(this.e == -1 ? -1 : 0);
                        q2.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                q2.setOutsideTouchable(true);
                q2.update(this.u, this.f, this.m, width < 0 ? -1 : width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.u.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        q2.setWidth(width2);
        q2.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(q2, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC3455ts.b(q2, true);
        }
        q2.setOutsideTouchable(true);
        q2.setTouchInterceptor(this.y);
        if (this.q) {
            q2.setOverlapAnchor(this.p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = I;
            if (method3 != null) {
                try {
                    method3.invoke(q2, this.D);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC3455ts.a(q2, this.D);
        }
        q2.showAsDropDown(this.u, this.f, this.m, this.r);
        this.c.setSelection(-1);
        if ((!this.E || this.c.isInTouchMode()) && (c0054Ch = this.c) != null) {
            c0054Ch.setListSelectionHidden(true);
            c0054Ch.requestLayout();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }
}
