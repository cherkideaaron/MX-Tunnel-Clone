package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.mxtunnel.pro.R;

/* renamed from: hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2784hb extends Dialog implements Or, InterfaceC2586dx, HD {
    public Qr a;
    public final ED b;
    public final C2532cx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2784hb(Context context, int i) {
        super(context, i);
        AbstractC0500aq.m(context, "context");
        this.b = new ED(new GD(this, new C0336Ta(this, 3)));
        this.c = new C2532cx(new H0(this, 6));
    }

    public static void a(DialogC2784hb dialogC2784hb) {
        AbstractC0500aq.m(dialogC2784hb, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0500aq.m(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final Qr b() {
        Qr qr = this.a;
        if (qr != null) {
            return qr;
        }
        Qr qr2 = new Qr(this);
        this.a = qr2;
        return qr2;
    }

    public final void c() {
        Window window = getWindow();
        AbstractC0500aq.j(window);
        View decorView = window.getDecorView();
        AbstractC0500aq.l(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        AbstractC0500aq.j(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0500aq.l(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC0500aq.j(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0500aq.l(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.Or
    public final Jr getLifecycle() {
        return b();
    }

    @Override // defpackage.InterfaceC2586dx
    public final C2532cx getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.HD
    public final DD getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0500aq.l(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C2532cx c2532cx = this.c;
            c2532cx.getClass();
            c2532cx.e = onBackInvokedDispatcher;
            c2532cx.b(c2532cx.g);
        }
        this.b.a(bundle);
        b().e(Hr.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0500aq.l(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(Hr.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(Hr.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0500aq.m(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0500aq.m(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
