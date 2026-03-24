package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3383sa;
import defpackage.AbstractC3481uH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzfu {

    @Nullable
    private Set zza;

    @Nullable
    private Set zzb;

    @Nullable
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List listI;
        AbstractC0500aq.m(str, "<this>");
        String strValueOf = String.valueOf(new char[]{'.'}[0]);
        int iE0 = AbstractC3481uH.e0(str, strValueOf, 0, false);
        if (iE0 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iE0).toString());
                length = strValueOf.length() + iE0;
                iE0 = AbstractC3481uH.e0(str, strValueOf, length, false);
            } while (iE0 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            listI = arrayList;
        } else {
            listI = AbstractC0115Ga.I(str.toString());
        }
        Iterator it = listI.iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(@NotNull zzrv zzrvVar) {
        this.zza = AbstractC3383sa.l0(zzrvVar.zzf().zzi());
        this.zzb = AbstractC3383sa.l0(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(@NotNull String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        AbstractC0500aq.k(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
