package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class G1 extends MO {
    public final /* synthetic */ int w;
    public final Animatable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G1(Animatable animatable, int i) {
        super(7);
        this.w = i;
        this.x = animatable;
    }

    @Override // defpackage.MO
    public final void M() {
        switch (this.w) {
            case 0:
                this.x.start();
                break;
            default:
                ((O1) this.x).start();
                break;
        }
    }

    @Override // defpackage.MO
    public final void N() {
        switch (this.w) {
            case 0:
                this.x.stop();
                break;
            default:
                ((O1) this.x).stop();
                break;
        }
    }
}
