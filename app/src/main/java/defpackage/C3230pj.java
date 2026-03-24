package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3230pj extends V6 {
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ String a = "awaitEvenIfOnMainThread task continuation executor";
    public final /* synthetic */ long c = 2;

    public C3230pj(ExecutorService executorService, TimeUnit timeUnit) {
        this.b = executorService;
        this.d = timeUnit;
    }

    @Override // defpackage.V6
    public final void a() {
        String str = this.a;
        ExecutorService executorService = this.b;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.c, this.d)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String strX = AbstractC3264qG.x("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strX, null);
            }
            executorService.shutdownNow();
        }
    }
}
