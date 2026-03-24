package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.AbstractC3264qG;

/* loaded from: classes2.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final String a;

    public /* synthetic */ h(String str, g gVar) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        String str = this.a;
        String strA = ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj).a();
        return str == null ? strA == null : str.equals(strA);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.a, "}");
    }
}
