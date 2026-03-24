package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0172Jg {
    public final String a;
    public final String b;

    public C0172Jg(R2 r2) throws Resources.NotFoundException, IOException {
        String strW;
        int iA = AbstractC0115Ga.A((Context) r2.b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) r2.b;
        if (iA == 0) {
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.a = "Flutter";
                    this.b = null;
                    if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                        return;
                    } else {
                        strW = "Development platform is: Flutter";
                    }
                } catch (IOException unused) {
                }
            }
            this.a = null;
            this.b = null;
            return;
        }
        this.a = "Unity";
        String string = context.getResources().getString(iA);
        this.b = string;
        strW = AbstractC3264qG.w("Unity Editor version is: ", string);
        if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
            return;
        }
        Log.v("FirebaseCrashlytics", strW, null);
    }

    public C0172Jg(C0607co c0607co) {
        this.a = c0607co.E("gcm.n.title");
        c0607co.A("gcm.n.title");
        Object[] objArrZ = c0607co.z("gcm.n.title");
        if (objArrZ != null) {
            String[] strArr = new String[objArrZ.length];
            for (int i = 0; i < objArrZ.length; i++) {
                strArr[i] = String.valueOf(objArrZ[i]);
            }
        }
        this.b = c0607co.E("gcm.n.body");
        c0607co.A("gcm.n.body");
        Object[] objArrZ2 = c0607co.z("gcm.n.body");
        if (objArrZ2 != null) {
            String[] strArr2 = new String[objArrZ2.length];
            for (int i2 = 0; i2 < objArrZ2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrZ2[i2]);
            }
        }
        c0607co.E("gcm.n.icon");
        if (TextUtils.isEmpty(c0607co.E("gcm.n.sound2"))) {
            c0607co.E("gcm.n.sound");
        }
        c0607co.E("gcm.n.tag");
        c0607co.E("gcm.n.color");
        c0607co.E("gcm.n.click_action");
        c0607co.E("gcm.n.android_channel_id");
        String strE = c0607co.E("gcm.n.link_android");
        strE = TextUtils.isEmpty(strE) ? c0607co.E("gcm.n.link") : strE;
        if (!TextUtils.isEmpty(strE)) {
            Uri.parse(strE);
        }
        c0607co.E("gcm.n.image");
        c0607co.E("gcm.n.ticker");
        c0607co.w("gcm.n.notification_priority");
        c0607co.w("gcm.n.visibility");
        c0607co.w("gcm.n.notification_count");
        c0607co.u("gcm.n.sticky");
        c0607co.u("gcm.n.local_only");
        c0607co.u("gcm.n.default_sound");
        c0607co.u("gcm.n.default_vibrate_timings");
        c0607co.u("gcm.n.default_light_settings");
        c0607co.B();
        c0607co.y();
        c0607co.F();
    }
}
