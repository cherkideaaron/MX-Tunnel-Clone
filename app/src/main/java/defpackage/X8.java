package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rased.vpn.app.tethering.ProxyService;

/* loaded from: classes2.dex */
public final class X8 {
    public static final Pattern q = Pattern.compile("(.*):([\\d]+)");
    public static final Pattern r = Pattern.compile("(https?)://([^:/]+)(:[\\d]+])?/.*");
    public static int s = 0;
    public static int t = 0;
    public SocketChannel a;
    public SelectionKey b;
    public ByteBuffer c;
    public int d;
    public int f;
    public String g;
    public final boolean i;
    public String j;
    public int k;
    public String l;
    public C2545d9 m;
    public String n;
    public D3 o;
    public final String p;
    public char[] e = new char[UserVerificationMethods.USER_VERIFY_ALL];
    public final HashMap h = new HashMap();

    public X8(boolean z) {
        this.i = z;
        StringBuilder sb = new StringBuilder("channel");
        int i = s;
        s = i + 1;
        sb.append(i);
        this.p = sb.toString();
        this.f = 0;
        f();
    }

    public final void a() {
        String str = this.p;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" close socket ");
            int i = t;
            t = i + 1;
            sb.append(i);
            Log.d("TetherChannel", sb.toString());
            this.b.cancel();
            this.a.close();
        } catch (Exception e) {
            Log.e("TetherChannel", str + " close exception", e);
        }
    }

    public final String b() throws NumberFormatException {
        int i;
        if (!this.i) {
            return null;
        }
        String strC = c();
        if ("CONNECT".equals(this.j)) {
            Matcher matcher = q.matcher(strC);
            if (matcher.matches()) {
                this.l = matcher.group(1);
                i = Integer.parseInt(matcher.group(2));
                this.k = i;
            }
        } else {
            Matcher matcher2 = r.matcher(strC);
            if (matcher2.matches()) {
                this.l = matcher2.group(2);
                if (matcher2.group(3) != null) {
                    Integer.parseInt(matcher2.group(3).substring(1));
                } else {
                    i = "https".equals(matcher2.group(1)) ? 443 : 80;
                    this.k = i;
                }
            }
        }
        return this.l;
    }

    public final String c() {
        String strG = (String) this.o.c;
        if (strG == null || strG.startsWith("/")) {
            strG = AbstractC3264qG.g((String) this.h.get("Host"), strG);
        }
        this.n = strG;
        return this.n;
    }

    public final void d() throws IOException, NumberFormatException {
        int i;
        C2545d9 c2545d9;
        String str;
        ByteBuffer byteBufferWrap;
        X8 x8;
        String strB;
        int i2;
        String str2;
        if (this.c == null) {
            this.c = ByteBuffer.allocate(8192);
        }
        this.c.clear();
        try {
            i = this.a.read(this.c);
        } catch (IOException e) {
            Log.e("TetherChannel", this.p + " read exception.", e);
            i = 0;
        }
        this.c.flip();
        int iLimit = this.c.limit() - this.c.position();
        Log.d("TetherChannel", (this.i ? "request" : "response") + " " + this.p + " read count " + i + " datasize " + iLimit);
        if (i == -1) {
            C2545d9 c2545d92 = this.m;
            if (c2545d92 != null) {
                Log.d("ChannelPair", "onClose " + this);
                c2545d92.a();
                return;
            }
            return;
        }
        if (iLimit == 0) {
            return;
        }
        if (this.d == 3) {
            C2545d9 c2545d93 = this.m;
            if (c2545d93 != null) {
                c2545d93.d(this);
                return;
            }
            return;
        }
        while (true) {
            String strE = e();
            if (strE == null) {
                break;
            }
            int i3 = this.d;
            if (i3 == 1) {
                Log.d("TetherChannel", this.p + " setStatusLine " + strE);
                this.g = strE;
                if (this.i) {
                    D3 d3 = new D3(16);
                    if (!TextUtils.isEmpty(strE)) {
                        try {
                            int iIndexOf = strE.indexOf(" ");
                            if (iIndexOf != -1) {
                                d3.b = strE.substring(0, iIndexOf);
                                String strSubstring = strE.substring(iIndexOf + 1);
                                int iIndexOf2 = strSubstring.indexOf(" ");
                                if (iIndexOf2 != -1) {
                                    d3.c = strSubstring.substring(0, iIndexOf2);
                                    String strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
                                    if (!TextUtils.isEmpty(strSubstring2)) {
                                        d3.d = strSubstring2;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    this.o = d3;
                    this.j = (String) d3.b;
                } else if (!TextUtils.isEmpty(strE)) {
                    try {
                        int iIndexOf3 = strE.indexOf(" ");
                        if (iIndexOf3 != -1) {
                            strE.substring(0, iIndexOf3);
                            String strSubstring3 = strE.substring(iIndexOf3 + 1);
                            int iIndexOf4 = strSubstring3.indexOf(" ");
                            if (iIndexOf4 != -1) {
                                Integer.parseInt(strSubstring3.substring(0, iIndexOf4));
                                strSubstring3.substring(iIndexOf4 + 1);
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                this.d = 2;
                if (this.m != null) {
                    Log.d("ChannelPair", "onStatusLine " + this.g);
                }
            } else if (i3 != 2) {
                continue;
            } else if (TextUtils.isEmpty(strE)) {
                this.d = 3;
                C2545d9 c2545d94 = this.m;
                if (c2545d94 != null) {
                    Log.d("ChannelPair", "onHeaders");
                    if (this.i) {
                        try {
                            str = this.j;
                        } catch (Exception e4) {
                            Log.e("ChannelPair", "establish response exception", e4);
                        }
                        if (c2545d94.b == null) {
                            if ("CONNECT".equals(str)) {
                                strB = b();
                                if (this.k == 0) {
                                    b();
                                }
                                i2 = this.k;
                            } else {
                                strB = b();
                                if (this.k == 0) {
                                    b();
                                }
                                i2 = this.k;
                            }
                            SocketChannel socketChannelB = C2545d9.b(i2, strB);
                            if (socketChannelB == null) {
                                c2545d94.a();
                            } else {
                                X8 x82 = new X8(false);
                                c2545d94.b = x82;
                                x82.m = c2545d94;
                                x82.a = socketChannelB;
                                c2545d94.b.b = socketChannelB.register(ProxyService.m.e, 1, c2545d94);
                            }
                        } else {
                            Log.d("ChannelPair", "reuse socket " + c2545d94.b.p);
                            c2545d94.b.f();
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        if ("CONNECT".equals(str)) {
                            stringBuffer.append("HTTP/1.0 200 Connection Established\r\nProxy-agent: KissProxy\r\n\r\n");
                            c2545d94.b.d = 3;
                            byteBufferWrap = ByteBuffer.wrap(stringBuffer.toString().getBytes());
                            x8 = c2545d94.a;
                        } else {
                            stringBuffer.append(str + " ");
                            String strC = c();
                            if (!strC.startsWith("/")) {
                                strC = strC.substring(strC.indexOf(47, 8));
                            }
                            Log.d("ChannelPair", "connResponse " + strC);
                            stringBuffer.append(strC);
                            stringBuffer.append(" ");
                            D3 d32 = this.o;
                            stringBuffer.append(d32 == null ? null : (String) d32.d);
                            stringBuffer.append("\r\n");
                            HashMap map = this.h;
                            for (String str3 : map.keySet()) {
                                stringBuffer.append(str3);
                                stringBuffer.append(": ");
                                stringBuffer.append((String) map.get(str3));
                                stringBuffer.append("\r\n");
                            }
                            stringBuffer.append("\r\n");
                            String string = stringBuffer.toString();
                            Log.d("ChannelPair", string);
                            byteBufferWrap = ByteBuffer.wrap(string.getBytes());
                            x8 = c2545d94.b;
                        }
                        x8.g(byteBufferWrap);
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(this.g);
                        stringBuffer2.append("\r\n");
                        for (Map.Entry entry : this.h.entrySet()) {
                            stringBuffer2.append((String) entry.getKey());
                            stringBuffer2.append(": ");
                            stringBuffer2.append((String) entry.getValue());
                            stringBuffer2.append("\r\n");
                        }
                        stringBuffer2.append("\r\n");
                        c2545d94.a.g(ByteBuffer.wrap(stringBuffer2.toString().getBytes()));
                    }
                }
            } else if (!TextUtils.isEmpty(strE)) {
                int iIndexOf5 = strE.indexOf(":");
                String str4 = this.p;
                if (iIndexOf5 <= 0 || iIndexOf5 >= strE.length()) {
                    str2 = str4 + " invalid header content " + strE;
                    Log.w("TetherChannel", str2);
                } else {
                    String strSubstring4 = strE.substring(0, iIndexOf5);
                    String strTrim = strE.substring(iIndexOf5 + 1).trim();
                    if (TextUtils.isEmpty(strSubstring4) || TextUtils.isEmpty(strTrim)) {
                        str2 = str4 + " +invalie header value";
                        Log.w("TetherChannel", str2);
                    } else {
                        Log.d("TetherChannel", str4 + " addHeader [name] " + strSubstring4 + " [value] " + strTrim);
                        this.h.put(strSubstring4, strTrim);
                    }
                }
            }
        }
        if (this.d != 3 || (c2545d9 = this.m) == null) {
            return;
        }
        c2545d9.d(this);
    }

    public final String e() {
        byte b;
        if (this.c.remaining() <= 0) {
            return null;
        }
        while (this.c.remaining() > 0 && (b = this.c.get()) != -1 && b != 10) {
            if (b != 13) {
                int i = this.f;
                char[] cArr = this.e;
                if (i == cArr.length) {
                    char[] cArr2 = new char[cArr.length * 2];
                    this.e = cArr2;
                    System.arraycopy(cArr, 0, cArr2, 0, i);
                }
                char[] cArr3 = this.e;
                int i2 = this.f;
                this.f = i2 + 1;
                cArr3[i2] = (char) b;
            }
        }
        String strCopyValueOf = String.copyValueOf(this.e, 0, this.f);
        this.f = 0;
        return strCopyValueOf;
    }

    public final void f() {
        System.currentTimeMillis();
        this.d = "CONNECT".equals(this.j) ? 3 : 1;
        this.h.clear();
    }

    public final void g(ByteBuffer byteBuffer) {
        try {
            this.a.write(byteBuffer);
        } catch (IOException e) {
            Log.e("TetherChannel", this.p + "  write exception.", e);
        }
    }
}
