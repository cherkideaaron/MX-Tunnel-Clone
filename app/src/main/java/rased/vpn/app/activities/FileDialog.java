package rased.vpn.app.activities;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.DialogInterfaceOnClickListenerC0603ck;
import defpackage.ViewOnClickListenerC0549bk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class FileDialog extends ListActivity {
    public static final String y = Environment.getExternalStorageDirectory().getAbsolutePath();
    public InputMethodManager d;
    public LinearLayout f;
    public LinearLayout m;
    public EditText n;
    public ArrayList o;
    public TextView r;
    public TextView s;
    public String t;
    public Button v;
    public File w;
    public boolean a = false;
    public String b = "/";
    public String[] c = null;
    public final HashMap e = new HashMap();
    public boolean p = false;
    public boolean q = false;
    public ArrayList u = null;
    public int x = 0;

    public final void a(int i, String str) {
        HashMap map = new HashMap();
        map.put("key", str);
        map.put("image", Integer.valueOf(i));
        this.o.add(map);
    }

    public final void b(String str) {
        File[] fileArr;
        boolean z = str.length() < this.b.length();
        Integer num = (Integer) this.e.get(this.t);
        this.b = str;
        ArrayList arrayList = new ArrayList();
        this.u = new ArrayList();
        this.o = new ArrayList();
        File file = new File(this.b);
        File[] fileArrListFiles = file.listFiles();
        String str2 = y;
        if (fileArrListFiles == null) {
            this.b = str2;
            file = new File(this.b);
            fileArrListFiles = file.listFiles();
        }
        c(R.string.file_dialog_location, this.b);
        if (!this.b.equals(str2)) {
            arrayList.add("ExtStorage");
            a(2131230910, "ExtStorage");
            this.u.add(str2);
        }
        if (!this.b.equals("/")) {
            arrayList.add("../");
            a(2131230910, "../");
            this.u.add(file.getParent());
            this.t = file.getParent();
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        TreeMap treeMap4 = new TreeMap();
        int length = fileArrListFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = fileArrListFiles[i];
            if (file2.isDirectory()) {
                String name = file2.getName();
                treeMap.put(name, name);
                treeMap2.put(name, file2.getPath());
                fileArr = fileArrListFiles;
            } else {
                String name2 = file2.getName();
                String lowerCase = name2.toLowerCase();
                if (this.c != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = this.c;
                        fileArr = fileArrListFiles;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        if (lowerCase.endsWith(strArr[i2].toLowerCase())) {
                            break;
                        }
                        i2++;
                        fileArrListFiles = fileArr;
                    }
                } else {
                    fileArr = fileArrListFiles;
                }
                treeMap3.put(name2, name2);
                treeMap4.put(name2, file2.getPath());
            }
            i++;
            fileArrListFiles = fileArr;
        }
        arrayList.addAll(treeMap.tailMap("").values());
        arrayList.addAll(treeMap3.tailMap("").values());
        this.u.addAll(treeMap2.tailMap("").values());
        this.u.addAll(treeMap4.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.o, R.layout.file_dialog_row, new String[]{"key", "image"}, new int[]{R.id.fdrowtext, R.id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            a(2131230910, (String) it.next());
        }
        Iterator it2 = treeMap3.tailMap("").values().iterator();
        while (it2.hasNext()) {
            a(2131230909, (String) it2.next());
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
        if (num == null || !z) {
            return;
        }
        getListView().setSelection(num.intValue());
    }

    public final void c(int i, String str) {
        if (this.q) {
            setTitle(str);
            return;
        }
        this.r.setText(((Object) getText(i)) + ": " + str);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0, getIntent());
        int i = a.f;
        setContentView(R.layout.file_dialog_main);
        this.r = (TextView) findViewById(R.id.fdPath);
        this.s = (TextView) findViewById(R.id.fdPrompt);
        this.n = (EditText) findViewById(R.id.fdEditTextFile);
        this.p = getIntent().getBooleanExtra("OPTION_ONE_CLICK_SELECT", this.p);
        boolean booleanExtra = getIntent().getBooleanExtra("OPTION_CURRENT_PATH_IN_TITLEBAR", this.q);
        this.q = booleanExtra;
        if (booleanExtra) {
            this.r.setVisibility(8);
        }
        String stringExtra = getIntent().getStringExtra("OPTION_PROMPT");
        if (stringExtra != null) {
            this.s.setText(stringExtra);
            this.s.setVisibility(0);
        } else {
            this.s.setVisibility(8);
        }
        this.d = (InputMethodManager) getSystemService("input_method");
        Button button = (Button) findViewById(R.id.fdButtonSelect);
        this.v = button;
        button.setEnabled(false);
        this.v.setOnClickListener(new ViewOnClickListenerC0549bk(this, 0));
        Button button2 = (Button) findViewById(R.id.fdButtonNew);
        button2.setOnClickListener(new ViewOnClickListenerC0549bk(this, 1));
        this.x = getIntent().getIntExtra("SELECTION_MODE", 0);
        this.c = getIntent().getStringArrayExtra("FORMAT_FILTER");
        this.a = getIntent().getBooleanExtra("CAN_SELECT_DIR", false);
        if (this.x == 1) {
            button2.setVisibility(8);
        }
        this.m = (LinearLayout) findViewById(R.id.fdLinearLayoutSelect);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fdLinearLayoutCreate);
        this.f = linearLayout;
        linearLayout.setVisibility(8);
        if (this.x == 1 && this.p) {
            this.m.setVisibility(8);
        }
        ((Button) findViewById(R.id.fdButtonCancel)).setOnClickListener(new ViewOnClickListenerC0549bk(this, 2));
        ((Button) findViewById(R.id.fdButtonCreate)).setOnClickListener(new ViewOnClickListenerC0549bk(this, 3));
        String stringExtra2 = getIntent().getStringExtra("START_PATH");
        if (stringExtra2 == null) {
            stringExtra2 = "/";
        }
        if (this.a) {
            this.w = new File(stringExtra2);
            this.v.setEnabled(true);
        }
        b(stringExtra2);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.v.setEnabled(false);
        if (this.f.getVisibility() == 0) {
            this.f.setVisibility(8);
            this.m.setVisibility(0);
            return true;
        }
        if (this.b.equals(y)) {
            return super.onKeyDown(i, keyEvent);
        }
        b(this.t);
        return true;
    }

    @Override // android.app.ListActivity
    public final void onListItemClick(ListView listView, View view, int i, long j) {
        File file = new File((String) this.u.get(i));
        if (!this.p) {
            this.f.setVisibility(8);
            this.m.setVisibility(0);
            this.d.hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.v.setEnabled(false);
        }
        if (!file.isDirectory()) {
            this.w = file;
            view.setSelected(true);
            this.v.setEnabled(true);
            c(R.string.file_dialog_select, file.getPath());
            if (this.p) {
                this.v.performClick();
                return;
            }
            return;
        }
        this.v.setEnabled(false);
        if (!file.canRead()) {
            new AlertDialog.Builder(this).setIcon(2131230904).setTitle("[" + file.getName() + "] " + ((Object) getText(R.string.file_dialog_cant_read_folder))).setPositiveButton("OK", new DialogInterfaceOnClickListenerC0603ck(0)).show();
            return;
        }
        this.e.put(this.b, Integer.valueOf(i));
        b((String) this.u.get(i));
        if (this.a) {
            this.w = file;
            view.setSelected(true);
            this.v.setEnabled(true);
        }
    }
}
