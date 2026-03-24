package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzas.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzas<K, V> zza(int i, Object[] objArr, zzao<K, V> zzaoVar) {
        int iHighestOneBit;
        short[] sArr;
        char c;
        char c2;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzas) zza;
        }
        Object zzanVar = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzae.zza(obj, obj2);
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i2, objArrCopyOf.length >> 1);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i2 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            c = 1;
            c2 = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            char c3 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i5 * 2;
                    int i8 = i6 * 2;
                    Object obj5 = objArrCopyOf[i7];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i7 ^ i3];
                    Objects.requireNonNull(obj6);
                    zzae.zza(obj5, obj6);
                    int iZza = zzad.zza(obj5.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i8;
                            if (i6 < i5) {
                                objArrCopyOf[i8] = obj5;
                                objArrCopyOf[i8 ^ 1] = obj6;
                            }
                            i6++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj7 = objArrCopyOf[i11];
                                Objects.requireNonNull(obj7);
                                zzanVar = new zzan(obj5, obj6, obj7);
                                objArrCopyOf[i11] = obj6;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    zzanVar = bArr;
                    c2 = 2;
                    c = 1;
                } else {
                    zzanVar = new Object[]{bArr, Integer.valueOf(i6), zzanVar};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i13 * 2;
                        int i15 = i12 * 2;
                        Object obj8 = objArrCopyOf[i14];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i14 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzae.zza(obj8, obj9);
                        int iZza2 = zzad.zza(obj8.hashCode());
                        while (true) {
                            int i16 = iZza2 & i4;
                            int i17 = sArr[i16] & 65535;
                            if (i17 == 65535) {
                                sArr[i16] = (short) i15;
                                if (i12 < i13) {
                                    objArrCopyOf[i15] = obj8;
                                    objArrCopyOf[i15 ^ 1] = obj9;
                                }
                                i12++;
                            } else {
                                if (obj8.equals(objArrCopyOf[i17])) {
                                    int i18 = i17 ^ 1;
                                    Object obj10 = objArrCopyOf[i18];
                                    Objects.requireNonNull(obj10);
                                    zzanVar = new zzan(obj8, obj9, obj10);
                                    objArrCopyOf[i18] = obj9;
                                    break;
                                }
                                iZza2 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        c2 = 2;
                        zzanVar = new Object[]{sArr, Integer.valueOf(i12), zzanVar};
                        c = 1;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i19 * 2;
                        int i22 = i20 * 2;
                        Object obj11 = objArrCopyOf[i21];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i21 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzae.zza(obj11, obj12);
                        int iZza3 = zzad.zza(obj11.hashCode());
                        while (true) {
                            int i23 = iZza3 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i22;
                                if (i20 < i19) {
                                    objArrCopyOf[i22] = obj11;
                                    objArrCopyOf[i22 ^ 1] = obj12;
                                }
                                i20++;
                            } else {
                                if (obj11.equals(objArrCopyOf[r15])) {
                                    int i24 = r15 ^ 1;
                                    Object obj13 = objArrCopyOf[i24];
                                    Objects.requireNonNull(obj13);
                                    zzanVar = new zzan(obj11, obj12, obj13);
                                    objArrCopyOf[i24] = obj12;
                                    break;
                                }
                                iZza3 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        zzanVar = new Object[]{sArr, Integer.valueOf(i20), zzanVar};
                    }
                }
                zzanVar = sArr;
                c2 = 2;
                c = 1;
            }
        }
        boolean z = zzanVar instanceof Object[];
        Object obj14 = zzanVar;
        if (z) {
            Object[] objArr2 = (Object[]) zzanVar;
            zzan zzanVar2 = (zzan) objArr2[c2];
            if (zzaoVar == null) {
                throw zzanVar2.zza();
            }
            zzaoVar.zza = zzanVar2;
            Object obj15 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            obj14 = obj15;
            i2 = iIntValue;
        }
        return new zzas<>(obj14, objArrCopyOf, i2);
    }
}
