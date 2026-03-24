package com.google.android.gms.internal.ads;

import defpackage.AbstractC0136He;
import defpackage.AbstractC0500aq;
import defpackage.C3010lj;
import defpackage.InterfaceC0304Rc;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zzfzj {
    @NotNull
    public static final zzfzh zza(@NotNull final ExecutorService executorService) {
        AbstractC0500aq.m(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final InterfaceC0304Rc zza() {
                return AbstractC0136He.a(new C3010lj(executorService));
            }
        };
    }
}
