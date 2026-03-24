package defpackage;

import java.io.BufferedOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393Wg {
    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    public C0393Wg(String str, C2653f8 c2653f8) {
        this.b = str;
        this.a = c2653f8.a.length;
        this.c = c2653f8.b;
        this.d = c2653f8.c;
        this.e = c2653f8.d;
        this.f = c2653f8.e;
        this.g = c2653f8.f;
        this.h = c2653f8.g;
    }

    public static C0393Wg a(FilterInputStream filterInputStream) throws IOException {
        C0393Wg c0393Wg = new C0393Wg();
        if (C0427Yg.g(filterInputStream) != 538247942) {
            throw new IOException();
        }
        c0393Wg.b = C0427Yg.i(filterInputStream);
        String strI = C0427Yg.i(filterInputStream);
        c0393Wg.c = strI;
        if (strI.equals("")) {
            c0393Wg.c = null;
        }
        c0393Wg.d = C0427Yg.h(filterInputStream);
        c0393Wg.e = C0427Yg.h(filterInputStream);
        c0393Wg.f = C0427Yg.h(filterInputStream);
        c0393Wg.g = C0427Yg.h(filterInputStream);
        int iG = C0427Yg.g(filterInputStream);
        Map mapEmptyMap = iG == 0 ? Collections.emptyMap() : new HashMap(iG);
        for (int i = 0; i < iG; i++) {
            mapEmptyMap.put(C0427Yg.i(filterInputStream).intern(), C0427Yg.i(filterInputStream).intern());
        }
        c0393Wg.h = mapEmptyMap;
        return c0393Wg;
    }

    public final C2653f8 b(byte[] bArr) {
        C2653f8 c2653f8 = new C2653f8();
        c2653f8.a = bArr;
        c2653f8.b = this.c;
        c2653f8.c = this.d;
        c2653f8.d = this.e;
        c2653f8.e = this.f;
        c2653f8.f = this.g;
        c2653f8.g = this.h;
        return c2653f8;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) throws IOException {
        try {
            C0427Yg.l(bufferedOutputStream, 538247942);
            C0427Yg.n(bufferedOutputStream, this.b);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            C0427Yg.n(bufferedOutputStream, str);
            C0427Yg.m(bufferedOutputStream, this.d);
            C0427Yg.m(bufferedOutputStream, this.e);
            C0427Yg.m(bufferedOutputStream, this.f);
            C0427Yg.m(bufferedOutputStream, this.g);
            Map map = this.h;
            if (map != null) {
                C0427Yg.l(bufferedOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    C0427Yg.n(bufferedOutputStream, (String) entry.getKey());
                    C0427Yg.n(bufferedOutputStream, (String) entry.getValue());
                }
            } else {
                C0427Yg.l(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e) {
            HM.b("%s", e.toString());
            return false;
        }
    }
}
