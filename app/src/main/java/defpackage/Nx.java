package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Nx implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Switch f;
    public final /* synthetic */ TextView m;
    public final /* synthetic */ Spinner n;
    public final /* synthetic */ TextView o;
    public final /* synthetic */ TextView p;
    public final /* synthetic */ Spinner q;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ OpenVPNClient s;

    public Nx(OpenVPNClient openVPNClient, ImageView imageView, TextView textView, View view, View view2, View view3, Switch r7, TextView textView2, Spinner spinner, TextView textView3, TextView textView4, Spinner spinner2, boolean[] zArr) {
        this.s = openVPNClient;
        this.a = imageView;
        this.b = textView;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = r7;
        this.m = textView2;
        this.n = spinner;
        this.o = textView3;
        this.p = textView4;
        this.q = spinner2;
        this.r = zArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.r;
        Spinner spinner = this.q;
        TextView textView = this.p;
        TextView textView2 = this.o;
        Spinner spinner2 = this.n;
        TextView textView3 = this.m;
        Switch r9 = this.f;
        View view2 = this.e;
        View view3 = this.d;
        View view4 = this.c;
        TextView textView4 = this.b;
        ImageView imageView = this.a;
        OpenVPNClient openVPNClient = this.s;
        if (i == 0) {
            imageView.setVisibility(0);
            textView4.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18699639813050L));
            openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18733999551418L));
            openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18738294518714L));
            openVPNClient.p0.setHint(openVPNClient.getString(R.string.payload_hint));
            view4.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(0);
            r9.setVisibility(0);
            textView3.setVisibility(0);
            spinner2.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            spinner.setVisibility(0);
            zArr[0] = false;
            return;
        }
        if (i == 1) {
            imageView.setVisibility(8);
            textView4.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18755474387898L));
            openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18794129093562L));
            openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18798424060858L));
            openVPNClient.p0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18815603930042L));
            view4.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(0);
            r9.setVisibility(8);
            textView3.setVisibility(8);
            spinner2.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            spinner.setVisibility(0);
            zArr[0] = false;
            return;
        }
        if (i == 2) {
            imageView.setVisibility(0);
            textView4.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18888618374074L));
            openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18922978112442L));
            openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18927273079738L));
            openVPNClient.p0.setHint(openVPNClient.getString(R.string.payload_hint));
            view4.setVisibility(0);
            view3.setVisibility(0);
            view2.setVisibility(0);
            r9.setVisibility(8);
            textView3.setVisibility(0);
            spinner2.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            spinner.setVisibility(0);
            zArr[0] = true;
            return;
        }
        if (i == 3) {
            imageView.setVisibility(8);
            textView4.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18944452948922L));
            openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18948747916218L));
            openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18953042883514L));
            openVPNClient.p0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18957337850810L));
            view4.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            r9.setVisibility(8);
            textView3.setVisibility(8);
            spinner2.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            spinner.setVisibility(8);
            zArr[0] = false;
            return;
        }
        imageView.setVisibility(8);
        textView4.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18961632818106L));
        openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18965927785402L));
        openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18970222752698L));
        openVPNClient.p0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-18974517719994L));
        view4.setVisibility(8);
        view3.setVisibility(8);
        view2.setVisibility(8);
        r9.setVisibility(8);
        textView3.setVisibility(8);
        spinner2.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        spinner.setVisibility(8);
        zArr[0] = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
