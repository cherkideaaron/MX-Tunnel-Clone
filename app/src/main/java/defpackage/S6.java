package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class S6 extends Thread {
    public ServerSocket a;
    public Socket b;
    public boolean c;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket();
            this.a = serverSocket;
            serverSocket.setReuseAddress(true);
            this.a.bind(new InetSocketAddress(0));
            Log.i("[Back Server]", "Started on port " + this.a.getLocalPort());
            while (this.c) {
                try {
                    try {
                        this.b = this.a.accept();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
                        while (bufferedReader.readLine() != null) {
                            OutputStream outputStream = this.b.getOutputStream();
                            outputStream.write("HTTP/1.1 200 CONNECTED\r\n\r\n".getBytes());
                            outputStream.flush();
                            if (!this.b.isClosed()) {
                                this.b.close();
                            }
                        }
                    } catch (Exception unused) {
                        OutputStream outputStream2 = this.b.getOutputStream();
                        outputStream2.write("HTTP/1.1 200 CONNECTED\r\n\r\n".getBytes());
                        outputStream2.flush();
                        if (!this.b.isClosed()) {
                            this.b.close();
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (Exception e) {
            Log.i("[Back Server]", e.getMessage());
        }
        super.run();
    }
}
