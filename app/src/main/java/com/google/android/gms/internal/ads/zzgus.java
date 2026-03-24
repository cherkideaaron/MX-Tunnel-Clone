package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public class zzgus<K, V> extends zzgun<K, V> implements zzgvn<K, V> {
    private final transient zzgup<V> emptySet;
    private transient zzgup zza;

    public zzgus(zzgui zzguiVar, int i, Comparator comparator) {
        super(zzguiVar, i);
        this.emptySet = zzgwg.zza;
    }

    public final zzgup zza() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgur zzgurVar = new zzgur(this);
        this.zza = zzgurVar;
        return zzgurVar;
    }
}
