package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3170oe {
    public final Intent a;
    public final C3397so b;
    public ActivityOptions c;
    public final boolean d;

    public C3170oe() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new C3397so(11);
        this.d = true;
    }

    public final R2 a() {
        Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.d);
        this.b.getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            String strA = AbstractC3060me.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i >= 34) {
            if (this.c == null) {
                this.c = AbstractC3005le.a();
            }
            AbstractC3115ne.a(this.c, false);
        }
        ActivityOptions activityOptions = this.c;
        return new R2(intent, activityOptions != null ? activityOptions.toBundle() : null, 21, false);
    }

    public C3170oe(C3333re c3333re) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.b = new C3397so(11);
        this.d = true;
        if (c3333re != null) {
            intent.setPackage(c3333re.d.getPackageName());
            IBinder iBinderAsBinder = c3333re.c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
            PendingIntent pendingIntent = c3333re.e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
