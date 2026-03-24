package com.google.android.gms.common;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.Vs;

@KeepName
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION + String.valueOf(i).length() + 194);
        Vs.x(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i2, " but found ", i);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i, sb.toString());
    }
}
