package defpackage;

import android.content.Intent;
import android.os.Build;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import rased.vpn.app.activities.ExceptionActivity;

/* renamed from: ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2846ij implements Thread.UncaughtExceptionHandler {
    public final AbstractActivityC2592e2 a;

    public C2846ij(AbstractActivityC2592e2 abstractActivityC2592e2) {
        this.a = abstractActivityC2592e2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AbstractActivityC2592e2 abstractActivityC2592e2 = this.a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        try {
            Intent intent = new Intent(abstractActivityC2592e2, (Class<?>) ExceptionActivity.class);
            intent.putExtra("error", "************ APPLICATION ERROR ************\n\n" + stringWriter.toString() + "\n************ DEVICE INFORMATION ***********\nBrand: " + Build.BRAND + "\nDevice: " + Build.DEVICE + "\nModel: " + Build.MODEL + "\nId: " + Build.ID + "\nProduct: " + Build.PRODUCT + "\n\n************ FIRMWARE ************\nSDK: " + Build.VERSION.SDK + "\nRelease: " + Build.VERSION.RELEASE + "\nIncremental: " + Build.VERSION.INCREMENTAL + "\nReport the bug to the developer!\n");
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            abstractActivityC2592e2.startActivity(intent);
            abstractActivityC2592e2.finish();
        } catch (Throwable th2) {
            throw new NoClassDefFoundError(th2.getMessage());
        }
    }
}
