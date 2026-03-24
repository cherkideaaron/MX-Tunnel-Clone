package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.mxtunnel.pro.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0473aH {
    public final int a;
    public final C2878jF b;
    public final int[][] c;
    public final C2878jF[] d;
    public final YG e;
    public final YG f;
    public final YG g;
    public final YG h;

    public C0473aH(ZG zg) {
        this.a = zg.a;
        this.b = zg.b;
        this.c = zg.c;
        this.d = zg.d;
        this.e = zg.e;
        this.f = zg.f;
        this.g = zg.g;
        this.h = zg.h;
    }

    public static void a(ZG zg, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = RA.t;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                C2878jF c2878jFA = C2878jF.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new C2754h(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                zg.a(StateSet.trimStateSet(iArr2, i), c2878jFA);
            }
        }
    }

    public static C0473aH b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ZG zg = new ZG();
        zg.c();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            zg.c();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(zg, context, xml, attributeSetAsAttributeSet, context.getTheme());
        }
        xml.close();
        return zg.b();
    }

    public final C2878jF c() {
        C2878jF c2878jF = this.b;
        YG yg = this.h;
        YG yg2 = this.g;
        YG yg3 = this.f;
        YG yg4 = this.e;
        if (yg4 == null && yg3 == null && yg2 == null && yg == null) {
            return c2878jF;
        }
        C2825iF c2825iFF = c2878jF.f();
        if (yg4 != null) {
            c2825iFF.e = yg4.b;
        }
        if (yg3 != null) {
            c2825iFF.f = yg3.b;
        }
        if (yg2 != null) {
            c2825iFF.h = yg2.b;
        }
        if (yg != null) {
            c2825iFF.g = yg.b;
        }
        return c2825iFF.a();
    }

    public final boolean d() {
        if (this.a > 1) {
            return true;
        }
        YG yg = this.e;
        if (yg != null && yg.a > 1) {
            return true;
        }
        YG yg2 = this.f;
        if (yg2 != null && yg2.a > 1) {
            return true;
        }
        YG yg3 = this.g;
        if (yg3 != null && yg3.a > 1) {
            return true;
        }
        YG yg4 = this.h;
        return yg4 != null && yg4.a > 1;
    }
}
