package com.google.android.gms.internal.measurement;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.Vs;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.zza.add(zzbk.FOR_IN);
        this.zza.add(zzbk.FOR_IN_CONST);
        this.zza.add(zzbk.FOR_IN_LET);
        this.zza.add(zzbk.FOR_LET);
        this.zza.add(zzbk.FOR_OF);
        this.zza.add(zzbk.FOR_OF_CONST);
        this.zza.add(zzbk.FOR_OF_LET);
        this.zza.add(zzbk.WHILE);
    }

    private static zzao zzc(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        return zze(zzbeVar, zzaoVar.zzf(), zzaoVar2);
    }

    private static zzao zzd(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return zze(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static zzao zze(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVarZzb = zzbeVar.zza((zzao) it.next()).zzb((zzae) zzaoVar);
                if (zzaoVarZzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarZzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzag zzagVar;
        zzao zzaoVarZza;
        zzao zzaoVarZza2;
        zzbe zzbfVar;
        zzao zzaoVarZza3;
        zzao zzaoVarZza4;
        zzbe zzbfVar2;
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal != 65) {
            switch (iOrdinal) {
                case 26:
                    if (!(Vs.j(zzbk.FOR_IN, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    }
                    String strZzc = ((zzao) list.get(0)).zzc();
                    zzaoVarZza = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar = new zzbf(zzgVar, strZzc);
                    return zzc(zzbfVar, zzaoVarZza, zzaoVarZza2);
                case 27:
                    if (!(Vs.j(zzbk.FOR_IN_CONST, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    }
                    String strZzc2 = ((zzao) list.get(0)).zzc();
                    zzaoVarZza = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar = new zzbc(zzgVar, strZzc2);
                    return zzc(zzbfVar, zzaoVarZza, zzaoVarZza2);
                case 28:
                    if (!(Vs.j(zzbk.FOR_IN_LET, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    }
                    String strZzc3 = ((zzao) list.get(0)).zzc();
                    zzaoVarZza = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar = new zzbd(zzgVar, strZzc3);
                    return zzc(zzbfVar, zzaoVarZza, zzaoVarZza2);
                case 29:
                    zzao zzaoVarZza5 = zzgVar.zza((zzao) Vs.j(zzbk.FOR_LET, 4, list, 0));
                    if (!(zzaoVarZza5 instanceof zzae)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    }
                    zzae zzaeVar = (zzae) zzaoVarZza5;
                    zzao zzaoVar = (zzao) list.get(1);
                    zzao zzaoVar2 = (zzao) list.get(2);
                    zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(3));
                    zzg zzgVarZzc = zzgVar.zzc();
                    for (int i = 0; i < zzaeVar.zzh(); i++) {
                        String strZzc4 = zzaeVar.zzl(i).zzc();
                        zzgVarZzc.zze(strZzc4, zzgVar.zzh(strZzc4));
                    }
                    while (zzgVar.zza(zzaoVar).zze().booleanValue()) {
                        zzao zzaoVarZzb = zzgVar.zzb((zzae) zzaoVarZza6);
                        if (zzaoVarZzb instanceof zzag) {
                            zzag zzagVar2 = (zzag) zzaoVarZzb;
                            if ("break".equals(zzagVar2.zzg())) {
                                break;
                            } else if ("return".equals(zzagVar2.zzg())) {
                                return zzagVar2;
                            }
                        }
                        zzg zzgVarZzc2 = zzgVar.zzc();
                        for (int i2 = 0; i2 < zzaeVar.zzh(); i2++) {
                            String strZzc5 = zzaeVar.zzl(i2).zzc();
                            zzgVarZzc2.zze(strZzc5, zzgVarZzc.zzh(strZzc5));
                        }
                        zzgVarZzc2.zza(zzaoVar2);
                        zzgVarZzc = zzgVarZzc2;
                    }
                    break;
                case 30:
                    if (!(Vs.j(zzbk.FOR_OF, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    }
                    String strZzc6 = ((zzao) list.get(0)).zzc();
                    zzaoVarZza3 = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza4 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar2 = new zzbf(zzgVar, strZzc6);
                    return zzd(zzbfVar2, zzaoVarZza3, zzaoVarZza4);
                case 31:
                    if (!(Vs.j(zzbk.FOR_OF_CONST, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    }
                    String strZzc7 = ((zzao) list.get(0)).zzc();
                    zzaoVarZza3 = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza4 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar2 = new zzbc(zzgVar, strZzc7);
                    return zzd(zzbfVar2, zzaoVarZza3, zzaoVarZza4);
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    if (!(Vs.j(zzbk.FOR_OF_LET, 3, list, 0) instanceof zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    }
                    String strZzc8 = ((zzao) list.get(0)).zzc();
                    zzaoVarZza3 = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza4 = zzgVar.zza((zzao) list.get(2));
                    zzbfVar2 = new zzbd(zzgVar, strZzc8);
                    return zzd(zzbfVar2, zzaoVarZza3, zzaoVarZza4);
                default:
                    return zzb(str);
            }
        } else {
            zzao zzaoVar3 = (zzao) Vs.j(zzbk.WHILE, 4, list, 0);
            zzao zzaoVar4 = (zzao) list.get(1);
            zzao zzaoVar5 = (zzao) list.get(2);
            zzao zzaoVarZza7 = zzgVar.zza((zzao) list.get(3));
            if (zzgVar.zza(zzaoVar5).zze().booleanValue()) {
                zzao zzaoVarZzb2 = zzgVar.zzb((zzae) zzaoVarZza7);
                if (zzaoVarZzb2 instanceof zzag) {
                    zzagVar = (zzag) zzaoVarZzb2;
                    if (!"break".equals(zzagVar.zzg())) {
                        if (!"return".equals(zzagVar.zzg())) {
                        }
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zza(zzaoVar3).zze().booleanValue()) {
                zzao zzaoVarZzb3 = zzgVar.zzb((zzae) zzaoVarZza7);
                if (zzaoVarZzb3 instanceof zzag) {
                    zzagVar = (zzag) zzaoVarZzb3;
                    if ("break".equals(zzagVar.zzg())) {
                        break;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
                zzgVar.zza(zzaoVar4);
            }
        }
        return zzao.zzf;
    }
}
