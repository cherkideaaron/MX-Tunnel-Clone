package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.AbstractC0136He;
import defpackage.InterfaceC0304Rc;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfw {

    @NotNull
    private final WebView zza;

    @NotNull
    private final InterfaceC0304Rc zzb;

    public zzfw(@NotNull WebView webView, @NotNull InterfaceC0304Rc interfaceC0304Rc) {
        this.zza = webView;
        this.zzb = interfaceC0304Rc;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        AbstractC0136He.y(this.zzb, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
