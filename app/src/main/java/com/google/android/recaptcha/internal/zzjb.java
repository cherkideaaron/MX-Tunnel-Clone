package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.Ht;
import defpackage.Jy;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzjb {
    @NotNull
    public static final Map zza() {
        Jy[] jyArr = {new Jy(-4, zzba.zzo), new Jy(-12, zzba.zzp), new Jy(-6, zzba.zzk), new Jy(-11, zzba.zzm), new Jy(-13, zzba.zzq), new Jy(-14, zzba.zzr), new Jy(-2, zzba.zzl), new Jy(-7, zzba.zzs), new Jy(-5, zzba.zzt), new Jy(-9, zzba.zzu), new Jy(-8, zzba.zzE), new Jy(-15, zzba.zzn), new Jy(-1, zzba.zzv), new Jy(-3, zzba.zzx), new Jy(-10, zzba.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ht.U(15));
        Ht.X(linkedHashMap, jyArr);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMap.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            linkedHashMap.put(1, zzba.zzA);
            linkedHashMap.put(2, zzba.zzB);
            linkedHashMap.put(0, zzba.zzC);
            linkedHashMap.put(3, zzba.zzD);
        }
        if (i >= 29) {
            linkedHashMap.put(4, zzba.zzz);
        }
        return linkedHashMap;
    }
}
