package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3196p3 {
    public final TextView a;
    public C2609eJ b;
    public C2609eJ c;
    public C2609eJ d;
    public C2609eJ e;
    public C2609eJ f;
    public C2609eJ g;
    public C2609eJ h;
    public final C3683y3 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public C3196p3(TextView textView) {
        this.a = textView;
        this.i = new C3683y3(textView);
    }

    public static C2609eJ c(Context context, I2 i2, int i) {
        ColorStateList colorStateListI;
        synchronized (i2) {
            colorStateListI = i2.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        C2609eJ c2609eJ = new C2609eJ();
        c2609eJ.d = true;
        c2609eJ.a = colorStateListI;
        return c2609eJ;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            W.f(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            W.f(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
            AbstractC2883jK.L(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC2883jK.L(editorInfo, text, i5, i3);
            return;
        }
        int i6 = i3 - i5;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i3, i8 - Math.min(i5, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i5, i8 - iMin);
        int i9 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC2883jK.L(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, C2609eJ c2609eJ) {
        if (drawable == null || c2609eJ == null) {
            return;
        }
        I2.e(drawable, c2609eJ, this.a.getDrawableState());
    }

    public final void b() {
        C2609eJ c2609eJ = this.b;
        TextView textView = this.a;
        if (c2609eJ != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        C2609eJ c2609eJ = this.h;
        if (c2609eJ != null) {
            return c2609eJ.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C2609eJ c2609eJ = this.h;
        if (c2609eJ != null) {
            return c2609eJ.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        boolean z3;
        int i2;
        int i3;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int i5;
        TextView textView = this.a;
        Context context = textView.getContext();
        I2 i2A = I2.a();
        int[] iArr = AbstractC2547dB.h;
        D3 d3L = D3.L(i, 0, context, attributeSet, iArr);
        UL.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) d3L.b, i);
        TypedArray typedArray = (TypedArray) d3L.b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, i2A, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, i2A, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, i2A, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, i2A, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, i2A, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, i2A, typedArray.getResourceId(6, 0));
        }
        d3L.P();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC2547dB.w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            D3 d3 = new D3(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            n(context, d3);
            int i6 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i5 = 26;
            } else {
                i5 = 26;
                string2 = null;
            }
            string = (i6 < i5 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            d3.P();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        D3 d32 = new D3(context, typedArrayObtainStyledAttributes2);
        if (z4 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = z;
        } else {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i7 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, d32);
        d32.P();
        if (!z4 && z2) {
            textView.setAllCaps(z3);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC3086n3.d(textView, string);
        }
        if (str != null) {
            if (i7 >= 24) {
                AbstractC3031m3.b(textView, AbstractC3031m3.a(str));
            } else {
                textView.setTextLocale(AbstractC2976l3.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC2547dB.i;
        C3683y3 c3683y3 = this.i;
        Context context2 = c3683y3.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c3683y3.i;
        UL.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c3683y3.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                c3683y3.f = C3683y3.b(iArr4);
                c3683y3.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c3683y3.j()) {
            c3683y3.a = 0;
        } else if (c3683y3.a == 1) {
            if (!c3683y3.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c3683y3.k(dimension2, dimension3, dimension);
            }
            c3683y3.h();
        }
        if (AbstractC3270qM.c && c3683y3.a != 0) {
            int[] iArr5 = c3683y3.f;
            if (iArr5.length > 0) {
                if (AbstractC3086n3.a(textView) != -1.0f) {
                    AbstractC3086n3.b(textView, Math.round(c3683y3.d), Math.round(c3683y3.e), Math.round(c3683y3.c), 0);
                } else {
                    AbstractC3086n3.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? i2A.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? i2A.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? i2A.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? i2A.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? i2A.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? i2A.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0115Ga.u(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof InterfaceC2774hJ) {
                ((InterfaceC2774hJ) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC3228ph.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(modeC);
            } else if (textView instanceof InterfaceC2774hJ) {
                ((InterfaceC2774hJ) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i3 = -1;
            } else {
                int i9 = typedValuePeekValue.data;
                int i10 = i9 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i9);
                i3 = i10;
                i2 = -1;
            }
        } else {
            i2 = -1;
            i3 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            AbstractC3296qu.Q(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            AbstractC3296qu.R(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                AbstractC3296qu.S(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Y.h(textView, i3, dimensionPixelSize);
            } else {
                AbstractC3296qu.S(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2547dB.w);
        D3 d3 = new D3(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, d3);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC3086n3.d(textView, string);
        }
        d3.P();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        C3683y3 c3683y3 = this.i;
        if (c3683y3.j()) {
            DisplayMetrics displayMetrics = c3683y3.j.getResources().getDisplayMetrics();
            c3683y3.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c3683y3.h()) {
                c3683y3.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C3683y3 c3683y3 = this.i;
        if (c3683y3.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c3683y3.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c3683y3.f = C3683y3.b(iArrCopyOf);
                if (!c3683y3.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c3683y3.g = false;
            }
            if (c3683y3.h()) {
                c3683y3.a();
            }
        }
    }

    public final void k(int i) {
        C3683y3 c3683y3 = this.i;
        if (c3683y3.j()) {
            if (i == 0) {
                c3683y3.a = 0;
                c3683y3.d = -1.0f;
                c3683y3.e = -1.0f;
                c3683y3.c = -1.0f;
                c3683y3.f = new int[0];
                c3683y3.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(Vs.k(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c3683y3.j.getResources().getDisplayMetrics();
            c3683y3.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c3683y3.h()) {
                c3683y3.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new C2609eJ();
        }
        C2609eJ c2609eJ = this.h;
        c2609eJ.a = colorStateList;
        c2609eJ.d = colorStateList != null;
        this.b = c2609eJ;
        this.c = c2609eJ;
        this.d = c2609eJ;
        this.e = c2609eJ;
        this.f = c2609eJ;
        this.g = c2609eJ;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new C2609eJ();
        }
        C2609eJ c2609eJ = this.h;
        c2609eJ.b = mode;
        c2609eJ.c = mode != null;
        this.b = c2609eJ;
        this.c = c2609eJ;
        this.d = c2609eJ;
        this.e = c2609eJ;
        this.f = c2609eJ;
        this.g = c2609eJ;
    }

    public final void n(Context context, D3 d3) {
        String string;
        Typeface typefaceCreate;
        Typeface typeface;
        int i = this.j;
        TypedArray typedArray = (TypedArray) d3.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (i4 == 2) {
                    typeface = Typeface.SERIF;
                } else if (i4 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceZ = d3.z(i5, this.j, new C2866j3(this, i6, i7, new WeakReference(this.a)));
                if (typefaceZ != null) {
                    if (i2 >= 28 && this.k != -1) {
                        typefaceZ = AbstractC3141o3.a(Typeface.create(typefaceZ, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceZ;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(string, this.j);
        } else {
            typefaceCreate = AbstractC3141o3.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }
}
