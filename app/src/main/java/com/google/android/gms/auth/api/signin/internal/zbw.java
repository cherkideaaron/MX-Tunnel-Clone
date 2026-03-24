package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.Ls;
import defpackage.Ms;

/* loaded from: classes.dex */
final class zbw implements Ms {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // defpackage.Ms
    public final Ls onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // defpackage.Ms
    public final /* bridge */ /* synthetic */ void onLoadFinished(Ls ls, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // defpackage.Ms
    public final void onLoaderReset(Ls ls) {
    }
}
