package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3553vi extends AbstractC0601ci {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public C3553vi(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // defpackage.AbstractC0601ci
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0601ci
    public final void b() {
        switch (this.a) {
            case 0:
                C3607wi.a((EditText) this.b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public C3553vi(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
