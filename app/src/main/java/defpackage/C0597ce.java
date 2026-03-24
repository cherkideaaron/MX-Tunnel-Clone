package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0597ce extends AbstractC0276Pi {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0597ce(C0259Oi c0259Oi, int i) {
        super(c0259Oi);
        this.e = i;
    }

    @Override // defpackage.AbstractC0276Pi
    public void r() {
        switch (this.e) {
            case 0:
                C0259Oi c0259Oi = this.b;
                c0259Oi.u = null;
                CheckableImageButton checkableImageButton = c0259Oi.m;
                checkableImageButton.setOnLongClickListener(null);
                MO.H(checkableImageButton, null);
                break;
        }
    }
}
