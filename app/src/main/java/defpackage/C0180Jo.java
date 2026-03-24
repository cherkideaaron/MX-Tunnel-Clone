package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: Jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180Jo implements InterfaceC0163Io {
    public final HttpResponse a(C3373sH c3373sH, Map map) throws IOException {
        InputStream errorStream;
        String strI = c3373sH.i();
        HashMap map2 = new HashMap();
        map2.putAll(C3373sH.f());
        map2.putAll(map);
        URL url = new URL(strI);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int i = c3373sH.p.b;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        "https".equals(url.getProtocol());
        for (String str : map2.keySet()) {
            httpURLConnection.addRequestProperty(str, (String) map2.get(str));
        }
        httpURLConnection.setRequestMethod("GET");
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicStatusLine basicStatusLine = new BasicStatusLine(protocolVersion, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        int statusCode = basicStatusLine.getStatusCode();
        if ((100 > statusCode || statusCode >= 200) && statusCode != 204 && statusCode != 304) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            basicHttpEntity.setContent(errorStream);
            basicHttpEntity.setContentLength(httpURLConnection.getContentLength());
            basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
            basicHttpEntity.setContentType(httpURLConnection.getContentType());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return basicHttpResponse;
    }
}
