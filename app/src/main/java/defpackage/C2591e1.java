package defpackage;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2591e1 extends Filter {
    public final /* synthetic */ C2646f1 a;

    public C2591e1(C2646f1 c2646f1) {
        this.a = c2646f1;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C2646f1 c2646f1 = this.a;
        if (zIsEmpty) {
            arrayList.addAll(c2646f1.c);
        } else {
            String strTrim = charSequence.toString().toLowerCase().trim();
            Iterator it = c2646f1.c.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                try {
                    if (jSONObject.getString("friendly_name").toLowerCase().contains(strTrim)) {
                        arrayList.add(jSONObject);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C2646f1 c2646f1 = this.a;
        c2646f1.clear();
        if (filterResults.count > 0) {
            c2646f1.addAll((List) filterResults.values);
        }
        c2646f1.notifyDataSetChanged();
    }
}
