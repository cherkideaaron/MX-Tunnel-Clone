package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.zza.add(zzbk.ASSIGN);
        this.zza.add(zzbk.CONST);
        this.zza.add(zzbk.CREATE_ARRAY);
        this.zza.add(zzbk.CREATE_OBJECT);
        this.zza.add(zzbk.EXPRESSION_LIST);
        this.zza.add(zzbk.GET);
        this.zza.add(zzbk.GET_INDEX);
        this.zza.add(zzbk.GET_PROPERTY);
        this.zza.add(zzbk.NULL);
        this.zza.add(zzbk.SET_PROPERTY);
        this.zza.add(zzbk.TYPEOF);
        this.zza.add(zzbk.UNDEFINED);
        this.zza.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzao zzaoVarZza;
        zzao zzaoVarZza2;
        String str2;
        int i = 0;
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal != 3) {
            if (iOrdinal != 14) {
                if (iOrdinal == 24) {
                    zzh.zzb(zzbk.EXPRESSION_LIST.name(), 1, list);
                    zzao zzaoVarZza3 = zzao.zzf;
                    while (i < list.size()) {
                        zzaoVarZza3 = zzgVar.zza((zzao) list.get(i));
                        if (zzaoVarZza3 instanceof zzag) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                        i++;
                    }
                    return zzaoVarZza3;
                }
                if (iOrdinal == 33) {
                    zzao zzaoVarZza4 = zzgVar.zza((zzao) Vs.j(zzbk.GET, 1, list, 0));
                    if (zzaoVarZza4 instanceof zzas) {
                        return zzgVar.zzh(zzaoVarZza4.zzc());
                    }
                    throw new IllegalArgumentException(AbstractC3264qG.w("Expected string for get var. got ", zzaoVarZza4.getClass().getCanonicalName()));
                }
                if (iOrdinal == 49) {
                    zzh.zza(zzbk.NULL.name(), 0, list);
                    return zzao.zzg;
                }
                if (iOrdinal == 58) {
                    zzao zzaoVarZza5 = zzgVar.zza((zzao) Vs.j(zzbk.SET_PROPERTY, 3, list, 0));
                    zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(1));
                    zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
                    if (zzaoVarZza5 == zzao.zzf || zzaoVarZza5 == zzao.zzg) {
                        throw new IllegalStateException("Can't set property " + zzaoVarZza6.zzc() + " of " + zzaoVarZza5.zzc());
                    }
                    if ((zzaoVarZza5 instanceof zzae) && (zzaoVarZza6 instanceof zzah)) {
                        ((zzae) zzaoVarZza5).zzn(zzaoVarZza6.zzd().intValue(), zzaoVarZza2);
                    } else if (zzaoVarZza5 instanceof zzak) {
                        ((zzak) zzaoVarZza5).zzm(zzaoVarZza6.zzc(), zzaoVarZza2);
                        return zzaoVarZza2;
                    }
                } else {
                    if (iOrdinal == 17) {
                        if (list.isEmpty()) {
                            return new zzae();
                        }
                        zzae zzaeVar = new zzae();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zzao zzaoVarZza7 = zzgVar.zza((zzao) it.next());
                            if (zzaoVarZza7 instanceof zzag) {
                                throw new IllegalStateException("Failed to evaluate array element");
                            }
                            zzaeVar.zzn(i, zzaoVarZza7);
                            i++;
                        }
                        return zzaeVar;
                    }
                    if (iOrdinal == 18) {
                        if (list.isEmpty()) {
                            return new zzal();
                        }
                        if (list.size() % 2 != 0) {
                            throw new IllegalArgumentException(Vs.k(list.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                        }
                        zzal zzalVar = new zzal();
                        while (i < list.size() - 1) {
                            zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(i));
                            zzao zzaoVarZza9 = zzgVar.zza((zzao) list.get(i + 1));
                            if ((zzaoVarZza8 instanceof zzag) || (zzaoVarZza9 instanceof zzag)) {
                                throw new IllegalStateException("Failed to evaluate map entry");
                            }
                            zzalVar.zzm(zzaoVarZza8.zzc(), zzaoVarZza9);
                            i += 2;
                        }
                        return zzalVar;
                    }
                    if (iOrdinal == 35 || iOrdinal == 36) {
                        zzao zzaoVarZza10 = zzgVar.zza((zzao) Vs.j(zzbk.GET_PROPERTY, 2, list, 0));
                        zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(1));
                        if ((zzaoVarZza10 instanceof zzae) && zzh.zzd(zzaoVarZza11)) {
                            return ((zzae) zzaoVarZza10).zzl(zzaoVarZza11.zzd().intValue());
                        }
                        if (zzaoVarZza10 instanceof zzak) {
                            return ((zzak) zzaoVarZza10).zzk(zzaoVarZza11.zzc());
                        }
                        if (zzaoVarZza10 instanceof zzas) {
                            if ("length".equals(zzaoVarZza11.zzc())) {
                                zzaoVarZza2 = new zzah(Double.valueOf(zzaoVarZza10.zzc().length()));
                            } else if (zzh.zzd(zzaoVarZza11) && zzaoVarZza11.zzd().doubleValue() < zzaoVarZza10.zzc().length()) {
                                zzaoVarZza = new zzas(String.valueOf(zzaoVarZza10.zzc().charAt(zzaoVarZza11.zzd().intValue())));
                            }
                        }
                    } else {
                        switch (iOrdinal) {
                            case 62:
                                zzao zzaoVarZza12 = zzgVar.zza((zzao) Vs.j(zzbk.TYPEOF, 1, list, 0));
                                if (zzaoVarZza12 instanceof zzat) {
                                    str2 = AdError.UNDEFINED_DOMAIN;
                                } else if (zzaoVarZza12 instanceof zzaf) {
                                    str2 = "boolean";
                                } else if (zzaoVarZza12 instanceof zzah) {
                                    str2 = "number";
                                } else if (zzaoVarZza12 instanceof zzas) {
                                    str2 = "string";
                                } else if (zzaoVarZza12 instanceof zzan) {
                                    str2 = "function";
                                } else {
                                    if ((zzaoVarZza12 instanceof zzap) || (zzaoVarZza12 instanceof zzag)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaoVarZza12));
                                    }
                                    str2 = "object";
                                }
                                zzaoVarZza2 = new zzas(str2);
                                break;
                            case 63:
                                zzh.zza(zzbk.UNDEFINED.name(), 0, list);
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                zzh.zzb(zzbk.VAR.name(), 1, list);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    zzao zzaoVarZza13 = zzgVar.zza((zzao) it2.next());
                                    if (!(zzaoVarZza13 instanceof zzas)) {
                                        throw new IllegalArgumentException(AbstractC3264qG.w("Expected string for var name. got ", zzaoVarZza13.getClass().getCanonicalName()));
                                    }
                                    zzgVar.zzf(zzaoVarZza13.zzc(), zzao.zzf);
                                }
                                break;
                            default:
                                return zzb(str);
                        }
                    }
                }
                return zzaoVarZza2;
            }
            zzh.zzb(zzbk.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(Vs.k(list.size(), "CONST requires an even number of arguments, found "));
            }
            while (i < list.size() - 1) {
                zzao zzaoVarZza14 = zzgVar.zza((zzao) list.get(i));
                if (!(zzaoVarZza14 instanceof zzas)) {
                    throw new IllegalArgumentException(AbstractC3264qG.w("Expected string for const name. got ", zzaoVarZza14.getClass().getCanonicalName()));
                }
                zzgVar.zzg(zzaoVarZza14.zzc(), zzgVar.zza((zzao) list.get(i + 1)));
                i += 2;
            }
            return zzao.zzf;
        }
        zzao zzaoVarZza15 = zzgVar.zza((zzao) Vs.j(zzbk.ASSIGN, 2, list, 0));
        if (!(zzaoVarZza15 instanceof zzas)) {
            throw new IllegalArgumentException(AbstractC3264qG.w("Expected string for assign var. got ", zzaoVarZza15.getClass().getCanonicalName()));
        }
        if (!zzgVar.zzd(zzaoVarZza15.zzc())) {
            throw new IllegalArgumentException(AbstractC3264qG.w("Attempting to assign undefined value ", zzaoVarZza15.zzc()));
        }
        zzaoVarZza = zzgVar.zza((zzao) list.get(1));
        zzgVar.zze(zzaoVarZza15.zzc(), zzaoVarZza);
        return zzaoVarZza;
    }
}
