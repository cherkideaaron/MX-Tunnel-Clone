package defpackage;

import androidx.fragment.app.l;
import androidx.fragment.app.t;
import java.util.ArrayList;

/* renamed from: wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3611wm implements InterfaceC3557vm {
    public final int a;
    public final int b = 1;
    public final /* synthetic */ t c;

    public C3611wm(t tVar, int i) {
        this.c = tVar;
        this.a = i;
    }

    @Override // defpackage.InterfaceC3557vm
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        t tVar = this.c;
        l lVar = tVar.w;
        int i = this.a;
        if (lVar == null || i >= 0 || !lVar.getChildFragmentManager().M(-1, 0)) {
            return tVar.N(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
