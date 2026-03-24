package defpackage;

import android.view.View;
import android.view.Window;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2537d1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC2537d1(C2646f1 c2646f1, JSONObject jSONObject, int i) {
        this.a = i;
        this.c = c2646f1;
        this.b = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                C2646f1 c2646f1 = (C2646f1) this.c;
                try {
                    C2646f1.a(c2646f1, ((JSONObject) this.b).getString("friendly_name"));
                    break;
                } catch (JSONException e) {
                    AbstractC3279qd.i0(c2646f1.getContext(), "Delete Error: " + e.getMessage());
                    return;
                }
            case 1:
                JSONObject jSONObject = (JSONObject) this.b;
                C2646f1 c2646f12 = (C2646f1) this.c;
                try {
                    c2646f12.d.Y(jSONObject.getString("friendly_name"), jSONObject);
                    break;
                } catch (JSONException e2) {
                    AbstractC3279qd.i0(c2646f12.getContext(), "Export Error: " + e2.getMessage());
                    return;
                }
            default:
                C3212pJ c3212pJ = (C3212pJ) this.c;
                Window.Callback callback = c3212pJ.k;
                if (callback != null && c3212pJ.l) {
                    callback.onMenuItemSelected(0, (C3410t0) this.b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC2537d1(C3212pJ c3212pJ) {
        this.a = 2;
        this.c = c3212pJ;
        this.b = new C3410t0(c3212pJ.a.getContext(), c3212pJ.h);
    }
}
