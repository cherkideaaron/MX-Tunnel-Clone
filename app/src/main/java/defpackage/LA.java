package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class LA {
    public static final LA d = new LA(0, 0);
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public LA() {
        this.a = 2;
        this.b = 2500;
    }

    public int a() {
        return this.c;
    }

    public void b(JB jb) {
        View view = jb.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(LA.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return AbstractC3264qG.j(sb, this.c, "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ LA(int i) {
        this.a = i;
    }

    public LA(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }
}
