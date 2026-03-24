package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class Eu extends FrameLayout implements InterfaceC3276qa {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public Eu(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
