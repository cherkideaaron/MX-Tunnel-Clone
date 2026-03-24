package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC3139o1 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ HandlerC3139o1() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        AbstractC0115Ga[] abstractC0115GaArr;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C3532vE c3532vE = (C3532vE) this.b;
                do {
                    synchronized (((HashMap) c3532vE.b)) {
                        try {
                            size = ((ArrayList) c3532vE.d).size();
                            if (size <= 0) {
                                return;
                            }
                            abstractC0115GaArr = new AbstractC0115Ga[size];
                            ((ArrayList) c3532vE.d).toArray(abstractC0115GaArr);
                            ((ArrayList) c3532vE.d).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                AbstractC0115Ga abstractC0115Ga = abstractC0115GaArr[0];
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3139o1(C3532vE c3532vE, Looper looper) {
        super(looper);
        this.b = c3532vE;
    }
}
