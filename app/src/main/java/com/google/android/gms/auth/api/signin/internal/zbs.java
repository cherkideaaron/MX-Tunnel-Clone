package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements IInterface {
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(parcelZba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(parcelZba, googleSignInOptions);
        zbb(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, parcelZba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(parcelZba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(parcelZba, googleSignInOptions);
        zbb(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, parcelZba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(parcelZba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(parcelZba, googleSignInOptions);
        zbb(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, parcelZba);
    }
}
