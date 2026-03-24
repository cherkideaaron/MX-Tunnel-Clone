package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3029m1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C3194p1 a;
    public final /* synthetic */ C3084n1 b;

    public C3029m1(C3084n1 c3084n1, C3194p1 c3194p1) {
        this.b = c3084n1;
        this.a = c3194p1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C3084n1 c3084n1 = this.b;
        DialogInterface.OnClickListener onClickListener = c3084n1.q;
        C3194p1 c3194p1 = this.a;
        onClickListener.onClick(c3194p1.b, i);
        if (c3084n1.s) {
            return;
        }
        c3194p1.b.dismiss();
    }
}
