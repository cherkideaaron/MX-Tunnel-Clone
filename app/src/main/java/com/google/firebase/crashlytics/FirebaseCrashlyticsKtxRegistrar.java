package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C0055Ci;
import defpackage.C0125Gk;
import defpackage.C0319Sa;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {

    @NotNull
    public static final C0125Gk Companion = new C0125Gk();

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0319Sa> getComponents() {
        return C0055Ci.a;
    }
}
