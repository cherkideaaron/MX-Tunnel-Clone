package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zaad extends Button {
    public zaad(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 22), "Unknown color scheme: ", i));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zaa(android.content.res.Resources r7, int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r0)
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.setMinHeight(r0)
            r6.setMinWidth(r0)
            int r0 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light
            int r0 = zab(r9, r0, r1, r1)
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark
            int r2 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light
            int r1 = zab(r9, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 21
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L53
            if (r8 == r5) goto L53
            if (r8 != r4) goto L3a
            goto L54
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int r9 = defpackage.AbstractC3219pQ.a(r8, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L53:
            r0 = r1
        L54:
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_tint
            android.content.res.ColorStateList r1 = r7.getColorStateList(r1)
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setTintMode(r1)
            r6.setBackgroundDrawable(r0)
            int r0 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light
            int r9 = zab(r9, r0, r1, r1)
            android.content.res.ColorStateList r9 = r7.getColorStateList(r9)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            android.content.res.ColorStateList r9 = (android.content.res.ColorStateList) r9
            r6.setTextColor(r9)
            r9 = 0
            if (r8 == 0) goto Lac
            if (r8 == r5) goto La2
            if (r8 != r4) goto L89
            r6.setText(r9)
            goto Laf
        L89:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int r9 = defpackage.AbstractC3219pQ.a(r8, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        La2:
            int r8 = com.google.android.gms.base.R.string.common_signin_button_text_long
        La4:
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
            goto Laf
        Lac:
            int r8 = com.google.android.gms.base.R.string.common_signin_button_text
            goto La4
        Laf:
            r6.setTransformationMethod(r9)
            android.content.Context r7 = r6.getContext()
            boolean r7 = com.google.android.gms.common.util.DeviceProperties.isWearable(r7)
            if (r7 == 0) goto Lc1
            r7 = 19
            r6.setGravity(r7)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zaad.zaa(android.content.res.Resources, int, int):void");
    }
}
