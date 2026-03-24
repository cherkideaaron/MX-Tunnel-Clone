package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mxtunnel.pro.R;

/* loaded from: classes2.dex */
public final class SG extends LinearLayout {
    public final TextInputLayout a;
    public final C3413t3 b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public boolean p;

    public SG(TextInputLayout textInputLayout, D3 d3) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C3413t3 c3413t3 = new C3413t3(getContext(), null);
        this.b = c3413t3;
        if (AbstractC3296qu.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(null);
        MO.H(checkableImageButton, onLongClickListener);
        this.o = null;
        checkableImageButton.setOnLongClickListener(null);
        MO.H(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) d3.b;
        if (typedArray.hasValue(70)) {
            this.e = AbstractC3296qu.w(getContext(), d3, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f = AbstractC2883jK.H(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(d3.x(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeJ = MO.j(typedArray.getInt(69, -1));
            this.n = scaleTypeJ;
            checkableImageButton.setScaleType(scaleTypeJ);
        }
        c3413t3.setVisibility(8);
        c3413t3.setId(R.id.textinput_prefix_text);
        c3413t3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c3413t3.setAccessibilityLiveRegion(1);
        c3413t3.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c3413t3.setTextColor(d3.w(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.c = TextUtils.isEmpty(text2) ? null : text2;
        c3413t3.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c3413t3);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f;
            TextInputLayout textInputLayout = this.a;
            MO.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            MO.D(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(null);
        MO.H(checkableImageButton, onLongClickListener);
        this.o = null;
        checkableImageButton.setOnLongClickListener(null);
        MO.H(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.a.e;
        if (editText == null) {
            return;
        }
        this.b.setPaddingRelative(this.d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.c == null || this.p) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
