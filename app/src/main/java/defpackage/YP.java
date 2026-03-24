package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzcl;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class YP {
    public static YP c;
    public final String a;
    public final zzmy b;

    public YP(String str, zzmy zzmyVar) {
        this.a = str;
        this.b = zzmyVar;
    }

    public static YP a(Context context, String str) {
        zzmy zzmyVarB;
        YP yp = c;
        if (yp == null || !Objects.equals(yp.a, str)) {
            try {
                zzcl.zza();
                zzmyVarB = b(context, str);
            } catch (IOException | GeneralSecurityException e) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
                if (e instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto." + str, 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        zzmyVarB = b(context, str);
                    } catch (IOException | GeneralSecurityException e2) {
                        Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e2.getMessage());
                        zzmyVarB = null;
                        c = new YP(str, zzmyVarB);
                        return c;
                    }
                } else {
                    zzmyVarB = null;
                }
                return c;
            }
            c = new YP(str, zzmyVarB);
        }
        return c;
    }

    public static zzmy b(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcv.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
    }
}
