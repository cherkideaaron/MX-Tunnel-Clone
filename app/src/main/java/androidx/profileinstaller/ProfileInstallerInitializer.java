package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.C3397so;
import defpackage.InterfaceC3614wp;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC3614wp {
    @Override // defpackage.InterfaceC3614wp
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.InterfaceC3614wp
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C3397so(23);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: Vz
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.a.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC3030m2(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C3397so(23);
    }
}
