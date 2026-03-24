package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC3219pQ;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzian implements Iterable<Byte>, Serializable {
    public static final zzian zza = new zzial(zzice.zzb);
    private int zzb = 0;

    static {
        int i = zziaa.zza;
    }

    public static zziam zzA() {
        return new zziam(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    public static void zzB(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(Vs.n(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length()), "Index > length: ", i, ", ", i2));
        }
    }

    public static int zzC(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC3219pQ.e(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(Vs.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), "Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(Vs.n(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), "End index: ", i2, " >= ", i3));
    }

    public static /* synthetic */ boolean zzD(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzC(i, i4, bArr.length);
        zzC(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private static zzian zzk(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(Vs.l(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzian) it.next();
        }
        int i2 = i >>> 1;
        zzian zzianVarZzk = zzk(it, i2);
        zzian zzianVarZzk2 = zzk(it, i - i2);
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzianVarZzk.zzc() >= zzianVarZzk2.zzc()) {
            return zzidt.zzk(zzianVarZzk, zzianVarZzk2);
        }
        int iZzc = zzianVarZzk.zzc();
        int iZzc2 = zzianVarZzk2.zzc();
        throw new IllegalArgumentException(Vs.n(new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length()), "ByteString would be too long: ", iZzc, "+", iZzc2));
    }

    public static zzian zzs(byte[] bArr, int i, int i2) {
        try {
            return zzt(bArr, i, i2, false);
        } catch (zzicg e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzian zzt(byte[] bArr, int i, int i2, boolean z) {
        zzC(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzial(bArr2);
    }

    public static zzian zzu(byte[] bArr) {
        try {
            return new zzial(bArr);
        } catch (zzicg e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzian zzv(String str) {
        return new zzial(str.getBytes(zzice.zza));
    }

    public static zzian zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzian)) {
            return false;
        }
        zzian zzianVar = (zzian) obj;
        int iZzc = zzc();
        if (iZzc != zzianVar.zzc()) {
            return false;
        }
        if (iZzc == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzianVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzj(zzianVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzc = zzc();
            iZzl = zzl(iZzc, 0, iZzc);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzc = zzc();
        String strZza = zzc() <= 50 ? zzied.zza(this) : zzied.zza(zzd(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzc);
        sb.append(" contents=\"");
        return AbstractC3264qG.l(sb, strZza, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzian zzd(int i, int i2);

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zziae zziaeVar);

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzian zzianVar);

    public abstract int zzl(int i, int i2, int i3);

    public abstract zziaq zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zziai iterator() {
        return new zziaf(this);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i, int i2, int i3) {
        zzC(0, i3, zzc());
        zzC(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzy() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzice.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzz() {
        return zzc() == 0 ? "" : zzh(zzice.zza);
    }
}
