package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2681fi implements InterfaceC0409Xf {
    public final /* synthetic */ Jr a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public C2681fi(EmojiCompatInitializer emojiCompatInitializer, Jr jr) {
        this.b = emojiCompatInitializer;
        this.a = jr;
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void a(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void b(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void e(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void f(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final void g(Or or) {
        this.b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC3277qb.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2899ji(0), 500L);
        this.a.b(this);
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void h(Or or) {
    }
}
