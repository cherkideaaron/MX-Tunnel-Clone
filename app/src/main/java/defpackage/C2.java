package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class C2 {
    public Object a;
    public Object b;

    public C2(F2 f2) {
        this.b = f2;
    }

    public void c() {
        B2 b2 = (B2) this.a;
        if (b2 != null) {
            try {
                ((F2) this.b).q.unregisterReceiver(b2);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof SH)) {
            return menuItem;
        }
        SH sh = (SH) menuItem;
        if (((WF) this.b) == null) {
            this.b = new WF();
        }
        MenuItem menuItem2 = (MenuItem) ((WF) this.b).get(sh);
        if (menuItem2 != null) {
            return menuItem2;
        }
        Gu gu = new Gu((Context) this.a, sh);
        ((WF) this.b).put(sh, gu);
        return gu;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((B2) this.a) == null) {
            this.a = new B2(this, 0);
        }
        ((F2) this.b).q.registerReceiver((B2) this.a, intentFilterD);
    }

    public C2(Context context) {
        this.a = context;
    }
}
