package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.C3382sQ;
import defpackage.HP;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzahk {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzaia zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private C3382sQ zzk;
    private List<zzahy> zzl;
    private zzah<HP> zzm;

    public zzahk() {
        this.zzf = new zzaia();
        this.zzm = zzah.zzg();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzah<HP> zzd() {
        return this.zzm;
    }

    public final C3382sQ zze() {
        return this.zzk;
    }

    public final zzaia zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzahy> zzk() {
        return this.zzl;
    }

    public final List<zzaib> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public zzahk(String str, String str2, boolean z, String str3, String str4, zzaia zzaiaVar, String str5, String str6, long j, long j2, boolean z2, C3382sQ c3382sQ, List<zzahy> list, zzah<HP> zzahVar) {
        zzaia zzaiaVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzaiaVar == null) {
            zzaiaVar2 = new zzaia();
        } else {
            List<zzaib> listZza = zzaiaVar.zza();
            zzaia zzaiaVar3 = new zzaia();
            if (listZza != null) {
                zzaiaVar3.zza().addAll(listZza);
            }
            zzaiaVar2 = zzaiaVar3;
        }
        this.zzf = zzaiaVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzahVar;
    }

    public final zzahk zza(zzah<HP> zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        this.zzm = zzahVar;
        return this;
    }

    public final zzahk zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahk zzc(String str) {
        this.zze = str;
        return this;
    }

    public final zzahk zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahk zza(List<zzaib> list) {
        Preconditions.checkNotNull(list);
        zzaia zzaiaVar = new zzaia();
        this.zzf = zzaiaVar;
        zzaiaVar.zza().addAll(list);
        return this;
    }

    public final zzahk zza(C3382sQ c3382sQ) {
        this.zzk = c3382sQ;
        return this;
    }

    public final zzahk zza(boolean z) {
        this.zzj = z;
        return this;
    }
}
