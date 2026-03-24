package com.google.android.gms.internal.ads;

import defpackage.AbstractC0500aq;
import defpackage.DK;
import defpackage.InterfaceC3478uE;
import defpackage.InterfaceC3493uc;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class zzfzb implements InterfaceC3478uE {

    @NotNull
    public static final zzfzb zza = new zzfzb();

    @NotNull
    private static final zzfyy zzb;

    static {
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        AbstractC0500aq.l(zzfyyVarZzd, "getDefaultInstance(...)");
        zzb = zzfyyVarZzd;
    }

    private zzfzb() {
    }

    @Override // defpackage.InterfaceC3478uE
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // defpackage.InterfaceC3478uE
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull InterfaceC3493uc interfaceC3493uc) {
        try {
            zzfyy zzfyyVarZzc = zzfyy.zzc(inputStream);
            AbstractC0500aq.j(zzfyyVarZzc);
            return zzfyyVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC3493uc interfaceC3493uc) {
        ((zzfyy) obj).zzaO(outputStream);
        return DK.a;
    }
}
