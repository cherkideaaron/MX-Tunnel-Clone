package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class S0 extends Q0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ O0 c;
    public final /* synthetic */ V0 d;

    public /* synthetic */ S0(V0 v0, String str, O0 o0, int i) {
        this.a = i;
        this.d = v0;
        this.b = str;
        this.c = o0;
    }

    @Override // defpackage.Q0
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                V0 v0 = this.d;
                HashMap map = v0.b;
                String str = this.b;
                Integer num = (Integer) map.get(str);
                O0 o0 = this.c;
                if (num != null) {
                    v0.d.add(str);
                    try {
                        v0.b(num.intValue(), o0, obj);
                        return;
                    } catch (Exception e) {
                        v0.d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + o0 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                V0 v02 = this.d;
                HashMap map2 = v02.b;
                String str2 = this.b;
                Integer num2 = (Integer) map2.get(str2);
                O0 o02 = this.c;
                if (num2 != null) {
                    v02.d.add(str2);
                    try {
                        v02.b(num2.intValue(), o02, obj);
                        return;
                    } catch (Exception e2) {
                        v02.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + o02 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.d.f(this.b);
    }
}
