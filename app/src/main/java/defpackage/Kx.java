package defpackage;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TimePicker;
import com.mxtunnel.pro.R;
import java.util.Calendar;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public final class Kx implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;

    public /* synthetic */ Kx(OpenVPNClient openVPNClient, int i) {
        this.a = i;
        this.b = openVPNClient;
    }

    /* JADX WARN: Type inference failed for: r13v19, types: [java.io.Serializable, java.lang.String[]] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        final OpenVPNClient openVPNClient = this.b;
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                final OpenVPNClient openVPNClient2 = this.b;
                if (!z) {
                    openVPNClient2.D0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18506366284730L));
                    openVPNClient2.L0 = Deobfuscator$MHRTUNNELVPN$app.getString(-18592265630650L);
                    break;
                } else {
                    String str = OpenVPNClient.Y0;
                    openVPNClient2.getClass();
                    Calendar calendar = Calendar.getInstance();
                    openVPNClient2.G0 = calendar.get(1);
                    openVPNClient2.H0 = calendar.get(2);
                    openVPNClient2.I0 = calendar.get(5);
                    openVPNClient2.J0 = calendar.get(11);
                    openVPNClient2.K0 = calendar.get(12);
                    DatePickerDialog datePickerDialog = new DatePickerDialog(openVPNClient2, new DatePickerDialog.OnDateSetListener() { // from class: yx
                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i3, int i4, int i5) {
                            final OpenVPNClient openVPNClient3 = openVPNClient2;
                            openVPNClient3.G0 = i3;
                            openVPNClient3.H0 = i4;
                            openVPNClient3.I0 = i5;
                            TimePickerDialog timePickerDialog = new TimePickerDialog(openVPNClient3, new TimePickerDialog.OnTimeSetListener() { // from class: Bx
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i6, int i7) {
                                    OpenVPNClient openVPNClient4 = openVPNClient3;
                                    openVPNClient4.J0 = i6;
                                    openVPNClient4.K0 = i7;
                                    String str2 = openVPNClient4.G0 + Deobfuscator$MHRTUNNELVPN$app.getString(-55790977381306L) + (openVPNClient4.H0 + 1) + Deobfuscator$MHRTUNNELVPN$app.getString(-55799567315898L) + openVPNClient4.I0 + Deobfuscator$MHRTUNNELVPN$app.getString(-55808157250490L) + openVPNClient4.J0 + Deobfuscator$MHRTUNNELVPN$app.getString(-55816747185082L) + openVPNClient4.K0;
                                    openVPNClient4.L0 = str2;
                                    openVPNClient4.D0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-55825337119674L) + str2);
                                }
                            }, openVPNClient3.J0, openVPNClient3.K0, false);
                            timePickerDialog.setOnCancelListener(new Zx(openVPNClient3, 1));
                            timePickerDialog.show();
                        }
                    }, openVPNClient2.G0, openVPNClient2.H0, openVPNClient2.I0);
                    datePickerDialog.setOnCancelListener(new Zx(openVPNClient2, 0));
                    datePickerDialog.show();
                    break;
                }
            case 1:
                if (!z) {
                    openVPNClient.M0 = Deobfuscator$MHRTUNNELVPN$app.getString(-18596560597946L);
                    break;
                } else {
                    openVPNClient.getClass();
                    try {
                        C3249q1 c3249q1 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
                        c3084n1.e = Deobfuscator$MHRTUNNELVPN$app.getString(-55881171694522L);
                        c3084n1.n = false;
                        View viewInflate = LayoutInflater.from(openVPNClient.getApplicationContext()).inflate(R.layout.hwid_dialog, (ViewGroup) null);
                        c3084n1.r = viewInflate;
                        final EditText editText = (EditText) viewInflate.findViewById(R.id.hwid_edittext);
                        c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-55924121367482L), null);
                        c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-55945596203962L), new DialogInterface.OnClickListener() { // from class: zx
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                OpenVPNClient openVPNClient3 = openVPNClient;
                                switch (i) {
                                    case 0:
                                        String str2 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        openVPNClient3.N0 = Deobfuscator$MHRTUNNELVPN$app.getString(-56765934957498L);
                                        openVPNClient3.F0.setChecked(false);
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        String str3 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        openVPNClient3.M0 = Deobfuscator$MHRTUNNELVPN$app.getString(-56864719205306L);
                                        openVPNClient3.E0.setChecked(false);
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        });
                        final DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
                        dialogInterfaceC3303r1A.show();
                        dialogInterfaceC3303r1A.d(-1).setOnClickListener(new View.OnClickListener() { // from class: Ax
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                DialogInterfaceC3303r1 dialogInterfaceC3303r1 = dialogInterfaceC3303r1A;
                                EditText editText2 = editText;
                                OpenVPNClient openVPNClient3 = openVPNClient;
                                switch (i) {
                                    case 0:
                                        String str2 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        String string = editText2.getText().toString();
                                        if (!string.isEmpty()) {
                                            openVPNClient3.N0 = string;
                                            dialogInterfaceC3303r1.dismiss();
                                            break;
                                        } else {
                                            SweetToast.error(openVPNClient3, Deobfuscator$MHRTUNNELVPN$app.getString(-56654265807802L));
                                            break;
                                        }
                                    default:
                                        String str3 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        String string2 = editText2.getText().toString();
                                        if (!string2.isEmpty()) {
                                            openVPNClient3.M0 = string2;
                                            dialogInterfaceC3303r1.dismiss();
                                            break;
                                        } else {
                                            SweetToast.error(openVPNClient3, Deobfuscator$MHRTUNNELVPN$app.getString(-56770229924794L));
                                            break;
                                        }
                                }
                            }
                        });
                        break;
                    } catch (Exception e) {
                        SweetToast.error(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-55971366007738L) + e.getMessage());
                        return;
                    }
                }
            case 2:
                if (!z) {
                    openVPNClient.N0 = Deobfuscator$MHRTUNNELVPN$app.getString(-18600855565242L);
                    break;
                } else {
                    openVPNClient.getClass();
                    try {
                        C3249q1 c3249q12 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                        C3084n1 c3084n12 = (C3084n1) c3249q12.c;
                        c3084n12.e = Deobfuscator$MHRTUNNELVPN$app.getString(-56027200582586L);
                        c3084n12.n = false;
                        View viewInflate2 = LayoutInflater.from(openVPNClient.getApplicationContext()).inflate(R.layout.password_dialog, (ViewGroup) null);
                        c3084n12.r = viewInflate2;
                        final EditText editText2 = (EditText) viewInflate2.findViewById(R.id.pw_edittext);
                        c3249q12.h(Deobfuscator$MHRTUNNELVPN$app.getString(-56087330124730L), null);
                        c3249q12.f(Deobfuscator$MHRTUNNELVPN$app.getString(-56108804961210L), new DialogInterface.OnClickListener() { // from class: zx
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                OpenVPNClient openVPNClient3 = openVPNClient;
                                switch (i2) {
                                    case 0:
                                        String str2 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        openVPNClient3.N0 = Deobfuscator$MHRTUNNELVPN$app.getString(-56765934957498L);
                                        openVPNClient3.F0.setChecked(false);
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        String str3 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        openVPNClient3.M0 = Deobfuscator$MHRTUNNELVPN$app.getString(-56864719205306L);
                                        openVPNClient3.E0.setChecked(false);
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        });
                        final DialogInterfaceC3303r1 dialogInterfaceC3303r1A2 = c3249q12.a();
                        dialogInterfaceC3303r1A2.show();
                        dialogInterfaceC3303r1A2.d(-1).setOnClickListener(new View.OnClickListener() { // from class: Ax
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                DialogInterfaceC3303r1 dialogInterfaceC3303r1 = dialogInterfaceC3303r1A2;
                                EditText editText22 = editText2;
                                OpenVPNClient openVPNClient3 = openVPNClient;
                                switch (i2) {
                                    case 0:
                                        String str2 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        String string = editText22.getText().toString();
                                        if (!string.isEmpty()) {
                                            openVPNClient3.N0 = string;
                                            dialogInterfaceC3303r1.dismiss();
                                            break;
                                        } else {
                                            SweetToast.error(openVPNClient3, Deobfuscator$MHRTUNNELVPN$app.getString(-56654265807802L));
                                            break;
                                        }
                                    default:
                                        String str3 = OpenVPNClient.Y0;
                                        openVPNClient3.getClass();
                                        String string2 = editText22.getText().toString();
                                        if (!string2.isEmpty()) {
                                            openVPNClient3.M0 = string2;
                                            dialogInterfaceC3303r1.dismiss();
                                            break;
                                        } else {
                                            SweetToast.error(openVPNClient3, Deobfuscator$MHRTUNNELVPN$app.getString(-56770229924794L));
                                            break;
                                        }
                                }
                            }
                        });
                        break;
                    } catch (Exception e2) {
                        SweetToast.error(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-56134574764986L) + e2.getMessage());
                        return;
                    }
                }
            default:
                if (!z) {
                    XD xd = openVPNClient.g0.b;
                    xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168959070663610L), false);
                    xd.apply();
                    openVPNClient.R0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-28651079037882L));
                    break;
                } else {
                    XD xd2 = openVPNClient.g0.b;
                    xd2.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168959070663610L), true);
                    xd2.apply();
                    openVPNClient.R0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-28595244463034L));
                    String[] strArr = {Deobfuscator$MHRTUNNELVPN$app.getString(-52492442497978L), Deobfuscator$MHRTUNNELVPN$app.getString(-52556867007418L), Deobfuscator$MHRTUNNELVPN$app.getString(-52604111647674L)};
                    ?? r13 = {Deobfuscator$MHRTUNNELVPN$app.getString(-52647061320634L), Deobfuscator$MHRTUNNELVPN$app.getString(-52681421059002L), Deobfuscator$MHRTUNNELVPN$app.getString(-52715780797370L)};
                    View viewInflate3 = LayoutInflater.from(openVPNClient.getApplicationContext()).inflate(R.layout.dialog_dns_selection, (ViewGroup) null);
                    Spinner spinner = (Spinner) viewInflate3.findViewById(R.id.dns_spinner);
                    ArrayAdapter arrayAdapter = new ArrayAdapter(openVPNClient, android.R.layout.simple_spinner_item, strArr);
                    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    try {
                        C3492ub c3492ub = openVPNClient.g0;
                        c3492ub.getClass();
                        spinner.setSelection(c3492ub.a.getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-169796589286330L), 0));
                    } catch (IndexOutOfBoundsException unused) {
                        spinner.setSelection(0);
                    }
                    C3249q1 c3249q13 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                    String string = Deobfuscator$MHRTUNNELVPN$app.getString(-52750140535738L);
                    C3084n1 c3084n13 = (C3084n1) c3249q13.c;
                    c3084n13.e = string;
                    c3084n13.n = true;
                    c3084n13.r = viewInflate3;
                    c3249q13.h(Deobfuscator$MHRTUNNELVPN$app.getString(-52827449947066L), new Wx(openVPNClient, spinner, r13, 1));
                    c3249q13.i();
                    break;
                }
        }
    }
}
