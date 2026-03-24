package defpackage;

import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0237Nd {
    public static final C0607co a;

    static {
        C0386Vq c0386Vq = new C0386Vq();
        C0108Fk.b.e(c0386Vq);
        c0386Vq.d = true;
        a = new C0607co(c0386Vq);
    }

    public static R5 a(JsonReader jsonReader) throws IOException {
        Q5 q5 = new Q5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    q5.d = jsonReader.nextLong();
                    q5.f = (byte) (q5.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    q5.b = strNextString;
                    break;
                case "pc":
                    q5.a = jsonReader.nextLong();
                    q5.f = (byte) (q5.f | 1);
                    break;
                case "file":
                    q5.c = jsonReader.nextString();
                    break;
                case "importance":
                    q5.e = jsonReader.nextInt();
                    q5.f = (byte) (q5.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return q5.a();
    }

    public static C3739z5 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new C3739z5(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }

    public static C3631x5 c(JsonReader jsonReader) throws IOException {
        C3577w5 c3577w5 = new C3577w5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c3577w5.i = d(jsonReader, new C0220Md(0));
                    break;
                case "pid":
                    c3577w5.a = jsonReader.nextInt();
                    c3577w5.j = (byte) (c3577w5.j | 1);
                    break;
                case "pss":
                    c3577w5.e = jsonReader.nextLong();
                    c3577w5.j = (byte) (c3577w5.j | 8);
                    break;
                case "rss":
                    c3577w5.f = jsonReader.nextLong();
                    c3577w5.j = (byte) (c3577w5.j | 16);
                    break;
                case "timestamp":
                    c3577w5.g = jsonReader.nextLong();
                    c3577w5.j = (byte) (c3577w5.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c3577w5.b = strNextString;
                    break;
                case "reasonCode":
                    c3577w5.c = jsonReader.nextInt();
                    c3577w5.j = (byte) (c3577w5.j | 2);
                    break;
                case "traceFile":
                    c3577w5.h = jsonReader.nextString();
                    break;
                case "importance":
                    c3577w5.d = jsonReader.nextInt();
                    c3577w5.j = (byte) (c3577w5.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c3577w5.a();
    }

    public static List d(JsonReader jsonReader, C0220Md c0220Md) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(c0220Md.e(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static J5 e(JsonReader jsonReader) throws IOException {
        I5 i5 = new I5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            char c = 65535;
            switch (strNextName.hashCode()) {
                case -1335157162:
                    if (strNextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (strNextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (strNextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (strNextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (strNextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (strNextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                U5 u5 = new U5();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "batteryLevel":
                            u5.a = Double.valueOf(jsonReader.nextDouble());
                            break;
                        case "batteryVelocity":
                            u5.b = jsonReader.nextInt();
                            u5.g = (byte) (u5.g | 1);
                            break;
                        case "orientation":
                            u5.d = jsonReader.nextInt();
                            u5.g = (byte) (u5.g | 4);
                            break;
                        case "diskUsed":
                            u5.f = jsonReader.nextLong();
                            u5.g = (byte) (u5.g | 16);
                            break;
                        case "ramUsed":
                            u5.e = jsonReader.nextLong();
                            u5.g = (byte) (u5.g | 8);
                            break;
                        case "proximityOn":
                            u5.c = jsonReader.nextBoolean();
                            u5.g = (byte) (u5.g | 2);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                i5.d = u5.a();
            } else if (c == 1) {
                jsonReader.beginObject();
                List listD = null;
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("assignments")) {
                        listD = d(jsonReader, new C0220Md(2));
                        if (listD == null) {
                            throw new NullPointerException("Null rolloutAssignments");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (listD == null) {
                    throw new IllegalStateException("Missing required properties: rolloutAssignments");
                }
                i5.f = new C0462a6(listD);
            } else if (c == 2) {
                jsonReader.beginObject();
                byte b = 0;
                int iNextInt = 0;
                L5 l5 = null;
                List listUnmodifiableList = null;
                List listUnmodifiableList2 = null;
                Boolean boolValueOf = null;
                T5 t5G = null;
                List listUnmodifiableList3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName4 = jsonReader.nextName();
                    strNextName4.getClass();
                    strNextName4.hashCode();
                    switch (strNextName4) {
                        case "appProcessDetails":
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(g(jsonReader));
                            }
                            jsonReader.endArray();
                            listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                            break;
                        case "background":
                            boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                            break;
                        case "execution":
                            jsonReader.beginObject();
                            List listD2 = null;
                            N5 n5F = null;
                            C3631x5 c3631x5C = null;
                            O5 o5 = null;
                            List listD3 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName5 = jsonReader.nextName();
                                strNextName5.getClass();
                                strNextName5.hashCode();
                                switch (strNextName5) {
                                    case "appExitInfo":
                                        c3631x5C = c(jsonReader);
                                        break;
                                    case "threads":
                                        listD2 = d(jsonReader, new C0220Md(3));
                                        break;
                                    case "signal":
                                        jsonReader.beginObject();
                                        long jNextLong = 0;
                                        byte b2 = 0;
                                        String strNextString = null;
                                        String strNextString2 = null;
                                        while (jsonReader.hasNext()) {
                                            String strNextName6 = jsonReader.nextName();
                                            strNextName6.getClass();
                                            strNextName6.hashCode();
                                            switch (strNextName6) {
                                                case "address":
                                                    jNextLong = jsonReader.nextLong();
                                                    b2 = (byte) (b2 | 1);
                                                    break;
                                                case "code":
                                                    strNextString2 = jsonReader.nextString();
                                                    if (strNextString2 == null) {
                                                        throw new NullPointerException("Null code");
                                                    }
                                                    break;
                                                case "name":
                                                    strNextString = jsonReader.nextString();
                                                    if (strNextString == null) {
                                                        throw new NullPointerException("Null name");
                                                    }
                                                    break;
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        if (b2 == 1 && strNextString != null && strNextString2 != null) {
                                            o5 = new O5(strNextString, strNextString2, jNextLong);
                                            break;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            if (strNextString == null) {
                                                sb.append(" name");
                                            }
                                            if (strNextString2 == null) {
                                                sb.append(" code");
                                            }
                                            if ((b2 & 1) == 0) {
                                                sb.append(" address");
                                            }
                                            throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
                                        }
                                        break;
                                    case "binaries":
                                        listD3 = d(jsonReader, new C0220Md(4));
                                        if (listD3 == null) {
                                            throw new NullPointerException("Null binaries");
                                        }
                                        break;
                                    case "exception":
                                        n5F = f(jsonReader);
                                        break;
                                    default:
                                        jsonReader.skipValue();
                                        break;
                                }
                            }
                            jsonReader.endObject();
                            if (o5 != null && listD3 != null) {
                                l5 = new L5(listD2, n5F, c3631x5C, o5, listD3);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (o5 == null) {
                                    sb2.append(" signal");
                                }
                                if (listD3 == null) {
                                    sb2.append(" binaries");
                                }
                                throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb2));
                            }
                        case "internalKeys":
                            ArrayList arrayList2 = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList2.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                            break;
                        case "customAttributes":
                            ArrayList arrayList3 = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList3.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                            break;
                        case "uiOrientation":
                            iNextInt = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        case "currentProcessDetails":
                            t5G = g(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b != 1 || l5 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    if (l5 == null) {
                        sb3.append(" execution");
                    }
                    if ((b & 1) == 0) {
                        sb3.append(" uiOrientation");
                    }
                    throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb3));
                }
                i5.c = new K5(l5, listUnmodifiableList, listUnmodifiableList2, boolValueOf, t5G, listUnmodifiableList3, iNextInt);
            } else if (c == 3) {
                jsonReader.beginObject();
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals("content")) {
                        strNextString3 = jsonReader.nextString();
                        if (strNextString3 == null) {
                            throw new NullPointerException("Null content");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString3 == null) {
                    throw new IllegalStateException("Missing required properties: content");
                }
                i5.e = new W5(strNextString3);
            } else if (c == 4) {
                String strNextString4 = jsonReader.nextString();
                if (strNextString4 == null) {
                    throw new NullPointerException("Null type");
                }
                i5.b = strNextString4;
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                i5.a = jsonReader.nextLong();
                i5.g = (byte) (i5.g | 1);
            }
        }
        jsonReader.endObject();
        return i5.a();
    }

    public static N5 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        N5 n5F = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new C0220Md(5));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                case "causedBy":
                    n5F = f(jsonReader);
                    break;
                case "overflowCount":
                    b = (byte) (b | 1);
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b == 1 && str != null && list != null) {
            return new N5(str, strNextString, list, n5F, iNextInt);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" type");
        }
        if (list == null) {
            sb.append(" frames");
        }
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }

    public static T5 g(JsonReader jsonReader) throws IOException {
        S5 s5 = new S5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    s5.b = jsonReader.nextInt();
                    s5.e = (byte) (s5.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    s5.a = strNextString;
                    break;
                case "defaultProcess":
                    s5.d = jsonReader.nextBoolean();
                    s5.e = (byte) (s5.e | 4);
                    break;
                case "importance":
                    s5.c = jsonReader.nextInt();
                    s5.e = (byte) (s5.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return s5.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C3469u5 h(android.util.JsonReader r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0237Nd.h(android.util.JsonReader):u5");
    }

    public static C3469u5 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C3469u5 c3469u5H = h(jsonReader);
                jsonReader.close();
                return c3469u5H;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
