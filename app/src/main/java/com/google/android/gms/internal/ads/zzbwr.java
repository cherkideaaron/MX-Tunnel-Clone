package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0125, B:63:0x0131, B:64:0x0135, B:145:0x025e, B:146:0x0263, B:148:0x0265, B:150:0x0282, B:152:0x028e, B:154:0x02c6, B:188:0x037c, B:189:0x037f, B:197:0x03a0, B:198:0x03b8, B:199:0x03d4, B:201:0x03dc, B:202:0x03e3, B:203:0x0409, B:206:0x040c, B:208:0x043a, B:209:0x044c, B:190:0x0383, B:191:0x0387, B:192:0x038a, B:193:0x038e, B:194:0x0392, B:195:0x0398, B:196:0x039c, B:153:0x02c3, B:211:0x044e, B:212:0x0453, B:65:0x013a, B:67:0x013e, B:98:0x0196, B:100:0x019e, B:101:0x01a0, B:119:0x01f2, B:121:0x01f7, B:123:0x01fc, B:126:0x0202, B:102:0x01a4, B:104:0x01ac, B:105:0x01ae, B:107:0x01b5, B:109:0x01be, B:110:0x01c1, B:111:0x01c9, B:113:0x01d2, B:114:0x01dc, B:116:0x01e5, B:117:0x01e8, B:127:0x0211, B:135:0x023b, B:141:0x024b, B:138:0x0241, B:140:0x0249, B:131:0x0231, B:133:0x0237, B:142:0x0250, B:143:0x0256, B:214:0x0455, B:215:0x045a, B:217:0x045c, B:218:0x0461), top: B:222:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0265 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0125, B:63:0x0131, B:64:0x0135, B:145:0x025e, B:146:0x0263, B:148:0x0265, B:150:0x0282, B:152:0x028e, B:154:0x02c6, B:188:0x037c, B:189:0x037f, B:197:0x03a0, B:198:0x03b8, B:199:0x03d4, B:201:0x03dc, B:202:0x03e3, B:203:0x0409, B:206:0x040c, B:208:0x043a, B:209:0x044c, B:190:0x0383, B:191:0x0387, B:192:0x038a, B:193:0x038e, B:194:0x0392, B:195:0x0398, B:196:0x039c, B:153:0x02c3, B:211:0x044e, B:212:0x0453, B:65:0x013a, B:67:0x013e, B:98:0x0196, B:100:0x019e, B:101:0x01a0, B:119:0x01f2, B:121:0x01f7, B:123:0x01fc, B:126:0x0202, B:102:0x01a4, B:104:0x01ac, B:105:0x01ae, B:107:0x01b5, B:109:0x01be, B:110:0x01c1, B:111:0x01c9, B:113:0x01d2, B:114:0x01dc, B:116:0x01e5, B:117:0x01e8, B:127:0x0211, B:135:0x023b, B:141:0x024b, B:138:0x0241, B:140:0x0249, B:131:0x0231, B:133:0x0237, B:142:0x0250, B:143:0x0256, B:214:0x0455, B:215:0x045a, B:217:0x045c, B:218:0x0461), top: B:222:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03dc A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0125, B:63:0x0131, B:64:0x0135, B:145:0x025e, B:146:0x0263, B:148:0x0265, B:150:0x0282, B:152:0x028e, B:154:0x02c6, B:188:0x037c, B:189:0x037f, B:197:0x03a0, B:198:0x03b8, B:199:0x03d4, B:201:0x03dc, B:202:0x03e3, B:203:0x0409, B:206:0x040c, B:208:0x043a, B:209:0x044c, B:190:0x0383, B:191:0x0387, B:192:0x038a, B:193:0x038e, B:194:0x0392, B:195:0x0398, B:196:0x039c, B:153:0x02c3, B:211:0x044e, B:212:0x0453, B:65:0x013a, B:67:0x013e, B:98:0x0196, B:100:0x019e, B:101:0x01a0, B:119:0x01f2, B:121:0x01f7, B:123:0x01fc, B:126:0x0202, B:102:0x01a4, B:104:0x01ac, B:105:0x01ae, B:107:0x01b5, B:109:0x01be, B:110:0x01c1, B:111:0x01c9, B:113:0x01d2, B:114:0x01dc, B:116:0x01e5, B:117:0x01e8, B:127:0x0211, B:135:0x023b, B:141:0x024b, B:138:0x0241, B:140:0x0249, B:131:0x0231, B:133:0x0237, B:142:0x0250, B:143:0x0256, B:214:0x0455, B:215:0x045a, B:217:0x045c, B:218:0x0461), top: B:222:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwr.zza(java.util.Map):void");
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z);
                    } else {
                        zzcei.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws JSONException {
                                this.zza.zzf(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
