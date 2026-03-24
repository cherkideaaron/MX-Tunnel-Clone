package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Jk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0176Jk {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final InterfaceC3258qA b;
    public final C3260qC c = new C3260qC();

    public C0176Jk(Context context, InterfaceC3258qA interfaceC3258qA) {
        this.a = context;
        this.b = interfaceC3258qA;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            throw new C0244Nk(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", Vs.m("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : AbstractC3264qG.w(", ", str)));
    }

    public static long d(String str) {
        Preconditions.checkArgument(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C3144o6 e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        I6 i6 = null;
        long jD = 0;
        String strNextString4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        jD = d(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
                i6 = new I6(strNextString, jD, 0);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C3144o6(strNextString4, strNextString2, strNextString3, i6, 1);
    }

    public static I6 f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        long jD = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jD = d(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new I6(strNextString, jD, 1);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: NameNotFoundException -> 0x00a7, TryCatch #0 {NameNotFoundException -> 0x00a7, blocks: (B:23:0x0089, B:25:0x0093, B:28:0x00a9), top: B:36:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: NameNotFoundException -> 0x00a7, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x00a7, blocks: (B:23:0x0089, B:25:0x0093, B:28:0x00a9), top: B:36:0x0089 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c(java.net.URL r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get heartbeats header"
            java.net.URLConnection r10 = r10.openConnection()     // Catch: java.io.IOException -> Lce
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch: java.io.IOException -> Lce
            r1 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r1)
            r2 = 0
            r10.setUseCaches(r2)
            r10.setReadTimeout(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/json"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Accept"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            r10.addRequestProperty(r1, r3)
            android.content.Context r1 = r9.a
            java.lang.String r3 = r1.getPackageName()
            java.lang.String r4 = "X-Android-Package"
            r10.addRequestProperty(r4, r3)
            qA r3 = r9.b
            java.lang.Object r3 = r3.get()
            to r3 = (defpackage.InterfaceC3451to) r3
            java.lang.String r4 = "ContentValues"
            if (r3 == 0) goto L86
            java.lang.String r5 = "x-firebase-client"
            Of r3 = (defpackage.C0256Of) r3     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            r7 = 24
            r8 = 1
            if (r6 < r7) goto L57
            android.content.Context r6 = r3.b     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            boolean r6 = defpackage.AbstractC3600wb.g(r6)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            goto L58
        L57:
            r6 = r8
        L58:
            r6 = r6 ^ r8
            if (r6 == 0) goto L62
            java.lang.String r3 = ""
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            goto L6e
        L62:
            Nf r6 = new Nf     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            r7 = 0
            r6.<init>(r3, r7)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            java.util.concurrent.Executor r3 = r3.e     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.call(r3, r6)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
        L6e:
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            r10.addRequestProperty(r5, r3)     // Catch: java.lang.InterruptedException -> L78 java.util.concurrent.ExecutionException -> L7a
            goto L86
        L78:
            r3 = move-exception
            goto L7c
        L7a:
            r3 = move-exception
            goto L83
        L7c:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L83:
            android.util.Log.w(r4, r0, r3)
        L86:
            java.lang.String r0 = "Could not get fingerprint hash for package: "
            r3 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            if (r5 != 0) goto La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            r2.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            java.lang.String r0 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            r2.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            java.lang.String r0 = r2.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            android.util.Log.e(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            goto Lc3
        La7:
            r0 = move-exception
            goto Lae
        La9:
            java.lang.String r3 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            goto Lc3
        Lae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r2.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r4, r1, r0)
        Lc3:
            java.lang.String r0 = "X-Android-Cert"
            r10.addRequestProperty(r0, r3)
            java.lang.String r0 = "x-goog-api-key"
            r10.addRequestProperty(r0, r11)
            return r10
        Lce:
            Nk r10 = new Nk
            java.lang.String r11 = "Firebase Installations Service is unavailable. Please try again later."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0176Jk.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
