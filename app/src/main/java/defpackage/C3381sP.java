package defpackage;

import android.view.View;
import com.google.android.gms.ads.formats.zzc;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* renamed from: sP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3381sP extends UnifiedNativeAdMapper {
    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        if ((view instanceof zzh) || ((zzc) zzc.zza.get(view)) != null) {
            throw null;
        }
    }
}
