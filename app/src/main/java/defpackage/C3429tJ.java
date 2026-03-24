package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3429tJ {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public C3429tJ(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C3429tJ.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a(String str) {
        C0312Rk c0312Rk = (C0312Rk) this.e;
        synchronized (c0312Rk) {
            try {
                if (((C3293qr) ((AtomicMarkableReference) c0312Rk.b).getReference()).c(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0312Rk.b;
                    atomicMarkableReference.set((C3293qr) atomicMarkableReference.getReference(), true);
                    H0 h0 = new H0(c0312Rk, 18);
                    AtomicReference atomicReference = (AtomicReference) c0312Rk.c;
                    while (!atomicReference.compareAndSet(null, h0)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ExecutorC0305Rd) ((D3) ((C3429tJ) c0312Rk.d).b).c).a(h0);
                }
            } finally {
            }
        }
    }

    public C3429tJ(String str, C3121nk c3121nk, D3 d3) {
        this.d = new C0312Rk(this, false);
        this.e = new C0312Rk(this, true);
        this.f = new C3249q1(5);
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new C2694fv(c3121nk);
        this.b = d3;
    }
}
