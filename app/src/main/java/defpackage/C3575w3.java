package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3575w3 extends C3521v3 {
    @Override // defpackage.C3521v3, defpackage.AbstractC3629x3
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.AbstractC3629x3
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
