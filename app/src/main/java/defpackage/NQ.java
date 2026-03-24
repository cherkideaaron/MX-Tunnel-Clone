package defpackage;

import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzee;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzpq;
import com.google.android.gms.internal.ads.zzwk;
import com.google.android.gms.internal.ads.zzyn;

/* loaded from: classes.dex */
public abstract /* synthetic */ class NQ {
    public static void a(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void b(zzlj zzljVar, zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void c(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void d(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static long e(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static boolean f(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean g(zzlj zzljVar, zzli zzliVar) {
        long j = zzliVar.zzd;
        throw null;
    }

    public static boolean h(zzlj zzljVar, zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        throw null;
    }

    public static boolean i(zzlj zzljVar, zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j) {
        zzee.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
