package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzhkh {
    public static final zzhye zza = zzhye.zza(new byte[0]);

    public static final zzhye zza(int i) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzhye zzb(int i) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
