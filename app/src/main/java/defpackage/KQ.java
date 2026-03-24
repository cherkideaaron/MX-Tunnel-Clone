package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.measurement.zzju;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class KQ {
    public static Object a(zzju zzjuVar) {
        try {
            return zzjuVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjuVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
