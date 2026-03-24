package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.BL;
import defpackage.CL;
import defpackage.DL;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(BL bl) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        DL dlH = remoteActionCompat.a;
        if (bl.e(1)) {
            dlH = bl.h();
        }
        remoteActionCompat.a = (IconCompat) dlH;
        CharSequence charSequence = remoteActionCompat.b;
        if (bl.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((CL) bl).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bl.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((CL) bl).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) bl.g(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (bl.e(5)) {
            z = ((CL) bl).e.readInt() != 0;
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (bl.e(6)) {
            z2 = ((CL) bl).e.readInt() != 0;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, BL bl) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bl.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        bl.i(1);
        bl.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bl.i(2);
        Parcel parcel = ((CL) bl).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bl.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        bl.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        bl.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        bl.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
