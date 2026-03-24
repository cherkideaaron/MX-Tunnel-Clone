package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2527cs extends ViewGroup {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float m;
    public boolean n;
    public int[] o;
    public int[] p;
    public Drawable q;
    public int r;
    public int s;
    public int t;
    public int u;

    public AbstractC2527cs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = AbstractC2547dB.n;
        D3 d3L = D3.L(0, 0, context, attributeSet, iArr);
        UL.k(this, context, iArr, attributeSet, (TypedArray) d3L.b, 0);
        TypedArray typedArray = (TypedArray) d3L.b;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.m = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.n = typedArray.getBoolean(7, false);
        setDividerDrawable(d3L.x(5));
        this.t = typedArray.getInt(8, 0);
        this.u = typedArray.getDimensionPixelSize(6, 0);
        d3L.P();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0557bs;
    }

    public final void d(Canvas canvas, int i) {
        this.q.setBounds(getPaddingLeft() + this.u, i, (getWidth() - getPaddingRight()) - this.u, this.s + i);
        this.q.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.q.setBounds(i, getPaddingTop() + this.u, this.r + i, (getHeight() - getPaddingBottom()) - this.u);
        this.q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0557bs generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new C0557bs(-2, -2);
        }
        if (i == 1) {
            return new C0557bs(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0557bs generateLayoutParams(AttributeSet attributeSet) {
        return new C0557bs(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0557bs) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.q;
    }

    public int getDividerPadding() {
        return this.u;
    }

    public int getDividerWidth() {
        return this.r;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.t;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0557bs generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0557bs ? new C0557bs((C0557bs) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0557bs((ViewGroup.MarginLayoutParams) layoutParams) : new C0557bs(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.t & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.t & 4) != 0;
        }
        if ((this.t & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.q == null) {
            return;
        }
        int i = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i < virtualChildCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && i(i)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0557bs) childAt.getLayoutParams())).topMargin) - this.s);
                }
                i++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.s : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0557bs) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = AbstractC3270qM.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i < virtualChildCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i)) {
                C0557bs c0557bs = (C0557bs) childAt3.getLayoutParams();
                e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0557bs).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0557bs).leftMargin) - this.r);
            }
            i++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0557bs c0557bs2 = (C0557bs) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) c0557bs2).leftMargin;
                    right = (left - paddingRight) - this.r;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0557bs2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.r;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2527cs.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02a0 A[PHI: r14
      0x02a0: PHI (r14v19 int) = (r14v17 int), (r14v20 int) binds: [B:137:0x02b1, B:131:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0703 A[PHI: r7
      0x0703: PHI (r7v46 int) = (r7v42 int), (r7v47 int) binds: [B:336:0x0714, B:330:0x0700] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2527cs.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.q) {
            return;
        }
        this.q = drawable;
        if (drawable != null) {
            this.r = drawable.getIntrinsicWidth();
            this.s = drawable.getIntrinsicHeight();
        } else {
            this.r = 0;
            this.s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.u = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.n = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.t) {
            requestLayout();
        }
        this.t = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.m = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
