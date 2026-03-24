package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541bc {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, 13);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, 16);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, 14);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 11);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 15);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 83);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 84);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(C0518b7 c0518b7, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = c0518b7.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = QA.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (iIntValue == 0 && c0518b7.isInEditMode() && (c0518b7.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0518b7.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.s) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.s.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x008b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0509. Please report as an issue. */
    public static C0388Wb d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String string;
        String str4;
        int i3;
        int dimensionPixelOffset;
        int i4;
        float dimension;
        int i5;
        int i6;
        String string2;
        float f2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int integer;
        StringBuilder sb;
        C0388Wb c0388Wb = new C0388Wb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? WA.c : WA.a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        String[] strArr = AbstractC3296qu.b;
        C0439Zb c0439Zb = c0388Wb.b;
        C0486ac c0486ac = c0388Wb.e;
        C0422Yb c0422Yb = c0388Wb.c;
        C0405Xb c0405Xb = c0388Wb.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C0371Vb c0371Vb = new C0371Vb();
            c0371Vb.a = new int[10];
            c0371Vb.b = new int[10];
            c0371Vb.c = 0;
            c0371Vb.d = new int[10];
            c0371Vb.e = new float[10];
            c0371Vb.f = 0;
            c0371Vb.g = new int[5];
            c0371Vb.h = new String[5];
            c0371Vb.i = 0;
            c0371Vb.j = new int[4];
            c0371Vb.k = new boolean[4];
            c0371Vb.l = 0;
            c0422Yb.getClass();
            c0405Xb.getClass();
            c0439Zb.getClass();
            c0486ac.getClass();
            int i11 = 0;
            while (i11 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0371Vb.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.H));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c0371Vb.c(5, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0405Xb.B);
                        i4 = 6;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0405Xb.C);
                        i4 = 7;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.I);
                        i4 = 8;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.O);
                        i4 = 11;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.P);
                        i4 = 12;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.L);
                        i4 = 13;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.N);
                        i4 = 14;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.Q);
                        i4 = 15;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.M);
                        i4 = 16;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0405Xb.d);
                        i4 = 17;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0405Xb.e);
                        i4 = 18;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.f);
                        i5 = 19;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.v);
                        i5 = 20;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0405Xb.c);
                        i4 = 21;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        dimensionPixelOffset = iArr[typedArrayObtainStyledAttributes.getInt(index, c0439Zb.a)];
                        i4 = 22;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0405Xb.b);
                        i4 = 23;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.E);
                        i4 = 24;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.D);
                        i4 = 27;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.F);
                        i4 = 28;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.J);
                        i4 = 31;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.G);
                        i4 = 34;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.w);
                        i5 = 37;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getResourceId(index, c0388Wb.a);
                        c0388Wb.a = dimensionPixelOffset;
                        i4 = 38;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.T);
                        i5 = 39;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.S);
                        i5 = 40;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.U);
                        i4 = 41;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.V);
                        i4 = 42;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0439Zb.c);
                        i5 = 43;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0371Vb.d(44, true);
                        c0371Vb.a(44, typedArrayObtainStyledAttributes.getDimension(index, c0486ac.m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0486ac.b);
                        i5 = 45;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0486ac.c);
                        i5 = 46;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0486ac.d);
                        i5 = 47;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0486ac.e);
                        i5 = 48;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, c0486ac.f);
                        i5 = 49;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, c0486ac.g);
                        i5 = 50;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, c0486ac.i);
                        i5 = 51;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, c0486ac.j);
                        i5 = 52;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, c0486ac.k);
                        i5 = 53;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.W);
                        i4 = 54;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.X);
                        i4 = 55;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.Y);
                        i4 = 56;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.Z);
                        i4 = 57;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.a0);
                        i4 = 58;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.b0);
                        i4 = 59;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0486ac.a);
                        i5 = 60;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.z);
                        i4 = 62;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0405Xb.A);
                        i5 = 63;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        str4 = str5;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, c0422Yb.a);
                        i4 = 64;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        str4 = str5;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            string2 = typedArrayObtainStyledAttributes.getString(index);
                            i6 = 65;
                        } else {
                            i6 = 65;
                            string2 = strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        c0371Vb.c(i6, string2);
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0371Vb.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0422Yb.e);
                        i5 = 67;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0439Zb.d);
                        i5 = 68;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        f2 = 1.0f;
                        i7 = 69;
                        c0371Vb.a(i7, typedArrayObtainStyledAttributes.getFloat(index, f2));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        i7 = 70;
                        f2 = 1.0f;
                        c0371Vb.a(i7, typedArrayObtainStyledAttributes.getFloat(index, f2));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.e0);
                        i4 = 72;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.f0);
                        i4 = 73;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        i8 = 74;
                        c0371Vb.c(i8, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        z2 = typedArrayObtainStyledAttributes.getBoolean(index, c0405Xb.m0);
                        i9 = 75;
                        c0371Vb.d(i9, z2);
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0422Yb.c);
                        i4 = 76;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        i8 = 77;
                        c0371Vb.c(i8, typedArrayObtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0439Zb.b);
                        i4 = 78;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0422Yb.d);
                        i5 = 79;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        z2 = typedArrayObtainStyledAttributes.getBoolean(index, c0405Xb.k0);
                        i9 = 80;
                        c0371Vb.d(i9, z2);
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        z2 = typedArrayObtainStyledAttributes.getBoolean(index, c0405Xb.l0);
                        i9 = 81;
                        c0371Vb.d(i9, z2);
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, c0422Yb.b);
                        i4 = 82;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, c0486ac.h);
                        i4 = 83;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, c0422Yb.g);
                        i4 = 84;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c0422Yb.f);
                        i5 = 85;
                        c0371Vb.a(i5, dimension);
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0422Yb.i = resourceId;
                            c0371Vb.b(89, resourceId);
                            if (c0422Yb.i != -1) {
                                dimensionPixelOffset = -2;
                                i4 = 88;
                                c0371Vb.b(i4, dimensionPixelOffset);
                            }
                        } else {
                            if (i13 == 3) {
                                String string3 = typedArrayObtainStyledAttributes.getString(index);
                                c0422Yb.h = string3;
                                c0371Vb.c(90, string3);
                                if (c0422Yb.h.indexOf("/") > 0) {
                                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    c0422Yb.i = resourceId2;
                                    c0371Vb.b(89, resourceId2);
                                    c0371Vb.b(88, -2);
                                } else {
                                    integer = -1;
                                    i10 = 88;
                                }
                            } else {
                                i10 = 88;
                                integer = typedArrayObtainStyledAttributes.getInteger(index, c0422Yb.i);
                            }
                            c0371Vb.b(i10, integer);
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.K);
                        i4 = 93;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0405Xb.R);
                        i4 = 94;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0371Vb, typedArrayObtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0371Vb, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c0405Xb.n0);
                        i4 = 97;
                        c0371Vb.b(i4, dimensionPixelOffset);
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i14 = AbstractC3674xv.y;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0388Wb.a = typedArrayObtainStyledAttributes.getResourceId(index, c0388Wb.a);
                        }
                        i3 = 1;
                        break;
                }
                i11 += i3;
                indexCount = i12;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i15 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i16 = 0;
            while (i16 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i16);
                if (index2 != i15 && 23 != index2 && 24 != index2) {
                    c0422Yb.getClass();
                    c0405Xb.getClass();
                    c0439Zb.getClass();
                    c0486ac.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.o = f(typedArrayObtainStyledAttributes, index2, c0405Xb.o);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.H);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.n = f(typedArrayObtainStyledAttributes, index2, c0405Xb.n);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.m = f(typedArrayObtainStyledAttributes, index2, c0405Xb.m);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.x = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0405Xb.B);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0405Xb.C);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.I);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.u = f(typedArrayObtainStyledAttributes, index2, c0405Xb.u);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.t = f(typedArrayObtainStyledAttributes, index2, c0405Xb.t);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.O);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.P);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.L);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.N);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.Q);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.M);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0405Xb.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0405Xb.e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.f = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.v = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.v);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0405Xb.c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0439Zb.a = iArr[typedArrayObtainStyledAttributes.getInt(index2, c0439Zb.a)];
                        i2 = 1;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0405Xb.b);
                        i2 = 1;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.E);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.g = f(typedArrayObtainStyledAttributes, index2, c0405Xb.g);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.h = f(typedArrayObtainStyledAttributes, index2, c0405Xb.h);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.D = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.D);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.F);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.i = f(typedArrayObtainStyledAttributes, index2, c0405Xb.i);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.j = f(typedArrayObtainStyledAttributes, index2, c0405Xb.j);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.J);
                        i2 = 1;
                        break;
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.r = f(typedArrayObtainStyledAttributes, index2, c0405Xb.r);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.s = f(typedArrayObtainStyledAttributes, index2, c0405Xb.s);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.G);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.l = f(typedArrayObtainStyledAttributes, index2, c0405Xb.l);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.k = f(typedArrayObtainStyledAttributes, index2, c0405Xb.k);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.w = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.w);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388Wb.a = typedArrayObtainStyledAttributes.getResourceId(index2, c0388Wb.a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.T = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.T);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.S = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.S);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.U = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.U);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.V = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.V);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0439Zb.c = typedArrayObtainStyledAttributes.getFloat(index2, c0439Zb.c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.l = true;
                        c0486ac.m = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.b = typedArrayObtainStyledAttributes.getFloat(index2, c0486ac.b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.c = typedArrayObtainStyledAttributes.getFloat(index2, c0486ac.c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.d = typedArrayObtainStyledAttributes.getFloat(index2, c0486ac.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.e = typedArrayObtainStyledAttributes.getFloat(index2, c0486ac.e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.f = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.g = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.i = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.j = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.k = typedArrayObtainStyledAttributes.getDimension(index2, c0486ac.k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.W = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.W);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.X = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.X);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.Y);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.Z);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.a0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.b0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0486ac.a = typedArrayObtainStyledAttributes.getFloat(index2, c0486ac.a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.y = f(typedArrayObtainStyledAttributes, index2, c0405Xb.y);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.z);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0405Xb.A = typedArrayObtainStyledAttributes.getFloat(index2, c0405Xb.A);
                        i2 = 1;
                        break;
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0422Yb.a = f(typedArrayObtainStyledAttributes, index2, c0422Yb.a);
                        i2 = 1;
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0422Yb.getClass();
                            i2 = 1;
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0422Yb.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0422Yb.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0422Yb.e = typedArrayObtainStyledAttributes.getFloat(index2, c0422Yb.e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0439Zb.d = typedArrayObtainStyledAttributes.getFloat(index2, c0439Zb.d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0405Xb.c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0405Xb.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.e0 = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.e0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.i0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0405Xb.m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        c0422Yb.c = typedArrayObtainStyledAttributes.getInt(index2, c0422Yb.c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        c0439Zb.b = typedArrayObtainStyledAttributes.getInt(index2, c0439Zb.b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        c0422Yb.d = typedArrayObtainStyledAttributes.getFloat(index2, c0422Yb.d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.k0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0405Xb.k0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0405Xb.l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        c0422Yb.b = typedArrayObtainStyledAttributes.getInteger(index2, c0422Yb.b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        c0486ac.h = f(typedArrayObtainStyledAttributes, index2, c0486ac.h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        c0422Yb.g = typedArrayObtainStyledAttributes.getInteger(index2, c0422Yb.g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        c0422Yb.f = typedArrayObtainStyledAttributes.getFloat(index2, c0422Yb.f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            c0422Yb.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string4 = typedArrayObtainStyledAttributes.getString(index2);
                            c0422Yb.h = string4;
                            if (string4.indexOf("/") > 0) {
                                c0422Yb.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0422Yb.i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        string = "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2);
                        Log.w(str6, string);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        string = sb2.toString();
                        Log.w(str6, string);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.p = f(typedArrayObtainStyledAttributes, index2, c0405Xb.p);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.q = f(typedArrayObtainStyledAttributes, index2, c0405Xb.q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.K);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0405Xb.R);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0405Xb, typedArrayObtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0405Xb, typedArrayObtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0405Xb.n0 = typedArrayObtainStyledAttributes.getInt(index2, c0405Xb.n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i16 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i15 = i2;
                str6 = str3;
                str7 = str10;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0388Wb;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0541bc.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(C0269Pb c0269Pb, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0269Pb.F = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i;
        HashMap map;
        int i2;
        int i3;
        HashMap map2;
        String resourceEntryName;
        C0541bc c0541bc = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i4 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c0541bc.c;
        HashSet hashSet = new HashSet(map3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            int id = childAt.getId();
            if (!map3.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c0541bc.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map3.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0388Wb c0388Wb = (C0388Wb) map3.get(Integer.valueOf(id));
                        if (c0388Wb != null) {
                            if (childAt instanceof C0518b7) {
                                C0405Xb c0405Xb = c0388Wb.d;
                                c0405Xb.g0 = i4;
                                C0518b7 c0518b7 = (C0518b7) childAt;
                                c0518b7.setId(id);
                                c0518b7.setType(c0405Xb.e0);
                                c0518b7.setMargin(c0405Xb.f0);
                                c0518b7.setAllowsGoneWidget(c0405Xb.m0);
                                int[] iArr = c0405Xb.h0;
                                if (iArr != null) {
                                    c0518b7.setReferencedIds(iArr);
                                } else {
                                    String str = c0405Xb.i0;
                                    if (str != null) {
                                        int[] iArrC = c(c0518b7, str);
                                        c0405Xb.h0 = iArrC;
                                        c0518b7.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            C0269Pb c0269Pb = (C0269Pb) childAt.getLayoutParams();
                            c0269Pb.a();
                            c0388Wb.a(c0269Pb);
                            HashMap map4 = c0388Wb.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map4.keySet()) {
                                C0184Kb c0184Kb = (C0184Kb) map4.get(str2);
                                String strW = !c0184Kb.a ? AbstractC3264qG.w("set", str2) : str2;
                                HashMap map5 = map4;
                                try {
                                    switch (AbstractC3264qG.A(c0184Kb.b)) {
                                        case 0:
                                            i3 = childCount;
                                            map2 = map3;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strW, clsArr).invoke(childAt, Integer.valueOf(c0184Kb.c));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbO = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO.append(cls.getName());
                                                Log.e("TransitionLayout", sbO.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strW);
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbO2 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO2.append(cls.getName());
                                                Log.e("TransitionLayout", sbO2.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        case 1:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strW, Float.TYPE).invoke(childAt, Float.valueOf(c0184Kb.d));
                                            break;
                                        case 2:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strW, Integer.TYPE).invoke(childAt, Integer.valueOf(c0184Kb.g));
                                            break;
                                        case 3:
                                            i3 = childCount;
                                            map2 = map3;
                                            Method method = cls.getMethod(strW, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0184Kb.g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strW, CharSequence.class).invoke(childAt, c0184Kb.e);
                                            break;
                                        case 5:
                                            i3 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strW, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0184Kb.f));
                                            break;
                                        case 6:
                                            i3 = childCount;
                                            try {
                                                map2 = map3;
                                            } catch (IllegalAccessException e5) {
                                                e = e5;
                                                map2 = map3;
                                                StringBuilder sbO22 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO22.append(cls.getName());
                                                Log.e("TransitionLayout", sbO22.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e6) {
                                                e = e6;
                                                map2 = map3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strW);
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e7) {
                                                e = e7;
                                                map2 = map3;
                                                StringBuilder sbO222 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO222.append(cls.getName());
                                                Log.e("TransitionLayout", sbO222.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                            try {
                                                cls.getMethod(strW, Float.TYPE).invoke(childAt, Float.valueOf(c0184Kb.d));
                                            } catch (IllegalAccessException e8) {
                                                e = e8;
                                                StringBuilder sbO2222 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO2222.append(cls.getName());
                                                Log.e("TransitionLayout", sbO2222.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strW);
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                StringBuilder sbO22222 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO22222.append(cls.getName());
                                                Log.e("TransitionLayout", sbO22222.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        case 7:
                                            i3 = childCount;
                                            try {
                                                cls.getMethod(strW, Integer.TYPE).invoke(childAt, Integer.valueOf(c0184Kb.c));
                                                map2 = map3;
                                            } catch (IllegalAccessException e11) {
                                                e = e11;
                                                map2 = map3;
                                                StringBuilder sbO222222 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO222222.append(cls.getName());
                                                Log.e("TransitionLayout", sbO222222.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (NoSuchMethodException e12) {
                                                e = e12;
                                                map2 = map3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strW);
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            } catch (InvocationTargetException e13) {
                                                e = e13;
                                                map2 = map3;
                                                StringBuilder sbO2222222 = AbstractC3264qG.o(" Custom Attribute \"", str2, "\" not found on ");
                                                sbO2222222.append(cls.getName());
                                                Log.e("TransitionLayout", sbO2222222.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i3;
                                                map3 = map2;
                                            }
                                        default:
                                            i3 = childCount;
                                            map2 = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e14) {
                                    e = e14;
                                    i3 = childCount;
                                } catch (NoSuchMethodException e15) {
                                    e = e15;
                                    i3 = childCount;
                                } catch (InvocationTargetException e16) {
                                    e = e16;
                                    i3 = childCount;
                                }
                                map4 = map5;
                                childCount = i3;
                                map3 = map2;
                            }
                            i = childCount;
                            map = map3;
                            childAt.setLayoutParams(c0269Pb);
                            C0439Zb c0439Zb = c0388Wb.b;
                            if (c0439Zb.b == 0) {
                                childAt.setVisibility(c0439Zb.a);
                            }
                            childAt.setAlpha(c0439Zb.c);
                            C0486ac c0486ac = c0388Wb.e;
                            childAt.setRotation(c0486ac.a);
                            childAt.setRotationX(c0486ac.b);
                            childAt.setRotationY(c0486ac.c);
                            childAt.setScaleX(c0486ac.d);
                            childAt.setScaleY(c0486ac.e);
                            if (c0486ac.h != -1) {
                                if (((View) childAt.getParent()).findViewById(c0486ac.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0486ac.f)) {
                                    childAt.setPivotX(c0486ac.f);
                                }
                                if (!Float.isNaN(c0486ac.g)) {
                                    childAt.setPivotY(c0486ac.g);
                                }
                            }
                            childAt.setTranslationX(c0486ac.i);
                            childAt.setTranslationY(c0486ac.j);
                            childAt.setTranslationZ(c0486ac.k);
                            if (c0486ac.l) {
                                childAt.setElevation(c0486ac.m);
                            }
                        }
                    } else {
                        i = childCount;
                        map = map3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i2 = 1;
                }
                i5 += i2;
                constraintLayout2 = constraintLayout;
                i4 = i2;
                childCount = i;
                map3 = map;
                c0541bc = this;
            }
            i2 = i4;
            i = childCount;
            map = map3;
            i5 += i2;
            constraintLayout2 = constraintLayout;
            i4 = i2;
            childCount = i;
            map3 = map;
            c0541bc = this;
        }
        int i6 = childCount;
        HashMap map6 = map3;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap map7 = map6;
            C0388Wb c0388Wb2 = (C0388Wb) map7.get(num);
            if (c0388Wb2 != null) {
                C0405Xb c0405Xb2 = c0388Wb2.d;
                if (c0405Xb2.g0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0518b7 c0518b72 = new C0518b7(context);
                    c0518b72.a = new int[32];
                    c0518b72.m = new HashMap();
                    c0518b72.c = context;
                    c0518b72.g(null);
                    c0518b72.setVisibility(8);
                    c0518b72.setId(num.intValue());
                    int[] iArr2 = c0405Xb2.h0;
                    if (iArr2 != null) {
                        c0518b72.setReferencedIds(iArr2);
                    } else {
                        String str3 = c0405Xb2.i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(c0518b72, str3);
                            c0405Xb2.h0 = iArrC2;
                            c0518b72.setReferencedIds(iArrC2);
                        }
                    }
                    c0518b72.setType(c0405Xb2.e0);
                    c0518b72.setMargin(c0405Xb2.f0);
                    C0269Pb c0269PbG = ConstraintLayout.g();
                    c0518b72.i();
                    c0388Wb2.a(c0269PbG);
                    viewGroup = constraintLayout;
                    viewGroup.addView(c0518b72, c0269PbG);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c0405Xb2.a) {
                    C2851io c2851io = new C2851io(constraintLayout.getContext());
                    c2851io.setId(num.intValue());
                    C0269Pb c0269PbG2 = ConstraintLayout.g();
                    c0388Wb2.a(c0269PbG2);
                    viewGroup.addView(c2851io, c0269PbG2);
                }
            }
            map6 = map7;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof AbstractC0235Nb) {
                ((AbstractC0235Nb) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C0541bc c0541bc = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0541bc.c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0269Pb c0269Pb = (C0269Pb) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0541bc.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0388Wb());
            }
            C0388Wb c0388Wb = (C0388Wb) map.get(Integer.valueOf(id));
            if (c0388Wb != null) {
                HashMap map2 = c0541bc.a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C0184Kb c0184Kb = (C0184Kb) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C0184Kb(c0184Kb, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C0184Kb(c0184Kb, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        e.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        e.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        e.printStackTrace();
                    }
                }
                c0388Wb.f = map3;
                c0388Wb.a = id;
                int i2 = c0269Pb.d;
                C0405Xb c0405Xb = c0388Wb.d;
                c0405Xb.g = i2;
                c0405Xb.h = c0269Pb.e;
                c0405Xb.i = c0269Pb.f;
                c0405Xb.j = c0269Pb.g;
                c0405Xb.k = c0269Pb.h;
                c0405Xb.l = c0269Pb.i;
                c0405Xb.m = c0269Pb.j;
                c0405Xb.n = c0269Pb.k;
                c0405Xb.o = c0269Pb.l;
                c0405Xb.p = c0269Pb.m;
                c0405Xb.q = c0269Pb.n;
                c0405Xb.r = c0269Pb.r;
                c0405Xb.s = c0269Pb.s;
                c0405Xb.t = c0269Pb.t;
                c0405Xb.u = c0269Pb.u;
                c0405Xb.v = c0269Pb.D;
                c0405Xb.w = c0269Pb.E;
                c0405Xb.x = c0269Pb.F;
                c0405Xb.y = c0269Pb.o;
                c0405Xb.z = c0269Pb.p;
                c0405Xb.A = c0269Pb.q;
                c0405Xb.B = c0269Pb.S;
                c0405Xb.C = c0269Pb.T;
                c0405Xb.D = c0269Pb.U;
                c0405Xb.f = c0269Pb.c;
                c0405Xb.d = c0269Pb.a;
                c0405Xb.e = c0269Pb.b;
                c0405Xb.b = ((ViewGroup.MarginLayoutParams) c0269Pb).width;
                c0405Xb.c = ((ViewGroup.MarginLayoutParams) c0269Pb).height;
                c0405Xb.E = ((ViewGroup.MarginLayoutParams) c0269Pb).leftMargin;
                c0405Xb.F = ((ViewGroup.MarginLayoutParams) c0269Pb).rightMargin;
                c0405Xb.G = ((ViewGroup.MarginLayoutParams) c0269Pb).topMargin;
                c0405Xb.H = ((ViewGroup.MarginLayoutParams) c0269Pb).bottomMargin;
                c0405Xb.K = c0269Pb.C;
                c0405Xb.S = c0269Pb.H;
                c0405Xb.T = c0269Pb.G;
                c0405Xb.V = c0269Pb.J;
                c0405Xb.U = c0269Pb.I;
                c0405Xb.k0 = c0269Pb.V;
                c0405Xb.l0 = c0269Pb.W;
                c0405Xb.W = c0269Pb.K;
                c0405Xb.X = c0269Pb.L;
                c0405Xb.Y = c0269Pb.O;
                c0405Xb.Z = c0269Pb.P;
                c0405Xb.a0 = c0269Pb.M;
                c0405Xb.b0 = c0269Pb.N;
                c0405Xb.c0 = c0269Pb.Q;
                c0405Xb.d0 = c0269Pb.R;
                c0405Xb.j0 = c0269Pb.X;
                c0405Xb.M = c0269Pb.w;
                c0405Xb.O = c0269Pb.y;
                c0405Xb.L = c0269Pb.v;
                c0405Xb.N = c0269Pb.x;
                c0405Xb.Q = c0269Pb.z;
                c0405Xb.P = c0269Pb.A;
                c0405Xb.R = c0269Pb.B;
                c0405Xb.n0 = c0269Pb.Y;
                c0405Xb.I = c0269Pb.getMarginEnd();
                c0405Xb.J = c0269Pb.getMarginStart();
                int visibility = childAt.getVisibility();
                C0439Zb c0439Zb = c0388Wb.b;
                c0439Zb.a = visibility;
                c0439Zb.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0486ac c0486ac = c0388Wb.e;
                c0486ac.a = rotation;
                c0486ac.b = childAt.getRotationX();
                c0486ac.c = childAt.getRotationY();
                c0486ac.d = childAt.getScaleX();
                c0486ac.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0486ac.f = pivotX;
                    c0486ac.g = pivotY;
                }
                c0486ac.i = childAt.getTranslationX();
                c0486ac.j = childAt.getTranslationY();
                c0486ac.k = childAt.getTranslationZ();
                if (c0486ac.l) {
                    c0486ac.m = childAt.getElevation();
                }
                if (childAt instanceof C0518b7) {
                    C0518b7 c0518b7 = (C0518b7) childAt;
                    c0405Xb.m0 = c0518b7.getAllowsGoneWidget();
                    c0405Xb.h0 = c0518b7.getReferencedIds();
                    c0405Xb.e0 = c0518b7.getType();
                    c0405Xb.f0 = c0518b7.getMargin();
                }
            }
            i++;
            c0541bc = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0388Wb c0388WbD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0388WbD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(c0388WbD.a), c0388WbD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
