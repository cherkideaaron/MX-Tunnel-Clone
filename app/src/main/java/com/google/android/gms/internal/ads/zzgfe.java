package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzgfe {
    private MessageDigest zza;
    private final zzgoe zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgfe(zzgoe zzgoeVar) {
        this.zzb = zzgoeVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgoc zzgocVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (NoSuchAlgorithmException e) {
                    zzgocVarZza.zzb(e);
                }
                zzgocVarZza.zzc();
            } catch (Throwable th) {
                zzgocVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzgrc.zza(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzgfh[] zzgfhVarArr = new zzgfu().zzcK;
        int length2 = zzgfhVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzgfhVarArr[i3].zza(bArrArray, bArr3);
        }
        if (!zzgrt.zzc(str)) {
            new zzgfg(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzaxw zzf(byte[] bArr, String str) {
        zzaxw zzaxwVarZza = zzaxx.zza();
        byte[] bArrZze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zzaxwVarZza.zzb(zzian.zzs(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzaxwVarZza.zza(zzian.zzs(zzd((byte[]) it.next(), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
        }
        return zzaxwVarZza;
    }

    public final String zzg(int i, String str) {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzl(i);
        return Base64.encodeToString(zzd(((zzaxg) zzawgVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
