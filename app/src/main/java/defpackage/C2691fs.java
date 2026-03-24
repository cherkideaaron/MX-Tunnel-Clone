package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* renamed from: fs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2691fs {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iC;
        int size = this.k.size();
        View view2 = null;
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((JB) this.k.get(i2)).a;
            C3583wB c3583wB = (C3583wB) view3.getLayoutParams();
            if (view3 != view && !c3583wB.a.j() && (iC = (c3583wB.a.c() - this.d) * this.e) >= 0 && iC < i) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i = iC;
                }
            }
        }
        this.d = view2 == null ? -1 : ((C3583wB) view2.getLayoutParams()).a.c();
    }

    public final View b(BB bb) {
        List list = this.k;
        if (list == null) {
            View viewD = bb.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((JB) this.k.get(i)).a;
            C3583wB c3583wB = (C3583wB) view.getLayoutParams();
            if (!c3583wB.a.j() && this.d == c3583wB.a.c()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
