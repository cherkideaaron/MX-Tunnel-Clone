package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.Bv;
import defpackage.MQ;
import defpackage.TP;

/* loaded from: classes2.dex */
final class zzaek extends zzaff<String, MQ> {
    private final String zzv;
    private final String zzw;

    public zzaek(String str, String str2) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        char c;
        zzaif zzaifVar = this.zzm;
        if (zzaifVar.zzg()) {
            zzaifVar.zzc();
        } else {
            zzaifVar.zzb();
        }
        zzaifVar.zzb();
        char c2 = 3;
        if (zzaifVar.zzh()) {
            String strZzd = zzaifVar.zzd();
            strZzd.getClass();
            c = 0;
            switch (strZzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c = 6;
                    break;
                case "PASSWORD_RESET":
                    break;
                case "VERIFY_EMAIL":
                    c = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    c = 5;
                    break;
                case "EMAIL_SIGNIN":
                    c = 4;
                    break;
                case "RECOVER_EMAIL":
                    c = 2;
                    break;
                default:
                    c = 3;
                    break;
            }
            if (c != 4 && c != 3) {
                if (zzaifVar.zzf()) {
                    String strZzb = zzaifVar.zzb();
                    Bv bvB = TP.b(zzaifVar.zza());
                    Preconditions.checkNotEmpty(strZzb);
                } else if (zzaifVar.zzg()) {
                    String strZzc = zzaifVar.zzc();
                    String strZzb2 = zzaifVar.zzb();
                    Preconditions.checkNotEmpty(strZzc);
                    Preconditions.checkNotEmpty(strZzb2);
                } else if (zzaifVar.zze()) {
                    Preconditions.checkNotEmpty(zzaifVar.zzb());
                }
            }
            c2 = c;
        }
        if (c2 != 0) {
            zza(new Status(17499));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzd(this.zzv, this.zzw, this.zzb);
    }
}
