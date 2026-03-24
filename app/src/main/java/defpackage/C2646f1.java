package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import rased.vpn.app.activities.OpenVPNClient;

/* renamed from: f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2646f1 extends ArrayAdapter {
    public final List a;
    public final SharedPreferences b;
    public final ArrayList c;
    public final OpenVPNClient d;
    public final boolean e;
    public final C3492ub f;

    public C2646f1(Context context, ArrayList arrayList, boolean z) {
        super(context, R.layout.network_item, arrayList);
        this.a = arrayList;
        this.c = new ArrayList(arrayList);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.b = defaultSharedPreferences;
        defaultSharedPreferences.edit();
        this.d = (OpenVPNClient) context;
        this.e = z;
        this.f = C3492ub.c(getContext());
    }

    public static void a(C2646f1 c2646f1, String str) {
        C3249q1 c3249q1 = new C3249q1(c2646f1.getContext(), R.style.MyDialogTheme);
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        c3084n1.e = "Delete Confirmation";
        c3084n1.g = AbstractC3264qG.x("Do you want to remove ", str, "?");
        c3249q1.h("YES", new DialogInterfaceOnClickListenerC0566c1(str, 0, c2646f1));
        c3249q1.f("NO", null);
        c3249q1.i();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new C2591e1(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (JSONObject) this.a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) throws JSONException {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.network_item_drop, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.network_item_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.network_item_info);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.network_item_icon);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.network_delete_icon);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.network_export_icon);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.network_selection_frame);
        this.b.getString("LastCheckedNetwork", "");
        JSONObject jSONObject = (JSONObject) this.a.get(i);
        boolean z = this.e;
        if (z) {
            imageView2.setVisibility(0);
            imageView3.setVisibility(0);
            if (this.f.f() == i) {
                frameLayout.setBackgroundColor(-16711936);
            }
            imageView2.setOnClickListener(new ViewOnClickListenerC2537d1(this, jSONObject, 0));
            imageView3.setOnClickListener(new ViewOnClickListenerC2537d1(this, jSONObject, 1));
        } else {
            imageView2.setOnClickListener(null);
            imageView2.setVisibility(8);
            imageView3.setOnClickListener(null);
            imageView3.setVisibility(8);
        }
        try {
            String string = jSONObject.getString("message");
            if (string.isEmpty()) {
                textView2.setText("Mx Tunnel PRO");
            } else {
                textView2.setText(string);
            }
            if (string.contains("Custom Tweak") && z) {
                imageView2.setVisibility(0);
                imageView3.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView3.setVisibility(8);
            }
            textView.setText(Html.fromHtml(jSONObject.getString("friendly_name")));
            imageView.setImageResource(R.drawable.ic_app_icon);
        } catch (Exception e) {
            Toast.makeText(getContext(), "Network Error: " + e.getMessage(), 1).show();
        }
        return viewInflate;
    }
}
