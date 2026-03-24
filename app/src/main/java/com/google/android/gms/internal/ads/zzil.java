package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzil {
    public static final zzil zza = new zzik().zzg();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzil) {
            return this.zzb.equals(((zzil) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final Set zza() {
        return this.zzb.keySet();
    }

    public final void zzb(MediaFormat mediaFormat) {
        String str;
        for (Map.Entry entry : this.zzb.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                str = null;
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str2, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str2, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str2, ((Float) value).floatValue());
            } else if (value instanceof String) {
                str = (String) value;
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str2, (ByteBuffer) value);
            }
            mediaFormat.setString(str2, str);
        }
    }

    public final /* synthetic */ Map zzc() {
        return this.zzb;
    }
}
