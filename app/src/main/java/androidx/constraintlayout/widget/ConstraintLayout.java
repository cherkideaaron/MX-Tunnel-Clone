package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.AbstractC0235Nb;
import defpackage.AbstractC0252Ob;
import defpackage.AbstractC2730gc;
import defpackage.C0269Pb;
import defpackage.C0286Qb;
import defpackage.C0541bc;
import defpackage.C2566dc;
import defpackage.C2620ec;
import defpackage.C2851io;
import defpackage.C2855is;
import defpackage.C2905jo;
import defpackage.QF;
import defpackage.R2;
import defpackage.WA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static QF x;
    public final SparseArray a;
    public final ArrayList b;
    public final C2620ec c;
    public int d;
    public int e;
    public int f;
    public int m;
    public boolean n;
    public int o;
    public C0541bc p;
    public R2 q;
    public int r;
    public HashMap s;
    public final SparseArray t;
    public final C0286Qb u;
    public int v;
    public int w;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new C2620ec();
        this.d = 0;
        this.e = 0;
        this.f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.n = true;
        this.o = 257;
        this.p = null;
        this.q = null;
        this.r = -1;
        this.s = new HashMap();
        this.t = new SparseArray();
        this.u = new C0286Qb(this, this);
        this.v = 0;
        this.w = 0;
        i(attributeSet, 0);
    }

    public static C0269Pb g() {
        C0269Pb c0269Pb = new C0269Pb(-2, -2);
        c0269Pb.a = -1;
        c0269Pb.b = -1;
        c0269Pb.c = -1.0f;
        c0269Pb.d = -1;
        c0269Pb.e = -1;
        c0269Pb.f = -1;
        c0269Pb.g = -1;
        c0269Pb.h = -1;
        c0269Pb.i = -1;
        c0269Pb.j = -1;
        c0269Pb.k = -1;
        c0269Pb.l = -1;
        c0269Pb.m = -1;
        c0269Pb.n = -1;
        c0269Pb.o = -1;
        c0269Pb.p = 0;
        c0269Pb.q = 0.0f;
        c0269Pb.r = -1;
        c0269Pb.s = -1;
        c0269Pb.t = -1;
        c0269Pb.u = -1;
        c0269Pb.v = Integer.MIN_VALUE;
        c0269Pb.w = Integer.MIN_VALUE;
        c0269Pb.x = Integer.MIN_VALUE;
        c0269Pb.y = Integer.MIN_VALUE;
        c0269Pb.z = Integer.MIN_VALUE;
        c0269Pb.A = Integer.MIN_VALUE;
        c0269Pb.B = Integer.MIN_VALUE;
        c0269Pb.C = 0;
        c0269Pb.D = 0.5f;
        c0269Pb.E = 0.5f;
        c0269Pb.F = null;
        c0269Pb.G = -1.0f;
        c0269Pb.H = -1.0f;
        c0269Pb.I = 0;
        c0269Pb.J = 0;
        c0269Pb.K = 0;
        c0269Pb.L = 0;
        c0269Pb.M = 0;
        c0269Pb.N = 0;
        c0269Pb.O = 0;
        c0269Pb.P = 0;
        c0269Pb.Q = 1.0f;
        c0269Pb.R = 1.0f;
        c0269Pb.S = -1;
        c0269Pb.T = -1;
        c0269Pb.U = -1;
        c0269Pb.V = false;
        c0269Pb.W = false;
        c0269Pb.X = null;
        c0269Pb.Y = 0;
        c0269Pb.Z = true;
        c0269Pb.a0 = true;
        c0269Pb.b0 = false;
        c0269Pb.c0 = false;
        c0269Pb.d0 = false;
        c0269Pb.e0 = -1;
        c0269Pb.f0 = -1;
        c0269Pb.g0 = -1;
        c0269Pb.h0 = -1;
        c0269Pb.i0 = Integer.MIN_VALUE;
        c0269Pb.j0 = Integer.MIN_VALUE;
        c0269Pb.k0 = 0.5f;
        c0269Pb.o0 = new C2566dc();
        return c0269Pb;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static QF getSharedValues() {
        if (x == null) {
            QF qf = new QF();
            new SparseIntArray();
            new HashMap();
            x = qf;
        }
        return x;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0269Pb;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0235Nb) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.n = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        String str;
        Context context = getContext();
        C0269Pb c0269Pb = new C0269Pb(context, attributeSet);
        c0269Pb.a = -1;
        c0269Pb.b = -1;
        c0269Pb.c = -1.0f;
        c0269Pb.d = -1;
        c0269Pb.e = -1;
        c0269Pb.f = -1;
        c0269Pb.g = -1;
        c0269Pb.h = -1;
        c0269Pb.i = -1;
        c0269Pb.j = -1;
        c0269Pb.k = -1;
        c0269Pb.l = -1;
        c0269Pb.m = -1;
        c0269Pb.n = -1;
        c0269Pb.o = -1;
        c0269Pb.p = 0;
        c0269Pb.q = 0.0f;
        c0269Pb.r = -1;
        c0269Pb.s = -1;
        c0269Pb.t = -1;
        c0269Pb.u = -1;
        c0269Pb.v = Integer.MIN_VALUE;
        c0269Pb.w = Integer.MIN_VALUE;
        c0269Pb.x = Integer.MIN_VALUE;
        c0269Pb.y = Integer.MIN_VALUE;
        c0269Pb.z = Integer.MIN_VALUE;
        c0269Pb.A = Integer.MIN_VALUE;
        c0269Pb.B = Integer.MIN_VALUE;
        c0269Pb.C = 0;
        c0269Pb.D = 0.5f;
        c0269Pb.E = 0.5f;
        c0269Pb.F = null;
        c0269Pb.G = -1.0f;
        c0269Pb.H = -1.0f;
        c0269Pb.I = 0;
        c0269Pb.J = 0;
        c0269Pb.K = 0;
        c0269Pb.L = 0;
        c0269Pb.M = 0;
        c0269Pb.N = 0;
        c0269Pb.O = 0;
        c0269Pb.P = 0;
        c0269Pb.Q = 1.0f;
        c0269Pb.R = 1.0f;
        c0269Pb.S = -1;
        c0269Pb.T = -1;
        c0269Pb.U = -1;
        c0269Pb.V = false;
        c0269Pb.W = false;
        c0269Pb.X = null;
        c0269Pb.Y = 0;
        c0269Pb.Z = true;
        c0269Pb.a0 = true;
        c0269Pb.b0 = false;
        c0269Pb.c0 = false;
        c0269Pb.d0 = false;
        c0269Pb.e0 = -1;
        c0269Pb.f0 = -1;
        c0269Pb.g0 = -1;
        c0269Pb.h0 = -1;
        c0269Pb.i0 = Integer.MIN_VALUE;
        c0269Pb.j0 = Integer.MIN_VALUE;
        c0269Pb.k0 = 0.5f;
        c0269Pb.o0 = new C2566dc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WA.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0252Ob.a.get(index);
            switch (i2) {
                case 1:
                    c0269Pb.U = typedArrayObtainStyledAttributes.getInt(index, c0269Pb.U);
                    continue;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.o);
                    c0269Pb.o = resourceId;
                    if (resourceId == -1) {
                        c0269Pb.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 3:
                    c0269Pb.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.p);
                    continue;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.q) % 360.0f;
                    c0269Pb.q = f;
                    if (f < 0.0f) {
                        c0269Pb.q = (360.0f - f) % 360.0f;
                    } else {
                        continue;
                    }
                case 5:
                    c0269Pb.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0269Pb.a);
                    continue;
                case 6:
                    c0269Pb.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0269Pb.b);
                    continue;
                case 7:
                    c0269Pb.c = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.c);
                    continue;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.d);
                    c0269Pb.d = resourceId2;
                    if (resourceId2 == -1) {
                        c0269Pb.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.e);
                    c0269Pb.e = resourceId3;
                    if (resourceId3 == -1) {
                        c0269Pb.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.f);
                    c0269Pb.f = resourceId4;
                    if (resourceId4 == -1) {
                        c0269Pb.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.g);
                    c0269Pb.g = resourceId5;
                    if (resourceId5 == -1) {
                        c0269Pb.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.h);
                    c0269Pb.h = resourceId6;
                    if (resourceId6 == -1) {
                        c0269Pb.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.i);
                    c0269Pb.i = resourceId7;
                    if (resourceId7 == -1) {
                        c0269Pb.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.j);
                    c0269Pb.j = resourceId8;
                    if (resourceId8 == -1) {
                        c0269Pb.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.k);
                    c0269Pb.k = resourceId9;
                    if (resourceId9 == -1) {
                        c0269Pb.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.l);
                    c0269Pb.l = resourceId10;
                    if (resourceId10 == -1) {
                        c0269Pb.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.r);
                    c0269Pb.r = resourceId11;
                    if (resourceId11 == -1) {
                        c0269Pb.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.s);
                    c0269Pb.s = resourceId12;
                    if (resourceId12 == -1) {
                        c0269Pb.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.t);
                    c0269Pb.t = resourceId13;
                    if (resourceId13 == -1) {
                        c0269Pb.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.u);
                    c0269Pb.u = resourceId14;
                    if (resourceId14 == -1) {
                        c0269Pb.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 21:
                    c0269Pb.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.v);
                    continue;
                case 22:
                    c0269Pb.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.w);
                    continue;
                case ConnectionResult.API_DISABLED /* 23 */:
                    c0269Pb.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.x);
                    continue;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    c0269Pb.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.y);
                    continue;
                case 25:
                    c0269Pb.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.z);
                    continue;
                case 26:
                    c0269Pb.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.A);
                    continue;
                case 27:
                    c0269Pb.V = typedArrayObtainStyledAttributes.getBoolean(index, c0269Pb.V);
                    continue;
                case 28:
                    c0269Pb.W = typedArrayObtainStyledAttributes.getBoolean(index, c0269Pb.W);
                    continue;
                case 29:
                    c0269Pb.D = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.D);
                    continue;
                case 30:
                    c0269Pb.E = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.E);
                    continue;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0269Pb.K = i3;
                    if (i3 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0269Pb.L = i4;
                    if (i4 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    }
                case 33:
                    try {
                        c0269Pb.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.M);
                        continue;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0269Pb.M) == -2) {
                            c0269Pb.M = -2;
                        }
                    }
                case 34:
                    try {
                        c0269Pb.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.O);
                        continue;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0269Pb.O) == -2) {
                            c0269Pb.O = -2;
                        }
                    }
                case 35:
                    c0269Pb.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.Q));
                    c0269Pb.K = 2;
                    continue;
                case 36:
                    try {
                        c0269Pb.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.N);
                        continue;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0269Pb.N) == -2) {
                            c0269Pb.N = -2;
                        }
                    }
                case 37:
                    try {
                        c0269Pb.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.P);
                        continue;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0269Pb.P) == -2) {
                            c0269Pb.P = -2;
                        }
                    }
                case 38:
                    c0269Pb.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.R));
                    c0269Pb.L = 2;
                    continue;
                default:
                    switch (i2) {
                        case 44:
                            C0541bc.h(c0269Pb, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0269Pb.G = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.G);
                            break;
                        case 46:
                            c0269Pb.H = typedArrayObtainStyledAttributes.getFloat(index, c0269Pb.H);
                            break;
                        case 47:
                            c0269Pb.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0269Pb.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0269Pb.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0269Pb.S);
                            break;
                        case 50:
                            c0269Pb.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0269Pb.T);
                            break;
                        case 51:
                            c0269Pb.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.m);
                            c0269Pb.m = resourceId15;
                            if (resourceId15 == -1) {
                                c0269Pb.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c0269Pb.n);
                            c0269Pb.n = resourceId16;
                            if (resourceId16 == -1) {
                                c0269Pb.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0269Pb.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.C);
                            break;
                        case 55:
                            c0269Pb.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0269Pb.B);
                            break;
                        default:
                            switch (i2) {
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    C0541bc.g(c0269Pb, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    C0541bc.g(c0269Pb, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0269Pb.Y = typedArrayObtainStyledAttributes.getInt(index, c0269Pb.Y);
                                    continue;
                            }
                    }
                    break;
            }
            Log.e("ConstraintLayout", str);
        }
        typedArrayObtainStyledAttributes.recycle();
        c0269Pb.a();
        return c0269Pb;
    }

    public int getMaxHeight() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.C0;
    }

    public final C2566dc h(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C0269Pb)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C0269Pb)) {
                return null;
            }
        }
        return ((C0269Pb) view.getLayoutParams()).o0;
    }

    public final void i(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        C2620ec c2620ec = this.c;
        c2620ec.e0 = this;
        C0286Qb c0286Qb = this.u;
        c2620ec.t0 = c0286Qb;
        c2620ec.r0.f = c0286Qb;
        this.a.put(getId(), this);
        this.p = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, WA.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.m);
                } else if (index == 112) {
                    this.o = typedArrayObtainStyledAttributes.getInt(index, this.o);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.q = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0541bc c0541bc = new C0541bc();
                        this.p = c0541bc;
                        c0541bc.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.p = null;
                    }
                    this.r = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c2620ec.C0 = this.o;
        C2855is.p = c2620ec.R(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            R2 r0 = new R2
            android.content.Context r1 = r9.getContext()
            r2 = 15
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3 = 0
        L27:
            r4 = 1
            if (r2 == r4) goto Lab
            if (r2 == 0) goto L9c
            r5 = 2
            if (r2 == r5) goto L31
            goto L9f
        L31:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6a;
                case 80204913: goto L60;
                case 1382829617: goto L57;
                case 1657696882: goto L4d;
                case 1901439077: goto L3f;
                default: goto L3e;
            }     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        L3e:
            goto L74
        L3f:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L74
            r4 = r8
            goto L75
        L49:
            r10 = move-exception
            goto La4
        L4b:
            r10 = move-exception
            goto La8
        L4d:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L74
            r4 = 0
            goto L75
        L57:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L74
            goto L75
        L60:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L74
            r4 = r5
            goto L75
        L6a:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L74
            r4 = r7
            goto L75
        L74:
            r4 = -1
        L75:
            if (r4 == r5) goto L8d
            if (r4 == r8) goto L80
            if (r4 == r7) goto L7c
            goto L9f
        L7c:
            r0.z(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L9f
        L80:
            Sb r2 = new Sb     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r3 == 0) goto L9f
            java.util.ArrayList r4 = r3.b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r4.add(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L9f
        L8d:
            Rb r3 = new Rb     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.Object r2 = r0.b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r4 = r3.a     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.put(r4, r3)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L9f
        L9c:
            r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        L9f:
            int r2 = r10.next()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L27
        La4:
            r10.printStackTrace()
            goto Lab
        La8:
            r10.printStackTrace()
        Lab:
            r9.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.C2620ec r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(ec, int, int, int):void");
    }

    public final void l(C2566dc c2566dc, C0269Pb c0269Pb, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        C2566dc c2566dc2 = (C2566dc) sparseArray.get(i);
        if (c2566dc2 == null || view == null || !(view.getLayoutParams() instanceof C0269Pb)) {
            return;
        }
        c0269Pb.b0 = true;
        if (i2 == 6) {
            C0269Pb c0269Pb2 = (C0269Pb) view.getLayoutParams();
            c0269Pb2.b0 = true;
            c0269Pb2.o0.D = true;
        }
        c2566dc.i(6).b(c2566dc2.i(i2), c0269Pb.C, c0269Pb.B, true);
        c2566dc.D = true;
        c2566dc.i(3).j();
        c2566dc.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0269Pb c0269Pb = (C0269Pb) childAt.getLayoutParams();
            C2566dc c2566dc = c0269Pb.o0;
            if (childAt.getVisibility() != 8 || c0269Pb.c0 || c0269Pb.d0 || zIsInEditMode) {
                int iO = c2566dc.o();
                int iP = c2566dc.p();
                childAt.layout(iO, iP, c2566dc.n() + iO, c2566dc.k() + iP);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0235Nb) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C2566dc c2566dcH = h(view);
        if ((view instanceof C2851io) && !(c2566dcH instanceof C2905jo)) {
            C0269Pb c0269Pb = (C0269Pb) view.getLayoutParams();
            C2905jo c2905jo = new C2905jo();
            c0269Pb.o0 = c2905jo;
            c0269Pb.c0 = true;
            c2905jo.N(c0269Pb.U);
        }
        if (view instanceof AbstractC0235Nb) {
            AbstractC0235Nb abstractC0235Nb = (AbstractC0235Nb) view;
            abstractC0235Nb.i();
            ((C0269Pb) view.getLayoutParams()).d0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(abstractC0235Nb)) {
                arrayList.add(abstractC0235Nb);
            }
        }
        this.a.put(view.getId(), view);
        this.n = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        C2566dc c2566dcH = h(view);
        this.c.p0.remove(c2566dcH);
        c2566dcH.z();
        this.b.remove(view);
        this.n = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.n = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0541bc c0541bc) {
        this.p = c0541bc;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.m) {
            return;
        }
        this.m = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2730gc abstractC2730gc) {
        R2 r2 = this.q;
        if (r2 != null) {
            r2.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.o = i;
        C2620ec c2620ec = this.c;
        c2620ec.C0 = i;
        C2855is.p = c2620ec.R(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new C2620ec();
        this.d = 0;
        this.e = 0;
        this.f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.n = true;
        this.o = 257;
        this.p = null;
        this.q = null;
        this.r = -1;
        this.s = new HashMap();
        this.t = new SparseArray();
        this.u = new C0286Qb(this, this);
        this.v = 0;
        this.w = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0269Pb c0269Pb = new C0269Pb(layoutParams);
        c0269Pb.a = -1;
        c0269Pb.b = -1;
        c0269Pb.c = -1.0f;
        c0269Pb.d = -1;
        c0269Pb.e = -1;
        c0269Pb.f = -1;
        c0269Pb.g = -1;
        c0269Pb.h = -1;
        c0269Pb.i = -1;
        c0269Pb.j = -1;
        c0269Pb.k = -1;
        c0269Pb.l = -1;
        c0269Pb.m = -1;
        c0269Pb.n = -1;
        c0269Pb.o = -1;
        c0269Pb.p = 0;
        c0269Pb.q = 0.0f;
        c0269Pb.r = -1;
        c0269Pb.s = -1;
        c0269Pb.t = -1;
        c0269Pb.u = -1;
        c0269Pb.v = Integer.MIN_VALUE;
        c0269Pb.w = Integer.MIN_VALUE;
        c0269Pb.x = Integer.MIN_VALUE;
        c0269Pb.y = Integer.MIN_VALUE;
        c0269Pb.z = Integer.MIN_VALUE;
        c0269Pb.A = Integer.MIN_VALUE;
        c0269Pb.B = Integer.MIN_VALUE;
        c0269Pb.C = 0;
        c0269Pb.D = 0.5f;
        c0269Pb.E = 0.5f;
        c0269Pb.F = null;
        c0269Pb.G = -1.0f;
        c0269Pb.H = -1.0f;
        c0269Pb.I = 0;
        c0269Pb.J = 0;
        c0269Pb.K = 0;
        c0269Pb.L = 0;
        c0269Pb.M = 0;
        c0269Pb.N = 0;
        c0269Pb.O = 0;
        c0269Pb.P = 0;
        c0269Pb.Q = 1.0f;
        c0269Pb.R = 1.0f;
        c0269Pb.S = -1;
        c0269Pb.T = -1;
        c0269Pb.U = -1;
        c0269Pb.V = false;
        c0269Pb.W = false;
        c0269Pb.X = null;
        c0269Pb.Y = 0;
        c0269Pb.Z = true;
        c0269Pb.a0 = true;
        c0269Pb.b0 = false;
        c0269Pb.c0 = false;
        c0269Pb.d0 = false;
        c0269Pb.e0 = -1;
        c0269Pb.f0 = -1;
        c0269Pb.g0 = -1;
        c0269Pb.h0 = -1;
        c0269Pb.i0 = Integer.MIN_VALUE;
        c0269Pb.j0 = Integer.MIN_VALUE;
        c0269Pb.k0 = 0.5f;
        c0269Pb.o0 = new C2566dc();
        return c0269Pb;
    }
}
