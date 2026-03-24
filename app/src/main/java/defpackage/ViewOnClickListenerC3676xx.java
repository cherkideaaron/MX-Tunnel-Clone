package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* renamed from: xx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3676xx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC3676xx(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                String str = OpenVPNClient.Y0;
                OpenVPNClient openVPNClient = (OpenVPNClient) obj2;
                View viewInflate = openVPNClient.getLayoutInflater().inflate(R.layout.custom_tweak_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewInflate.findViewById(R.id.custom_tweak_name);
                EditText editText2 = (EditText) viewInflate.findViewById(R.id.custom_tweak_message);
                editText2.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-33341183325114L));
                Spinner spinner = (Spinner) viewInflate.findViewById(R.id.custom_tweak_mode);
                TextView textView = (TextView) viewInflate.findViewById(R.id.custom_preload_title);
                Spinner spinner2 = (Spinner) viewInflate.findViewById(R.id.preload_pay);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tweak_type_title);
                Spinner spinner3 = (Spinner) viewInflate.findViewById(R.id.custom_tweak_type);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tweak_mode_title);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.proxy_settings);
                openVPNClient.p0 = (EditText) viewInflate.findViewById(R.id.custom_tweak_edit);
                openVPNClient.q0 = (EditText) viewInflate.findViewById(R.id.custom_tweak_sni);
                EditText editText3 = (EditText) viewInflate.findViewById(R.id.custom_tweak_proxy);
                EditText editText4 = (EditText) viewInflate.findViewById(R.id.custom_tweak_proxy_port);
                Switch r3 = (Switch) viewInflate.findViewById(R.id.custom_tweak_default_proxy);
                View viewFindViewById = viewInflate.findViewById(R.id.custom_tweak_proxy_layout);
                View viewFindViewById2 = viewInflate.findViewById(R.id.custom_tweak_sni_layout);
                View viewFindViewById3 = viewInflate.findViewById(R.id.payload_lay);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.custom_tweak_generate);
                openVPNClient.D0 = (CheckBox) viewInflate.findViewById(R.id.tweak_expiry_date);
                openVPNClient.E0 = (CheckBox) viewInflate.findViewById(R.id.tweak_hwid_lock);
                openVPNClient.F0 = (CheckBox) viewInflate.findViewById(R.id.tweak_password_lock);
                CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.tweak_mobile_data);
                CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.tweak_block_root);
                openVPNClient.L0 = Deobfuscator$MHRTUNNELVPN$app.getString(-33379838030778L);
                openVPNClient.M0 = Deobfuscator$MHRTUNNELVPN$app.getString(-33384132998074L);
                openVPNClient.N0 = Deobfuscator$MHRTUNNELVPN$app.getString(-33388427965370L);
                String[] strArr = {Deobfuscator$MHRTUNNELVPN$app.getString(-33392722932666L)};
                String[] strArr2 = {Deobfuscator$MHRTUNNELVPN$app.getString(-33418492736442L)};
                openVPNClient.D0.setOnCheckedChangeListener(new Kx(openVPNClient, 0));
                openVPNClient.E0.setOnCheckedChangeListener(new Kx(openVPNClient, 1));
                openVPNClient.F0.setOnCheckedChangeListener(new Kx(openVPNClient, 2));
                checkBox.setOnCheckedChangeListener(new Mx(strArr, 0));
                checkBox2.setOnCheckedChangeListener(new Mx(strArr2, 1));
                imageView.setVisibility(0);
                textView3.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-33444262540218L));
                openVPNClient.q0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-33478622278586L));
                openVPNClient.q0.setHint(Deobfuscator$MHRTUNNELVPN$app.getString(-33482917245882L));
                openVPNClient.p0.setHint(openVPNClient.getString(R.string.payload_hint));
                viewFindViewById.setVisibility(0);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
                r3.setVisibility(0);
                textView.setVisibility(0);
                spinner2.setVisibility(0);
                textView4.setVisibility(0);
                textView2.setVisibility(0);
                spinner3.setVisibility(0);
                boolean[] zArr = {false};
                String[] strArr3 = {Deobfuscator$MHRTUNNELVPN$app.getString(-33500097115066L), Deobfuscator$MHRTUNNELVPN$app.getString(-33521571951546L), Deobfuscator$MHRTUNNELVPN$app.getString(-33538751820730L), Deobfuscator$MHRTUNNELVPN$app.getString(-33581701493690L), Deobfuscator$MHRTUNNELVPN$app.getString(-33637536068538L)};
                String[] strArr4 = {Deobfuscator$MHRTUNNELVPN$app.getString(-33689075676090L), Deobfuscator$MHRTUNNELVPN$app.getString(-33714845479866L), Deobfuscator$MHRTUNNELVPN$app.getString(-33740615283642L)};
                String[] strArr5 = {Deobfuscator$MHRTUNNELVPN$app.getString(-33783564956602L), Deobfuscator$MHRTUNNELVPN$app.getString(-33805039793082L), Deobfuscator$MHRTUNNELVPN$app.getString(-33856579400634L), Deobfuscator$MHRTUNNELVPN$app.getString(-33908119008186L)};
                spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(openVPNClient, android.R.layout.simple_dropdown_item_1line, strArr3));
                spinner.setSelection(0, false);
                spinner.setOnItemSelectedListener(new Nx(openVPNClient, imageView, textView3, viewFindViewById, viewFindViewById2, viewFindViewById3, r3, textView, spinner2, textView4, textView2, spinner3, zArr));
                spinner3.setAdapter((SpinnerAdapter) new ArrayAdapter(openVPNClient, android.R.layout.simple_dropdown_item_1line, strArr4));
                spinner3.setSelection(0, false);
                r3.setOnCheckedChangeListener(new Ox(viewFindViewById, editText3, editText4));
                spinner2.setAdapter((SpinnerAdapter) new ArrayAdapter(openVPNClient, android.R.layout.simple_dropdown_item_1line, strArr5));
                spinner2.setSelection(0, false);
                spinner2.setOnItemSelectedListener(new Px(openVPNClient, zArr));
                Button button = (Button) viewInflate.findViewById(R.id.custok_tweak_save);
                DialogInterfaceC3303r1 dialogInterfaceC3303r1A = new C3249q1(openVPNClient, R.style.MyDialogTheme).a();
                dialogInterfaceC3303r1A.setTitle(Deobfuscator$MHRTUNNELVPN$app.getString(-33972543517626L));
                C3194p1 c3194p1 = dialogInterfaceC3303r1A.f;
                c3194p1.h = viewInflate;
                c3194p1.i = 0;
                c3194p1.j = false;
                imageView.setOnClickListener(new Qx(openVPNClient, 0));
                button.setOnClickListener(new Sx(openVPNClient, editText, spinner, editText3, editText4, r3, editText2, spinner3, strArr, strArr2, dialogInterfaceC3303r1A));
                dialogInterfaceC3303r1A.show();
                ((DialogInterfaceC3303r1) obj).dismiss();
                break;
            case 1:
                String str2 = OpenVPNClient.Y0;
                OpenVPNClient openVPNClient2 = (OpenVPNClient) obj2;
                openVPNClient2.getClass();
                Intent intent = new Intent(Deobfuscator$MHRTUNNELVPN$app.getString(-58123144623034L));
                intent.setType(Deobfuscator$MHRTUNNELVPN$app.getString(-58269173511098L));
                intent.addCategory(Deobfuscator$MHRTUNNELVPN$app.getString(-58286353380282L));
                openVPNClient2.startActivityForResult(intent, 1001);
                ((DialogInterfaceC3303r1) obj).dismiss();
                break;
            default:
                C2771hG c2771hG = (C2771hG) obj2;
                c2771hG.getClass();
                ((View.OnClickListener) obj).onClick(view);
                c2771hG.a(1);
                break;
        }
    }
}
