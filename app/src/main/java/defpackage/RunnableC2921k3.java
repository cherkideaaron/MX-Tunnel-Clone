package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2921k3 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public RunnableC2921k3(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N0 n0;
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
                break;
            case 1:
                ((BottomSheetBehavior) this.d).F((View) this.c, false, this.b);
                break;
            case 2:
                Object obj = ((C0565c0) this.c).a;
                C0387Wa c0387Wa = (C0387Wa) this.d;
                String str = (String) c0387Wa.a.get(Integer.valueOf(this.b));
                if (str != null) {
                    T0 t0 = (T0) c0387Wa.e.get(str);
                    if (t0 != null && (n0 = t0.a) != null) {
                        if (c0387Wa.d.remove(str)) {
                            n0.c(obj);
                            break;
                        }
                    } else {
                        c0387Wa.g.remove(str);
                        c0387Wa.f.put(str, obj);
                        break;
                    }
                }
                break;
            case 3:
                ((C0387Wa) this.d).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.c));
                break;
            case 4:
                ((BinderC2895je) this.d).b.onNavigationEvent(this.b, (Bundle) this.c);
                break;
            case 5:
                ((C2663fI) this.c).a(this.b, (Intent) this.d);
                break;
            default:
                ((SystemForegroundService) this.d).e.notify(this.b, (Notification) this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC2921k3(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ RunnableC2921k3(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
