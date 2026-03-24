package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Dv extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public Dv(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap map = this.a.b;
        Integer num = (Integer) obj;
        num.intValue();
        map.remove(num);
    }
}
