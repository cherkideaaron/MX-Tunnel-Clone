package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: kC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class FragmentC2930kC extends Fragment {
    public static final /* synthetic */ int b = 0;
    public C2524cp a;

    public final void a(Hr hr) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0500aq.l(activity, "getActivity(...)");
            AbstractC0500aq.y(activity, hr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(Hr.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(Hr.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(Hr.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C2524cp c2524cp = this.a;
        if (c2524cp != null) {
            ((Mz) c2524cp.b).a();
        }
        a(Hr.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C2524cp c2524cp = this.a;
        if (c2524cp != null) {
            Mz mz = (Mz) c2524cp.b;
            int i = mz.a + 1;
            mz.a = i;
            if (i == 1 && mz.d) {
                mz.f.e(Hr.ON_START);
                mz.d = false;
            }
        }
        a(Hr.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(Hr.ON_STOP);
    }
}
