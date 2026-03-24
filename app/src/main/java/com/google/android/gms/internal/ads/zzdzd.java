package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdzd {
    public final long zza;
    public final int[] zzb;

    private zzdzd(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzguf zza(JsonReader jsonReader) {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzguf zzgufVarZzi = zzguf.zzi();
            jsonReader.beginObject();
            zzdzd zzdzdVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, FacebookMediationAdapter.KEY_ID)) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzguc zzgucVar2 = new zzguc();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgucVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgufVarZzi = zzgucVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgufVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgufVarZzi.size()];
                for (int i2 = 0; i2 < zzgufVarZzi.size(); i2++) {
                    iArr[i2] = ((Integer) zzgufVarZzi.get(i2)).intValue();
                }
                zzdzdVar = new zzdzd(jLongValue, iArr);
            }
            if (zzdzdVar != null) {
                zzgucVar.zzf(zzdzdVar);
            }
        }
        jsonReader.endArray();
        return zzgucVar.zzi();
    }
}
