package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaoq {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
    private boolean zze;
    private int zzf;

    public zzaoq(int i) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.zzf
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L45
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L3f
            if (r0 == r5) goto L37
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L4d
        L1a:
            int r9 = r8.zza
            int r9 = r9 - r10
            r8.zza = r9
            r8.zze = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L2f
        L28:
            com.google.android.gms.internal.ads.zzee.zzc(r7, r6)
            r8.zza()
            goto L4d
        L2f:
            int r9 = r8.zza
            r8.zzb = r9
            r9 = 4
            r8.zzf = r9
            goto L4d
        L37:
            r10 = 31
            if (r9 <= r10) goto L3c
            goto L28
        L3c:
            r8.zzf = r2
            goto L4d
        L3f:
            if (r9 == r4) goto L42
            goto L28
        L42:
            r8.zzf = r5
            goto L4d
        L45:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L4d
            r8.zzf = r3
            r8.zze = r3
        L4d:
            byte[] r9 = com.google.android.gms.internal.ads.zzaoq.zzd
            r8.zzc(r9, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoq.zzb(int, int):boolean");
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        if (this.zze) {
            int i3 = i2 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i4 = this.zza + i3;
            if (length < i4) {
                this.zzc = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.zzc, this.zza, i3);
            this.zza += i3;
        }
    }
}
