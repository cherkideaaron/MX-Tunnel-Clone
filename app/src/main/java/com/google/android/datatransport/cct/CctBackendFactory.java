package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.AbstractC0356Ud;
import defpackage.C2596e6;
import defpackage.InterfaceC0476aK;
import defpackage.O8;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC0476aK create(AbstractC0356Ud abstractC0356Ud) {
        Context context = ((C2596e6) abstractC0356Ud).a;
        C2596e6 c2596e6 = (C2596e6) abstractC0356Ud;
        return new O8(context, c2596e6.b, c2596e6.c);
    }
}
