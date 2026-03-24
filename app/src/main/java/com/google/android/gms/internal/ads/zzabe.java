package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabe extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzabe(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(Vs.o(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
