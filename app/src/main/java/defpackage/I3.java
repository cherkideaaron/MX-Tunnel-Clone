package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class I3 extends ArrayAdapter {
    public final ArrayList a;
    public final ArrayList b;
    public String c;

    public I3(Context context) {
        super(context, R.layout.app_list_view);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = "";
    }

    @Override // android.widget.ArrayAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void add(J3 j3) {
        this.a.add(j3);
        String str = this.c;
        if ((str == null || str.length() == 0) ? true : j3.c.toLowerCase().contains(str.toLowerCase())) {
            this.b.add(j3);
        }
        notifyDataSetChanged();
    }

    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        this.c = str;
        ArrayList arrayList = this.b;
        arrayList.clear();
        int length = this.c.length();
        ArrayList arrayList2 = this.a;
        if (length == 0) {
            arrayList.addAll(arrayList2);
        } else {
            String lowerCase = this.c.toLowerCase();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                J3 j3 = (J3) it.next();
                String str2 = j3.c;
                if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                    arrayList.add(j3);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        this.a.clear();
        this.b.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (J3) this.b.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.app_list_view, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.name);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checked);
        J3 j3 = (J3) this.b.get(i);
        PackageManager packageManager = getContext().getPackageManager();
        ApplicationInfo applicationInfo = j3.a.applicationInfo;
        imageView.setImageDrawable(applicationInfo.loadIcon(packageManager));
        textView.setText(applicationInfo.loadLabel(packageManager).toString());
        checkBox.setChecked(j3.b);
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter
    public final void sort(Comparator comparator) {
        Collections.sort(this.a, comparator);
        b(this.c);
    }
}
