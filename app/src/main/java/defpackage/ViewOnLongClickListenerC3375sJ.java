package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: sJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC3375sJ implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC3375sJ q;
    public static ViewOnLongClickListenerC3375sJ r;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final RunnableC3321rJ d;
    public final RunnableC3321rJ e;
    public int f;
    public int m;
    public C3429tJ n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r0v0, types: [rJ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [rJ] */
    public ViewOnLongClickListenerC3375sJ(View view, CharSequence charSequence) {
        final int i = 0;
        this.d = new Runnable(this) { // from class: rJ
            public final /* synthetic */ ViewOnLongClickListenerC3375sJ b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: rJ
            public final /* synthetic */ ViewOnLongClickListenerC3375sJ b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = VL.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? AbstractC2897jg.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.p = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ) {
        ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ2 = q;
        if (viewOnLongClickListenerC3375sJ2 != null) {
            viewOnLongClickListenerC3375sJ2.a.removeCallbacks(viewOnLongClickListenerC3375sJ2.d);
        }
        q = viewOnLongClickListenerC3375sJ;
        if (viewOnLongClickListenerC3375sJ != null) {
            viewOnLongClickListenerC3375sJ.a.postDelayed(viewOnLongClickListenerC3375sJ.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ = r;
        View view = this.a;
        if (viewOnLongClickListenerC3375sJ == this) {
            r = null;
            C3429tJ c3429tJ = this.n;
            if (c3429tJ != null) {
                View view2 = (View) c3429tJ.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c3429tJ.a).getSystemService("window")).removeView(view2);
                }
                this.n = null;
                this.p = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (q == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ = r;
            if (viewOnLongClickListenerC3375sJ != null) {
                viewOnLongClickListenerC3375sJ.a();
            }
            r = this;
            this.o = z;
            C3429tJ c3429tJ = new C3429tJ(view.getContext());
            this.n = c3429tJ;
            int width = this.f;
            int i3 = this.m;
            boolean z2 = this.o;
            View view2 = (View) c3429tJ.b;
            ViewParent parent = view2.getParent();
            Context context = (Context) c3429tJ.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c3429tJ.c).setText(this.b);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c3429tJ.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = (Rect) c3429tJ.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c3429tJ.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c3429tJ.f;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i7 <= rect.height() : i6 < 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.o) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = UL.a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC3321rJ runnableC3321rJ = this.e;
            view.removeCallbacks(runnableC3321rJ);
            view.postDelayed(runnableC3321rJ, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            tJ r4 = r3.n
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.o
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.p = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            tJ r4 = r3.n
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.p
            if (r1 != 0) goto L66
            int r1 = r3.f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.c
            if (r1 > r2) goto L66
            int r1 = r3.m
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f = r4
            r3.m = r5
            r3.p = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnLongClickListenerC3375sJ.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f = view.getWidth() / 2;
        this.m = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
