package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import defpackage.AbstractC3650xO;
import defpackage.C0607co;
import defpackage.C2524cp;
import defpackage.SM;
import defpackage.VM;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes.dex */
public final class zzfsv {
    private final zzfsx zza;
    private final WebView zzb;
    private zzfuy zzc;
    private final HashMap zzd;
    private final zzftl zze;

    private zzfsv(zzfsx zzfsxVar, WebView webView, boolean z) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzftl();
        zzfuh.zza();
        this.zza = zzfsxVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfsj) it.next()).zzb(webView);
            }
            this.zzc = new zzfuy(webView);
        }
        if (!AbstractC3650xO.b(Features.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        zzfst zzfstVar = new zzfst(this);
        WebView webView2 = this.zzb;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        int i = SM.a;
        if (!VM.d.b()) {
            throw VM.a();
        }
        C0607co c0607coB = SM.b(webView2);
        ((WebViewProviderBoundaryInterface) c0607coB.a).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new C2524cp(zzfstVar, 28)));
    }

    public static zzfsv zza(zzfsx zzfsxVar, WebView webView, boolean z) {
        return new zzfsv(zzfsxVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebView webView = this.zzb;
        int i = SM.a;
        if (!VM.d.b()) {
            throw VM.a();
        }
        ((WebViewProviderBoundaryInterface) SM.b(webView).a).removeWebMessageListener("omidJsSessionService");
    }

    public final void zzb(zzfsu zzfsuVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfss(this, zzfsuVar, timer), 1000L);
    }

    public final View zzc() {
        zzfuy zzfuyVar = this.zzc;
        if (zzfuyVar == null) {
            return null;
        }
        return (View) zzfuyVar.get();
    }

    public final void zzd(View view, zzfsq zzfsqVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzd(view, zzfsqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfsqVar, "Ad overlay");
    }

    public final /* synthetic */ void zzf(String str) {
        zzfso zzfsoVar = zzfso.DEFINED_BY_JAVASCRIPT;
        zzfsr zzfsrVar = zzfsr.DEFINED_BY_JAVASCRIPT;
        zzfsw zzfswVar = zzfsw.JAVASCRIPT;
        zzfsn zzfsnVar = new zzfsn(zzfsk.zza(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar, false), zzfsl.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfsnVar);
        zzfsnVar.zzb(zzc());
        for (zzftk zzftkVar : this.zze.zza()) {
            zzfsnVar.zzd((View) zzftkVar.zza().get(), zzftkVar.zzc(), zzftkVar.zzd());
        }
        zzfsnVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzfsj zzfsjVar = (zzfsj) map.get(str);
        if (zzfsjVar != null) {
            zzfsjVar.zzc();
            map.remove(str);
        }
    }
}
