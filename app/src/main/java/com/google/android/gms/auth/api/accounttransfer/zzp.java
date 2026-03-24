package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayListCreateTypedList = null;
        zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            int i3 = 1;
            if (fieldId != 1) {
                i3 = 2;
                if (fieldId != 2) {
                    i3 = 3;
                    if (fieldId != 3) {
                        i3 = 4;
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            zzsVar = (zzs) SafeParcelReader.createParcelable(parcel, header, zzs.CREATOR);
                        }
                    } else {
                        i = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzu.CREATOR);
                }
            } else {
                i2 = SafeParcelReader.readInt(parcel, header);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzo(hashSet, i2, arrayListCreateTypedList, i, zzsVar);
        }
        throw new SafeParcelReader.ParseException(Vs.k(iValidateObjectHeader, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
