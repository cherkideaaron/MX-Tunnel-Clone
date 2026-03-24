package defpackage;

import java.util.ArrayList;

/* renamed from: oJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3157oJ extends AbstractC3296qu {
    public final /* synthetic */ int j;
    public boolean k;
    public int l;
    public final /* synthetic */ Object m;

    public C3157oJ(C3623wy c3623wy) {
        this.j = 1;
        this.m = c3623wy;
        this.k = false;
        this.l = 0;
    }

    @Override // defpackage.AbstractC3296qu, defpackage.InterfaceC2940kM
    public void a() {
        switch (this.j) {
            case 0:
                this.k = true;
                break;
        }
    }

    @Override // defpackage.AbstractC3296qu, defpackage.InterfaceC2940kM
    public final void b() {
        switch (this.j) {
            case 0:
                ((C3212pJ) this.m).a.setVisibility(0);
                break;
            default:
                if (!this.k) {
                    this.k = true;
                    InterfaceC2940kM interfaceC2940kM = (InterfaceC2940kM) ((C3623wy) this.m).e;
                    if (interfaceC2940kM != null) {
                        interfaceC2940kM.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC2940kM
    public final void c() {
        switch (this.j) {
            case 0:
                if (!this.k) {
                    ((C3212pJ) this.m).a.setVisibility(this.l);
                    break;
                }
                break;
            default:
                int i = this.l + 1;
                this.l = i;
                C3623wy c3623wy = (C3623wy) this.m;
                if (i == ((ArrayList) c3623wy.c).size()) {
                    InterfaceC2940kM interfaceC2940kM = (InterfaceC2940kM) c3623wy.e;
                    if (interfaceC2940kM != null) {
                        interfaceC2940kM.c();
                    }
                    this.l = 0;
                    this.k = false;
                    c3623wy.b = false;
                    break;
                }
                break;
        }
    }

    public C3157oJ(C3212pJ c3212pJ, int i) {
        this.j = 0;
        this.m = c3212pJ;
        this.l = i;
        this.k = false;
    }
}
