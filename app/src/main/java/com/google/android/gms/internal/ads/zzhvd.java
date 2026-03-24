package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class zzhvd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhye zzc;
    private static final zzhkn zzd;
    private static final zzhkk zze;
    private static final zzhji zzf;
    private static final zzhjf zzg;
    private static final zzhji zzh;
    private static final zzhjf zzi;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zzhyeVarZza;
        zzhye zzhyeVarZza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zzhyeVarZza2;
        zzd = zzhkn.zzd(zzhvc.zza, zzhsg.class, zzhlc.class);
        zze = zzhkk.zzd(zzhux.zza, zzhyeVarZza, zzhlc.class);
        zzf = zzhji.zzd(zzhuy.zza, zzhsk.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhuz.zza, zzhyeVarZza2, zzhlb.class);
        zzh = zzhji.zzd(zzhva.zza, zzhsi.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvb.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    public static /* synthetic */ zzhlc zzb(zzhsg zzhsgVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhpd zzhpdVarZzc = zzhpe.zzc();
        zzhpdVarZzc.zza(zzl(zzhsgVar));
        zzhqeVarZze.zzb(((zzhpe) zzhpdVarZzc.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzh(zzhsgVar.zzf()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    public static /* synthetic */ zzhsg zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhpe zzhpeVarZzb = zzhpe.zzb(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhsb zzhsbVarZzb = zzhsg.zzb();
            zzhsbVarZzb.zzc(zzi(zzhpeVarZzb.zza().zza()));
            zzhsbVarZzb.zza(zzo(zzhpeVarZzb.zza().zzh()));
            zzhsbVarZzb.zzb(zzn(zzhpeVarZzb.zza().zzg()));
            zzhsbVarZzb.zzd(zzj(zzhlcVar.zzc().zzc()));
            return zzhsbVarZzb.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhsk zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpk zzhpkVarZze = zzhpk.zze(zzhlbVar.zzb(), zzibb.zza());
            if (zzhpkVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsb zzhsbVarZzb = zzhsg.zzb();
            zzhsbVarZzb.zzc(zzi(zzhpkVarZze.zzb().zza()));
            zzhsbVarZzb.zza(zzo(zzhpkVarZze.zzb().zzh()));
            zzhsbVarZzb.zzb(zzn(zzhpkVarZze.zzb().zzg()));
            zzhsbVarZzb.zzd(zzj(zzhlbVar.zzd()));
            zzhsg zzhsgVarZze = zzhsbVarZzb.zze();
            zzhsj zzhsjVarZzc = zzhsk.zzc();
            zzhsjVarZzc.zza(zzhsgVarZze);
            zzhsjVarZzc.zzb(new ECPoint(new BigInteger(1, zzhpkVarZze.zzc().zzy()), new BigInteger(1, zzhpkVarZze.zzd().zzy())));
            zzhsjVarZzc.zzc(zzhlbVar.zze());
            return zzhsjVarZzc.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzhlb zzf(zzhsi zzhsiVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhsiVar.zzd().zzd());
        zzhph zzhphVarZze = zzhpi.zze();
        zzhphVarZze.zza(zzm(zzhsiVar.zze()));
        byte[] bArrZzb = zzhig.zzb(zzhsiVar.zzf().zzb(zzhbtVar), iZzk);
        zzian zzianVar = zzian.zza;
        zzhphVarZze.zzb(zzian.zzs(bArrZzb, 0, bArrZzb.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhpi) zzhphVarZze.zzbu()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, zzh(zzhsiVar.zzd().zzf()), zzhsiVar.zze().zzb());
    }

    public static /* synthetic */ zzhsi zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpi zzhpiVarZzd = zzhpi.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzhpiVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpk zzhpkVarZzb = zzhpiVarZzd.zzb();
            if (zzhpkVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsb zzhsbVarZzb = zzhsg.zzb();
            zzhsbVarZzb.zzc(zzi(zzhpkVarZzb.zzb().zza()));
            zzhsbVarZzb.zza(zzo(zzhpkVarZzb.zzb().zzh()));
            zzhsbVarZzb.zzb(zzn(zzhpkVarZzb.zzb().zzg()));
            zzhsbVarZzb.zzd(zzj(zzhlbVar.zzd()));
            zzhsg zzhsgVarZze = zzhsbVarZzb.zze();
            zzhsj zzhsjVarZzc = zzhsk.zzc();
            zzhsjVarZzc.zza(zzhsgVarZze);
            zzhsjVarZzc.zzb(new ECPoint(new BigInteger(1, zzhpkVarZzb.zzc().zzy()), new BigInteger(1, zzhpkVarZzb.zzd().zzy())));
            zzhsjVarZzc.zzc(zzhlbVar.zze());
            zzhsk zzhskVarZzd = zzhsjVarZzc.zzd();
            zzhsh zzhshVarZzc = zzhsi.zzc();
            zzhshVarZzc.zza(zzhskVarZzd);
            zzhshVarZzc.zzb(zzhyf.zza(new BigInteger(1, zzhpiVarZzd.zzc().zzy()), zzhbtVar));
            return zzhshVarZzc.zzc();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhqy zzh(zzhsf zzhsfVar) throws GeneralSecurityException {
        if (zzhsf.zza.equals(zzhsfVar)) {
            return zzhqy.TINK;
        }
        if (zzhsf.zzb.equals(zzhsfVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhsf.zzd.equals(zzhsfVar)) {
            return zzhqy.RAW;
        }
        if (zzhsf.zzc.equals(zzhsfVar)) {
            return zzhqy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhsfVar.toString()));
    }

    private static zzhsd zzi(zzhpt zzhptVar) throws GeneralSecurityException {
        int iOrdinal = zzhptVar.ordinal();
        if (iOrdinal == 2) {
            return zzhsd.zzb;
        }
        if (iOrdinal == 3) {
            return zzhsd.zza;
        }
        if (iOrdinal == 4) {
            return zzhsd.zzc;
        }
        int iZza = zzhptVar.zza();
        throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    private static zzhsf zzj(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return zzhsf.zza;
        }
        if (iOrdinal == 2) {
            return zzhsf.zzc;
        }
        if (iOrdinal == 3) {
            return zzhsf.zzd;
        }
        if (iOrdinal == 4) {
            return zzhsf.zzb;
        }
        int iZza = zzhqyVar.zza();
        throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }

    private static int zzk(zzhsc zzhscVar) throws GeneralSecurityException {
        if (zzhsc.zza.equals(zzhscVar)) {
            return 33;
        }
        if (zzhsc.zzb.equals(zzhscVar)) {
            return 49;
        }
        if (zzhsc.zzc.equals(zzhscVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhscVar.toString()));
    }

    private static zzhpg zzl(zzhsg zzhsgVar) throws GeneralSecurityException {
        zzhpt zzhptVar;
        int i;
        zzhpf zzhpfVarZzb = zzhpg.zzb();
        zzhsd zzhsdVarZze = zzhsgVar.zze();
        if (zzhsd.zza.equals(zzhsdVarZze)) {
            zzhptVar = zzhpt.SHA256;
        } else if (zzhsd.zzb.equals(zzhsdVarZze)) {
            zzhptVar = zzhpt.SHA384;
        } else {
            if (!zzhsd.zzc.equals(zzhsdVarZze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhsdVarZze.toString()));
            }
            zzhptVar = zzhpt.SHA512;
        }
        zzhpfVarZzb.zza(zzhptVar);
        zzhsc zzhscVarZzd = zzhsgVar.zzd();
        int i2 = 4;
        if (zzhsc.zza.equals(zzhscVarZzd)) {
            i = 4;
        } else if (zzhsc.zzb.equals(zzhscVarZzd)) {
            i = 5;
        } else {
            if (!zzhsc.zzc.equals(zzhscVarZzd)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhscVarZzd.toString()));
            }
            i = 6;
        }
        zzhpfVarZzb.zzb(i);
        zzhse zzhseVarZzc = zzhsgVar.zzc();
        if (zzhse.zza.equals(zzhseVarZzc)) {
            i2 = 3;
        } else if (!zzhse.zzb.equals(zzhseVarZzc)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhseVarZzc.toString()));
        }
        zzhpfVarZzb.zzc(i2);
        return (zzhpg) zzhpfVarZzb.zzbu();
    }

    private static zzhpk zzm(zzhsk zzhskVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhskVar.zzf().zzd());
        ECPoint eCPointZzd = zzhskVar.zzd();
        zzhpj zzhpjVarZzg = zzhpk.zzg();
        zzhpjVarZzg.zza(zzl(zzhskVar.zzf()));
        byte[] bArrZzb = zzhig.zzb(eCPointZzd.getAffineX(), iZzk);
        zzian zzianVar = zzian.zza;
        zzhpjVarZzg.zzb(zzian.zzs(bArrZzb, 0, bArrZzb.length));
        byte[] bArrZzb2 = zzhig.zzb(eCPointZzd.getAffineY(), iZzk);
        zzhpjVarZzg.zzc(zzian.zzs(bArrZzb2, 0, bArrZzb2.length));
        return (zzhpk) zzhpjVarZzg.zzbu();
    }

    private static zzhsc zzn(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhsc.zza;
        }
        if (i2 == 3) {
            return zzhsc.zzb;
        }
        if (i2 == 4) {
            return zzhsc.zzc;
        }
        int iZza = zzhps.zza(i);
        throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZza).length() + 35), "Unable to parse EllipticCurveType: ", iZza));
    }

    private static zzhse zzo(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhse.zza;
        }
        if (i2 == 2) {
            return zzhse.zzb;
        }
        int iZza = zzhpl.zza(i);
        throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZza).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", iZza));
    }
}
