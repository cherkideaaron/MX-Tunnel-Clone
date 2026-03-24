package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import defpackage.AbstractC3264qG;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes2.dex */
public final class zzmy {
    private static final Object zza = new Object();
    private static final String zzb = "zzmy";
    private zzbw zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzba zze = null;
        private boolean zzf = true;
        private zzbj zzg = null;
        private zzxb zzh = null;
        private zzbw zzi;

        private final zzba zzb() throws KeyStoreException {
            zzmy.zzd();
            zznd zzndVar = new zznd();
            try {
                boolean zZzc = zznd.zzc(this.zzd);
                try {
                    return zzndVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (!zZzc) {
                        throw new KeyStoreException(AbstractC3264qG.x("the master key ", this.zzd, " exists but is unusable"), e);
                    }
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }

        private static zzbw zza(byte[] bArr) {
            return zzbw.zza(zzbz.zza(zzaz.zza(bArr), zzbf.zza()));
        }

        public final zza zza(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.zza = context;
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public final zza zza(zzxb zzxbVar) {
            this.zzh = zzxbVar;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.zzd = str;
            return this;
        }

        public final synchronized zzmy zza() {
            zzbw zzbwVarZza;
            zzmy zzmyVar;
            try {
                if (this.zzb == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                zzxb zzxbVar = this.zzh;
                if (zzxbVar != null && this.zzg == null) {
                    this.zzg = zzbj.zza(zzcj.zza(zzxbVar.zzk()));
                }
                synchronized (zzmy.zza) {
                    try {
                        byte[] bArrZzb = zzb(this.zza, this.zzb, this.zzc);
                        if (bArrZzb == null) {
                            if (this.zzd != null) {
                                this.zze = zzb();
                            }
                            zzbj zzbjVar = this.zzg;
                            if (zzbjVar == null) {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                            zzbm zzbmVarZza = zzbm.zza(zzbjVar);
                            zzmy.zza(zzbmVarZza, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                            zzbwVarZza = zzbw.zza(zzbmVarZza);
                        } else if (this.zzd != null) {
                            zzmy.zzd();
                            zzbwVarZza = zzb(bArrZzb);
                        } else {
                            zzbwVarZza = zza(bArrZzb);
                        }
                        this.zzi = zzbwVarZza;
                        zzmyVar = new zzmy(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmyVar;
        }

        private final zzbw zzb(byte[] bArr) {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbw.zza(zzbm.zza(zzaz.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    zzbw zzbwVarZza = zza(bArr);
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                    return zzbwVarZza;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return zzzx.zza(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(AbstractC3264qG.x("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }
    }

    private zzmy(zza zzaVar) {
        new zznf(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbm zza() {
        return this.zzc.zza();
    }

    public static /* synthetic */ void zza(zzbm zzbmVar, zzby zzbyVar, zzba zzbaVar) throws GeneralSecurityException {
        try {
            if (zzbaVar != null) {
                zzbmVar.zza(zzbyVar, zzbaVar, new byte[0]);
            } else {
                zzbz.zza(zzbmVar, zzbyVar, zzbf.zza());
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
