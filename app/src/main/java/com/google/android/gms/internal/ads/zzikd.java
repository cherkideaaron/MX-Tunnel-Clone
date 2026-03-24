package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzikd {
    public static List zza(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    public static HashSet zzb(int i) {
        return new HashSet(zzd(i));
    }

    public static LinkedHashMap zzc(int i) {
        return new LinkedHashMap(zzd(i));
    }

    private static int zzd(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
