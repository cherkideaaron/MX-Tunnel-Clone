package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfon;

/* renamed from: wQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3598wQ {
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfoe a(android.content.Context r2, int r3) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzfor.zza()
            if (r0 == 0) goto L41
            int r0 = r3 + (-2)
            r1 = 20
            if (r0 == r1) goto L36
            r1 = 21
            if (r0 == r1) goto L36
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L2b
            switch(r0) {
                case 2: goto L28;
                case 3: goto L28;
                case 4: goto L25;
                case 5: goto L18;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                case 9: goto L25;
                case 10: goto L25;
                case 11: goto L25;
                case 12: goto L25;
                case 13: goto L25;
                default: goto L17;
            }
        L17:
            goto L41
        L18:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzb
        L1a:
            java.lang.Object r0 = r0.zze()
        L1e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L39
        L25:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzd
            goto L1a
        L28:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzc
            goto L1a
        L2b:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzkm
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            goto L1e
        L36:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zze
            goto L1a
        L39:
            if (r0 == 0) goto L41
            com.google.android.gms.internal.ads.zzfog r0 = new com.google.android.gms.internal.ads.zzfog
            r0.<init>(r2, r3)
            return r0
        L41:
            com.google.android.gms.internal.ads.zzfph r2 = new com.google.android.gms.internal.ads.zzfph
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3598wQ.a(android.content.Context, int):com.google.android.gms.internal.ads.zzfoe");
    }

    public static zzfoe b(Context context, int i, int i2, zzm zzmVar) {
        zzfoe zzfoeVarA = a(context, i);
        if (zzfoeVarA instanceof zzfog) {
            zzfoeVarA.zza();
            zzfoeVarA.zzp(i2);
            zzfoeVarA.zzf(zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfon.zza(str)) {
                zzfoeVarA.zze(str);
            }
        }
        return zzfoeVarA;
    }
}
