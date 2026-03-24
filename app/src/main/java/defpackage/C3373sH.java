package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* renamed from: sH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3373sH implements Comparable {
    public static long s;
    public final GM a;
    public final String b;
    public String c;
    public final int d;
    public CC e;
    public Integer f;
    public C3314rC m;
    public final boolean n;
    public boolean o;
    public final LA p;
    public C2653f8 q;
    public DC r;

    public C3373sH(String str, DC dc, CC cc) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Uri uri;
        String host;
        String strB = b(b(str));
        this.a = GM.c ? new GM() : null;
        this.n = true;
        int iHashCode = 0;
        this.o = false;
        this.q = null;
        this.b = strB;
        StringBuilder sbO = AbstractC3264qG.o("Request:0:", strB, ":");
        sbO.append(System.currentTimeMillis());
        sbO.append(":");
        long j = s;
        s = 1 + j;
        sbO.append(j);
        String string = sbO.toString();
        char[] cArr = AbstractC0419Xp.a;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = string.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            AbstractC0419Xp.a(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        this.e = cc;
        this.p = new LA();
        if (!TextUtils.isEmpty(strB) && (uri = Uri.parse(strB)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.d = iHashCode;
        this.r = dc;
    }

    public static String b(String str) {
        if (!str.startsWith("http://")) {
            return !str.startsWith("https://") ? "https://".concat(str) : str;
        }
        return "https://" + str.substring(7);
    }

    public static Map f() {
        return Collections.emptyMap();
    }

    public static C0312Rk j(C3078mw c3078mw) throws NumberFormatException {
        String str;
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        C2653f8 c2653f8;
        long j5;
        Map map = c3078mw.b;
        byte[] bArr = c3078mw.a;
        try {
            str = new String(bArr, AbstractC0146Ho.a(map));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = (String) map.get("Date");
        long jB = str2 != null ? AbstractC0146Ho.b(str2) : 0L;
        String str3 = (String) map.get("Cache-Control");
        int i = 0;
        if (str3 != null) {
            String[] strArrSplit = str3.split(",");
            z = false;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    c2653f8 = null;
                    break;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused2) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str4 = (String) map.get("Expires");
        long jB2 = str4 != null ? AbstractC0146Ho.b(str4) : 0L;
        String str5 = (String) map.get("Last-Modified");
        long jB3 = str5 != null ? AbstractC0146Ho.b(str5) : 0L;
        String str6 = (String) map.get("ETag");
        if (i != 0) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (z) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (jB <= 0 || jB2 < jB) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jB2 - jB);
                j3 = j4;
            }
        }
        C2653f8 c2653f82 = new C2653f8();
        c2653f82.a = bArr;
        c2653f82.b = str6;
        c2653f82.f = j4;
        c2653f82.e = j3;
        c2653f82.c = jB;
        c2653f82.d = jB3;
        c2653f82.g = map;
        c2653f8 = c2653f82;
        return new C0312Rk(str, c2653f8);
    }

    public final void a(String str) {
        if (GM.c) {
            this.a.a(Thread.currentThread().getId(), str);
        }
    }

    public final void c(String str) {
        C3314rC c3314rC = this.m;
        if (c3314rC != null) {
            synchronized (c3314rC.c) {
                c3314rC.c.remove(this);
            }
            synchronized (c3314rC.k) {
                Iterator it = c3314rC.k.iterator();
                if (it.hasNext()) {
                    Vs.u(it.next());
                    throw null;
                }
            }
            if (this.n) {
                synchronized (c3314rC.b) {
                    try {
                        String strE = e();
                        Queue queue = (Queue) c3314rC.b.remove(strE);
                        if (queue != null) {
                            if (HM.a) {
                                HM.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), strE);
                            }
                            c3314rC.d.addAll(queue);
                        }
                    } finally {
                    }
                }
            }
            this.e = null;
            this.r = null;
        }
        if (GM.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3095nC(this, str, id));
            } else {
                this.a.a(id, str);
                this.a.b(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3373sH c3373sH = (C3373sH) obj;
        c3373sH.getClass();
        return this.f.intValue() - c3373sH.f.intValue();
    }

    public final C2653f8 d() {
        return this.q;
    }

    public final String e() {
        return "0:" + this.b;
    }

    public final String g() {
        return this.b;
    }

    public final LA h() {
        return this.p;
    }

    public final String i() {
        String str = this.c;
        return str != null ? str : this.b;
    }

    public final void k(String str) {
        this.c = str;
    }

    public final String toString() {
        return "[ ] " + i() + " " + ("0x" + Integer.toHexString(this.d)) + " " + Vs.D(2) + " " + this.f;
    }
}
