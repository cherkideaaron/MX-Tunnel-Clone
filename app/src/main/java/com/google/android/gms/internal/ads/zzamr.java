package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(iZzt, iZzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i2 = 8;
        int iZzj5 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzj6 = zzeqVar.zzj(i2);
            int iZzj7 = zzeqVar.zzj(i2);
            int[] iArr = (iZzj7 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeqVar.zzj(i2);
                iZzj4 = zzeqVar.zzj(i2);
                iZzj = zzeqVar.zzj(i2);
                iZzj2 = zzeqVar.zzj(i2);
                i3 -= 6;
            } else {
                int iZzj8 = zzeqVar.zzj(6) << 2;
                int iZzj9 = zzeqVar.zzj(4) << 4;
                i3 -= 4;
                iZzj = zzeqVar.zzj(4) << 4;
                iZzj2 = zzeqVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d = iZzj3;
            String str = zzfj.zza;
            double d2 = iZzj4 - 128;
            double d3 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            iZzj5 = iZzj5;
            i2 = 8;
        }
        return new zzamj(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int iZzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int iZzj2 = zzeqVar.zzj(2);
        boolean zZzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeqVar.zzj(16);
                int iZzj4 = zzeqVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeqVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeqVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzaml(iZzj, zZzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaml(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, DefaultRenderer.BACKGROUND_COLOR, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0220 A[LOOP:3: B:88:0x016a->B:119:0x0220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i, int i2, zzeq zzeqVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzeqVar.zzj(i2);
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzalx zzalxVar;
        char c;
        char c2;
        char c3;
        int i3;
        zzamq zzamqVar;
        zzamk zzamkVar;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        zzamo zzamoVar;
        int i7;
        int i8;
        SparseArray sparseArray;
        int i9;
        zzamo zzamoVar2;
        int i10;
        int iZzj;
        int iZzj2;
        zzamj zzamjVar;
        zzamo zzamoVar3;
        zzaml zzamlVar;
        int iZzj3;
        int iZzj4;
        int i11;
        int iZzj5;
        zzeq zzeqVar = new zzeq(bArr, i + i2);
        zzeqVar.zzf(i);
        while (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
            zzamq zzamqVar2 = this.zzi;
            int iZzj6 = zzeqVar.zzj(8);
            int iZzj7 = zzeqVar.zzj(16);
            int iZzj8 = zzeqVar.zzj(16);
            int iZze = zzeqVar.zze() + iZzj8;
            if (iZzj8 * 8 > zzeqVar.zzc()) {
                zzee.zzc("DvbParser", "Data field length exceeds limit");
                zzeqVar.zzh(zzeqVar.zzc());
            } else {
                switch (iZzj6) {
                    case 16:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzamm zzammVar = zzamqVar2.zzi;
                            int iZzj9 = zzeqVar.zzj(8);
                            int iZzj10 = zzeqVar.zzj(4);
                            int iZzj11 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            SparseArray sparseArray2 = new SparseArray();
                            for (int i12 = iZzj8 - 2; i12 > 0; i12 -= 6) {
                                int iZzj12 = zzeqVar.zzj(8);
                                zzeqVar.zzh(8);
                                sparseArray2.put(iZzj12, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                            }
                            zzamm zzammVar2 = new zzamm(iZzj9, iZzj10, iZzj11, sparseArray2);
                            if (zzammVar2.zzb != 0) {
                                zzamqVar2.zzi = zzammVar2;
                                zzamqVar2.zzc.clear();
                                zzamqVar2.zzd.clear();
                                zzamqVar2.zze.clear();
                                break;
                            } else if (zzammVar != null) {
                                if (zzammVar.zza != zzammVar2.zza) {
                                    zzamqVar2.zzi = zzammVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzamm zzammVar3 = zzamqVar2.zzi;
                        if (iZzj7 == zzamqVar2.zza && zzammVar3 != null) {
                            int iZzj13 = zzeqVar.zzj(8);
                            zzeqVar.zzh(4);
                            boolean zZzi = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int iZzj14 = zzeqVar.zzj(16);
                            int iZzj15 = zzeqVar.zzj(16);
                            int iZzj16 = zzeqVar.zzj(3);
                            int iZzj17 = zzeqVar.zzj(3);
                            zzeqVar.zzh(2);
                            int iZzj18 = zzeqVar.zzj(8);
                            int iZzj19 = zzeqVar.zzj(8);
                            int iZzj20 = zzeqVar.zzj(4);
                            int iZzj21 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            int i13 = iZzj8 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i13 > 0) {
                                int iZzj22 = zzeqVar.zzj(16);
                                int iZzj23 = zzeqVar.zzj(2);
                                int iZzj24 = zzeqVar.zzj(2);
                                int iZzj25 = zzeqVar.zzj(12);
                                zzeqVar.zzh(4);
                                int iZzj26 = zzeqVar.zzj(12);
                                int i14 = i13 - 6;
                                if (iZzj23 == 1) {
                                    i13 -= 8;
                                    i10 = iZzj23;
                                    iZzj = zzeqVar.zzj(8);
                                    iZzj2 = zzeqVar.zzj(8);
                                } else if (iZzj23 == 2) {
                                    iZzj23 = 2;
                                    i13 -= 8;
                                    i10 = iZzj23;
                                    iZzj = zzeqVar.zzj(8);
                                    iZzj2 = zzeqVar.zzj(8);
                                } else {
                                    i10 = iZzj23;
                                    i13 = i14;
                                    iZzj = 0;
                                    iZzj2 = 0;
                                }
                                sparseArray3.put(iZzj22, new zzamp(i10, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                            }
                            zzamo zzamoVar4 = new zzamo(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray3);
                            if (zzammVar3.zzb == 0 && (zzamoVar2 = (zzamo) zzamqVar2.zzc.get(zzamoVar4.zza)) != null) {
                                int i15 = 0;
                                while (true) {
                                    SparseArray sparseArray4 = zzamoVar2.zzj;
                                    if (i15 < sparseArray4.size()) {
                                        zzamoVar4.zzj.put(sparseArray4.keyAt(i15), (zzamp) sparseArray4.valueAt(i15));
                                        i15++;
                                    }
                                }
                            }
                            sparseArray = zzamqVar2.zzc;
                            i9 = zzamoVar4.zza;
                            zzamoVar3 = zzamoVar4;
                            sparseArray.put(i9, zzamoVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzamj zzamjVarZzb = zzb(zzeqVar, iZzj8);
                            sparseArray = zzamqVar2.zzd;
                            zzamjVar = zzamjVarZzb;
                        } else if (iZzj7 == zzamqVar2.zzb) {
                            zzamj zzamjVarZzb2 = zzb(zzeqVar, iZzj8);
                            sparseArray = zzamqVar2.zzf;
                            zzamjVar = zzamjVarZzb2;
                        }
                        i9 = zzamjVar.zza;
                        zzamoVar3 = zzamjVar;
                        sparseArray.put(i9, zzamoVar3);
                        break;
                    case 19:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzaml zzamlVarZzc = zzc(zzeqVar);
                            sparseArray = zzamqVar2.zze;
                            zzamlVar = zzamlVarZzc;
                        } else if (iZzj7 == zzamqVar2.zzb) {
                            zzaml zzamlVarZzc2 = zzc(zzeqVar);
                            sparseArray = zzamqVar2.zzg;
                            zzamlVar = zzamlVarZzc2;
                        }
                        i9 = zzamlVar.zza;
                        zzamoVar3 = zzamlVar;
                        sparseArray.put(i9, zzamoVar3);
                        break;
                    case 20:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzeqVar.zzh(4);
                            boolean zZzi2 = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int iZzj27 = zzeqVar.zzj(16);
                            int iZzj28 = zzeqVar.zzj(16);
                            if (zZzi2) {
                                int iZzj29 = zzeqVar.zzj(16);
                                iZzj3 = zzeqVar.zzj(16);
                                iZzj5 = zzeqVar.zzj(16);
                                iZzj4 = zzeqVar.zzj(16);
                                i11 = iZzj29;
                            } else {
                                iZzj3 = iZzj27;
                                iZzj4 = iZzj28;
                                i11 = 0;
                                iZzj5 = 0;
                            }
                            zzamqVar2.zzh = new zzamk(iZzj27, iZzj28, i11, iZzj3, iZzj5, iZzj4);
                            break;
                        }
                        break;
                }
                zzeqVar.zzo(iZze - zzeqVar.zze());
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar2 = zzamqVar3.zzh;
            if (zzamkVar2 == null) {
                zzamkVar2 = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar2.zza + 1 != bitmap.getWidth() || zzamkVar2.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamkVar2.zza + 1, zzamkVar2.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = zzammVar4.zzc;
            int i16 = 0;
            while (i16 < sparseArray5.size()) {
                Canvas canvas = this.zzf;
                canvas.save();
                zzamn zzamnVar = (zzamn) sparseArray5.valueAt(i16);
                zzamo zzamoVar5 = (zzamo) zzamqVar3.zzc.get(sparseArray5.keyAt(i16));
                int i17 = zzamnVar.zza + zzamkVar2.zzc;
                int i18 = zzamnVar.zzb + zzamkVar2.zze;
                int i19 = zzamoVar5.zzc;
                int i20 = i17 + i19;
                int iMin = Math.min(i20, zzamkVar2.zzd);
                int i21 = zzamoVar5.zzd;
                int i22 = i18 + i21;
                canvas.clipRect(i17, i18, iMin, Math.min(i22, zzamkVar2.zzf));
                int i23 = zzamoVar5.zzf;
                zzamj zzamjVar2 = (zzamj) zzamqVar3.zzd.get(i23);
                if (zzamjVar2 == null && (zzamjVar2 = (zzamj) zzamqVar3.zzf.get(i23)) == null) {
                    zzamjVar2 = this.zzh;
                }
                SparseArray sparseArray6 = zzamoVar5.zzj;
                SparseArray sparseArray7 = sparseArray5;
                int i24 = i20;
                int i25 = 0;
                while (i25 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i25);
                    SparseArray sparseArray8 = sparseArray6;
                    zzamp zzampVar = (zzamp) sparseArray6.valueAt(i25);
                    int i26 = i19;
                    zzaml zzamlVar2 = (zzaml) zzamqVar3.zze.get(iKeyAt);
                    if (zzamlVar2 == null) {
                        zzamlVar2 = (zzaml) zzamqVar3.zzg.get(iKeyAt);
                    }
                    if (zzamlVar2 != null) {
                        Paint paint = zzamlVar2.zzb ? null : this.zzd;
                        int i27 = zzamoVar5.zze;
                        zzamqVar = zzamqVar3;
                        int i28 = zzampVar.zza + i17;
                        int i29 = zzampVar.zzb + i18;
                        int i30 = i17;
                        int[] iArr = i27 == 3 ? zzamjVar2.zzd : i27 == 2 ? zzamjVar2.zzc : zzamjVar2.zzb;
                        i5 = i16;
                        i7 = i24;
                        arrayList = arrayList2;
                        zzamkVar = zzamkVar2;
                        i8 = i26;
                        i6 = i30;
                        i4 = i21;
                        zzamoVar = zzamoVar5;
                        zzh(zzamlVar2.zzc, iArr, i27, i28, i29, paint, canvas);
                        zzh(zzamlVar2.zzd, iArr, i27, i28, i29 + 1, paint, canvas);
                    } else {
                        zzamqVar = zzamqVar3;
                        zzamkVar = zzamkVar2;
                        i4 = i21;
                        i5 = i16;
                        arrayList = arrayList2;
                        i6 = i17;
                        zzamoVar = zzamoVar5;
                        i7 = i24;
                        i8 = i26;
                    }
                    i25++;
                    i17 = i6;
                    zzamoVar5 = zzamoVar;
                    i24 = i7;
                    sparseArray6 = sparseArray8;
                    zzamqVar3 = zzamqVar;
                    i16 = i5;
                    arrayList2 = arrayList;
                    zzamkVar2 = zzamkVar;
                    i21 = i4;
                    i19 = i8;
                }
                zzamq zzamqVar4 = zzamqVar3;
                zzamk zzamkVar3 = zzamkVar2;
                int i31 = i21;
                int i32 = i16;
                ArrayList arrayList3 = arrayList2;
                int i33 = i19;
                int i34 = i17;
                zzamo zzamoVar6 = zzamoVar5;
                int i35 = i24;
                float f = i18;
                float f2 = i34;
                if (zzamoVar6.zzb) {
                    int i36 = zzamoVar6.zze;
                    if (i36 == 3) {
                        i3 = zzamjVar2.zzd[zzamoVar6.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i36 == 2 ? zzamjVar2.zzc[zzamoVar6.zzh] : zzamjVar2.zzb[zzamoVar6.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i22;
                    float f4 = i35;
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(f2, f, f4, f3, paint2);
                } else {
                    c = 2;
                    c2 = 3;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i34, i18, i33, i31));
                zzamkVar2 = zzamkVar3;
                float f5 = zzamkVar2.zza;
                zzcwVar.zzi(f2 / f5);
                zzcwVar.zzj(0);
                float f6 = zzamkVar2.zzb;
                zzcwVar.zzf(f / f6, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i33 / f5);
                zzcwVar.zzn(i31 / f6);
                arrayList3.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                sparseArray5 = sparseArray7;
                arrayList2 = arrayList3;
                i16 = i32 + 1;
                zzamqVar3 = zzamqVar4;
            }
            zzalxVar = new zzalx(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
