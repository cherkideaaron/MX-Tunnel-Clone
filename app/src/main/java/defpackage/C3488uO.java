package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import java.util.ArrayList;

/* renamed from: uO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3488uO implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C3488uO(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new WrappedParcelable(parcel);
            case 1:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString = null;
                String strCreateString2 = null;
                String strCreateString3 = null;
                String strCreateString4 = null;
                String strCreateString5 = null;
                String strCreateString6 = null;
                String strCreateString7 = null;
                String strCreateString8 = null;
                boolean z = false;
                boolean z2 = false;
                int i = 0;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header)) {
                        case 1:
                            strCreateString = SafeParcelReader.createString(parcel, header);
                            break;
                        case 2:
                            strCreateString2 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 3:
                            strCreateString3 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 4:
                            strCreateString4 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 5:
                            z = SafeParcelReader.readBoolean(parcel, header);
                            break;
                        case 6:
                            strCreateString5 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 7:
                            z2 = SafeParcelReader.readBoolean(parcel, header);
                            break;
                        case 8:
                            strCreateString6 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 9:
                            i = SafeParcelReader.readInt(parcel, header);
                            break;
                        case 10:
                            strCreateString7 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 11:
                            strCreateString8 = SafeParcelReader.createString(parcel, header);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new C3302r0(strCreateString, strCreateString2, strCreateString3, strCreateString4, z, strCreateString5, z2, strCreateString6, i, strCreateString7, strCreateString8);
            case 2:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString9 = null;
                String strCreateString10 = null;
                String strCreateString11 = null;
                String strCreateString12 = null;
                String strCreateString13 = null;
                String strCreateString14 = null;
                String strCreateString15 = null;
                boolean z3 = false;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header2)) {
                        case 1:
                            strCreateString9 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 2:
                            strCreateString10 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 3:
                            strCreateString13 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 4:
                            strCreateString12 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 5:
                            strCreateString11 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 6:
                            strCreateString14 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 7:
                            z3 = SafeParcelReader.readBoolean(parcel, header2);
                            break;
                        case 8:
                            strCreateString15 = SafeParcelReader.createString(parcel, header2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new C3489uP(strCreateString9, strCreateString10, strCreateString11, strCreateString12, strCreateString13, strCreateString14, z3, strCreateString15);
            case 3:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                zzahv zzahvVar = null;
                String strCreateString16 = null;
                String strCreateString17 = null;
                ArrayList arrayListCreateTypedList = null;
                ArrayList<String> arrayListCreateStringList = null;
                String strCreateString18 = null;
                Boolean booleanObject = null;
                EP ep = null;
                C3382sQ c3382sQ = null;
                SP sp = null;
                ArrayList arrayListCreateTypedList2 = null;
                boolean z4 = false;
                C3489uP c3489uP = null;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header3)) {
                        case 1:
                            zzahvVar = (zzahv) SafeParcelReader.createParcelable(parcel, header3, zzahv.CREATOR);
                            break;
                        case 2:
                            c3489uP = (C3489uP) SafeParcelReader.createParcelable(parcel, header3, C3489uP.CREATOR);
                            break;
                        case 3:
                            strCreateString16 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 4:
                            strCreateString17 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 5:
                            arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header3, C3489uP.CREATOR);
                            break;
                        case 6:
                            arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header3);
                            break;
                        case 7:
                            strCreateString18 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 8:
                            booleanObject = SafeParcelReader.readBooleanObject(parcel, header3);
                            break;
                        case 9:
                            ep = (EP) SafeParcelReader.createParcelable(parcel, header3, EP.CREATOR);
                            break;
                        case 10:
                            z4 = SafeParcelReader.readBoolean(parcel, header3);
                            break;
                        case 11:
                            c3382sQ = (C3382sQ) SafeParcelReader.createParcelable(parcel, header3, C3382sQ.CREATOR);
                            break;
                        case 12:
                            sp = (SP) SafeParcelReader.createParcelable(parcel, header3, SP.CREATOR);
                            break;
                        case 13:
                            arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header3, HP.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header3);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                BP bp = new BP();
                bp.a = zzahvVar;
                bp.b = c3489uP;
                bp.c = strCreateString16;
                bp.d = strCreateString17;
                bp.e = arrayListCreateTypedList;
                bp.f = arrayListCreateStringList;
                bp.m = strCreateString18;
                bp.n = booleanObject;
                bp.o = ep;
                bp.p = z4;
                bp.q = c3382sQ;
                bp.r = sp;
                bp.s = arrayListCreateTypedList2;
                return bp;
            case 4:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header4);
                    if (fieldId == 1) {
                        j = SafeParcelReader.readLong(parcel, header4);
                    } else if (fieldId != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header4);
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, header4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new EP(j, j2);
            case 5:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString19 = null;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header5) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header5);
                    } else {
                        strCreateString19 = SafeParcelReader.createString(parcel, header5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new C0553bo(strCreateString19);
            case 6:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString20 = null;
                String strCreateString21 = null;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header6);
                    if (fieldId2 == 1) {
                        strCreateString20 = SafeParcelReader.createString(parcel, header6);
                    } else if (fieldId2 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        strCreateString21 = SafeParcelReader.createString(parcel, header6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new C2687fo(strCreateString20, strCreateString21);
            case 7:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString22 = null;
                String strCreateString23 = null;
                String strCreateString24 = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header7);
                    if (fieldId3 == 1) {
                        strCreateString22 = SafeParcelReader.createString(parcel, header7);
                    } else if (fieldId3 == 2) {
                        strCreateString23 = SafeParcelReader.createString(parcel, header7);
                    } else if (fieldId3 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header7);
                    } else {
                        strCreateString24 = SafeParcelReader.createString(parcel, header7);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new HP(strCreateString22, strCreateString23, strCreateString24);
            case 8:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayListCreateTypedList3 = null;
                GP gp = null;
                String strCreateString25 = null;
                C3382sQ c3382sQ2 = null;
                BP bp2 = null;
                ArrayList arrayListCreateTypedList4 = null;
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header8)) {
                        case 1:
                            arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header8, Ty.CREATOR);
                            break;
                        case 2:
                            gp = (GP) SafeParcelReader.createParcelable(parcel, header8, GP.CREATOR);
                            break;
                        case 3:
                            strCreateString25 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 4:
                            c3382sQ2 = (C3382sQ) SafeParcelReader.createParcelable(parcel, header8, C3382sQ.CREATOR);
                            break;
                        case 5:
                            bp2 = (BP) SafeParcelReader.createParcelable(parcel, header8, BP.CREATOR);
                            break;
                        case 6:
                            arrayListCreateTypedList4 = SafeParcelReader.createTypedList(parcel, header8, HJ.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header8);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new FP(arrayListCreateTypedList3, gp, strCreateString25, c3382sQ2, bp2, arrayListCreateTypedList4);
            case 9:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString26 = null;
                String strCreateString27 = null;
                String strCreateString28 = null;
                String strCreateString29 = null;
                boolean z5 = false;
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header9);
                    if (fieldId4 == 1) {
                        strCreateString26 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId4 == 2) {
                        strCreateString27 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId4 == 4) {
                        strCreateString28 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId4 == 5) {
                        z5 = SafeParcelReader.readBoolean(parcel, header9);
                    } else if (fieldId4 != 6) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        strCreateString29 = SafeParcelReader.createString(parcel, header9);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                return new Py(strCreateString26, strCreateString27, strCreateString28, strCreateString29, z5);
            case 10:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString30 = null;
                String strCreateString31 = null;
                ArrayList arrayListCreateTypedList5 = null;
                ArrayList arrayListCreateTypedList6 = null;
                BP bp3 = null;
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header10);
                    if (fieldId5 == 1) {
                        strCreateString30 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId5 == 2) {
                        strCreateString31 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId5 == 3) {
                        arrayListCreateTypedList5 = SafeParcelReader.createTypedList(parcel, header10, Ty.CREATOR);
                    } else if (fieldId5 == 4) {
                        arrayListCreateTypedList6 = SafeParcelReader.createTypedList(parcel, header10, HJ.CREATOR);
                    } else if (fieldId5 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        bp3 = (BP) SafeParcelReader.createParcelable(parcel, header10, BP.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                GP gp2 = new GP();
                gp2.a = strCreateString30;
                gp2.b = strCreateString31;
                gp2.c = arrayListCreateTypedList5;
                gp2.d = arrayListCreateTypedList6;
                gp2.e = bp3;
                return gp2;
            case 11:
                int iValidateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString32 = null;
                String strCreateString33 = null;
                String strCreateString34 = null;
                long j3 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader11) {
                    int header11 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header11);
                    if (fieldId6 == 1) {
                        strCreateString32 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId6 == 2) {
                        strCreateString33 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId6 == 3) {
                        j3 = SafeParcelReader.readLong(parcel, header11);
                    } else if (fieldId6 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header11);
                    } else {
                        strCreateString34 = SafeParcelReader.createString(parcel, header11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader11);
                return new Ty(j3, strCreateString32, strCreateString33, strCreateString34);
            case 12:
                int iValidateObjectHeader12 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString35 = null;
                while (parcel.dataPosition() < iValidateObjectHeader12) {
                    int header12 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header12) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header12);
                    } else {
                        strCreateString35 = SafeParcelReader.createString(parcel, header12);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader12);
                return new Yy(strCreateString35);
            case 13:
                int iValidateObjectHeader13 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString36 = null;
                String strCreateString37 = null;
                zzaiz zzaizVar = null;
                long j4 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader13) {
                    int header13 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(header13);
                    if (fieldId7 == 1) {
                        strCreateString36 = SafeParcelReader.createString(parcel, header13);
                    } else if (fieldId7 == 2) {
                        strCreateString37 = SafeParcelReader.createString(parcel, header13);
                    } else if (fieldId7 == 3) {
                        j4 = SafeParcelReader.readLong(parcel, header13);
                    } else if (fieldId7 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header13);
                    } else {
                        zzaizVar = (zzaiz) SafeParcelReader.createParcelable(parcel, header13, zzaiz.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader13);
                return new HJ(strCreateString36, strCreateString37, j4, zzaizVar);
            case 14:
                int iValidateObjectHeader14 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString38 = null;
                String strCreateString39 = null;
                while (parcel.dataPosition() < iValidateObjectHeader14) {
                    int header14 = SafeParcelReader.readHeader(parcel);
                    int fieldId8 = SafeParcelReader.getFieldId(header14);
                    if (fieldId8 == 1) {
                        strCreateString38 = SafeParcelReader.createString(parcel, header14);
                    } else if (fieldId8 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header14);
                    } else {
                        strCreateString39 = SafeParcelReader.createString(parcel, header14);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader14);
                return new C2830iK(strCreateString38, strCreateString39);
            case 15:
                int iValidateObjectHeader15 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z6 = false;
                String strCreateString40 = null;
                String strCreateString41 = null;
                boolean z7 = false;
                while (parcel.dataPosition() < iValidateObjectHeader15) {
                    int header15 = SafeParcelReader.readHeader(parcel);
                    int fieldId9 = SafeParcelReader.getFieldId(header15);
                    if (fieldId9 == 2) {
                        strCreateString40 = SafeParcelReader.createString(parcel, header15);
                    } else if (fieldId9 == 3) {
                        strCreateString41 = SafeParcelReader.createString(parcel, header15);
                    } else if (fieldId9 == 4) {
                        z6 = SafeParcelReader.readBoolean(parcel, header15);
                    } else if (fieldId9 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header15);
                    } else {
                        z7 = SafeParcelReader.readBoolean(parcel, header15);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader15);
                ZK zk = new ZK();
                zk.a = strCreateString40;
                zk.b = strCreateString41;
                zk.c = z6;
                zk.d = z7;
                zk.e = TextUtils.isEmpty(strCreateString41) ? null : Uri.parse(strCreateString41);
                return zk;
            case 16:
                int iValidateObjectHeader16 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayListCreateTypedList7 = null;
                ArrayList arrayListCreateTypedList8 = null;
                while (parcel.dataPosition() < iValidateObjectHeader16) {
                    int header16 = SafeParcelReader.readHeader(parcel);
                    int fieldId10 = SafeParcelReader.getFieldId(header16);
                    if (fieldId10 == 1) {
                        arrayListCreateTypedList7 = SafeParcelReader.createTypedList(parcel, header16, Ty.CREATOR);
                    } else if (fieldId10 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header16);
                    } else {
                        arrayListCreateTypedList8 = SafeParcelReader.createTypedList(parcel, header16, HJ.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader16);
                return new SP(arrayListCreateTypedList7, arrayListCreateTypedList8);
            case 17:
                int iValidateObjectHeader17 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader17) {
                    int header17 = SafeParcelReader.readHeader(parcel);
                    SafeParcelReader.getFieldId(header17);
                    SafeParcelReader.skipUnknownField(parcel, header17);
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader17);
                return new Qy();
            case 18:
                int iValidateObjectHeader18 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString42 = null;
                String strCreateString43 = null;
                String strCreateString44 = null;
                zzajb zzajbVar = null;
                String strCreateString45 = null;
                String strCreateString46 = null;
                String strCreateString47 = null;
                while (parcel.dataPosition() < iValidateObjectHeader18) {
                    int header18 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header18)) {
                        case 1:
                            strCreateString42 = SafeParcelReader.createString(parcel, header18);
                            break;
                        case 2:
                            strCreateString43 = SafeParcelReader.createString(parcel, header18);
                            break;
                        case 3:
                            strCreateString44 = SafeParcelReader.createString(parcel, header18);
                            break;
                        case 4:
                            zzajbVar = (zzajb) SafeParcelReader.createParcelable(parcel, header18, zzajb.CREATOR);
                            break;
                        case 5:
                            strCreateString45 = SafeParcelReader.createString(parcel, header18);
                            break;
                        case 6:
                            strCreateString46 = SafeParcelReader.createString(parcel, header18);
                            break;
                        case 7:
                            strCreateString47 = SafeParcelReader.createString(parcel, header18);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header18);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader18);
                return new C3382sQ(strCreateString42, strCreateString43, strCreateString44, zzajbVar, strCreateString45, strCreateString46, strCreateString47);
            case 19:
                int iValidateObjectHeader19 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString48 = null;
                String strCreateString49 = null;
                String strCreateString50 = null;
                String strCreateString51 = null;
                boolean z8 = false;
                while (parcel.dataPosition() < iValidateObjectHeader19) {
                    int header19 = SafeParcelReader.readHeader(parcel);
                    int fieldId11 = SafeParcelReader.getFieldId(header19);
                    if (fieldId11 == 1) {
                        strCreateString48 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId11 == 2) {
                        strCreateString49 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId11 == 3) {
                        strCreateString50 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId11 == 4) {
                        strCreateString51 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId11 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header19);
                    } else {
                        z8 = SafeParcelReader.readBoolean(parcel, header19);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader19);
                return new C0428Yh(strCreateString48, strCreateString49, strCreateString50, strCreateString51, z8);
            case 20:
                int iValidateObjectHeader20 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString52 = null;
                while (parcel.dataPosition() < iValidateObjectHeader20) {
                    int header20 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header20) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header20);
                    } else {
                        strCreateString52 = SafeParcelReader.createString(parcel, header20);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader20);
                return new C0022Aj(strCreateString52);
            case 21:
                int iValidateObjectHeader21 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString53 = null;
                boolean z9 = false;
                String strCreateString54 = null;
                while (parcel.dataPosition() < iValidateObjectHeader21) {
                    int header21 = SafeParcelReader.readHeader(parcel);
                    int fieldId12 = SafeParcelReader.getFieldId(header21);
                    if (fieldId12 == 1) {
                        strCreateString53 = SafeParcelReader.createString(parcel, header21);
                    } else if (fieldId12 == 2) {
                        strCreateString54 = SafeParcelReader.createString(parcel, header21);
                    } else if (fieldId12 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header21);
                    } else {
                        z9 = SafeParcelReader.readBoolean(parcel, header21);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader21);
                return new C3165oR(strCreateString53, strCreateString54, z9);
            default:
                int iValidateObjectHeader22 = SafeParcelReader.validateObjectHeader(parcel);
                BP bp4 = null;
                C3165oR c3165oR = null;
                C3382sQ c3382sQ3 = null;
                while (parcel.dataPosition() < iValidateObjectHeader22) {
                    int header22 = SafeParcelReader.readHeader(parcel);
                    int fieldId13 = SafeParcelReader.getFieldId(header22);
                    if (fieldId13 == 1) {
                        bp4 = (BP) SafeParcelReader.createParcelable(parcel, header22, BP.CREATOR);
                    } else if (fieldId13 == 2) {
                        c3165oR = (C3165oR) SafeParcelReader.createParcelable(parcel, header22, C3165oR.CREATOR);
                    } else if (fieldId13 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header22);
                    } else {
                        c3382sQ3 = (C3382sQ) SafeParcelReader.createParcelable(parcel, header22, C3382sQ.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader22);
                C3220pR c3220pR = new C3220pR();
                c3220pR.a = bp4;
                c3220pR.b = c3165oR;
                c3220pR.c = c3382sQ3;
                return c3220pR;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WrappedParcelable[i];
            case 1:
                return new C3302r0[i];
            case 2:
                return new C3489uP[i];
            case 3:
                return new BP[i];
            case 4:
                return new EP[i];
            case 5:
                return new C0553bo[i];
            case 6:
                return new C2687fo[i];
            case 7:
                return new HP[i];
            case 8:
                return new FP[i];
            case 9:
                return new Py[i];
            case 10:
                return new GP[i];
            case 11:
                return new Ty[i];
            case 12:
                return new Yy[i];
            case 13:
                return new HJ[i];
            case 14:
                return new C2830iK[i];
            case 15:
                return new ZK[i];
            case 16:
                return new SP[i];
            case 17:
                return new Qy[i];
            case 18:
                return new C3382sQ[i];
            case 19:
                return new C0428Yh[i];
            case 20:
                return new C0022Aj[i];
            case 21:
                return new C3165oR[i];
            default:
                return new C3220pR[i];
        }
    }
}
