package defpackage;

import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfxq;
import java.io.File;

/* renamed from: xQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3652xQ {
    public static String a(zzfxm zzfxmVar, File file, String str) {
        return b(file, str, zzfxq.zza);
    }

    public static String b(File file, String str, zzfxq zzfxqVar) {
        return new File(file, str).getPath();
    }
}
