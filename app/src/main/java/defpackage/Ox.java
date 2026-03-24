package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* loaded from: classes2.dex */
public final class Ox implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;

    public Ox(View view, EditText editText, EditText editText2) {
        this.a = view;
        this.b = editText;
        this.c = editText2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.setVisibility(compoundButton.isChecked() ? 8 : 0);
        if (z) {
            return;
        }
        try {
            this.b.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18978812687290L));
            this.c.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18983107654586L));
        } catch (Exception unused) {
        }
    }
}
