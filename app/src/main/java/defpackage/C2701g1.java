package defpackage;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import java.util.Locale;

/* renamed from: g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2701g1 extends ArrayAdapter {
    public SharedPreferences a;

    public static String a(String str) {
        for (String str2 : Locale.getISOCountries()) {
            Locale locale = new Locale("", str2);
            if (str.equalsIgnoreCase(str2)) {
                return str2.toLowerCase();
            }
            if (str.toLowerCase().contains(locale.getDisplayCountry().toLowerCase())) {
                return str2.toLowerCase();
            }
            if (str.equalsIgnoreCase(locale.getDisplayCountry())) {
                return str2.toLowerCase();
            }
        }
        return "";
    }

    public final Drawable b(String str) {
        try {
            return Drawable.createFromStream(getContext().getAssets().open("flags/flag_" + a(str) + ".png"), null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.server_item, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.server_item_title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.server_item_icon);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.server_description);
        this.a.getInt("ServerChecked", 0);
        try {
            String str = (String) super.getItem(i);
            textView.setText(str);
            Drawable drawableB = b(str);
            if (drawableB != null) {
                imageView.setImageDrawable(drawableB);
            } else {
                imageView.setImageResource(R.drawable.ic_app_icon);
            }
            if (str.toLowerCase().contains("auto select")) {
                textView2.setText("Random");
                i2 = -16776961;
            } else {
                textView2.setText("FREE");
                i2 = -65536;
            }
            textView2.setTextColor(i2);
        } catch (Exception unused) {
        }
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (String) super.getItem(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.server_item_drop, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.server_item_title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.server_item_icon);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.server_description);
        this.a.getInt("ServerChecked", 0);
        try {
            String str = (String) super.getItem(i);
            textView.setText(str);
            Drawable drawableB = b(str);
            if (drawableB != null) {
                imageView.setImageDrawable(drawableB);
            } else {
                imageView.setImageResource(R.drawable.ic_app_icon);
            }
            if (str.toLowerCase().contains("auto select")) {
                textView2.setText("Random");
                i2 = -16776961;
            } else {
                textView2.setText("FREE");
                i2 = -65536;
            }
            textView2.setTextColor(i2);
        } catch (Exception unused) {
        }
        return viewInflate;
    }
}
