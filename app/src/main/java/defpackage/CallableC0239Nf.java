package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0239Nf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0256Of b;

    public /* synthetic */ CallableC0239Nf(C0256Of c0256Of, int i) {
        this.a = i;
        this.b = c0256Of;
    }

    private final Object a() {
        String string;
        C0256Of c0256Of = this.b;
        synchronized (c0256Of) {
            try {
                C3667xo c3667xo = (C3667xo) c0256Of.a.get();
                ArrayList arrayListC = c3667xo.c();
                c3667xo.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    C3034m6 c3034m6 = (C3034m6) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c3034m6.a);
                    jSONObject.put("dates", new JSONArray((Collection) c3034m6.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                C0256Of c0256Of = this.b;
                synchronized (c0256Of) {
                    ((C3667xo) c0256Of.a.get()).k(System.currentTimeMillis(), ((C3007lg) c0256Of.c.get()).a());
                }
                return null;
        }
    }
}
