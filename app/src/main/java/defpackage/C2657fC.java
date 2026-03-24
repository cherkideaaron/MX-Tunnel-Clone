package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: fC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2657fC extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C2712gC b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ InterfaceC3396sn d;
    public final /* synthetic */ InterfaceC3396sn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2657fC(C2712gC c2712gC, Map map, InterfaceC3396sn interfaceC3396sn, InterfaceC3396sn interfaceC3396sn2, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c2712gC;
        this.c = map;
        this.d = interfaceC3396sn;
        this.e = interfaceC3396sn2;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C2657fC(this.b, this.c, this.d, this.e, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2657fC) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        InterfaceC3396sn interfaceC3396sn = this.e;
        try {
            if (i == 0) {
                AbstractC0115Ga.U(obj);
                URLConnection uRLConnectionOpenConnection = C2712gC.a(this.b).openConnection();
                AbstractC0500aq.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.c.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    InterfaceC3396sn interfaceC3396sn2 = this.d;
                    this.a = 1;
                    if (interfaceC3396sn2.invoke(jSONObject, this) == enumC0321Sc) {
                        return enumC0321Sc;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.a = 2;
                    if (interfaceC3396sn.invoke(str, this) == enumC0321Sc) {
                        return enumC0321Sc;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.a = 3;
            if (interfaceC3396sn.invoke(message, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return DK.a;
    }
}
