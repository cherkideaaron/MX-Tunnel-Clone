package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import com.mxtunnel.pro.R;

/* renamed from: Qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC0298Qn implements DialogInterface.OnCancelListener, View.OnClickListener, AdapterView.OnItemSelectedListener, RadioGroup.OnCheckedChangeListener {
    public View a;
    public RadioGroup b;
    public DialogInterfaceC3303r1 c;
    public Context d;
    public InterfaceC0281Pn e;
    public SharedPreferences f;
    public SharedPreferences.Editor m;
    public EditText n;
    public Spinner o;
    public Spinner p;
    public RadioGroup q;
    public CheckBox r;
    public CheckBox s;
    public CheckBox t;
    public CheckBox u;
    public CheckBox v;
    public CheckBox w;
    public Button x;

    public final String a() {
        int selectedItemPosition = this.p.getSelectedItemPosition();
        RadioGroup radioGroup = this.b;
        int iIndexOfChild = radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()));
        if (selectedItemPosition == 0) {
            return "[crlf]";
        }
        if (selectedItemPosition == 1) {
            return "[crlf][crlf]";
        }
        if (selectedItemPosition != 2) {
            return null;
        }
        return iIndexOfChild == 2 ? "[crlf][crlf]" : "[crlf]";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogInterfaceOnCancelListenerC0298Qn.b():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(int r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            android.widget.RadioGroup r0 = r7.q
            int r1 = r0.getCheckedRadioButtonId()
            android.view.View r1 = r0.findViewById(r1)
            int r0 = r0.indexOfChild(r1)
            android.widget.Spinner r1 = r7.p
            int r1 = r1.getSelectedItemPosition()
            android.widget.RadioGroup r2 = r7.b
            int r3 = r2.getCheckedRadioButtonId()
            android.view.View r3 = r2.findViewById(r3)
            int r2 = r2.indexOfChild(r3)
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = "[protocol]"
            if (r1 != 0) goto L2a
            goto L40
        L2a:
            if (r1 != r5) goto L2d
            goto L40
        L2d:
            if (r1 != r4) goto L3f
            java.lang.String r1 = "HTTP/1.1"
            if (r0 == 0) goto L3c
            if (r0 == r5) goto L38
            if (r0 == r4) goto L38
            goto L3f
        L38:
            if (r2 != r4) goto L40
        L3a:
            r6 = r1
            goto L40
        L3c:
            if (r2 != r4) goto L40
            goto L3a
        L3f:
            r6 = r3
        L40:
            if (r8 == 0) goto L68
            if (r8 == r5) goto L50
            if (r8 == r4) goto L47
            goto L6e
        L47:
            java.lang.String r8 = "[host_port]@"
            java.lang.String r0 = " "
            java.lang.String r3 = defpackage.Vs.m(r8, r9, r0, r6, r10)
            goto L6e
        L50:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.String r9 = "@[host_port] "
            r8.append(r9)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r3 = r8.toString()
            goto L6e
        L68:
            java.lang.String r8 = "[host_port] "
            java.lang.String r3 = defpackage.AbstractC3264qG.x(r8, r6, r10)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogInterfaceOnCancelListenerC0298Qn.c(int, java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.e.e();
        this.c.dismiss();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int id = radioGroup.getId();
        if (id == R.id.query_mode) {
            this.m.putInt("QUERY_MODE", radioGroup.indexOfChild((RadioButton) radioGroup.findViewById(i))).apply();
            return;
        }
        if (id == R.id.split_group) {
            int iIndexOfChild = radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()));
            if (iIndexOfChild == 0 || iIndexOfChild == 1) {
                this.p.setSelection(2);
                this.o.setSelection(1);
            } else {
                if (iIndexOfChild != 2) {
                    return;
                }
                this.p.setSelection(0);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.n.getText().toString();
        if (view.getId() == R.id.generate_payload) {
            if (string.isEmpty()) {
                Toast.makeText(this.d, "URL/Host is empty!", 1).show();
                return;
            }
            this.m.putString("URL_HOST", string);
            this.m.putBoolean("ONLINE_HOST", this.r.isChecked());
            this.m.putBoolean("FORWARD_HOST", this.s.isChecked());
            this.m.putBoolean("REVERSE_PROXY", this.t.isChecked());
            this.m.putBoolean("KEEP_ALIVE", this.u.isChecked());
            this.m.putBoolean("PROXY_AUTH", this.v.isChecked());
            this.m.putBoolean("DUAL_CONNECT", this.w.isChecked());
            RadioGroup radioGroup = this.b;
            this.m.putInt("Split", this.b.indexOfChild((RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId())));
            this.m.putString("FIXED_PAYLOAD", b());
            this.m.apply();
            this.e.d(b());
        } else if (view.getId() != R.id.close_generator_dialog) {
            return;
        } else {
            this.e.e();
        }
        this.c.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Spinner spinner;
        SharedPreferences.Editor editorPutInt;
        int id = adapterView.getId();
        if (id == R.id.request_method) {
            this.m.putInt("SELECTED_REQUEST_METHOD", i).apply();
            editorPutInt = this.m.putString("METHOD", (String) adapterView.getSelectedItem());
        } else {
            if (id != R.id.inject_method) {
                return;
            }
            int i2 = 1;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    spinner = this.o;
                }
                editorPutInt = this.m.putInt("SELECTED_INJECT_METHOD", i);
            } else {
                ((RadioButton) this.b.getChildAt(2)).setChecked(true);
                spinner = this.o;
                i2 = 0;
            }
            spinner.setSelection(i2);
            editorPutInt = this.m.putInt("SELECTED_INJECT_METHOD", i);
        }
        editorPutInt.apply();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
