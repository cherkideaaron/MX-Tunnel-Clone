package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.view.View;
import com.mxtunnel.pro.R;
import rased.vpn.app.activities.IPHunterActivity;

/* renamed from: Wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0401Wo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ IPHunterActivity b;

    public /* synthetic */ ViewOnClickListenerC0401Wo(IPHunterActivity iPHunterActivity, int i) {
        this.a = i;
        this.b = iPHunterActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                IPHunterActivity iPHunterActivity = this.b;
                if (!iPHunterActivity.n) {
                    String string = Settings.Secure.getString(iPHunterActivity.getContentResolver(), "assistant");
                    if (string != null && string.contains("com.mxtunnel.pro/rased.vpn.app.voice.MyInteractionService")) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) iPHunterActivity.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            String strTrim = iPHunterActivity.c.getText().toString().trim();
                            if (!strTrim.isEmpty()) {
                                String[] strArrSplit = strTrim.split(";");
                                String[] strArr = {iPHunterActivity.a()};
                                iPHunterActivity.m.notifyDataSetChanged();
                                iPHunterActivity.f.clear();
                                int length = strArrSplit.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        String strTrim2 = strArrSplit[i].trim();
                                        if (!strTrim2.isEmpty() && strArr[0].startsWith(strTrim2)) {
                                            iPHunterActivity.runOnUiThread(new RunnableC0384Vo(iPHunterActivity, AbstractC3264qG.m(new StringBuilder("Found IP: "), strArr[0], " (Matches prefix: ", strTrim2, ")"), 0));
                                            AbstractC3279qd.i0(iPHunterActivity.getApplicationContext(), "Success! IP Found!");
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        Thread thread = new Thread(new RunnableC2736gi(iPHunterActivity, strArr, strArrSplit, 2));
                                        iPHunterActivity.o = thread;
                                        thread.start();
                                    }
                                }
                                iPHunterActivity.a.setText("STOP IP HUNT");
                                iPHunterActivity.n = true;
                                iPHunterActivity.c.setEnabled(false);
                                break;
                            } else {
                                AbstractC3279qd.i0(iPHunterActivity.getApplicationContext(), "Please enter IP addresses to search");
                                break;
                            }
                        } else {
                            AbstractC3279qd.i0(iPHunterActivity.getApplicationContext(), "No internet connection!");
                            break;
                        }
                    } else {
                        C3249q1 c3249q1 = new C3249q1(iPHunterActivity, R.style.MyDialogTheme);
                        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
                        c3084n1.e = "IP Hunter";
                        c3084n1.g = "You need to make this app as the Default digital assistant app before you can use IP Hunter";
                        c3249q1.h("OKAY", new DialogInterfaceOnClickListenerC0418Xo(iPHunterActivity, 0));
                        c3249q1.f("LATER", new DialogInterfaceOnClickListenerC0603ck(1));
                        c3249q1.i();
                        break;
                    }
                } else {
                    iPHunterActivity.b();
                    break;
                }
                break;
            default:
                this.b.finish();
                break;
        }
    }
}
