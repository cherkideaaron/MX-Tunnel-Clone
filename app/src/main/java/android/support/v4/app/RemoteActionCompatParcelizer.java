package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import defpackage.BL;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(BL bl) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(bl);
    }

    public static void write(RemoteActionCompat remoteActionCompat, BL bl) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, bl);
    }
}
