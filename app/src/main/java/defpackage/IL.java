package defpackage;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class IL extends AbstractC3111na {
    public final /* synthetic */ int e;

    public IL(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.AbstractC3111na
    public final boolean E(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }

    @Override // defpackage.AbstractC3111na
    public final Object d(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(PL.c(view));
            case 1:
                return PL.a(view);
            case 2:
                return RL.a(view);
            default:
                return Boolean.valueOf(PL.b(view));
        }
    }

    @Override // defpackage.AbstractC3111na
    public final void e(View view, Object obj) {
        switch (this.e) {
            case 0:
                PL.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                PL.e(view, (CharSequence) obj);
                break;
            case 2:
                RL.c(view, (CharSequence) obj);
                break;
            default:
                PL.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
