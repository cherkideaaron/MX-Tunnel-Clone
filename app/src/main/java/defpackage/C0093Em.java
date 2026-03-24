package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.l;

/* renamed from: Em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093Em extends AbstractC3756zM {
    public final ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093Em(l lVar, ViewGroup viewGroup, int i) {
        super(lVar, "Attempting to use <fragment> tag to add fragment " + lVar + " to container " + viewGroup);
        switch (i) {
            case 1:
                super(lVar, "Attempting to add fragment " + lVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.b = viewGroup;
                break;
            default:
                this.b = viewGroup;
                break;
        }
    }
}
