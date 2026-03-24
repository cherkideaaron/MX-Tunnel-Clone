package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class N2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ N2() {
        this.a = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ef, code lost:
    
        if (r7 == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f1, code lost:
    
        if (r7 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f3, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f8, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fe, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.b, (float[]) r0.c, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0228, code lost:
    
        r8 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r24 <= 0.0f) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0235, code lost:
    
        if (r7 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        if (r7 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023a, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023f, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0242, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0245, code lost:
    
        r3 = new android.graphics.RadialGradient(r8, r15, r24, (int[]) r0.b, (float[]) r0.c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0262, code lost:
    
        return new defpackage.N2(r3, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026a, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new defpackage.C3178om(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if (r19 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        r0 = new defpackage.C3178om(r5, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e4, code lost:
    
        r0 = new defpackage.C3178om(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        if (r9 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        if (r9 == 2) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.N2 c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N2.c(android.content.res.Resources, int, android.content.res.Resources$Theme):N2");
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a() {
        C2609eJ c2609eJ;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC3228ph.a(drawable);
        }
        if (drawable == null || (c2609eJ = (C2609eJ) this.d) == null) {
            return;
        }
        I2.e(drawable, c2609eJ, imageView.getDrawableState());
    }

    public XB b() {
        C2961kp c2961kp = (C2961kp) this.d;
        if (c2961kp != null) {
            throw c2961kp.a();
        }
        XB xbB = XB.b(this.b, (Object[]) this.c, this);
        C2961kp c2961kp2 = (C2961kp) this.d;
        if (c2961kp2 == null) {
            return xbB;
        }
        throw c2961kp2.a();
    }

    public String e() {
        String strG;
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof InterfaceC3207pE) {
                InterfaceC3207pE interfaceC3207pE = (InterfaceC3207pE) obj;
                if (!AbstractC0500aq.b(interfaceC3207pE.e(), DH.x)) {
                    int i3 = ((int[]) this.d)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        strG = interfaceC3207pE.g(i3);
                        sb.append(strG);
                    }
                } else if (((int[]) this.d)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    strG = "]";
                    sb.append(strG);
                }
            } else if (obj != C3397so.d) {
                sb.append("['");
                sb.append(obj);
                strG = "']";
                sb.append(strG);
            }
        }
        String string = sb.toString();
        AbstractC0500aq.l(string, "toString(...)");
        return string;
    }

    public boolean f() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void g(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2547dB.f;
        D3 d3L = D3.L(i, 0, context, attributeSet, iArr);
        UL.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) d3L.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) d3L.b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0500aq.F(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3228ph.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(d3L.w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC3228ph.c(typedArray.getInt(3, -1), null));
            }
            d3L.P();
        } catch (Throwable th) {
            d3L.P();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003c A[EDGE_INSN: B:86:0x003c->B:17:0x003c BREAK  A[LOOP:3: B:11:0x0024->B:89:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(defpackage.C0399Wm r13, int r14, int r15) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N2.h(Wm, int, int):void");
    }

    public void i(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, AbstractC0115Ga.t(objArr.length, i));
        }
        MO.g(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void j(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, AbstractC0115Ga.t(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i(entry.getKey(), entry.getValue());
        }
    }

    public void k(C0399Wm c0399Wm) throws SQLException {
        c0399Wm.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0399Wm.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return e();
            default:
                return super.toString();
        }
    }

    public N2(int i) {
        this.a = 2;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public N2(C3766zf c3766zf, WN wn) {
        this.a = 4;
        this.b = 12;
        this.c = c3766zf;
        this.d = wn;
    }

    public N2(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 1;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public N2(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }
}
