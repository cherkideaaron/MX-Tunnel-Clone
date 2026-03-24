package rased.vpn.app.activities;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.VpnService;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.security.KeyChain;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3162oO;
import defpackage.AbstractC3279qd;
import defpackage.BA;
import defpackage.C0102Fe;
import defpackage.C0108Fk;
import defpackage.C0285Qa;
import defpackage.C2524cp;
import defpackage.C2646f1;
import defpackage.C2701g1;
import defpackage.C2827iH;
import defpackage.C2845ii;
import defpackage.C3080my;
import defpackage.C3084n1;
import defpackage.C3249q1;
import defpackage.C3300qy;
import defpackage.C3312rA;
import defpackage.C3373sH;
import defpackage.C3430tK;
import defpackage.C3492ub;
import defpackage.C3515uy;
import defpackage.C3569vy;
import defpackage.Cx;
import defpackage.DialogInterfaceC3303r1;
import defpackage.DialogInterfaceOnClickListenerC0566c1;
import defpackage.DialogInterfaceOnClickListenerC0603ck;
import defpackage.DialogInterfaceOnClickListenerC3568vx;
import defpackage.EO;
import defpackage.EnumC2587dy;
import defpackage.FO;
import defpackage.GO;
import defpackage.Gx;
import defpackage.H2;
import defpackage.Hx;
import defpackage.InterfaceC0281Pn;
import defpackage.InterfaceC0315Rn;
import defpackage.InterfaceC3154oG;
import defpackage.InterfaceC3181op;
import defpackage.InterfaceC3353ry;
import defpackage.InterfaceC3376sK;
import defpackage.Ix;
import defpackage.Lx;
import defpackage.P0;
import defpackage.Q0;
import defpackage.R2;
import defpackage.RunnableC2705g5;
import defpackage.RunnableC2899ji;
import defpackage.RunnableC3680y0;
import defpackage.Tx;
import defpackage.Ux;
import defpackage.Vx;
import defpackage.Wx;
import defpackage.XD;
import defpackage.YD;
import defpackage.Yx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.service.InjectorService;
import rased.vpn.app.service.OpenVPNService;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.TunnelManagerHelper;
import rased.vpn.app.service.vpn.TunnelUtils;
import rased.vpn.app.service.vpn.TunnelVpnManagerPsi;
import rased.vpn.app.service.vpn.logger.ConnectionStatus;
import rased.vpn.app.service.vpn.logger.SkStatus;
import rased.vpn.app.utils.PUtils;
import rased.vpn.app.view.CircleProgressBar;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public class OpenVPNClient extends a implements View.OnClickListener, View.OnTouchListener, AdapterView.OnItemSelectedListener, TextView.OnEditorActionListener, InterfaceC0281Pn, RadioGroup.OnCheckedChangeListener, InterfaceC0315Rn, InterfaceC3181op, InterfaceC3376sK, TunnelVpnManagerPsi.SocksListener, SkStatus.StateListener, InterfaceC3154oG, BA, FO, EO {
    public static final String Y0;
    public static final String Z0;
    public boolean A;
    public boolean A0;
    public TextView B;
    public boolean B0;
    public EditText C;
    public TextView C0;
    public View D;
    public CheckBox D0;
    public CheckBox E;
    public CheckBox E0;
    public EditText F;
    public CheckBox F0;
    public View G;
    public int G0;
    public CheckBox H;
    public int H0;
    public View I;
    public int I0;
    public C2827iH J;
    public int J0;
    public View K;
    public int K0;
    public Spinner L;
    public String L0;
    public ProgressBar M;
    public String M0;
    public View N;
    public String N0;
    public Spinner O;
    public final String O0;
    public H2 P;
    public final String P0;
    public EditText Q;
    public boolean Q0;
    public View R;
    public CheckBox R0;
    public Spinner S;
    public YD S0;
    public int T;
    public XD T0;
    public View U;
    public ArrayList U0;
    public View V;
    public C2646f1 V0;
    public final Handler W;
    public zzj W0;
    public final Lx X;
    public final Q0 X0;
    public ImageView Y;
    public TextView Z;
    public View[] a0;
    public TextView[] b0;
    public final Handler c0;
    public final Lx d0;
    public EditText e0;
    public View f0;
    public C3492ub g0;
    public boolean h0;
    public View i0;
    public View j0;
    public C2701g1 k0;
    public ArrayList l0;
    public String m;
    public int m0;
    public View n;
    public TextView n0;
    public TextView o;
    public TextView o0;
    public TextView p;
    public EditText p0;
    public TextView q;
    public EditText q0;
    public View r;
    public Spinner r0;
    public Button s;
    public CircleProgressBar s0;
    public Button t;
    public AdView t0;
    public View u;
    public InterstitialAd u0;
    public EnumC2587dy v;
    public String v0;
    public TextView w;
    public String w0;
    public TextView x;
    public CountDownTimer x0;
    public EnumC2587dy y;
    public String y0;
    public View z;
    public boolean z0;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-58548346385338L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-58608475927482L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-58664310502330L);
        Y0 = Deobfuscator$MHRTUNNELVPN$app.getString(-58720145077178L);
        Z0 = Deobfuscator$MHRTUNNELVPN$app.getString(-58793159521210L);
    }

    public OpenVPNClient() {
        EnumC2587dy enumC2587dy = EnumC2587dy.a;
        this.v = enumC2587dy;
        this.y = enumC2587dy;
        this.A = false;
        this.T = 0;
        this.W = new Handler();
        this.X = new Lx(this, 0);
        this.c0 = new Handler();
        this.d0 = new Lx(this, 1);
        this.z0 = false;
        this.A0 = false;
        this.B0 = false;
        this.L0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31657556145082L);
        this.M0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31661851112378L);
        this.N0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31666146079674L);
        this.O0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31670441046970L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-31700505818042L);
        this.P0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31739160523706L);
        this.Q0 = false;
        this.X0 = registerForActivityResult(new P0(1), new C0285Qa(this, 9));
    }

    public static int D(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.getJSONObject(i).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-32649693590458L)).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static String F() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        StringBuffer stringBuffer5 = new StringBuffer();
        StringBuffer stringBuffer6 = new StringBuffer();
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append(Build.SERIAL);
        stringBuffer7.append(Build.BOARD.length() % 5);
        stringBuffer6.append(stringBuffer7.toString());
        stringBuffer6.append(Build.BRAND.length() % 5);
        stringBuffer5.append(stringBuffer6.toString());
        stringBuffer5.append(Build.DEVICE.length() % 5);
        stringBuffer4.append(stringBuffer5.toString());
        stringBuffer4.append(Build.MANUFACTURER.length() % 5);
        stringBuffer3.append(stringBuffer4.toString());
        stringBuffer3.append(Build.MODEL.length() % 5);
        stringBuffer2.append(stringBuffer3.toString());
        stringBuffer2.append(Build.PRODUCT.length() % 5);
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append(Build.HARDWARE);
        String string = stringBuffer.toString();
        try {
            messageDigest = MessageDigest.getInstance(Deobfuscator$MHRTUNNELVPN$app.getString(-37679100294074L));
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        messageDigest.update(string.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String hexString = Integer.toHexString(b & 255);
            while (hexString.length() < 2) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(Deobfuscator$MHRTUNNELVPN$app.getString(-37696280163258L));
                stringBuffer8.append(hexString);
                hexString = stringBuffer8.toString();
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.getDefault());
    }

    public static String J(MenuItem menuItem) {
        Intent intent;
        if (menuItem == null || (intent = menuItem.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-48708576310202L));
    }

    public static String T(long j) {
        String string;
        float f;
        float f2 = j;
        if (f2 >= 1.0E12f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-40505188774842L);
            f = 1.0995116E12f;
        } else if (f2 >= 1.0E9f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-40518073676730L);
            f = 1.0737418E9f;
        } else if (f2 >= 1000000.0f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-40530958578618L);
            f = 1048576.0f;
        } else {
            if (f2 < 1000.0f) {
                return String.format(Locale.ENGLISH, Deobfuscator$MHRTUNNELVPN$app.getString(-40556728382394L), Float.valueOf(f2));
            }
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-40543843480506L);
            f = 1024.0f;
        }
        return String.format(Locale.ENGLISH, Deobfuscator$MHRTUNNELVPN$app.getString(-40578203218874L), Float.valueOf(f2 / f), string);
    }

    public static boolean w(OpenVPNClient openVPNClient, String str, String str2) {
        openVPNClient.getClass();
        String[] strArrSplit = str.split(Deobfuscator$MHRTUNNELVPN$app.getString(-37713460032442L));
        String[] strArrSplit2 = str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-37726344934330L));
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        if (i >= strArrSplit.length || i >= strArrSplit2.length) {
            if (Integer.signum(strArrSplit.length - strArrSplit2.length) <= 0) {
                return false;
            }
        } else if (Integer.signum(Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i]))) <= 0) {
            return false;
        }
        return true;
    }

    public static void x(OpenVPNClient openVPNClient) throws JSONException, IOException {
        openVPNClient.O();
        openVPNClient.K();
        openVPNClient.N();
        openVPNClient.n0.setText(openVPNClient.getString(R.string.config_three) + Deobfuscator$MHRTUNNELVPN$app.getString(-37704870097850L) + openVPNClient.E());
        int iF = openVPNClient.g0.f();
        openVPNClient.r0.setSelection(iF == 0 ? 1 : 0);
        if (iF >= openVPNClient.I().length()) {
            iF = 0;
        }
        openVPNClient.r0.postDelayed(new Cx(openVPNClient, iF, 1), 100L);
        XD xd = openVPNClient.g0.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169470171771834L), true);
        xd.apply();
    }

    public final void A() {
        this.e0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-40685577401274L));
        this.F.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-40689872368570L));
        this.C.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-40694167335866L));
        this.Q.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-40698462303162L));
    }

    public final void B(JSONObject jSONObject) throws JSONException, IOException {
        try {
            String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-54236199220154L));
            String string2 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-54292033795002L));
            String string3 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-54334983467962L));
            Calendar calendar = Calendar.getInstance();
            String str = String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-54390818042810L), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)));
            if (!string.isEmpty()) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Deobfuscator$MHRTUNNELVPN$app.getString(-54498192225210L));
                if (simpleDateFormat.parse(str).after(simpleDateFormat.parse(string))) {
                    SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-54571206669242L));
                    return;
                }
            }
            if (!string2.isEmpty() && !string2.equals(F())) {
                SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-54669990917050L));
                return;
            }
            if (string3.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-54837494641594L)) && new C2845ii(getApplicationContext(), 1).d()) {
                SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-54858969478074L));
                return;
            }
            String strOptString = jSONObject.optString(Deobfuscator$MHRTUNNELVPN$app.getString(-55039358104506L), Deobfuscator$MHRTUNNELVPN$app.getString(-55099487646650L));
            JSONObject jSONObjectM = m();
            JSONArray jSONArray = jSONObjectM.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-55103782613946L));
            String str2 = strOptString;
            int i = 1;
            loop0: while (true) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (str2.equalsIgnoreCase(jSONArray.getJSONObject(i2).optString(Deobfuscator$MHRTUNNELVPN$app.getString(-55528984376250L), Deobfuscator$MHRTUNNELVPN$app.getString(-55589113918394L)))) {
                        break;
                    }
                }
                str2 = strOptString + Deobfuscator$MHRTUNNELVPN$app.getString(-55142437319610L) + i + Deobfuscator$MHRTUNNELVPN$app.getString(-55155322221498L);
                i++;
            }
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-55163912156090L), str2);
            jSONArray.put(jSONObject);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getFilesDir(), Deobfuscator$MHRTUNNELVPN$app.getString(-55224041698234L)));
            fileOutputStream.write(AbstractC3279qd.u(jSONObjectM.toString(2)).getBytes());
            fileOutputStream.close();
            SweetToast.success(this, Deobfuscator$MHRTUNNELVPN$app.getString(-55279876273082L));
            N();
            int i3 = 0;
            while (i3 < this.U0.size()) {
                if (str2.equals(((JSONObject) this.U0.get(i3)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-55400135357370L)))) {
                    this.r0.setSelection(i3 == 0 ? 1 : 0);
                    this.r0.postDelayed(new Cx(this, i3, 0), 100L);
                }
                i3++;
            }
        } catch (Exception e) {
            SweetToast.error(this, Deobfuscator$MHRTUNNELVPN$app.getString(-55460264899514L) + e.getMessage());
        }
    }

    public final void C(boolean z) {
        if (z) {
            findViewById(R.id.graph_layout).setVisibility(8);
            this.t.setVisibility(8);
            this.s.setVisibility(0);
        } else {
            findViewById(R.id.graph_layout).setVisibility(0);
            this.t.setVisibility(0);
            this.s.setVisibility(8);
        }
        this.j0.setEnabled(z);
        this.i0.setEnabled(z);
        this.r0.setEnabled(z);
        this.L.setEnabled(z);
        this.R0.setEnabled(z);
    }

    public final String E() {
        Deobfuscator$MHRTUNNELVPN$app.getString(-33203744371642L);
        try {
            return m().getString(Deobfuscator$MHRTUNNELVPN$app.getString(-33289643717562L));
        } catch (JSONException unused) {
            return Deobfuscator$MHRTUNNELVPN$app.getString(-33324003455930L);
        }
    }

    public final String G() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-39663375184826L))).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? Deobfuscator$MHRTUNNELVPN$app.getString(-39719209759674L) : TunnelUtils.getLocalIpAddress();
    }

    public final String H() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-39770749367226L))).getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : Deobfuscator$MHRTUNNELVPN$app.getString(-39826583942074L);
    }

    public final JSONArray I() {
        try {
            return m().getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-59892671148986L));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void K() throws IOException {
        try {
            for (File file : getFilesDir().listFiles()) {
                if (file.getAbsolutePath().toLowerCase().endsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-37159409251258L))) {
                    file.delete();
                }
            }
            String string = Deobfuscator$MHRTUNNELVPN$app.getString(-37185179055034L);
            String strY = AbstractC3279qd.Y(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-37236718662586L));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getFilesDir(), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-37288258270138L), URLEncoder.encode(string, Deobfuscator$MHRTUNNELVPN$app.getString(-37322618008506L)))));
            fileOutputStream.write(strY.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-37348387812282L) + e.getMessage());
        }
    }

    public final void L() {
        zza.zza(this).zzc().zzb(new Tx(this), new Gx(this));
    }

    public final void M() {
        InterstitialAd.load(this, Deobfuscator$MHRTUNNELVPN$app.getString(-50804520350650L), new AdRequest.Builder().build(), new Yx(this, 1));
    }

    public final void N() throws JSONException {
        try {
            this.U0.clear();
            JSONArray jSONArrayI = I();
            for (int i = 0; i < jSONArrayI.length(); i++) {
                this.U0.add(jSONArrayI.getJSONObject(i));
            }
            this.V0.notifyDataSetChanged();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-34878781617082L), jSONArrayI);
            this.w0 = YD.b(jSONObject.toString());
        } catch (Exception e) {
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-34938911159226L) + e.getMessage());
        }
    }

    public final void O() {
        try {
            this.l0.clear();
            this.l0.add(Deobfuscator$MHRTUNNELVPN$app.getString(-34681213121466L));
            JSONArray jSONArrayN = n();
            for (int i = 0; i < jSONArrayN.length(); i++) {
                this.l0.add(jSONArrayN.getJSONObject(i).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-34762817500090L)));
            }
            this.k0.notifyDataSetChanged();
        } catch (Exception e) {
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-34814357107642L) + e.getMessage());
        }
    }

    public final void P(String str) throws JSONException {
        try {
            this.l0.clear();
            this.l0.add(Deobfuscator$MHRTUNNELVPN$app.getString(-36025537885114L));
            JSONArray jSONArrayN = n();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONArrayN.length(); i++) {
                JSONObject jSONObject = jSONArrayN.getJSONObject(i);
                if (jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36107142263738L)).equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36145796969402L));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36197336576954L), string);
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36248876184506L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36300415792058L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36351955399610L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36403495007162L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36455034614714L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36523754091450L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36592473568186L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36631128273850L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36669782979514L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36708437685178L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36747092390842L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36785747096506L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36824401802170L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36863056507834L)));
                    jSONObject2.put(Deobfuscator$MHRTUNNELVPN$app.getString(-36901711213498L), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-36953250821050L)));
                    jSONArray.put(jSONObject2);
                    this.l0.add(string);
                }
            }
            this.k0.notifyDataSetChanged();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Deobfuscator$MHRTUNNELVPN$app.getString(-37004790428602L), jSONArray);
            this.v0 = YD.b(jSONObject3.toString());
        } catch (Exception e) {
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-37060625003450L) + e.getMessage());
        }
    }

    public final void Q() {
        AdView adView = new AdView(this);
        this.t0 = adView;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iWidth = displayMetrics.widthPixels;
        if (Build.VERSION.SDK_INT >= 30) {
            iWidth = getWindowManager().getCurrentWindowMetrics().getBounds().width();
        }
        adView.setAdSize(AdSize.getInlineAdaptiveBannerAdSize((int) (iWidth / displayMetrics.density), 150));
        this.t0.setAdUnitId(Deobfuscator$MHRTUNNELVPN$app.getString(-32709823132602L));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.adView);
        relativeLayout.setGravity(17);
        relativeLayout.removeAllViews();
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        this.t0.setAdListener(new Hx(this, relativeLayout));
        this.t0.loadAd(adRequestBuild);
    }

    public final boolean R(boolean z) {
        Intent intent;
        String string;
        String stringExtra;
        if ((this.T & 3) == 3 && (stringExtra = (intent = getIntent()).getStringExtra((string = Deobfuscator$MHRTUNNELVPN$app.getString(-40101461849018L)))) != null) {
            C3515uy c3515uy = null;
            this.m = null;
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-40277555508154L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-40337685050298L), stringExtra));
            intent.removeExtra(string);
            if (z) {
                OpenVPNService openVPNService = this.b;
                if (openVPNService != null) {
                    C3515uy c3515uy2 = openVPNService.c;
                    if (c3515uy2 != null) {
                        c3515uy = c3515uy2;
                    } else {
                        C3569vy c3569vyI = openVPNService.i();
                        if (c3569vyI.size() >= 1) {
                            c3515uy = (C3515uy) c3569vyI.get(0);
                        }
                    }
                }
                if (!c3515uy.g.equals(stringExtra)) {
                    this.m = stringExtra;
                    u(false);
                    CountDownTimer countDownTimer = this.x0;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                }
            } else {
                OpenVPNService openVPNService2 = this.b;
                C3569vy c3569vyI2 = openVPNService2 != null ? openVPNService2.i() : null;
                if (c3569vyI2 != null && c3569vyI2.b(stringExtra) != null) {
                    this.m = stringExtra;
                    return true;
                }
                p(s(R.string.profile_not_found), stringExtra, null);
            }
        }
        return false;
    }

    public final void S() {
        if (this.u0 == null) {
            InterstitialAd.load(this, Deobfuscator$MHRTUNNELVPN$app.getString(-50576887083962L), new AdRequest.Builder().build(), new Yx(this, 0));
            this.z0 = false;
        }
    }

    public final void U(C3300qy c3300qy, boolean z, boolean z2, boolean z3) {
        String strS;
        int i;
        CircleProgressBar circleProgressBar;
        float f;
        String string;
        int i2 = 2;
        int i3 = c3300qy.b;
        InterfaceC3353ry interfaceC3353ry = c3300qy.j;
        if (interfaceC3353ry != null && ((i3 & 16) != 0 || interfaceC3353ry != this)) {
            i3 |= 131072;
        }
        if (!z && (i3 & 8) == 0 && c3300qy.g == null) {
            int i4 = c3300qy.i;
            if (i4 == R.string.core_thread_active) {
                k0(i3, null, true);
                C(false);
            } else if (i4 == R.string.core_thread_inactive) {
                k0(i3, null, false);
                C(true);
            }
        } else {
            k0(i3 | 65536, c3300qy.g, z2);
        }
        int i5 = c3300qy.i;
        if (i5 == R.string.connected) {
            this.B0 = true;
        } else {
            this.B0 = false;
        }
        if (i5 == R.string.connected) {
            C(false);
            this.s0.setProgressWithAnimation(100.0f);
            this.s0.setColor(-16711936);
            Q();
            long j = this.S0.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-38748547150778L), 0L);
            if (j == 0 || (j != 0 && System.currentTimeMillis() >= j + 60000)) {
                M();
            }
            XD xd = this.g0.b;
            xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169470171771834L), false);
            xd.apply();
            CountDownTimer countDownTimer = this.x0;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.h0 = false;
            z();
            SweetToast.success(getApplicationContext(), getString(R.string.connected_toast));
        } else if (i5 == R.string.auth_failed) {
            j0();
            this.Z.setTextColor(-65536);
            this.Z.setText(getString(R.string.invalid));
            this.s0.setProgressWithAnimation(0.0f);
            this.s0.setColor(-65536);
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-38808676692922L));
        } else {
            if (i5 == R.string.connecting) {
                circleProgressBar = this.s0;
                f = 30.0f;
            } else if (i5 == R.string.get_config) {
                circleProgressBar = this.s0;
                f = 60.0f;
            } else if (i5 == R.string.assign_ip) {
                circleProgressBar = this.s0;
                f = 90.0f;
            } else if (i5 == R.string.disconnected) {
                if (this.g0.n().booleanValue()) {
                    this.s0.setProgressWithAnimation(0.0f);
                    this.s0.setColor(-65536);
                }
            } else if (i5 == R.string.wait) {
                this.x0 = new Ux(this, 1).start();
            } else if (i5 == R.string.info_msg) {
                if (c3300qy.d.startsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-38924640809914L))) {
                    Intent intent = new Intent(Deobfuscator$MHRTUNNELVPN$app.getString(-38967590482874L), Uri.parse(c3300qy.d.substring(9)));
                    intent.putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-39083554599866L), getPackageName());
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }
            } else if (i5 == R.string.tap_not_supported) {
                if (!z3) {
                    strS = s(R.string.tap_unsupported_title);
                    i = R.string.tap_unsupported_error;
                    p(strS, s(i), null);
                }
            } else if (i5 == R.string.tun_iface_create) {
                if (!z3) {
                    strS = s(R.string.tun_ko_title);
                    i = R.string.tun_ko_error;
                    p(strS, s(i), null);
                }
            } else if (i5 == R.string.warn_msg) {
                this.v = EnumC2587dy.d;
                p(s(R.string.warning_title), c3300qy.d, new RunnableC3680y0(14, this, this));
            }
            circleProgressBar.setProgressWithAnimation(f);
            this.s0.setColor(-65536);
        }
        if (c3300qy.f >= 1) {
            int i6 = c3300qy.c;
            if (i6 >= 0) {
                this.Y.setImageResource(i6);
            }
            int i7 = c3300qy.i;
            if (i7 == R.string.connected) {
                c0(i7);
                string = getString(R.string.connected);
            } else if (c3300qy.d.length() > 0) {
                d0(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-39233878455226L), s(c3300qy.i), c3300qy.d));
                string = getString(c3300qy.i);
            } else if (this.g0.n().booleanValue()) {
                c0(c3300qy.i);
                this.y0 = getString(c3300qy.i);
                if (c3300qy.i == R.string.disconnected && this.g0.l() != 7) {
                    this.s0.setProgressWithAnimation(0.0f);
                    this.s0.setColor(-65536);
                }
            }
            this.y0 = string;
        }
        int i8 = c3300qy.h;
        if (i8 <= 0 || i8 >= 99) {
            this.M.setVisibility(8);
        } else {
            this.M.setVisibility(0);
            this.M.setProgress(i8);
        }
        b0();
        if (c3300qy.i == R.string.connected) {
            EnumC2587dy enumC2587dy = this.y;
            EnumC2587dy enumC2587dy2 = EnumC2587dy.a;
            if (enumC2587dy != enumC2587dy2) {
                if (!this.J.t(Deobfuscator$MHRTUNNELVPN$app.getString(-39268238193594L))) {
                    this.y = enumC2587dy2;
                } else if (this.v == EnumC2587dy.d) {
                    this.v = this.y;
                } else {
                    new Handler().postDelayed(new Lx(this, i2), 1000L);
                }
            }
        }
    }

    public final void V() {
        OpenVPNService openVPNService = this.b;
        C3569vy c3569vyI = openVPNService != null ? openVPNService.i() : null;
        C3515uy c3515uyB = c3569vyI != null ? c3569vyI.b(Deobfuscator$MHRTUNNELVPN$app.getString(-40634037793722L)) : null;
        C2524cp c2524cp = new C2524cp(this, 19);
        new Handler();
        if (c3515uyB != null && c3515uyB.d && c3515uyB.e == null) {
            c2524cp.u(Deobfuscator$MHRTUNNELVPN$app.getString(-64604250272698L));
        } else {
            c2524cp.u(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.activities.OpenVPNClient.W():void");
    }

    public final void X() {
        boolean zT = this.J.t(Deobfuscator$MHRTUNNELVPN$app.getString(-38692712575930L));
        this.U.setVisibility(!zT ? 8 : 0);
        this.w.setText(zT ? R.string.touch_less : R.string.touch_more);
    }

    public final void Y(final String str, JSONObject jSONObject) {
        try {
            final String strPEncrypt = PUtils.pEncrypt(getApplicationContext(), jSONObject.toString());
            C3249q1 c3249q1 = new C3249q1(this, R.style.MyDialogTheme);
            C3084n1 c3084n1 = (C3084n1) c3249q1.c;
            c3084n1.e = Deobfuscator$MHRTUNNELVPN$app.getString(-53630608831418L);
            c3084n1.g = Deobfuscator$MHRTUNNELVPN$app.getString(-53682148438970L) + str + Deobfuscator$MHRTUNNELVPN$app.getString(-53823882359738L);
            c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-53832472294330L), null);
            c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-53858242098106L), new DialogInterface.OnClickListener() { // from class: Fx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws IOException {
                    String str2 = str;
                    OpenVPNClient openVPNClient = this.a;
                    String str3 = openVPNClient.P0;
                    String str4 = openVPNClient.O0;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29 && AbstractC0115Ga.l(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-56869014172602L)) != 0) {
                        AbstractC3279qd.j0(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-57049402799034L));
                        AbstractC0115Ga.P(openVPNClient, new String[]{Deobfuscator$MHRTUNNELVPN$app.getString(-57264151163834L)}, 77);
                        return;
                    }
                    try {
                        String str5 = str2 + str4;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Deobfuscator$MHRTUNNELVPN$app.getString(-57444539790266L), str5);
                        contentValues.put(Deobfuscator$MHRTUNNELVPN$app.getString(-57504669332410L), Deobfuscator$MHRTUNNELVPN$app.getString(-57547619005370L));
                        contentValues.put(Deobfuscator$MHRTUNNELVPN$app.getString(-57654993187770L), Environment.DIRECTORY_DOWNLOADS + Deobfuscator$MHRTUNNELVPN$app.getString(-57715122729914L) + str3);
                        String str6 = strPEncrypt;
                        if (i2 < 29) {
                            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str3);
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            File file2 = new File(file, str5);
                            int i3 = 1;
                            while (file2.exists()) {
                                i3++;
                                file2 = new File(file, str5.replace(str4, Deobfuscator$MHRTUNNELVPN$app.getString(-57723712664506L) + i3 + Deobfuscator$MHRTUNNELVPN$app.getString(-57736597566394L) + str4));
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                fileOutputStream.write(str6.getBytes());
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                SweetToast.success(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-57745187500986L) + file2.getName());
                                return;
                            } finally {
                            }
                        }
                        try {
                            FileOutputStream fileOutputStream2 = (FileOutputStream) openVPNClient.getContentResolver().openOutputStream(openVPNClient.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues));
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.write(str6.getBytes());
                                    fileOutputStream2.flush();
                                } finally {
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                }
                            }
                            SweetToast.success(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-57856856650682L) + str5);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            SweetToast.error(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-57968525800378L) + e.getMessage());
                            return;
                        }
                    } catch (Exception e2) {
                        SweetToast.error(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-58063015080890L) + e2.getMessage());
                    }
                    SweetToast.error(openVPNClient, Deobfuscator$MHRTUNNELVPN$app.getString(-58063015080890L) + e2.getMessage());
                }
            });
            c3249q1.i();
        } catch (Exception e) {
            SweetToast.error(this, Deobfuscator$MHRTUNNELVPN$app.getString(-53879716934586L) + e.getMessage());
        }
    }

    public final void Z(final String str, final JSONObject jSONObject) {
        try {
            C3249q1 c3249q1 = new C3249q1(this, R.style.MyDialogTheme);
            C3084n1 c3084n1 = (C3084n1) c3249q1.c;
            c3084n1.e = Deobfuscator$MHRTUNNELVPN$app.getString(-56276308685754L);
            c3084n1.n = false;
            View viewInflate = LayoutInflater.from(getApplicationContext()).inflate(R.layout.password_dialog_import, (ViewGroup) null);
            c3084n1.r = viewInflate;
            final EditText editText = (EditText) viewInflate.findViewById(R.id.pw_edittext);
            c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-56336438227898L), null);
            c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-56357913064378L), new DialogInterfaceOnClickListenerC3568vx(2));
            final DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
            dialogInterfaceC3303r1A.show();
            dialogInterfaceC3303r1A.d(-1).setOnClickListener(new View.OnClickListener() { // from class: Dx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException, IOException {
                    long j;
                    Context applicationContext;
                    String str2 = OpenVPNClient.Y0;
                    OpenVPNClient openVPNClient = this.a;
                    openVPNClient.getClass();
                    String string = editText.getText().toString();
                    if (string.isEmpty()) {
                        j = -56456697312186L;
                        applicationContext = openVPNClient;
                    } else if (str.equals(string)) {
                        openVPNClient.B(jSONObject);
                        dialogInterfaceC3303r1A.dismiss();
                        return;
                    } else {
                        j = -56568366461882L;
                        applicationContext = openVPNClient.getApplicationContext();
                    }
                    SweetToast.error(applicationContext, Deobfuscator$MHRTUNNELVPN$app.getString(j));
                }
            });
        } catch (Exception e) {
            SweetToast.error(this, Deobfuscator$MHRTUNNELVPN$app.getString(-56383682868154L) + e.getMessage());
        }
    }

    public final boolean a0(int i, int i2, String str) {
        boolean z = str.length() > 0;
        TextView textView = (TextView) findViewById(i);
        View viewFindViewById = findViewById(i2);
        textView.setText(str);
        viewFindViewById.setVisibility(z ? 0 : 8);
        return z;
    }

    @Override // defpackage.InterfaceC3376sK, rased.vpn.app.service.vpn.TunnelVpnManagerPsi.SocksListener, defpackage.FO
    public final void addStatus(String str) {
        runOnUiThread(new RunnableC3680y0(15, this, str));
    }

    @Override // rased.vpn.app.activities.a, defpackage.InterfaceC3353ry
    public final void b(C3300qy c3300qy) {
        U(c3300qy, false, o(), false);
    }

    public final void b0() {
        String string;
        int i;
        if (o()) {
            OpenVPNService openVPNService = this.b;
            C3080my c3080myH = openVPNService != null ? openVPNService.h() : null;
            TextView textView = this.B;
            int i2 = c3080myH.d;
            if (i2 < 3600) {
                if (i2 >= 120) {
                    string = String.format(s(R.string.lpr_gt_n_min_ago), Integer.valueOf(i2 / 60));
                } else if (i2 >= 2) {
                    string = String.format(s(R.string.lpr_n_sec_ago), Integer.valueOf(i2));
                } else if (i2 == 1) {
                    i = R.string.lpr_1_sec_ago;
                } else if (i2 == 0) {
                    i = R.string.lpr_lt_1_sec_ago;
                } else {
                    string = Deobfuscator$MHRTUNNELVPN$app.getString(-40612562957242L);
                }
                textView.setText(string);
                TextView textView2 = this.x;
                StringBuilder sb = new StringBuilder();
                sb.append(getString(R.string.duration_three));
                int i3 = c3080myH.c;
                sb.append(String.format(Locale.ENGLISH, Deobfuscator$MHRTUNNELVPN$app.getString(-64763164062650L), Integer.valueOf(i3 / 3600), Integer.valueOf((i3 / 60) % 60), Integer.valueOf(i3 % 60)));
                textView2.setText(sb.toString());
                this.o.setText(T(c3080myH.a));
                this.p.setText(T(c3080myH.b));
            }
            i = R.string.lpr_gt_1_hour_ago;
            string = s(i);
            textView.setText(string);
            TextView textView22 = this.x;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R.string.duration_three));
            int i32 = c3080myH.c;
            sb2.append(String.format(Locale.ENGLISH, Deobfuscator$MHRTUNNELVPN$app.getString(-64763164062650L), Integer.valueOf(i32 / 3600), Integer.valueOf((i32 / 60) % 60), Integer.valueOf(i32 % 60)));
            textView22.setText(sb2.toString());
            this.o.setText(T(c3080myH.a));
            this.p.setText(T(c3080myH.b));
        }
    }

    @Override // rased.vpn.app.activities.a, defpackage.InterfaceC3353ry
    public final PendingIntent c(int i) {
        return PendingIntent.getActivity(this, i, getIntent(), Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456);
    }

    public final void c0(int i) {
        this.Z.setVisibility(0);
        if (!getString(i).contains(Deobfuscator$MHRTUNNELVPN$app.getString(-40462239101882L))) {
            this.Z.setText(i);
        }
        if (i == R.string.auth_failed) {
            this.Z.setTextColor(-65536);
            this.Z.setText(getString(R.string.invalid));
        } else if (i == R.string.disconnected || i == R.string.auth_failed) {
            this.Z.setTextColor(-65536);
            this.Z.setText(getString(R.string.disconnected));
        } else if (i == R.string.connected) {
            this.Z.setText(getString(R.string.connected));
            this.Z.setTextColor(-16711936);
        }
    }

    @Override // defpackage.InterfaceC0281Pn
    public final void d(String str) {
    }

    public final void d0(String str) {
        TextView textView;
        String string;
        int i;
        this.Z.setVisibility(0);
        if (!str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-40419289428922L))) {
            this.Z.setText(str);
        }
        if (str.equals(getString(R.string.auth_failed))) {
            this.Z.setTextColor(-65536);
            textView = this.Z;
            i = R.string.invalid;
        } else {
            if (str.equals(getString(R.string.disconnected)) || str.equals(getString(R.string.auth_failed))) {
                this.Z.setTextColor(-65536);
                textView = this.Z;
                string = getString(R.string.disconnected);
                textView.setText(string);
            }
            i = R.string.connected;
            if (!str.equals(getString(R.string.connected))) {
                return;
            }
            this.Z.setTextColor(-16711936);
            textView = this.Z;
        }
        string = getString(i);
        textView.setText(string);
    }

    @Override // defpackage.InterfaceC0281Pn
    public final void e() {
        this.i0.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x045b A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x046b A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e7 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0505 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x051a A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0543 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05b9 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06b7 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06c4 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06c9 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06f4 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0744 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x079d A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07c6 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x07eb A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0803 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0272 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cf A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0348 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c1 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e1 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0401 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0421 A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0002, B:4:0x0032, B:6:0x0036, B:7:0x0037, B:9:0x0073, B:13:0x0089, B:15:0x012f, B:17:0x013e, B:18:0x0157, B:24:0x01bf, B:26:0x0224, B:28:0x0233, B:30:0x0242, B:32:0x0251, B:34:0x0260, B:101:0x0442, B:103:0x045b, B:104:0x0467, B:118:0x04c6, B:120:0x04e7, B:121:0x0500, B:160:0x06c9, B:162:0x06e5, B:163:0x06ee, B:166:0x06f4, B:168:0x071f, B:169:0x0723, B:177:0x079d, B:178:0x07c2, B:180:0x07e1, B:182:0x07eb, B:183:0x0803, B:179:0x07c6, B:170:0x0727, B:171:0x0744, B:173:0x0760, B:174:0x0787, B:129:0x051a, B:131:0x0543, B:133:0x0552, B:135:0x0561, B:136:0x057a, B:155:0x06a8, B:157:0x06b7, B:158:0x06c4, B:138:0x0581, B:139:0x0586, B:140:0x0590, B:142:0x059f, B:143:0x05b9, B:145:0x05c8, B:147:0x05d7, B:149:0x060f, B:150:0x062c, B:151:0x0646, B:153:0x0655, B:154:0x068b, B:122:0x0505, B:105:0x046b, B:107:0x0471, B:108:0x047e, B:110:0x0484, B:111:0x0491, B:113:0x0497, B:114:0x04a4, B:116:0x04aa, B:117:0x04b7, B:37:0x0272, B:39:0x0281, B:41:0x0290, B:43:0x029f, B:45:0x02ae, B:47:0x02bd, B:50:0x02cf, B:52:0x02de, B:54:0x02fa, B:56:0x0309, B:58:0x0318, B:60:0x0327, B:62:0x0336, B:65:0x0348, B:67:0x0357, B:69:0x0373, B:71:0x0382, B:73:0x0391, B:75:0x03a0, B:77:0x03af, B:80:0x03c1, B:82:0x03d0, B:85:0x03e1, B:87:0x03f0, B:90:0x0401, B:92:0x0410, B:95:0x0421, B:97:0x0430, B:19:0x015b, B:20:0x015f, B:22:0x016e, B:23:0x01a3, B:12:0x0086, B:186:0x0809, B:187:0x080a, B:5:0x0033), top: B:192:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.activities.OpenVPNClient.e0():void");
    }

    @Override // rased.vpn.app.activities.a, defpackage.InterfaceC3722yp
    public final void f() {
        g0();
    }

    public final void f0() {
        try {
            this.Z.setText(getString(R.string.connecting));
            this.Z.setTextColor(-65536);
            Intent intentPrepare = VpnService.prepare(this);
            if (intentPrepare != null) {
                SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-44267580126138L), Deobfuscator$MHRTUNNELVPN$app.getString(-44353479472058L), R.string.state_user_vpn_permission, ConnectionStatus.LEVEL_WAITING_FOR_USER_INPUT);
                try {
                    startActivityForResult(intentPrepare, 65);
                } catch (ActivityNotFoundException unused) {
                    SkStatus.logError(R.string.no_vpn_support_image);
                }
            } else {
                onActivityResult(65, -1, null);
            }
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), 1).show();
        }
    }

    public final void g0() {
        this.c0.removeCallbacks(this.d0);
        Intent intentPrepare = VpnService.prepare(this);
        if (intentPrepare == null) {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-47944072131514L), Deobfuscator$MHRTUNNELVPN$app.getString(-48004201673658L));
            V();
            return;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-47510280434618L), Deobfuscator$MHRTUNNELVPN$app.getString(-47570409976762L));
            startActivityForResult(intentPrepare, 1);
        } catch (ActivityNotFoundException e) {
            Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-47712143897530L), Deobfuscator$MHRTUNNELVPN$app.getString(-47772273439674L), e);
            p(s(R.string.vpn_permission_dialog_missing_title), s(R.string.vpn_permission_dialog_missing_text), null);
        }
    }

    public final void h0() {
        C2827iH.s().r().f();
        InjectorService injectorService = this.d;
        if (injectorService != null && InjectorService.s) {
            injectorService.getClass();
            InjectorService.s = false;
            injectorService.j(Deobfuscator$MHRTUNNELVPN$app.getString(-67576367641530L));
            injectorService.m = 0;
            new Thread(new RunnableC2705g5(injectorService, 15)).start();
            injectorService.stopForeground(true);
            injectorService.stopSelf();
        }
        i0();
    }

    public final void i0() {
        if (this.g0.o().booleanValue()) {
            TunnelManagerHelper.stopPsiphon(this);
        } else if (this.g0.p().booleanValue()) {
            TunnelManagerHelper.stopSocksHttp(this);
        } else if (this.g0.q().booleanValue()) {
            TunnelManagerHelper.stopXRay(this);
        }
        C(true);
        getApplicationContext().deleteFile(Deobfuscator$MHRTUNNELVPN$app.getString(-44357774439354L));
    }

    public final void j0() {
        this.Z.setTextColor(-65536);
        d0(getString(R.string.disconnected));
        h0();
        u(true);
        CountDownTimer countDownTimer = this.x0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[PHI: r7
      0x005d: PHI (r7v18 ey) = (r7v17 ey), (r7v26 ey), (r7v26 ey) binds: [B:24:0x003e, B:26:0x0044, B:31:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(int r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.activities.OpenVPNClient.k0(int, java.lang.String, boolean):void");
    }

    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws JSONException, IOException {
        long j;
        boolean z = false;
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-49447310685114L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-49507440227258L), Integer.valueOf(i), Integer.valueOf(i2)));
        if (i == 1) {
            if (i2 == -1) {
                V();
                return;
            }
            if (i2 != 0) {
                return;
            }
            EnumC2587dy enumC2587dy = this.y;
            EnumC2587dy enumC2587dy2 = EnumC2587dy.b;
            if (enumC2587dy == enumC2587dy2) {
                finish();
                return;
            } else {
                if (enumC2587dy == EnumC2587dy.c) {
                    this.y = enumC2587dy2;
                    g0();
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-49975591662522L));
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-50027131270074L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-50087260812218L), stringExtra));
                try {
                    File file = new File(stringExtra);
                    if (file.getPath().endsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-50400793424826L))) {
                        R2 r2 = new R2(13, z);
                        r2.b = new HashMap();
                        r2.c = new HashMap();
                        r2.y(new InputStreamReader(new FileInputStream(stringExtra)));
                        String name = file.getName();
                        String str = String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-50426563228602L), r2);
                        OpenVPNService openVPNService = this.b;
                        if (openVPNService != null) {
                            openVPNService.a(name, str);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-50478102836154L) + e.getMessage());
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            if (i2 == -1) {
                String stringExtra2 = intent.getStringExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-50190340027322L));
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-50241879634874L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-50302009177018L), stringExtra2));
                try {
                    Intent intentCreateInstallIntent = KeyChain.createInstallIntent();
                    intentCreateInstallIntent.putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-64690149618618L), AbstractC3279qd.a0(stringExtra2));
                    startActivity(intentCreateInstallIntent);
                    return;
                } catch (IOException unused) {
                    p(null, String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-64720214389690L), stringExtra2, getText(R.string.file_read_error)), null);
                    return;
                }
            }
            return;
        }
        if (i == 65) {
            if (this.g0.o().booleanValue()) {
                TunnelManagerHelper.startPsiphon(this);
                j = -49692123820986L;
            } else if (!this.g0.p().booleanValue()) {
                TunnelManagerHelper.startXRay(this);
                return;
            } else {
                TunnelManagerHelper.startSocksHttp(this);
                j = -49760843297722L;
            }
            this.y0 = Deobfuscator$MHRTUNNELVPN$app.getString(j);
            return;
        }
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1 || intent == null) {
            return;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(getContentResolver().openInputStream(intent.getData()))).readLine();
            if (line == null) {
                line = Deobfuscator$MHRTUNNELVPN$app.getString(-55524689408954L);
            }
            JSONObject jSONObject = new JSONObject(PUtils.pDecrypt(getApplicationContext(), line));
            String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-49795203036090L));
            if (string.isEmpty()) {
                B(jSONObject);
            } else {
                Z(string, jSONObject);
            }
        } catch (Exception unused2) {
            SweetToast.error(this, Deobfuscator$MHRTUNNELVPN$app.getString(-49859627545530L));
        }
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws JSONException {
        int i = 3;
        this.c0.removeCallbacks(this.d0);
        this.m = null;
        this.y = EnumC2587dy.a;
        int id = view.getId();
        if (id != R.id.connect) {
            if (id == R.id.disconnect) {
                C3249q1 c3249q1 = new C3249q1(this, R.style.MyDialogTheme);
                String string = Deobfuscator$MHRTUNNELVPN$app.getString(-43760773985210L);
                C3084n1 c3084n1 = (C3084n1) c3249q1.c;
                c3084n1.e = string;
                c3084n1.g = Deobfuscator$MHRTUNNELVPN$app.getString(-43812313592762L);
                c3084n1.n = false;
                c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-43971227382714L), new DialogInterfaceOnClickListenerC0603ck(4));
                c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-43984112284602L), new Ix(this, i));
                c3249q1.i();
                return;
            }
            return;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-175650629710778L))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-42394974385082L));
            return;
        }
        C3492ub c3492ub = this.g0;
        c3492ub.getClass();
        if (c3492ub.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-165763614995386L), Deobfuscator$MHRTUNNELVPN$app.getString(-165832334472122L)).contains(Deobfuscator$MHRTUNNELVPN$app.getString(-42498053600186L))) {
            try {
                JSONObject jSONObject = new JSONObject(YD.a(this.w0)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-42553888175034L)).getJSONObject(this.r0.getSelectedItemPosition());
                String string2 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-42614017717178L));
                String string3 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-42669852292026L));
                String string4 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-42712801964986L));
                String string5 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-42785816409018L));
                Calendar calendar = Calendar.getInstance();
                String str = String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-42841650983866L), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)));
                if (!string2.isEmpty()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Deobfuscator$MHRTUNNELVPN$app.getString(-42949025166266L));
                    if (simpleDateFormat.parse(str).after(simpleDateFormat.parse(string2))) {
                        SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-43022039610298L));
                        return;
                    }
                }
                if (!string3.isEmpty() && !string3.equals(F())) {
                    SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-43120823858106L));
                    return;
                }
                if (string4.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-43288327582650L)) && !H().toLowerCase().contains(Deobfuscator$MHRTUNNELVPN$app.getString(-43309802419130L))) {
                    SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-43339867190202L));
                    return;
                } else if (string5.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-43524550783930L)) && new C2845ii(getApplicationContext(), 1).d()) {
                    SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-43546025620410L));
                    return;
                }
            } catch (Exception e) {
                SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-43726414246842L) + e.getMessage());
            }
        }
        h0();
        e0();
        this.A0 = true;
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        C3515uy c3515uyB;
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-48824540427194L), Deobfuscator$MHRTUNNELVPN$app.getString(-48884669969338L));
        int itemId = menuItem.getItemId();
        if (itemId == R.string.profile_context_cancel || itemId == R.string.proxy_context_cancel) {
            return true;
        }
        if (itemId == R.string.profile_context_forget_creds) {
            OpenVPNService openVPNService = this.b;
            C3569vy c3569vyI = openVPNService != null ? openVPNService.i() : null;
            if (c3569vyI == null || (c3515uyB = c3569vyI.b(J(menuItem))) == null) {
                return true;
            }
            H2 h2 = this.P;
            String string = Deobfuscator$MHRTUNNELVPN$app.getString(-49000634086330L);
            String str = c3515uyB.g;
            h2.p(string, str);
            this.P.p(Deobfuscator$MHRTUNNELVPN$app.getString(-49013518988218L), str);
            if (c3515uyB.e != null) {
                c3515uyB.e = null;
                c3515uyB.n.t.k(str, Deobfuscator$MHRTUNNELVPN$app.getString(-74005933683642L));
            }
            k0(65536, null, o());
            return true;
        }
        if (itemId == R.string.profile_context_menu_change_profile) {
            this.L.performClick();
            return true;
        }
        if (itemId == R.string.profile_context_menu_create_shortcut) {
            String strJ = J(menuItem);
            if (strJ == null) {
                return true;
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.create_shortcut_dialog, (ViewGroup) null);
            EditText editText = (EditText) viewInflate.findViewById(R.id.shortcut_name);
            editText.setText(strJ);
            editText.selectAll();
            Vx vx = new Vx(this, strJ, editText, 0);
            C3249q1 c3249q1 = new C3249q1(this);
            C3084n1 c3084n1 = (C3084n1) c3249q1.c;
            c3084n1.e = c3084n1.a.getText(R.string.create_shortcut_title);
            c3084n1.r = viewInflate;
            c3249q1.g(R.string.create_shortcut_yes, vx);
            c3084n1.j = c3084n1.a.getText(R.string.create_shortcut_cancel);
            c3084n1.k = vx;
            c3249q1.i();
            return true;
        }
        if (itemId == R.string.profile_context_menu_delete) {
            String strJ2 = J(menuItem);
            if (strJ2 == null) {
                return true;
            }
            DialogInterfaceOnClickListenerC0566c1 dialogInterfaceOnClickListenerC0566c1 = new DialogInterfaceOnClickListenerC0566c1(strJ2, 1, this);
            C3249q1 c3249q12 = new C3249q1(this);
            C3084n1 c3084n12 = (C3084n1) c3249q12.c;
            c3084n12.e = c3084n12.a.getText(R.string.delete_profile_confirm_title);
            c3084n12.g = strJ2;
            c3249q12.g(R.string.delete_profile_confirm_yes, dialogInterfaceOnClickListenerC0566c1);
            c3084n12.j = c3084n12.a.getText(R.string.delete_profile_confirm_cancel);
            c3084n12.k = dialogInterfaceOnClickListenerC0566c1;
            c3249q12.i();
            return true;
        }
        if (itemId == R.string.profile_context_menu_rename) {
            String strJ3 = J(menuItem);
            if (strJ3 == null) {
                return true;
            }
            View viewInflate2 = getLayoutInflater().inflate(R.layout.rename_profile_dialog, (ViewGroup) null);
            EditText editText2 = (EditText) viewInflate2.findViewById(R.id.rename_profile_name);
            editText2.setText(strJ3);
            editText2.selectAll();
            Vx vx2 = new Vx(this, strJ3, editText2, 1);
            C3249q1 c3249q13 = new C3249q1(this);
            C3084n1 c3084n13 = (C3084n1) c3249q13.c;
            c3084n13.e = c3084n13.a.getText(R.string.rename_profile_title);
            c3084n13.r = viewInflate2;
            c3249q13.g(R.string.rename_profile_yes, vx2);
            c3084n13.j = c3084n13.a.getText(R.string.rename_profile_cancel);
            c3084n13.k = vx2;
            c3249q13.i();
            return true;
        }
        if (itemId == R.string.proxy_context_change_proxy) {
            this.O.performClick();
            return true;
        }
        if (itemId == R.string.proxy_context_delete) {
            String strJ4 = J(menuItem);
            OpenVPNService openVPNService2 = this.b;
            Wx wx = new Wx(this, openVPNService2 != null ? openVPNService2.v : null, strJ4, 0);
            C3249q1 c3249q14 = new C3249q1(this);
            C3084n1 c3084n14 = (C3084n1) c3249q14.c;
            c3084n14.e = c3084n14.a.getText(R.string.proxy_delete_confirm_title);
            c3084n14.g = strJ4;
            c3249q14.g(R.string.proxy_delete_confirm_yes, wx);
            c3084n14.j = c3084n14.a.getText(R.string.proxy_delete_confirm_cancel);
            c3084n14.k = wx;
            c3249q14.i();
            return true;
        }
        if (itemId != R.string.proxy_context_forget_creds) {
            return false;
        }
        String strJ5 = J(menuItem);
        OpenVPNService openVPNService3 = this.b;
        C0102Fe c0102Fe = openVPNService3 != null ? openVPNService3.v : null;
        if (c0102Fe == null) {
            return true;
        }
        C3312rA c3312rA = c0102Fe.b(strJ5) ? null : (C3312rA) ((TreeMap) c0102Fe.e).get(strJ5);
        if (c3312rA != null) {
            c3312rA.g = "";
            c3312rA.d = "";
            c0102Fe.a = true;
        }
        c0102Fe.e();
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(69:0|2|(1:4)|5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|50|(1:52)|53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)(1:69)|68|70|138|71|(2:131|74)|77|140|78|81|(15:87|(1:89)|90|133|91|94|(4:96|135|97|100)|101|(1:103)|104|(2:109|(1:111)(1:112))|113|(5:137|119|(1:121)(1:122)|123|(1:125)(1:126))|129|130)(1:85)|86|90|133|91|94|(0)|101|(0)|104|(3:106|109|(0)(0))|113|(7:115|117|137|119|(0)(0)|123|(0)(0))|129|130) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0703, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x082b A[Catch: Exception -> 0x085c, TryCatch #3 {Exception -> 0x085c, blocks: (B:119:0x0812, B:123:0x0834, B:125:0x0854, B:126:0x0858, B:122:0x082b), top: B:137:0x0812 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0854 A[Catch: Exception -> 0x085c, TryCatch #3 {Exception -> 0x085c, blocks: (B:119:0x0812, B:123:0x0834, B:125:0x0854, B:126:0x0858, B:122:0x082b), top: B:137:0x0812 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0858 A[Catch: Exception -> 0x085c, TRY_LEAVE, TryCatch #3 {Exception -> 0x085c, blocks: (B:119:0x0812, B:123:0x0834, B:125:0x0854, B:126:0x0858, B:122:0x082b), top: B:137:0x0812 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0713  */
    @Override // rased.vpn.app.activities.a, androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r11) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.activities.OpenVPNClient.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.AbstractActivityC2592e2, androidx.fragment.app.q, android.app.Activity
    public final void onDestroy() {
        SkStatus.removeStateListener(this);
        this.W.removeCallbacks(this.X);
        k();
        if (this.d != null) {
            unbindService(this.e);
            this.d = null;
        }
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-39946843026362L), Deobfuscator$MHRTUNNELVPN$app.getString(-40006972568506L));
        super.onDestroy();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) throws JSONException {
        this.c0.removeCallbacks(this.d0);
        int id = adapterView.getId();
        try {
            if (id != R.id.profile) {
                if (id == R.id.proxy) {
                    OpenVPNService openVPNService = this.b;
                    C0102Fe c0102Fe = openVPNService != null ? openVPNService.v : null;
                    if (c0102Fe == null) {
                        return;
                    }
                    ArrayAdapter arrayAdapter = (ArrayAdapter) this.O.getAdapter();
                    c0102Fe.f(arrayAdapter != null ? (String) arrayAdapter.getItem(i) : null);
                    c0102Fe.e();
                } else if (id == R.id.server) {
                    ArrayAdapter arrayAdapter2 = (ArrayAdapter) this.S.getAdapter();
                    this.J.F((String) this.L.getSelectedItem(), Deobfuscator$MHRTUNNELVPN$app.getString(-48304849384378L), arrayAdapter2 != null ? (String) arrayAdapter2.getItem(i) : null);
                } else {
                    if (id != R.id.network_spin) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(YD.a(this.w0)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-48334914155450L)).getJSONObject(this.r0.getSelectedItemPosition());
                    P(jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-48395043697594L)));
                    K();
                    XD xd = this.T0;
                    xd.putString(Z0, jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-48433698403258L)));
                    xd.apply();
                    C3492ub c3492ub = this.g0;
                    String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-48493827945402L));
                    XD xd2 = c3492ub.b;
                    xd2.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-165694895518650L), string);
                    xd2.apply();
                    C3492ub c3492ub2 = this.g0;
                    String string2 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-48528187683770L));
                    XD xd3 = c3492ub2.b;
                    xd3.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-165836629439418L), string2);
                    xd3.apply();
                    C3492ub c3492ub3 = this.g0;
                    String string3 = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-48566842389434L));
                    XD xd4 = c3492ub3.b;
                    xd4.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-168825926677434L), string3);
                    xd4.apply();
                    C3492ub c3492ub4 = this.g0;
                    int selectedItemPosition = this.r0.getSelectedItemPosition();
                    XD xd5 = c3492ub4.b;
                    xd5.putInt(Deobfuscator$MHRTUNNELVPN$app.getString(-166296190940090L), selectedItemPosition);
                    xd5.apply();
                }
                l(true);
                return;
            }
            k0(327680, null, o());
            String str = (String) this.l0.get(i);
            XD xd6 = this.T0;
            xd6.putString(Y0, str);
            xd6.apply();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-38319050421178L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-38379179963322L), intent.toString()));
        setIntent(intent);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_update) {
            this.h0 = true;
            SweetToast.info(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-38619698131898L));
            z();
            return true;
        }
        if (itemId != R.id.menu_clear_data) {
            return super.onOptionsItemSelected(menuItem);
        }
        C3249q1 c3249q1 = new C3249q1(this, R.style.MyDialogTheme);
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-44001292153786L);
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        c3084n1.e = string;
        c3084n1.g = Deobfuscator$MHRTUNNELVPN$app.getString(-44048536794042L);
        c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-44224630453178L), new Ix(this, 4));
        c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-44237515355066L), null);
        c3249q1.i();
        return true;
    }

    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length != 0) {
            if (i != 2 && i != 3) {
                if (i != 530) {
                    return;
                }
                SweetToast.error(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-41755024257978L));
                return;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (strArr[i2].equals(Deobfuscator$MHRTUNNELVPN$app.getString(-41866693407674L)) && iArr[i2] == 0) {
                    if (i == 2) {
                        r(2, R.string.select_profile);
                    } else if (i == 3) {
                        r(3, R.string.select_pkcs12);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.q, android.app.Activity
    public final void onResume() {
        Q();
        S();
        SkStatus.addStateListener(this);
        C3430tK.v = this;
        GO.s = this;
        TunnelVpnManagerPsi.setSocksListener(this);
        SocksDNSService.u = this;
        PsiphonDNSService.s = this;
        XRayDNSService.t = this;
        this.h0 = false;
        z();
        this.C0.setText(G() + Deobfuscator$MHRTUNNELVPN$app.getString(-39654785250234L) + H());
        super.onResume();
    }

    @Override // defpackage.AbstractActivityC2592e2, androidx.fragment.app.q, android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-39830878909370L), Deobfuscator$MHRTUNNELVPN$app.getString(-39891008451514L));
        this.T |= 2;
        if (this.y == EnumC2587dy.b) {
            this.y = EnumC2587dy.c;
        }
        boolean zO = o();
        if (zO) {
            this.W.removeCallbacks(this.X);
            this.W.postDelayed(this.X, 1000L);
        }
        if (R(zO)) {
            k0(65536, null, zO);
        }
    }

    @Override // defpackage.AbstractActivityC2592e2, androidx.fragment.app.q, android.app.Activity
    public final void onStop() {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-39543116100538L), Deobfuscator$MHRTUNNELVPN$app.getString(-39603245642682L));
        this.W.removeCallbacks(this.X);
        super.onStop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() != R.id.conn_details_boxed || motionEvent.getAction() != 0) {
            return false;
        }
        this.J.D(Deobfuscator$MHRTUNNELVPN$app.getString(-48249014809530L), !this.J.t(Deobfuscator$MHRTUNNELVPN$app.getString(-48193180234682L)));
        X();
        return true;
    }

    @Override // rased.vpn.app.activities.a
    public final void q() {
        C3300qy c3300qy;
        C3300qy c3300qy2;
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-38495144080314L), Deobfuscator$MHRTUNNELVPN$app.getString(-38555273622458L));
        this.T |= 1;
        R(o());
        boolean zO = o();
        OpenVPNService openVPNService = this.b;
        C3300qy c3300qy3 = null;
        C3300qy c3300qy4 = (openVPNService == null || (c3300qy2 = openVPNService.f) == null || (c3300qy2.a != 0 && SystemClock.elapsedRealtime() > c3300qy2.a)) ? null : openVPNService.f;
        boolean z = false;
        if (c3300qy4 == null) {
            OpenVPNService openVPNService2 = this.b;
            C3569vy c3569vyI = openVPNService2 != null ? openVPNService2.i() : null;
            if ((c3569vyI != null ? c3569vyI.size() : 0) > 0) {
                c3300qy4 = new C3300qy();
                c3300qy4.b = 2;
                c3300qy4.i = R.string.disconnected;
                c3300qy4.c = 2131230899;
                c3300qy4.e = Deobfuscator$MHRTUNNELVPN$app.getString(-72863472382906L);
                c3300qy4.d = Deobfuscator$MHRTUNNELVPN$app.getString(-72919306957754L);
                U(c3300qy4, true, zO, true);
            } else {
                this.Z.setVisibility(8);
                k0(65536, null, zO);
                this.M.setVisibility(8);
            }
        } else {
            U(c3300qy4, true, zO, true);
        }
        OpenVPNService openVPNService3 = this.b;
        if (openVPNService3 != null && (c3300qy = openVPNService3.m) != null) {
            if (c3300qy.a != 0 && SystemClock.elapsedRealtime() > c3300qy.a) {
                z = true;
            }
            if (!z) {
                c3300qy3 = openVPNService3.m;
            }
        }
        if (c3300qy3 != null) {
            U(c3300qy3, true, zO, true);
        }
    }

    @Override // defpackage.InterfaceC3376sK, rased.vpn.app.service.vpn.TunnelVpnManagerPsi.SocksListener
    public final void restartSocksOpenVPN() {
        runOnUiThread(new Lx(this, 5));
    }

    @Override // defpackage.InterfaceC3376sK, rased.vpn.app.service.vpn.TunnelVpnManagerPsi.SocksListener, defpackage.FO
    public final void startSocksOpenVPN() {
        runOnUiThread(new RunnableC2899ji(1));
    }

    @Override // defpackage.InterfaceC3376sK, rased.vpn.app.service.vpn.TunnelVpnManagerPsi.SocksListener, defpackage.FO
    public final void stopSocksOpenVPN() {
        runOnUiThread(new Lx(this, 6));
    }

    @Override // rased.vpn.app.activities.a
    public final void t(String str) {
        super.t(str);
    }

    @Override // rased.vpn.app.service.vpn.logger.SkStatus.StateListener
    public final void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        runOnUiThread(new Lx(this, 8));
    }

    public final void y() {
        C3249q1 c3249q1 = new C3249q1(this, R.style.MyDialogTheme);
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-52105895441338L);
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        c3084n1.e = string;
        c3084n1.g = Deobfuscator$MHRTUNNELVPN$app.getString(-52166024983482L);
        c3084n1.n = false;
        c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-52470967661498L), new Ix(this, 5));
        c3249q1.i();
    }

    public final void z() {
        AbstractC3162oO.f(this).a(new C3373sH(Deobfuscator$MHRTUNNELVPN$app.getString(-37412812321722L), new Tx(this), new C0108Fk(22)));
    }
}
