package org.spongycastle.util.io.pem;

import defpackage.AbstractC3264qG;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.spongycastle.util.encoders.Base64;

/* loaded from: classes2.dex */
public class PemReader extends BufferedReader {
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) throws IOException {
        String line;
        String strW = AbstractC3264qG.w(END, str);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (true) {
            line = readLine();
            if (line == null) {
                break;
            }
            if (line.indexOf(":") >= 0) {
                int iIndexOf = line.indexOf(58);
                arrayList.add(new PemHeader(line.substring(0, iIndexOf), line.substring(iIndexOf + 1).trim()));
            } else {
                if (line.indexOf(strW) != -1) {
                    break;
                }
                sb.append(line.trim());
            }
        }
        if (line != null) {
            return new PemObject(str, arrayList, Base64.decode(sb.toString()));
        }
        throw new IOException(AbstractC3264qG.g(strW, " not found"));
    }

    public PemObject readPemObject() throws IOException {
        String line;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.startsWith(BEGIN));
        if (line == null) {
            return null;
        }
        String strSubstring = line.substring(11);
        int iIndexOf = strSubstring.indexOf(45);
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        if (iIndexOf > 0) {
            return loadObject(strSubstring2);
        }
        return null;
    }
}
