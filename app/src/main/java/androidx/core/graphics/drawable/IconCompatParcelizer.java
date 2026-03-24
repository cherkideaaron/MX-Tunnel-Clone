package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.BL;
import defpackage.CL;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(BL bl) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = bl.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (bl.e(2)) {
            Parcel parcel = ((CL) bl).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = bl.g(iconCompat.d, 3);
        iconCompat.e = bl.f(iconCompat.e, 4);
        iconCompat.f = bl.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) bl.g(iconCompat.g, 6);
        String string = iconCompat.i;
        if (bl.e(7)) {
            string = ((CL) bl).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (bl.e(8)) {
            string2 = ((CL) bl).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, BL bl) {
        bl.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            bl.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bl.i(2);
            int length = bArr.length;
            Parcel parcel = ((CL) bl).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bl.i(3);
            ((CL) bl).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bl.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            bl.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bl.i(6);
            ((CL) bl).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bl.i(7);
            ((CL) bl).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bl.i(8);
            ((CL) bl).e.writeString(str2);
        }
    }
}
