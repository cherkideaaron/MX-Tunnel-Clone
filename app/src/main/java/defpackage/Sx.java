package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public final class Sx implements View.OnClickListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ Spinner b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ Switch e;
    public final /* synthetic */ EditText f;
    public final /* synthetic */ Spinner m;
    public final /* synthetic */ String[] n;
    public final /* synthetic */ String[] o;
    public final /* synthetic */ DialogInterfaceC3303r1 p;
    public final /* synthetic */ OpenVPNClient q;

    public Sx(OpenVPNClient openVPNClient, EditText editText, Spinner spinner, EditText editText2, EditText editText3, Switch r6, EditText editText4, Spinner spinner2, String[] strArr, String[] strArr2, DialogInterfaceC3303r1 dialogInterfaceC3303r1) {
        this.q = openVPNClient;
        this.a = editText;
        this.b = spinner;
        this.c = editText2;
        this.d = editText3;
        this.e = r6;
        this.f = editText4;
        this.m = spinner2;
        this.n = strArr;
        this.o = strArr2;
        this.p = dialogInterfaceC3303r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, IOException {
        String string;
        int i;
        boolean z;
        Exception exc;
        Context applicationContext;
        StringBuilder sb;
        long j;
        String string2;
        String string3;
        Context applicationContext2;
        long j2;
        String string4;
        String string5;
        String string6;
        String string7;
        int i2;
        String string8;
        String string9;
        Context applicationContext3;
        long j3;
        Exception exc2;
        Context applicationContext4;
        StringBuilder sb2;
        long j4;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18 = this.a.getText().toString();
        boolean zIsEmpty = string18.isEmpty();
        OpenVPNClient openVPNClient = this.q;
        if (zIsEmpty) {
            SweetToast.error(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-20383266993082L));
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= openVPNClient.U0.size()) {
                    string = string18;
                    i = 1;
                    z = false;
                    break;
                } else {
                    if (string18.equalsIgnoreCase(((JSONObject) openVPNClient.U0.get(i3)).optString(Deobfuscator$MHRTUNNELVPN$app.getString(-20473461306298L), Deobfuscator$MHRTUNNELVPN$app.getString(-20533590848442L)))) {
                        string = string18;
                        z = true;
                        i = 1;
                        break;
                    }
                    i3++;
                }
            }
            while (z) {
                StringBuilder sbN = AbstractC3264qG.n(string18);
                sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-20537885815738L));
                sbN.append(i);
                sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-20550770717626L));
                string = sbN.toString();
                int i4 = 0;
                while (true) {
                    if (i4 >= openVPNClient.U0.size()) {
                        z = false;
                        break;
                    } else {
                        if (string.equalsIgnoreCase(((JSONObject) openVPNClient.U0.get(i4)).optString(Deobfuscator$MHRTUNNELVPN$app.getString(-20559360652218L), Deobfuscator$MHRTUNNELVPN$app.getString(-20619490194362L)))) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                }
                i++;
            }
            int selectedItemPosition = this.b.getSelectedItemPosition();
            EditText editText = this.d;
            EditText editText2 = this.c;
            DialogInterfaceC3303r1 dialogInterfaceC3303r1 = this.p;
            String[] strArr = this.o;
            String[] strArr2 = this.n;
            Spinner spinner = this.m;
            Switch r9 = this.e;
            EditText editText3 = this.f;
            if (selectedItemPosition == 0) {
                String string19 = openVPNClient.p0.getText().toString();
                String string20 = editText2.getText().toString();
                String string21 = editText.getText().toString();
                if (string19.isEmpty() || ((string20.isEmpty() && !r9.isChecked()) || (string21.isEmpty() && !r9.isChecked()))) {
                    applicationContext3 = openVPNClient.getApplicationContext();
                    j3 = -20623785161658L;
                    SweetToast.error(applicationContext3, Deobfuscator$MHRTUNNELVPN$app.getString(j3));
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20748339213242L), string);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20808468755386L), string19);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20842828493754L), Deobfuscator$MHRTUNNELVPN$app.getString(-20877188232122L));
                        if (r9.isChecked()) {
                            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20924432872378L), Deobfuscator$MHRTUNNELVPN$app.getString(-20945907708858L));
                            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20975972479930L), Deobfuscator$MHRTUNNELVPN$app.getString(-20997447316410L));
                        } else {
                            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20881483199418L), string20);
                            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-20902958035898L), string21);
                        }
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21010332218298L), Deobfuscator$MHRTUNNELVPN$app.getString(-21044691956666L));
                        if (editText3.getText().toString().isEmpty()) {
                            string14 = Deobfuscator$MHRTUNNELVPN$app.getString(-21048986923962L);
                            string15 = Deobfuscator$MHRTUNNELVPN$app.getString(-21083346662330L);
                        } else {
                            string14 = Deobfuscator$MHRTUNNELVPN$app.getString(-21169246008250L);
                            string15 = Deobfuscator$MHRTUNNELVPN$app.getString(-21203605746618L) + editText3.getText().toString();
                        }
                        jSONObject.put(string14, string15);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21272325223354L), Deobfuscator$MHRTUNNELVPN$app.getString(-21302389994426L));
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21323864830906L), Deobfuscator$MHRTUNNELVPN$app.getString(-21349634634682L));
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21375404438458L), Deobfuscator$MHRTUNNELVPN$app.getString(-21401174242234L));
                        if (spinner.getSelectedItemPosition() == 0) {
                            string16 = Deobfuscator$MHRTUNNELVPN$app.getString(-21431239013306L);
                            string17 = Deobfuscator$MHRTUNNELVPN$app.getString(-21469893718970L);
                        } else if (spinner.getSelectedItemPosition() == 1) {
                            string16 = Deobfuscator$MHRTUNNELVPN$app.getString(-21495663522746L);
                            string17 = Deobfuscator$MHRTUNNELVPN$app.getString(-21534318228410L);
                        } else {
                            string16 = Deobfuscator$MHRTUNNELVPN$app.getString(-21560088032186L);
                            string17 = Deobfuscator$MHRTUNNELVPN$app.getString(-21598742737850L);
                        }
                        jSONObject.put(string16, string17);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21641692410810L), openVPNClient.L0);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21697526985658L), openVPNClient.M0);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21740476658618L), strArr2[0]);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21813491102650L), strArr[0]);
                        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-21869325677498L), openVPNClient.N0);
                        JSONObject jSONObjectM = openVPNClient.m();
                        jSONObjectM.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-21933750186938L)).put(jSONObject);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-21972404892602L)));
                        fileOutputStream.write(AbstractC3279qd.u(jSONObjectM.toString(2)).getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-22032534434746L));
                        dialogInterfaceC3303r1.dismiss();
                        openVPNClient.N();
                        final int i5 = 0;
                        while (i5 < openVPNClient.U0.size()) {
                            if (string.equals(((JSONObject) openVPNClient.U0.get(i5)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-22144203584442L)))) {
                                openVPNClient.r0.setSelection(i5 == 0 ? 1 : 0);
                                final int i6 = 0;
                                openVPNClient.r0.postDelayed(new Runnable(this) { // from class: Rx
                                    public final /* synthetic */ Sx b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                this.b.q.r0.setSelection(i5);
                                                break;
                                            case 1:
                                                this.b.q.r0.setSelection(i5);
                                                break;
                                            case 2:
                                                this.b.q.r0.setSelection(i5);
                                                break;
                                            case 3:
                                                this.b.q.r0.setSelection(i5);
                                                break;
                                            default:
                                                this.b.q.r0.setSelection(i5);
                                                break;
                                        }
                                    }
                                }, 100L);
                            }
                            i5++;
                        }
                        openVPNClient.Y(string, jSONObject);
                    } catch (Exception e) {
                        exc2 = e;
                        applicationContext4 = openVPNClient.getApplicationContext();
                        sb2 = new StringBuilder();
                        j4 = -22204333126586L;
                        sb2.append(Deobfuscator$MHRTUNNELVPN$app.getString(j4));
                        sb2.append(exc2.getMessage());
                        SweetToast.error(applicationContext4, sb2.toString());
                    }
                }
            } else if (selectedItemPosition == 1) {
                String string22 = openVPNClient.p0.getText().toString();
                if (string.isEmpty() || string22.isEmpty()) {
                    applicationContext3 = openVPNClient.getApplicationContext();
                    j3 = -22281642537914L;
                    SweetToast.error(applicationContext3, Deobfuscator$MHRTUNNELVPN$app.getString(j3));
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22406196589498L), string);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22466326131642L), Deobfuscator$MHRTUNNELVPN$app.getString(-22500685870010L));
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22504980837306L), string22);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22539340575674L), Deobfuscator$MHRTUNNELVPN$app.getString(-22560815412154L));
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22565110379450L), Deobfuscator$MHRTUNNELVPN$app.getString(-22586585215930L));
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22590880183226L), Deobfuscator$MHRTUNNELVPN$app.getString(-22625239921594L));
                        if (editText3.getText().toString().isEmpty()) {
                            string10 = Deobfuscator$MHRTUNNELVPN$app.getString(-22629534888890L);
                            string11 = Deobfuscator$MHRTUNNELVPN$app.getString(-22663894627258L);
                        } else {
                            string10 = Deobfuscator$MHRTUNNELVPN$app.getString(-22745499005882L);
                            string11 = Deobfuscator$MHRTUNNELVPN$app.getString(-22779858744250L) + editText3.getText().toString();
                        }
                        jSONObject2.put(string10, string11);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22848578220986L), Deobfuscator$MHRTUNNELVPN$app.getString(-22878642992058L));
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22895822861242L), Deobfuscator$MHRTUNNELVPN$app.getString(-22921592665018L));
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-22947362468794L), Deobfuscator$MHRTUNNELVPN$app.getString(-22973132272570L));
                        if (spinner.getSelectedItemPosition() == 0) {
                            string12 = Deobfuscator$MHRTUNNELVPN$app.getString(-23003197043642L);
                            string13 = Deobfuscator$MHRTUNNELVPN$app.getString(-23041851749306L);
                        } else if (spinner.getSelectedItemPosition() == 1) {
                            string12 = Deobfuscator$MHRTUNNELVPN$app.getString(-23067621553082L);
                            string13 = Deobfuscator$MHRTUNNELVPN$app.getString(-23106276258746L);
                        } else {
                            string12 = Deobfuscator$MHRTUNNELVPN$app.getString(-23132046062522L);
                            string13 = Deobfuscator$MHRTUNNELVPN$app.getString(-23170700768186L);
                        }
                        jSONObject2.put(string12, string13);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23213650441146L), openVPNClient.L0);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23269485015994L), openVPNClient.M0);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23312434688954L), strArr2[0]);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23385449132986L), strArr[0]);
                        jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23441283707834L), openVPNClient.N0);
                        JSONObject jSONObjectM2 = openVPNClient.m();
                        jSONObjectM2.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-23505708217274L)).put(jSONObject2);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-23544362922938L)));
                        fileOutputStream2.write(AbstractC3279qd.u(jSONObjectM2.toString(2)).getBytes());
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-23604492465082L));
                        dialogInterfaceC3303r1.dismiss();
                        openVPNClient.N();
                        final int i7 = 0;
                        while (i7 < openVPNClient.U0.size()) {
                            if (string.equals(((JSONObject) openVPNClient.U0.get(i7)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-23716161614778L)))) {
                                openVPNClient.r0.setSelection(i7 == 0 ? 1 : 0);
                                final int i8 = 1;
                                openVPNClient.r0.postDelayed(new Runnable(this) { // from class: Rx
                                    public final /* synthetic */ Sx b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i8) {
                                            case 0:
                                                this.b.q.r0.setSelection(i7);
                                                break;
                                            case 1:
                                                this.b.q.r0.setSelection(i7);
                                                break;
                                            case 2:
                                                this.b.q.r0.setSelection(i7);
                                                break;
                                            case 3:
                                                this.b.q.r0.setSelection(i7);
                                                break;
                                            default:
                                                this.b.q.r0.setSelection(i7);
                                                break;
                                        }
                                    }
                                }, 100L);
                            }
                            i7++;
                        }
                        openVPNClient.Y(string, jSONObject2);
                    } catch (Exception e2) {
                        exc2 = e2;
                        applicationContext4 = openVPNClient.getApplicationContext();
                        sb2 = new StringBuilder();
                        j4 = -23776291156922L;
                        sb2.append(Deobfuscator$MHRTUNNELVPN$app.getString(j4));
                        sb2.append(exc2.getMessage());
                        SweetToast.error(applicationContext4, sb2.toString());
                    }
                }
            } else {
                if (selectedItemPosition != 2) {
                    if (selectedItemPosition == 3) {
                        if (string.isEmpty()) {
                            applicationContext2 = openVPNClient.getApplicationContext();
                            j2 = -25541522715578L;
                            SweetToast.error(applicationContext2, Deobfuscator$MHRTUNNELVPN$app.getString(j2));
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25666076767162L), string);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25726206309306L), Deobfuscator$MHRTUNNELVPN$app.getString(-25760566047674L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25764861014970L), Deobfuscator$MHRTUNNELVPN$app.getString(-25799220753338L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25803515720634L), Deobfuscator$MHRTUNNELVPN$app.getString(-25824990557114L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25855055328186L), Deobfuscator$MHRTUNNELVPN$app.getString(-25876530164666L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25923774804922L), Deobfuscator$MHRTUNNELVPN$app.getString(-25958134543290L));
                            if (editText3.getText().toString().isEmpty()) {
                                string4 = Deobfuscator$MHRTUNNELVPN$app.getString(-25962429510586L);
                                string5 = Deobfuscator$MHRTUNNELVPN$app.getString(-25996789248954L);
                            } else {
                                string4 = Deobfuscator$MHRTUNNELVPN$app.getString(-26082688594874L);
                                string5 = Deobfuscator$MHRTUNNELVPN$app.getString(-26117048333242L) + editText3.getText().toString();
                            }
                            jSONObject3.put(string4, string5);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26185767809978L), Deobfuscator$MHRTUNNELVPN$app.getString(-26215832581050L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26233012450234L), Deobfuscator$MHRTUNNELVPN$app.getString(-26258782254010L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26284552057786L), Deobfuscator$MHRTUNNELVPN$app.getString(-26310321861562L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26340386632634L), Deobfuscator$MHRTUNNELVPN$app.getString(-26379041338298L));
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26409106109370L), openVPNClient.L0);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26464940684218L), openVPNClient.M0);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26507890357178L), strArr2[0]);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26580904801210L), strArr[0]);
                            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-26636739376058L), openVPNClient.N0);
                            JSONObject jSONObjectM3 = openVPNClient.m();
                            jSONObjectM3.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-26701163885498L)).put(jSONObject3);
                            FileOutputStream fileOutputStream3 = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-26739818591162L)));
                            fileOutputStream3.write(AbstractC3279qd.u(jSONObjectM3.toString(2)).getBytes());
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-26799948133306L));
                            dialogInterfaceC3303r1.dismiss();
                            openVPNClient.N();
                            final int i9 = 0;
                            while (i9 < openVPNClient.U0.size()) {
                                if (string.equals(((JSONObject) openVPNClient.U0.get(i9)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-26911617283002L)))) {
                                    openVPNClient.r0.setSelection(i9 == 0 ? 1 : 0);
                                    final int i10 = 3;
                                    openVPNClient.r0.postDelayed(new Runnable(this) { // from class: Rx
                                        public final /* synthetic */ Sx b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    this.b.q.r0.setSelection(i9);
                                                    break;
                                                case 1:
                                                    this.b.q.r0.setSelection(i9);
                                                    break;
                                                case 2:
                                                    this.b.q.r0.setSelection(i9);
                                                    break;
                                                case 3:
                                                    this.b.q.r0.setSelection(i9);
                                                    break;
                                                default:
                                                    this.b.q.r0.setSelection(i9);
                                                    break;
                                            }
                                        }
                                    }, 100L);
                                }
                                i9++;
                            }
                            openVPNClient.Y(string, jSONObject3);
                            return;
                        } catch (Exception e3) {
                            exc = e3;
                            applicationContext = openVPNClient.getApplicationContext();
                            sb = new StringBuilder();
                            j = -26971746825146L;
                            sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(j));
                            sb.append(exc.getMessage());
                            SweetToast.error(applicationContext, sb.toString());
                            return;
                        }
                    }
                    if (string.isEmpty()) {
                        applicationContext2 = openVPNClient.getApplicationContext();
                        j2 = -27049056236474L;
                        SweetToast.error(applicationContext2, Deobfuscator$MHRTUNNELVPN$app.getString(j2));
                        return;
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27173610288058L), string);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27233739830202L), Deobfuscator$MHRTUNNELVPN$app.getString(-27268099568570L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27272394535866L), Deobfuscator$MHRTUNNELVPN$app.getString(-27306754274234L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27311049241530L), Deobfuscator$MHRTUNNELVPN$app.getString(-27332524078010L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27362588849082L), Deobfuscator$MHRTUNNELVPN$app.getString(-27384063685562L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27414128456634L), Deobfuscator$MHRTUNNELVPN$app.getString(-27448488195002L));
                        if (editText3.getText().toString().isEmpty()) {
                            string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-27452783162298L);
                            string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-27487142900666L);
                        } else {
                            string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-27603107017658L);
                            string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-27637466756026L) + editText3.getText().toString();
                        }
                        jSONObject4.put(string2, string3);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27706186232762L), Deobfuscator$MHRTUNNELVPN$app.getString(-27736251003834L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27766315774906L), Deobfuscator$MHRTUNNELVPN$app.getString(-27792085578682L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27817855382458L), Deobfuscator$MHRTUNNELVPN$app.getString(-27843625186234L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27873689957306L), Deobfuscator$MHRTUNNELVPN$app.getString(-27912344662970L));
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-27955294335930L), openVPNClient.L0);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-28011128910778L), openVPNClient.M0);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-28054078583738L), strArr2[0]);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-28127093027770L), strArr[0]);
                        jSONObject4.put(Deobfuscator$MHRTUNNELVPN$app.getString(-28182927602618L), openVPNClient.N0);
                        JSONObject jSONObjectM4 = openVPNClient.m();
                        jSONObjectM4.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-28247352112058L)).put(jSONObject4);
                        FileOutputStream fileOutputStream4 = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-28286006817722L)));
                        fileOutputStream4.write(AbstractC3279qd.u(jSONObjectM4.toString(2)).getBytes());
                        fileOutputStream4.flush();
                        fileOutputStream4.close();
                        SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-28346136359866L));
                        dialogInterfaceC3303r1.dismiss();
                        openVPNClient.N();
                        final int i11 = 0;
                        while (i11 < openVPNClient.U0.size()) {
                            if (string.equals(((JSONObject) openVPNClient.U0.get(i11)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-28457805509562L)))) {
                                openVPNClient.r0.setSelection(i11 == 0 ? 1 : 0);
                                final int i12 = 4;
                                openVPNClient.r0.postDelayed(new Runnable(this) { // from class: Rx
                                    public final /* synthetic */ Sx b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                this.b.q.r0.setSelection(i11);
                                                break;
                                            case 1:
                                                this.b.q.r0.setSelection(i11);
                                                break;
                                            case 2:
                                                this.b.q.r0.setSelection(i11);
                                                break;
                                            case 3:
                                                this.b.q.r0.setSelection(i11);
                                                break;
                                            default:
                                                this.b.q.r0.setSelection(i11);
                                                break;
                                        }
                                    }
                                }, 100L);
                            }
                            i11++;
                        }
                        openVPNClient.Y(string, jSONObject4);
                        return;
                    } catch (Exception e4) {
                        exc = e4;
                        applicationContext = openVPNClient.getApplicationContext();
                        sb = new StringBuilder();
                        j = -28517935051706L;
                        sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(j));
                        sb.append(exc.getMessage());
                        SweetToast.error(applicationContext, sb.toString());
                        return;
                    }
                }
                String string23 = openVPNClient.q0.getText().toString();
                String string24 = openVPNClient.p0.getText().toString();
                String string25 = editText2.getText().toString();
                String string26 = editText.getText().toString();
                if (string24.isEmpty() || ((string25.isEmpty() && !r9.isChecked()) || ((string26.isEmpty() && !r9.isChecked()) || string23.isEmpty()))) {
                    applicationContext2 = openVPNClient.getApplicationContext();
                    j2 = -23853600568250L;
                    SweetToast.error(applicationContext2, Deobfuscator$MHRTUNNELVPN$app.getString(j2));
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-23978154619834L), string);
                    try {
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24038284161978L), string24 + Deobfuscator$MHRTUNNELVPN$app.getString(-24072643900346L) + string23);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24081233834938L), Deobfuscator$MHRTUNNELVPN$app.getString(-24115593573306L));
                        if (r9.isChecked()) {
                            jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24162838213562L), Deobfuscator$MHRTUNNELVPN$app.getString(-24184313050042L));
                            jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24214377821114L), Deobfuscator$MHRTUNNELVPN$app.getString(-24235852657594L));
                        } else {
                            jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24119888540602L), string25);
                            jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24141363377082L), string26);
                        }
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24253032526778L), Deobfuscator$MHRTUNNELVPN$app.getString(-24287392265146L));
                        if (editText3.getText().toString().isEmpty()) {
                            string6 = Deobfuscator$MHRTUNNELVPN$app.getString(-24291687232442L);
                            string7 = Deobfuscator$MHRTUNNELVPN$app.getString(-24326046970810L);
                        } else {
                            string6 = Deobfuscator$MHRTUNNELVPN$app.getString(-24433421153210L);
                            string7 = Deobfuscator$MHRTUNNELVPN$app.getString(-24467780891578L) + editText3.getText().toString();
                        }
                        jSONObject5.put(string6, string7);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24536500368314L), Deobfuscator$MHRTUNNELVPN$app.getString(-24566565139386L));
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24588039975866L), Deobfuscator$MHRTUNNELVPN$app.getString(-24613809779642L));
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24635284616122L), Deobfuscator$MHRTUNNELVPN$app.getString(-24661054419898L));
                        if (spinner.getSelectedItemPosition() == 0) {
                            jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24691119190970L), Deobfuscator$MHRTUNNELVPN$app.getString(-24729773896634L));
                            i2 = 1;
                        } else {
                            i2 = 1;
                            if (spinner.getSelectedItemPosition() == 1) {
                                string8 = Deobfuscator$MHRTUNNELVPN$app.getString(-24755543700410L);
                                string9 = Deobfuscator$MHRTUNNELVPN$app.getString(-24794198406074L);
                            } else {
                                string8 = Deobfuscator$MHRTUNNELVPN$app.getString(-24819968209850L);
                                string9 = Deobfuscator$MHRTUNNELVPN$app.getString(-24858622915514L);
                            }
                            jSONObject5.put(string8, string9);
                        }
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24901572588474L), openVPNClient.L0);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-24957407163322L), openVPNClient.M0);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25000356836282L), strArr2[0]);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25073371280314L), strArr[0]);
                        jSONObject5.put(Deobfuscator$MHRTUNNELVPN$app.getString(-25129205855162L), openVPNClient.N0);
                        JSONObject jSONObjectM5 = openVPNClient.m();
                        jSONObjectM5.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-25193630364602L)).put(jSONObject5);
                        FileOutputStream fileOutputStream5 = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-25232285070266L)));
                        fileOutputStream5.write(AbstractC3279qd.u(jSONObjectM5.toString(2)).getBytes());
                        fileOutputStream5.flush();
                        fileOutputStream5.close();
                        SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-25292414612410L));
                        dialogInterfaceC3303r1.dismiss();
                        openVPNClient.N();
                        final int i13 = 0;
                        while (i13 < openVPNClient.U0.size()) {
                            if (string.equals(((JSONObject) openVPNClient.U0.get(i13)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-25404083762106L)))) {
                                openVPNClient.r0.setSelection(i13 == 0 ? i2 : 0);
                                final int i14 = 2;
                                try {
                                    openVPNClient.r0.postDelayed(new Runnable(this) { // from class: Rx
                                        public final /* synthetic */ Sx b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    this.b.q.r0.setSelection(i13);
                                                    break;
                                                case 1:
                                                    this.b.q.r0.setSelection(i13);
                                                    break;
                                                case 2:
                                                    this.b.q.r0.setSelection(i13);
                                                    break;
                                                case 3:
                                                    this.b.q.r0.setSelection(i13);
                                                    break;
                                                default:
                                                    this.b.q.r0.setSelection(i13);
                                                    break;
                                            }
                                        }
                                    }, 100L);
                                } catch (Exception e5) {
                                    e = e5;
                                    exc = e;
                                    applicationContext = openVPNClient.getApplicationContext();
                                    sb = new StringBuilder();
                                    j = -25464213304250L;
                                    sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(j));
                                    sb.append(exc.getMessage());
                                    SweetToast.error(applicationContext, sb.toString());
                                    return;
                                }
                            }
                            i13++;
                        }
                        openVPNClient.Y(string, jSONObject5);
                    } catch (Exception e6) {
                        e = e6;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }
    }
}
