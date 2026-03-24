package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: vA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3528vA extends Thread {
    public final String a;
    public final String b;
    public final boolean c;
    public final Socket d;
    public final Socket e;

    public C3528vA(Socket socket, Socket socket2, boolean z, String str, String str2) {
        this.d = socket;
        this.e = socket2;
        this.c = z;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        Socket socket = this.e;
        Socket socket2 = this.d;
        boolean z = this.c;
        byte[] bArr = new byte[Integer.parseInt(z ? this.a : this.b)];
        try {
            InputStream inputStream = socket2.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return;
                }
                try {
                    try {
                        String str = new String(bArr, 0, i);
                        if (z) {
                            outputStream.write(bArr, 0, i);
                            outputStream.flush();
                        } else {
                            String[] strArrSplit = str.split("\r\n");
                            if (strArrSplit[0].startsWith("HTTP/")) {
                                String str2 = strArrSplit[0];
                                int i2 = Integer.parseInt(str2.substring(9, 12));
                                String strSubstring = str2.substring(13);
                                String str3 = "<b>Status: " + String.valueOf(i2) + " (" + strSubstring + ")</b>";
                                OpenVPNService openVPNService = AbstractC0136He.v;
                                if (openVPNService != null) {
                                    openVPNService.l(str3);
                                }
                                if (i2 == 200) {
                                    OpenVPNService openVPNService2 = AbstractC0136He.v;
                                    if (openVPNService2 != null) {
                                        openVPNService2.l("Successful - The action requested by the client was successful.");
                                    }
                                    outputStream.write(bArr, 0, i);
                                    outputStream.flush();
                                } else {
                                    outputStream.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
                                    outputStream.flush();
                                }
                            } else {
                                outputStream.write(bArr, 0, i);
                                outputStream.flush();
                            }
                        }
                    } catch (Exception unused) {
                        socket2.close();
                        socket.close();
                        return;
                    } catch (Throwable unused2) {
                        socket2.close();
                        socket.close();
                    }
                } catch (IOException unused3) {
                }
            }
        } catch (IOException | Exception unused4) {
        }
    }
}
