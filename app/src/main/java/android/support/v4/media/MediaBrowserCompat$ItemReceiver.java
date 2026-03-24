package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.AbstractC3296qu;
import defpackage.KC;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends KC {
    @Override // defpackage.KC
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(AbstractC3296qu.class.getClassLoader());
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
