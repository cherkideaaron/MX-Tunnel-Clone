package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: iG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826iG implements Handler.Callback {
    public final /* synthetic */ C3532vE a;

    public C2826iG(C3532vE c3532vE) {
        this.a = c3532vE;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C3532vE c3532vE = this.a;
        C2879jG c2879jG = (C2879jG) message.obj;
        synchronized (c3532vE.a) {
            if (((C2879jG) c3532vE.c) == c2879jG || ((C2879jG) c3532vE.d) == c2879jG) {
                c3532vE.a(c2879jG, 2);
            }
        }
        return true;
    }
}
