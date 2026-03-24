package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.mxtunnel.pro.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class Ot extends LinearLayout {
    public final ArrayList a;
    public final ArrayList b;
    public final C2827iH c;
    public final Nt d;
    public Integer[] e;
    public YG f;
    public C0473aH m;
    public int n;
    public C0582cH o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r12v5, types: [Nt] */
    public Ot(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        YG ygB;
        XmlResourceParser xml;
        int next;
        int next2;
        super(AbstractC3279qd.n0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.c = new C2827iH(materialButtonToggleGroup, 19);
        this.d = new Comparator() { // from class: Nt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                Ot ot = materialButtonToggleGroup;
                ot.getClass();
                int iCompareTo = Boolean.valueOf(materialButton.u).compareTo(Boolean.valueOf(materialButton2.u));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(ot.indexOfChild(materialButton), ot.indexOfChild(materialButton2));
            }
        };
        this.p = true;
        Context context2 = getContext();
        TypedArray typedArrayS = AbstractC3279qd.S(context2, attributeSet, RA.m, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayS.hasValue(2)) {
            int resourceId = typedArrayS.getResourceId(2, 0);
            C0582cH c0582cH = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        C0582cH c0582cH2 = new C0582cH();
                        c0582cH2.c = new int[10][];
                        c0582cH2.d = new C0607co[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c0582cH2.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c0582cH = c0582cH2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.o = c0582cH;
        }
        if (typedArrayS.hasValue(4)) {
            C0473aH c0473aHB = C0473aH.b(context2, typedArrayS, 4);
            this.m = c0473aHB;
            if (c0473aHB == null) {
                this.m = new ZG(C2878jF.a(context2, typedArrayS.getResourceId(4, 0), typedArrayS.getResourceId(5, 0), new C2754h(0)).a()).b();
            }
        }
        if (typedArrayS.hasValue(3)) {
            C2754h c2754h = new C2754h(0.0f);
            int resourceId2 = typedArrayS.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        YG yg = new YG();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            yg.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        ygB = yg;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    ygB = YG.b(c2754h);
                }
            } else {
                ygB = YG.b(C2878jF.c(typedArrayS, 3, c2754h));
            }
            this.f = ygB;
        }
        this.n = typedArrayS.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayS.getBoolean(0, true));
        typedArrayS.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.n <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.n - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.n - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.p = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.o == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                if (c(i) && this.o != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    C0582cH c0582cH = this.o;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < c0582cH.a; i3++) {
                        C0528bH c0528bH = (C0528bH) c0582cH.d[i3].a;
                        int i4 = c0528bH.a;
                        float f = c0528bH.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else if (i4 == 1) {
                            fMax = Math.max(i2, width * f);
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i6 = i + 1;
                    while (true) {
                        if (i6 >= childCount) {
                            break;
                        }
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                        i6++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.o);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.B;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.B = null;
                materialButton.y = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        ZG zg;
        int i;
        if (!(this.f == null && this.m == null) && this.p) {
            this.p = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    C0473aH c0473aH = this.m;
                    if (c0473aH == null || (!z && !z2)) {
                        c0473aH = (C0473aH) this.b.get(i2);
                    }
                    if (c0473aH == null) {
                        zg = new ZG((C2878jF) this.a.get(i2));
                    } else {
                        ZG zg2 = new ZG();
                        int i3 = c0473aH.a;
                        zg2.a = i3;
                        zg2.b = c0473aH.b;
                        int[][] iArr = c0473aH.c;
                        int[][] iArr2 = new int[iArr.length][];
                        zg2.c = iArr2;
                        C2878jF[] c2878jFArr = c0473aH.d;
                        zg2.d = new C2878jF[c2878jFArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(c2878jFArr, 0, zg2.d, 0, zg2.a);
                        zg2.e = c0473aH.e;
                        zg2.f = c0473aH.f;
                        zg2.g = c0473aH.g;
                        zg2.h = c0473aH.h;
                        zg = zg2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    YG yg = this.f;
                    if ((i4 | 1) == i4) {
                        zg.e = yg;
                    }
                    if ((i4 | 2) == i4) {
                        zg.f = yg;
                    }
                    if ((i4 | 4) == i4) {
                        zg.g = yg;
                    }
                    if ((i4 | 8) == i4) {
                        zg.h = yg;
                    }
                    C0473aH c0473aHB = zg.b();
                    if (c0473aHB.d()) {
                        materialButton.setStateListShapeAppearanceModel(c0473aHB);
                    } else {
                        materialButton.setShapeAppearanceModel(c0473aHB.c());
                    }
                }
                i2++;
            }
        }
    }

    public C0582cH getButtonSizeChange() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public InterfaceC0100Fc getInnerCornerSize() {
        return this.f.b;
    }

    public YG getInnerCornerSizeStateList() {
        return this.f;
    }

    public C2878jF getShapeAppearance() {
        C0473aH c0473aH = this.m;
        if (c0473aH == null) {
            return null;
        }
        return c0473aH.c();
    }

    public int getSpacing() {
        return this.n;
    }

    public C0473aH getStateListShapeAppearance() {
        return this.m;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
            this.b.remove(iIndexOfChild);
        }
        this.p = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(C0582cH c0582cH) {
        if (this.o != c0582cH) {
            this.o = c0582cH;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(InterfaceC0100Fc interfaceC0100Fc) {
        this.f = YG.b(interfaceC0100Fc);
        this.p = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(YG yg) {
        this.f = yg;
        this.p = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.p = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(C2878jF c2878jF) {
        this.m = new ZG(c2878jF).b();
        this.p = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.n = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C0473aH c0473aH) {
        this.m = c0473aH;
        this.p = true;
        e();
        invalidate();
    }
}
