package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbhe;

/* loaded from: classes.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzah zzb;

    public zzu(Context context, zzt zztVar, zzah zzahVar) throws Resources.NotFoundException {
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zza);
        zzbb.zza();
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, 0);
        zzbb.zza();
        int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzb);
        zzbb.zza();
        imageButton.setPadding(iZzC, iZzC2, iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zza();
        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbb.zza();
        addView(imageButton, new FrameLayout.LayoutParams(iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzbd.zzc().zzd(zzbhe.zzbJ)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbK)).booleanValue() ? new zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc() throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzbI
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 != 0) goto L61
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e
            goto L61
        L1e:
            com.google.android.gms.internal.ads.zzcdu r1 = com.google.android.gms.ads.internal.zzt.zzh()
            android.content.res.Resources r1 = r1.zzf()
            if (r1 == 0) goto L5b
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 == 0) goto L38
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross     // Catch: android.content.res.Resources.NotFoundException -> L43
        L33:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            goto L4a
        L38:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r0 == 0) goto L4a
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross     // Catch: android.content.res.Resources.NotFoundException -> L43
            goto L33
        L43:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r0)
        L4a:
            android.widget.ImageButton r0 = r5.zza
            if (r3 != 0) goto L52
            r0.setImageResource(r2)
            return
        L52:
            r0.setImageDrawable(r3)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L5b:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        L61:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzu.zzc():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    public final void zza(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((Long) zzbd.zzc().zzd(zzbhe.zzbJ)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    public final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }
}
