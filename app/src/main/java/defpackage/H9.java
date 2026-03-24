package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class H9 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public H9(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        K9 k9 = this.a.e;
        if (k9 != null) {
            k9.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
