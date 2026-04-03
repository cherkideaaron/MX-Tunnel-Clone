package rased.vpn.app.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import defpackage.AbstractC0136He;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3279qd;
import defpackage.BinderC3776zp;
import defpackage.C2876jD;
import defpackage.C2931kD;
import defpackage.C3492ub;
import defpackage.C3528vA;
import defpackage.C3668xp;
import defpackage.InterfaceC2994lL;
import defpackage.InterfaceC3722yp;
import defpackage.S6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* loaded from: classes2.dex */
public class InjectorService extends Service implements Runnable, Handler.Callback {
    public static boolean s;
    public Thread a;
    public Handler b;
    public C3492ub c;
    public ServerSocket d;
    public Socket e;
    public Socket f;
    public int m = 0;
    public InterfaceC3722yp n;
    public HttpsURLConnection o;
    public S6 p;
    public SSLSocket q;
    public int r;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-72369551143866L);
        s = false;
    }

    public static String a(String str, String str2, String str3) {
        while (str.contains(str2)) {
            Matcher matcher = Pattern.compile(Deobfuscator$MHRTUNNELVPN$app.getString(-71218499908538L)).matcher(str);
            if (matcher.find()) {
                int iIntValue = Integer.valueOf(matcher.group(1)).intValue();
                String string = Deobfuscator$MHRTUNNELVPN$app.getString(-71304399254458L);
                for (int i = 0; i < iIntValue; i++) {
                    string = ((Object) string) + str3;
                }
                StringBuilder sbN = AbstractC3264qG.n(str2);
                sbN.append(String.valueOf(iIntValue));
                sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-71308694221754L));
                str = str.replace(sbN.toString(), string);
            }
        }
        return str;
    }

    public static boolean c(String str, OutputStream outputStream) throws InterruptedException, IOException {
        if (!str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-70157642986426L))) {
            return true;
        }
        for (String str2 : str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-70192002724794L)))) {
            if (c(str2, outputStream)) {
                outputStream.write(str2.getBytes());
                outputStream.flush();
                Thread.sleep(1000L);
            }
        }
        return false;
    }

    public static String h(String str) {
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-70969391805370L))) {
            str = a(str, Deobfuscator$MHRTUNNELVPN$app.getString(-70990866641850L), Deobfuscator$MHRTUNNELVPN$app.getString(-71012341478330L));
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-71020931412922L))) {
            str = a(str, Deobfuscator$MHRTUNNELVPN$app.getString(-71042406249402L), Deobfuscator$MHRTUNNELVPN$app.getString(-71063881085882L));
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-71072471020474L))) {
            str = a(str, Deobfuscator$MHRTUNNELVPN$app.getString(-71102535791546L), Deobfuscator$MHRTUNNELVPN$app.getString(-71132600562618L));
        }
        return str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-71145485464506L)) ? a(str, Deobfuscator$MHRTUNNELVPN$app.getString(-71175550235578L), Deobfuscator$MHRTUNNELVPN$app.getString(-71205615006650L)) : str;
    }

    public final void b(String str, Socket socket) throws InterruptedException, IOException {
        int i = 0;
        OutputStream outputStream = socket.getOutputStream();
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-69358779069370L))) {
            Random random = new Random();
            String[] strArrSplit = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-69397433775034L)));
            str = strArrSplit[random.nextInt(strArrSplit.length)];
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-69436088480698L))) {
            String[] strArrSplit2 = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-69474743186362L)));
            int i2 = this.m;
            String str2 = strArrSplit2[i2];
            int i3 = i2 + 1;
            this.m = i3;
            if (i3 > strArrSplit2.length - 1) {
                this.m = 0;
            }
            str = str2;
        }
        j(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-69547757630394L), C3492ub.m(str.replace(Deobfuscator$MHRTUNNELVPN$app.getString(-69513397892026L), Deobfuscator$MHRTUNNELVPN$app.getString(-69526282793914L)))));
        j(Deobfuscator$MHRTUNNELVPN$app.getString(-69599297237946L));
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-69642246910906L))) {
            String[] strArrSplit3 = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-69702376453050L)));
            int length = strArrSplit3.length;
            while (i < length) {
                String str3 = strArrSplit3[i];
                if (c(str3, outputStream)) {
                    outputStream.write(str3.getBytes());
                    outputStream.flush();
                    Thread.sleep(1500L);
                }
                i++;
            }
            return;
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-69762505995194L))) {
            String[] strArrSplit4 = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-69831225471930L)));
            int length2 = strArrSplit4.length;
            while (i < length2) {
                String str4 = strArrSplit4[i];
                if (c(str4, outputStream)) {
                    outputStream.write(str4.getBytes());
                    outputStream.flush();
                    Thread.sleep(0L);
                }
                i++;
            }
            return;
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-69899944948666L))) {
            String[] strArrSplit5 = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-69968664425402L)));
            int length3 = strArrSplit5.length;
            while (i < length3) {
                String str5 = strArrSplit5[i];
                if (c(str5, outputStream)) {
                    outputStream.write(str5.getBytes());
                    outputStream.flush();
                    Thread.sleep(0L);
                }
                i++;
            }
            return;
        }
        if (!str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-70037383902138L))) {
            if (c(str, outputStream)) {
                outputStream.write(str.getBytes());
                outputStream.flush();
                return;
            }
            return;
        }
        String[] strArrSplit6 = str.split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-70097513444282L)));
        int length4 = strArrSplit6.length;
        while (i < length4) {
            String str6 = strArrSplit6[i];
            if (c(str6, outputStream)) {
                outputStream.write(str6.getBytes());
                outputStream.flush();
                Thread.sleep(1500L);
            }
            i++;
        }
    }

    public final String d(String str) {
        if (str != null) {
            try {
                if (!str.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-70226362463162L))) {
                    String str2 = str.split(Deobfuscator$MHRTUNNELVPN$app.getString(-70230657430458L))[0];
                    String[] strArrSplit = str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-70243542332346L));
                    String[] strArrSplit2 = strArrSplit[1].split(Deobfuscator$MHRTUNNELVPN$app.getString(-70252132266938L));
                    String str3 = strArrSplit2[0];
                    String str4 = strArrSplit2[1];
                    C3492ub c3492ub = this.c;
                    c3492ub.getClass();
                    return h(c3492ub.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166983385707450L), Deobfuscator$MHRTUNNELVPN$app.getString(-167039220282298L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70260722201530L), this.c.h()).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70282197038010L), str).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70329441678266L), str2).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70355211482042L), strArrSplit[0]).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70393866187706L), strArrSplit[1]).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70445405795258L), str3).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70475470566330L), str4).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70505535337402L), strArrSplit[2]).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70552779977658L), Deobfuscator$MHRTUNNELVPN$app.getString(-70574254814138L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70582844748730L), Deobfuscator$MHRTUNNELVPN$app.getString(-70604319585210L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70612909519802L), Deobfuscator$MHRTUNNELVPN$app.getString(-70642974290874L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70655859192762L), Deobfuscator$MHRTUNNELVPN$app.getString(-70685923963834L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70698808865722L), Deobfuscator$MHRTUNNELVPN$app.getString(-70711693767610L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-70720283702202L), Deobfuscator$MHRTUNNELVPN$app.getString(-70733168604090L)));
                }
            } catch (Exception e) {
                k(Deobfuscator$MHRTUNNELVPN$app.getString(-70741758538682L), e.toString());
            }
        }
        k(Deobfuscator$MHRTUNNELVPN$app.getString(-70801888080826L), Deobfuscator$MHRTUNNELVPN$app.getString(-70862017622970L));
        return null;
    }

    public final void e() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        String strH = this.c.k().equals(Deobfuscator$MHRTUNNELVPN$app.getString(-69225635083194L)) ? this.c.h() : this.c.k();
        C2931kD c2931kD = new C2931kD();
        c2931kD.b = this;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        c2931kD.a = sSLContext;
        sSLContext.init(null, new TrustManager[]{new C2876jD()}, new SecureRandom());
        URL url = new URL(Deobfuscator$MHRTUNNELVPN$app.getString(-69247109919674L) + strH);
        String host = url.getHost();
        if (url.getPort() > 0) {
            StringBuilder sbN = AbstractC3264qG.n(host);
            sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-69285764625338L));
            sbN.append(url.getPort());
            host = sbN.toString();
        }
        if (!url.getPath().equals(Deobfuscator$MHRTUNNELVPN$app.getString(-69294354559930L))) {
            StringBuilder sbN2 = AbstractC3264qG.n(host);
            sbN2.append(url.getPath());
            host = sbN2.toString();
        }
        j(Deobfuscator$MHRTUNNELVPN$app.getString(-69302944494522L) + C3492ub.m(host));
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, this.p.a.getLocalSocketAddress()));
        this.o = httpsURLConnection;
        httpsURLConnection.setHostnameVerifier(new C3668xp());
        this.o.setSSLSocketFactory(c2931kD);
        this.o.connect();
    }

    public final void f(int i, String str) throws IOException {
        Socket socket = new Socket();
        this.f = socket;
        int i2 = this.r;
        if (i2 == 3 || i2 == 5) {
            socket.bind(new InetSocketAddress(0));
        }
        this.f.connect(new InetSocketAddress(str, i));
        i(this.f);
    }

    public final boolean g() throws IOException, NumberFormatException {
        String strD;
        Socket socket;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.e.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine();
            if (line != null && line.length() > 0) {
                stringBuffer.append(line);
                stringBuffer.append(Deobfuscator$MHRTUNNELVPN$app.getString(-67713806595002L));
                if (stringBuffer.toString().equals(Deobfuscator$MHRTUNNELVPN$app.getString(-67726691496890L))) {
                    k(Deobfuscator$MHRTUNNELVPN$app.getString(-67730986464186L), Deobfuscator$MHRTUNNELVPN$app.getString(-67782526071738L));
                    return false;
                }
                String string = Deobfuscator$MHRTUNNELVPN$app.getString(-67967209665466L);
                C3492ub c3492ub = this.c;
                c3492ub.getClass();
                k(string, c3492ub.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-165600406238138L), Deobfuscator$MHRTUNNELVPN$app.getString(-165690600551354L)));
                k(Deobfuscator$MHRTUNNELVPN$app.getString(-68035929142202L), this.c.e());
                j(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-68662994367418L), new String[]{Deobfuscator$MHRTUNNELVPN$app.getString(-68108943586234L), Deobfuscator$MHRTUNNELVPN$app.getString(-68177663062970L), Deobfuscator$MHRTUNNELVPN$app.getString(-68289332212666L), Deobfuscator$MHRTUNNELVPN$app.getString(-68345166787514L), Deobfuscator$MHRTUNNELVPN$app.getString(-68392411427770L), Deobfuscator$MHRTUNNELVPN$app.getString(-68521260446650L), Deobfuscator$MHRTUNNELVPN$app.getString(-68594274890682L)}[this.r]));
                int i = this.r;
                if (i == 2) {
                    strD = d(stringBuffer.toString());
                    if (strD == null) {
                        return false;
                    }
                    String strG = this.c.g();
                    C3492ub c3492ub2 = this.c;
                    c3492ub2.getClass();
                    int i2 = Integer.parseInt(c3492ub2.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-167095054857146L), Deobfuscator$MHRTUNNELVPN$app.getString(-167142299497402L)));
                    String str = strG + Deobfuscator$MHRTUNNELVPN$app.getString(-68770368549818L) + i2;
                    k(Deobfuscator$MHRTUNNELVPN$app.getString(-68778958484410L), Deobfuscator$MHRTUNNELVPN$app.getString(-68843382993850L) + str);
                    f(i2, strG);
                    if (!strD.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-68907807503290L))) {
                        socket = this.f;
                        b(strD, socket);
                    }
                } else if (i == 3) {
                    String strH = this.c.h();
                    C3492ub c3492ub3 = this.c;
                    c3492ub3.getClass();
                    f(Integer.parseInt(c3492ub3.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166618313487290L), Deobfuscator$MHRTUNNELVPN$app.getString(-166656968192954L))), strH);
                    e();
                    OutputStream outputStream = this.e.getOutputStream();
                    outputStream.write(Deobfuscator$MHRTUNNELVPN$app.getString(-71763960755130L).getBytes());
                    outputStream.flush();
                } else if (i == 5) {
                    strD = d(stringBuffer.toString());
                    if (strD == null) {
                        return false;
                    }
                    String str2 = stringBuffer.toString().split(Deobfuscator$MHRTUNNELVPN$app.getString(-68912102470586L))[0].split(Deobfuscator$MHRTUNNELVPN$app.getString(-68924987372474L))[1];
                    j(Deobfuscator$MHRTUNNELVPN$app.getString(-68950757176250L) + C3492ub.m(str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-68933577307066L))[0]) + Deobfuscator$MHRTUNNELVPN$app.getString(-69015181685690L) + C3492ub.m(String.valueOf(Integer.parseInt(str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-68942167241658L))[1]))));
                    String strG2 = this.c.g();
                    C3492ub c3492ub4 = this.c;
                    c3492ub4.getClass();
                    int i3 = Integer.parseInt(c3492ub4.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-167095054857146L), Deobfuscator$MHRTUNNELVPN$app.getString(-167142299497402L)));
                    String str3 = strG2 + Deobfuscator$MHRTUNNELVPN$app.getString(-69023771620282L) + i3;
                    k(Deobfuscator$MHRTUNNELVPN$app.getString(-69032361554874L), Deobfuscator$MHRTUNNELVPN$app.getString(-69096786064314L) + C3492ub.m(str3));
                    f(i3, strG2);
                    e();
                    if (!strD.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-69161210573754L))) {
                        socket = this.q;
                        b(strD, socket);
                    }
                }
                return this.q != null ? !this.e.isClosed() && this.f.isConnected() && this.q.isConnected() : !this.e.isClosed() && this.f.isConnected();
            }
        } catch (Exception e) {
            k(Deobfuscator$MHRTUNNELVPN$app.getString(-69165505541050L), e.toString());
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            String str = (String) message.obj;
            OpenVPNService openVPNService = AbstractC0136He.v;
            if (openVPNService != null) {
                openVPNService.l(str);
            }
            Log.i(Deobfuscator$MHRTUNNELVPN$app.getString(-72073198400442L), str);
        } else if (i == 2) {
            try {
                InterfaceC3722yp interfaceC3722yp = this.n;
                if (interfaceC3722yp != null) {
                    interfaceC3722yp.f();
                } else {
                    AbstractC3279qd.j0(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-72111853106106L));
                }
            } catch (NullPointerException unused) {
                AbstractC3279qd.j0(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-72240702124986L));
            }
        }
        return true;
    }

    public final void i(Socket socket) {
        InterfaceC2994lL interfaceC2994lL = AbstractC0136He.u;
        if (interfaceC2994lL != null ? ((OpenVPNService) interfaceC2994lL).protect(socket) : false) {
            j(Deobfuscator$MHRTUNNELVPN$app.getString(-71935759446970L));
        }
    }

    public final void j(String str) {
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(1, str));
    }

    public final void k(String str, String str2) {
        j(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-72013068858298L), str, str2));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new BinderC3776zp(this);
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b = new Handler(this);
        AbstractC0500aq.i(getApplicationContext());
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        if (intent == null) {
            return;
        }
        if (intent.getAction().equals(Deobfuscator$MHRTUNNELVPN$app.getString(-67357324309434L))) {
            this.a = new Thread(this, Deobfuscator$MHRTUNNELVPN$app.getString(-67383094113210L));
            C3492ub c3492ubC = C3492ub.c(this);
            this.c = c3492ubC;
            this.r = c3492ubC.l();
            j(Deobfuscator$MHRTUNNELVPN$app.getString(-67447518622650L));
            s = true;
            Thread thread = this.a;
            if (thread != null) {
                thread.interrupt();
            }
            this.a.start();
        }
        super.onStart(intent, i);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C3528vA c3528vA;
        try {
            j(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-71317284156346L), Integer.toString(7878)));
            j(Deobfuscator$MHRTUNNELVPN$app.getString(-71433248273338L));
            this.d = new ServerSocket(7878);
            int i = this.r;
            if (i == 3 || i == 5) {
                S6 s6 = this.p;
                if (s6 != null) {
                    ServerSocket serverSocket = s6.a;
                    if (serverSocket != null) {
                        serverSocket.close();
                    }
                    Socket socket = s6.b;
                    if (socket != null) {
                        socket.close();
                    }
                    s6.c = false;
                    s6.interrupt();
                }
                S6 s62 = new S6();
                s62.c = true;
                this.p = s62;
                s62.start();
            }
            this.b.sendEmptyMessage(2);
            while (s) {
                Socket socketAccept = this.d.accept();
                this.e = socketAccept;
                if (socketAccept != null && !socketAccept.isClosed() && g()) {
                    this.e.setKeepAlive(true);
                    SSLSocket sSLSocket = this.q;
                    if (sSLSocket == null || !sSLSocket.isConnected()) {
                        Socket socket2 = this.f;
                        if (socket2 != null && socket2.isConnected()) {
                            this.f.setKeepAlive(true);
                            i(this.f);
                            Socket socket3 = this.e;
                            Socket socket4 = this.f;
                            String string = Deobfuscator$MHRTUNNELVPN$app.getString(-71630816768954L);
                            String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-71656586572730L);
                            new C3528vA(socket3, socket4, true, string, string2).start();
                            c3528vA = new C3528vA(socket4, socket3, false, string, string2);
                        }
                    } else {
                        this.q.setKeepAlive(true);
                        this.f.setKeepAlive(true);
                        i(this.q);
                        Socket socket5 = this.e;
                        SSLSocket sSLSocket2 = this.q;
                        String string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-71579277161402L);
                        String string4 = Deobfuscator$MHRTUNNELVPN$app.getString(-71605046965178L);
                        new C3528vA(socket5, sSLSocket2, true, string3, string4).start();
                        c3528vA = new C3528vA(sSLSocket2, socket5, false, string3, string4);
                    }
                    c3528vA.start();
                }
            }
        } catch (Exception e) {
            j(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-72043133629370L), Deobfuscator$MHRTUNNELVPN$app.getString(-71682356376506L), e.getMessage()));
        }
    }
}
