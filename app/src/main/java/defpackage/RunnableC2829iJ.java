package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: iJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2829iJ implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ RunnableC2829iJ(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2937kJ c2937kJ = this.b.R;
                Cu cu = c2937kJ == null ? null : c2937kJ.b;
                if (cu != null) {
                    cu.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
