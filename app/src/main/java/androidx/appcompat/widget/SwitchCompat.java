package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2547dB;
import defpackage.AbstractC3228ph;
import defpackage.AbstractC3270qM;
import defpackage.AbstractC3296qu;
import defpackage.C2626ei;
import defpackage.C3196p3;
import defpackage.C3357s1;
import defpackage.C3553vi;
import defpackage.D3;
import defpackage.IL;
import defpackage.L2;
import defpackage.PI;
import defpackage.R8;
import defpackage.UL;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final R8 a0 = new R8("thumbPos", 5, Float.class);
    public static final int[] b0 = {R.attr.state_checked};
    public final int A;
    public float B;
    public float C;
    public final VelocityTracker D;
    public final int E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final TextPaint O;
    public final ColorStateList P;
    public StaticLayout Q;
    public StaticLayout R;
    public final C3357s1 S;
    public ObjectAnimator T;
    public L2 U;
    public C3553vi V;
    public final Rect W;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList m;
    public PorterDuff.Mode n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public int z;

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.mxtunnel.pro.R.attr.switchStyle);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = false;
        this.D = VelocityTracker.obtain();
        this.N = true;
        this.W = new Rect();
        PI.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.O = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC2547dB.v;
        D3 d3L = D3.L(com.mxtunnel.pro.R.attr.switchStyle, 0, context, attributeSet, iArr);
        UL.k(this, context, iArr, attributeSet, (TypedArray) d3L.b, com.mxtunnel.pro.R.attr.switchStyle);
        Drawable drawableX = d3L.x(2);
        this.a = drawableX;
        if (drawableX != null) {
            drawableX.setCallback(this);
        }
        Drawable drawableX2 = d3L.x(11);
        this.f = drawableX2;
        if (drawableX2 != null) {
            drawableX2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) d3L.b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.y = typedArray.getBoolean(3, true);
        this.q = typedArray.getDimensionPixelSize(8, 0);
        this.r = typedArray.getDimensionPixelSize(5, 0);
        this.s = typedArray.getDimensionPixelSize(6, 0);
        this.t = typedArray.getBoolean(4, false);
        ColorStateList colorStateListW = d3L.w(9);
        if (colorStateListW != null) {
            this.b = colorStateListW;
            this.d = true;
        }
        PorterDuff.Mode modeC = AbstractC3228ph.c(typedArray.getInt(10, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.e = true;
        }
        if (this.d || this.e) {
            a();
        }
        ColorStateList colorStateListW2 = d3L.w(12);
        if (colorStateListW2 != null) {
            this.m = colorStateListW2;
            this.o = true;
        }
        PorterDuff.Mode modeC2 = AbstractC3228ph.c(typedArray.getInt(13, -1), null);
        if (this.n != modeC2) {
            this.n = modeC2;
            this.p = true;
        }
        if (this.o || this.p) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC2547dB.w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0115Ga.u(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            this.P = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C3357s1 c3357s1 = new C3357s1();
                c3357s1.a = context2.getResources().getConfiguration().locale;
                this.S = c3357s1;
            } else {
                this.S = null;
            }
            setTextOnInternal(this.u);
            setTextOffInternal(this.w);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C3196p3(this).f(attributeSet, com.mxtunnel.pro.R.attr.switchStyle);
        d3L.P();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A = viewConfiguration.getScaledTouchSlop();
        this.E = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.mxtunnel.pro.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private L2 getEmojiTextViewHelper() {
        if (this.U == null) {
            this.U = new L2(this);
        }
        return this.U;
    }

    private boolean getTargetCheckedState() {
        return this.F > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = AbstractC3270qM.a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.F : this.F) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.W;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? AbstractC3228ph.b(drawable2) : AbstractC3228ph.c;
        return ((((this.G - this.I) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.w = charSequence;
        L2 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE0 = ((AbstractC0500aq) emojiTextViewHelper.b.b).e0(this.S);
        if (transformationMethodE0 != null) {
            charSequence = transformationMethodE0.getTransformation(charSequence, this);
        }
        this.x = charSequence;
        this.R = null;
        if (this.y) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.u = charSequence;
        L2 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE0 = ((AbstractC0500aq) emojiTextViewHelper.b.b).e0(this.S);
        if (transformationMethodE0 != null) {
            charSequence = transformationMethodE0.getTransformation(charSequence, this);
        }
        this.v = charSequence;
        this.Q = null;
        if (this.y) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.o || this.p) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.o) {
                    drawableMutate.setTintList(this.m);
                }
                if (this.p) {
                    this.f.setTintMode(this.n);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.u);
        setTextOffInternal(this.w);
        requestLayout();
    }

    public final void d() {
        if (this.V == null && ((AbstractC0500aq) this.U.b.b).O() && C2626ei.k != null) {
            C2626ei c2626eiA = C2626ei.a();
            int iB = c2626eiA.b();
            if (iB == 3 || iB == 0) {
                C3553vi c3553vi = new C3553vi(this);
                this.V = c3553vi;
                c2626eiA.g(c3553vi);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.J;
        int i4 = this.K;
        int i5 = this.L;
        int i6 = this.M;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? AbstractC3228ph.b(drawable) : AbstractC3228ph.c;
        Drawable drawable2 = this.f;
        Rect rect = this.W;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.I + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = AbstractC3270qM.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.G;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = AbstractC3270qM.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.G;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.s : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3296qu.W(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.y;
    }

    public boolean getSplitTrack() {
        return this.t;
    }

    public int getSwitchMinWidth() {
        return this.r;
    }

    public int getSwitchPadding() {
        return this.s;
    }

    public CharSequence getTextOff() {
        return this.w;
    }

    public CharSequence getTextOn() {
        return this.u;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.F;
    }

    public int getThumbTextPadding() {
        return this.q;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.m;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.n;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.T;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.T.end();
        this.T = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, b0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.W;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.K;
        int i2 = this.M;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC3228ph.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.Q : this.R;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.P;
            TextPaint textPaint = this.O;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.u : this.w;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Drawable drawable = this.f;
            Rect rect = this.W;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC3228ph.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = AbstractC3270qM.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.G + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.G) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.H;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.H + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.H;
        }
        this.J = paddingLeft;
        this.K = paddingTop;
        this.M = height;
        this.L = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.y) {
            StaticLayout staticLayout = this.Q;
            TextPaint textPaint = this.O;
            if (staticLayout == null) {
                CharSequence charSequence = this.v;
                this.Q = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.R == null) {
                CharSequence charSequence2 = this.x;
                this.R = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.W;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.I = Math.max(this.y ? (this.q * 2) + Math.max(this.Q.getWidth(), this.R.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = AbstractC3228ph.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.N ? Math.max(this.r, (this.I * 2) + iMax + iMax2) : this.r;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.G = iMax3;
        this.H = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.u : this.w;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.u;
                if (string == null) {
                    string = getResources().getString(com.mxtunnel.pro.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = UL.a;
                new IL(com.mxtunnel.pro.R.id.tag_state_description, CharSequence.class, 64, 30, 2).D(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.w;
            if (string2 == null) {
                string2 = getResources().getString(com.mxtunnel.pro.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = UL.a;
            new IL(com.mxtunnel.pro.R.id.tag_state_description, CharSequence.class, 64, 30, 2).D(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.T;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, a0, zIsChecked ? 1.0f : 0.0f);
        this.T = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.T.setAutoCancel(true);
        this.T.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3296qu.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.u);
        setTextOffInternal(this.w);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.N = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.y != z) {
            this.y = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.t = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.r = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.s = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.O;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.w;
        if (string == null) {
            string = getResources().getString(com.mxtunnel.pro.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = UL.a;
        new IL(com.mxtunnel.pro.R.id.tag_state_description, CharSequence.class, 64, 30, 2).D(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.u;
        if (string == null) {
            string = getResources().getString(com.mxtunnel.pro.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = UL.a;
        new IL(com.mxtunnel.pro.R.id.tag_state_description, CharSequence.class, 64, 30, 2).D(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.F = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0500aq.F(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.q = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0500aq.F(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        this.o = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.n = mode;
        this.p = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }
}
