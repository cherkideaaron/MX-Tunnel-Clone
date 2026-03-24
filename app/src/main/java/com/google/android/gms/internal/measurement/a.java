package com.google.android.gms.internal.measurement;

import defpackage.AbstractC3264qG;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static zzao a(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(AbstractC3264qG.g(zzaoVar.zzc(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
            throw new IllegalArgumentException(AbstractC3264qG.w("Object has no function ", zzaoVar.zzc()));
        }
        zzh.zza("hasOwnProperty", 1, list);
        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
    }

    public static Iterator b(Map map) {
        return new zzaj(map.keySet().iterator());
    }
}
