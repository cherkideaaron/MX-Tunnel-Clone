package defpackage;

import android.os.SystemClock;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;
import org.apache.http.message.BasicHttpResponse;

/* renamed from: u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3471u7 implements InterfaceC2695fw {
    public static final boolean c = HM.a;
    public final InterfaceC0163Io a;
    public final W7 b;

    public C3471u7(InterfaceC0163Io interfaceC0163Io) {
        W7 w7 = new W7();
        this.a = interfaceC0163Io;
        this.b = w7;
    }

    public static void a(HashMap map, C2653f8 c2653f8) {
        if (c2653f8 == null) {
            return;
        }
        String str = c2653f8.b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        if (c2653f8.d > 0) {
            map.put("If-Modified-Since", DateUtils.formatDate(new Date(c2653f8.d)));
        }
    }

    public static void b(String str, C3373sH c3373sH, EM em) throws EM {
        LA la = c3373sH.p;
        int i = la.b;
        try {
            int i2 = la.c + 1;
            la.c = i2;
            float f = i;
            la.b = (int) ((1.0f * f) + f);
            if (i2 > 0) {
                throw em;
            }
            c3373sH.a(str + "-retry [timeout=" + i + "]");
        } catch (EM e) {
            c3373sH.a(str + "-timeout-giveup [timeout=" + i + "]");
            throw e;
        }
    }

    public static TreeMap c(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    public static void e(long j, C3373sH c3373sH, byte[] bArr, StatusLine statusLine) {
        if (c || j > AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS) {
            HM.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", c3373sH, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(statusLine.getStatusCode()), Integer.valueOf(c3373sH.h().a()));
        }
    }

    public final byte[] d(HttpEntity httpEntity) throws IOException {
        int contentLength = (int) httpEntity.getContentLength();
        W7 w7 = this.b;
        C2534cz c2534cz = new C2534cz(w7, contentLength);
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new C2867j4(3, (byte) 0);
            }
            byte[] bArrA = w7.a(UserVerificationMethods.USER_VERIFY_ALL);
            while (true) {
                int i = content.read(bArrA);
                if (i == -1) {
                    break;
                }
                c2534cz.write(bArrA, 0, i);
            }
            byte[] byteArray = c2534cz.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException unused) {
                HM.d("Error occured when calling consumingContent", new Object[0]);
            }
            w7.b(bArrA);
            c2534cz.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException unused2) {
                HM.d("Error occured when calling consumingContent", new Object[0]);
            }
            w7.b(null);
            c2534cz.close();
            throw th;
        }
    }

    public final C3078mw f(C3373sH c3373sH) throws EM, IOException {
        boolean z;
        Object obj;
        C2867j4 c2867j4;
        String str;
        C2867j4 c2867j42;
        String str2;
        HashMap map;
        HttpResponse httpResponseA;
        boolean z2 = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyMap();
            HttpResponse httpResponse = null;
            try {
                try {
                    try {
                        map = new HashMap();
                        a(map, c3373sH.d());
                    } catch (SocketTimeoutException unused) {
                        z = z2;
                    } catch (ConnectTimeoutException unused2) {
                        z = z2;
                    }
                    try {
                        httpResponseA = ((C0180Jo) this.a).a(c3373sH, map);
                    } catch (SocketTimeoutException unused3) {
                        z = true;
                        c2867j4 = new C2867j4(4, (byte) 0);
                        str = "socket";
                        b(str, c3373sH, c2867j4);
                        z2 = z;
                    } catch (ConnectTimeoutException unused4) {
                        z = true;
                        c2867j4 = new C2867j4(4, (byte) 0);
                        str = "connection";
                        b(str, c3373sH, c2867j4);
                        z2 = z;
                    }
                    try {
                        BasicHttpResponse basicHttpResponse = (BasicHttpResponse) httpResponseA;
                        StatusLine statusLine = basicHttpResponse.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        TreeMap treeMapC = c(httpResponseA.getAllHeaders());
                        if (statusCode == 304) {
                            C2653f8 c2653f8D = c3373sH.d();
                            if (c2653f8D == null) {
                                SystemClock.elapsedRealtime();
                                return new C3078mw(null, treeMapC, z2);
                            }
                            c2653f8D.g.putAll(treeMapC);
                            byte[] bArr = c2653f8D.a;
                            Map map2 = c2653f8D.g;
                            SystemClock.elapsedRealtime();
                            return new C3078mw(bArr, map2, z2);
                        }
                        if (statusCode == 301 || statusCode == 302) {
                            c3373sH.k((String) treeMapC.get("Location"));
                        }
                        byte[] bArrD = basicHttpResponse.getEntity() != null ? d(basicHttpResponse.getEntity()) : new byte[0];
                        e(SystemClock.elapsedRealtime() - jElapsedRealtime, c3373sH, bArrD, statusLine);
                        if (statusCode < 200 || statusCode > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new C3078mw(bArrD, treeMapC, false);
                    } catch (IOException e) {
                        e = e;
                        obj = null;
                        httpResponse = httpResponseA;
                        if (httpResponse == null) {
                            throw new C3459tw(e);
                        }
                        int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                        if (statusCode2 == 301 || statusCode2 == 302) {
                            HM.c("Request at %s has been redirected to %s", c3373sH.g(), c3373sH.i());
                        } else {
                            HM.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), c3373sH.i());
                        }
                        if (obj == null) {
                            throw new C2867j4(e, 1);
                        }
                        SystemClock.elapsedRealtime();
                        if (statusCode2 == 401 || statusCode2 == 403) {
                            c2867j42 = new C2867j4(0, (byte) 0);
                            str2 = "auth";
                        } else {
                            if (statusCode2 != 301 && statusCode2 != 302) {
                                throw new C2867j4(0);
                            }
                            c2867j42 = new C2867j4(2, (byte) 0);
                            str2 = "redirect";
                        }
                        b(str2, c3373sH, c2867j42);
                        z = true;
                        z2 = z;
                    }
                } catch (MalformedURLException e2) {
                    throw new RuntimeException("Bad URL " + c3373sH.i(), e2);
                }
            } catch (IOException e3) {
                e = e3;
                obj = null;
            }
            z2 = z;
        }
    }
}
