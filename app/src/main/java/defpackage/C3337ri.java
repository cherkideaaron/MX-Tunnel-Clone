package defpackage;

import android.text.TextUtils;

/* renamed from: ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3337ri implements InterfaceC3284qi, VH {
    public final /* synthetic */ int a;
    public String b;

    @Override // defpackage.VH
    public void a(C0399Wm c0399Wm) {
    }

    @Override // defpackage.VH
    public String b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC3284qi
    public boolean h(CharSequence charSequence, int i, int i2, C3268qK c3268qK) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        c3268qK.c = (c3268qK.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3337ri(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.InterfaceC3284qi
    public Object e() {
        return this;
    }
}
