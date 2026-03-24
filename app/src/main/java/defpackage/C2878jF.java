package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: jF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2878jF {
    public AbstractC0500aq a = new XC();
    public AbstractC0500aq b = new XC();
    public AbstractC0500aq c = new XC();
    public AbstractC0500aq d = new XC();
    public InterfaceC0100Fc e = new C2754h(0.0f);
    public InterfaceC0100Fc f = new C2754h(0.0f);
    public InterfaceC0100Fc g = new C2754h(0.0f);
    public InterfaceC0100Fc h = new C2754h(0.0f);
    public C0360Uh i = new C0360Uh(0);
    public C0360Uh j = new C0360Uh(0);
    public C0360Uh k = new C0360Uh(0);
    public C0360Uh l = new C0360Uh(0);

    public static C2825iF a(Context context, int i, int i2, C2754h c2754h) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(RA.A);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0100Fc interfaceC0100FcC = c(typedArrayObtainStyledAttributes, 5, c2754h);
            InterfaceC0100Fc interfaceC0100FcC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC0100FcC);
            InterfaceC0100Fc interfaceC0100FcC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC0100FcC);
            InterfaceC0100Fc interfaceC0100FcC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC0100FcC);
            InterfaceC0100Fc interfaceC0100FcC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC0100FcC);
            C2825iF c2825iF = new C2825iF();
            AbstractC0500aq abstractC0500aqQ = AbstractC2883jK.q(i4);
            c2825iF.a = abstractC0500aqQ;
            C2825iF.b(abstractC0500aqQ);
            c2825iF.e = interfaceC0100FcC2;
            AbstractC0500aq abstractC0500aqQ2 = AbstractC2883jK.q(i5);
            c2825iF.b = abstractC0500aqQ2;
            C2825iF.b(abstractC0500aqQ2);
            c2825iF.f = interfaceC0100FcC3;
            AbstractC0500aq abstractC0500aqQ3 = AbstractC2883jK.q(i6);
            c2825iF.c = abstractC0500aqQ3;
            C2825iF.b(abstractC0500aqQ3);
            c2825iF.g = interfaceC0100FcC4;
            AbstractC0500aq abstractC0500aqQ4 = AbstractC2883jK.q(i7);
            c2825iF.d = abstractC0500aqQ4;
            C2825iF.b(abstractC0500aqQ4);
            c2825iF.h = interfaceC0100FcC5;
            return c2825iF;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C2825iF b(Context context, AttributeSet attributeSet, int i, int i2) {
        C2754h c2754h = new C2754h(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.t, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c2754h);
    }

    public static InterfaceC0100Fc c(TypedArray typedArray, int i, InterfaceC0100Fc interfaceC0100Fc) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC0100Fc;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C2754h(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new ZB(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC0100Fc;
    }

    public final boolean d() {
        return (this.b instanceof XC) && (this.a instanceof XC) && (this.c instanceof XC) && (this.d instanceof XC);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(C0360Uh.class) && this.j.getClass().equals(C0360Uh.class) && this.i.getClass().equals(C0360Uh.class) && this.k.getClass().equals(C0360Uh.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final C2825iF f() {
        C2825iF c2825iF = new C2825iF();
        c2825iF.a = this.a;
        c2825iF.b = this.b;
        c2825iF.c = this.c;
        c2825iF.d = this.d;
        c2825iF.e = this.e;
        c2825iF.f = this.f;
        c2825iF.g = this.g;
        c2825iF.h = this.h;
        c2825iF.i = this.i;
        c2825iF.j = this.j;
        c2825iF.k = this.k;
        c2825iF.l = this.l;
        return c2825iF;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
