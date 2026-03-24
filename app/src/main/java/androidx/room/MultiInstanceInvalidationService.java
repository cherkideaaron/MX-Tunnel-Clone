package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.Dv;
import defpackage.Ev;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int a = 0;
    public final HashMap b = new HashMap();
    public final Dv c = new Dv(this);
    public final Ev d = new Ev(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
