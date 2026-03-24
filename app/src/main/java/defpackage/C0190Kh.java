package defpackage;

import android.view.View;

/* renamed from: Kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190Kh extends AbstractC0136He {
    public final /* synthetic */ int w;

    public /* synthetic */ C0190Kh(int i) {
        this.w = i;
    }

    @Override // defpackage.AbstractC0136He
    public final void J(Object obj, float f) {
        View view = (View) obj;
        switch (this.w) {
            case 0:
                view.setAlpha(f);
                break;
            case 1:
                view.setScaleX(f);
                break;
            case 2:
                view.setScaleY(f);
                break;
            case 3:
                view.setRotation(f);
                break;
            case 4:
                view.setRotationX(f);
                break;
            default:
                view.setRotationY(f);
                break;
        }
    }

    @Override // defpackage.AbstractC0136He
    public final float u(Object obj) {
        View view = (View) obj;
        switch (this.w) {
            case 0:
                return view.getAlpha();
            case 1:
                return view.getScaleX();
            case 2:
                return view.getScaleY();
            case 3:
                return view.getRotation();
            case 4:
                return view.getRotationX();
            default:
                return view.getRotationY();
        }
    }
}
