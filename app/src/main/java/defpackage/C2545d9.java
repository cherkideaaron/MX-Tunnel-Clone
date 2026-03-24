package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import rased.vpn.app.tethering.ProxyService;

/* renamed from: d9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2545d9 {
    public X8 a;
    public X8 b;

    public static SocketChannel b(int i, String str) throws InterruptedException, IOException {
        Log.d("ChannelPair", "connect " + str + ":" + i);
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            socketChannelOpen.configureBlocking(false);
            if (socketChannelOpen.connect(new InetSocketAddress(InetAddress.getByName(str), i))) {
                Log.e("ChannelPair", "connect channel failed");
                return null;
            }
            for (int i2 = 0; i2 < 200; i2++) {
                Thread.sleep(50L);
                if (socketChannelOpen.finishConnect()) {
                    return socketChannelOpen;
                }
            }
            Log.w("ChannelPair", "abort connection for timeout");
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Log.d("ChannelPair", "close pair socket " + this);
        X8 x8 = this.a;
        if (x8 != null) {
            x8.a();
        }
        X8 x82 = this.b;
        if (x82 != null) {
            x82.a();
        }
    }

    public final void c(SelectionKey selectionKey) {
        if (!selectionKey.isValid()) {
            Log.d("ChannelPair", "close invalid socket.");
            a();
            return;
        }
        if (!selectionKey.isAcceptable()) {
            X8 x8 = this.a;
            if (x8 != null && selectionKey.equals(x8.b)) {
                this.a.d();
                return;
            }
            X8 x82 = this.b;
            if (x82 == null || !selectionKey.equals(x82.b)) {
                return;
            }
            this.b.d();
            this.a.f();
            return;
        }
        try {
            if (selectionKey.isAcceptable()) {
                SocketChannel socketChannelAccept = ((ServerSocketChannel) selectionKey.channel()).accept();
                Log.d("ChannelPair", "connRequest " + socketChannelAccept.socket().getInetAddress());
                X8 x83 = new X8(true);
                this.a = x83;
                x83.m = this;
                x83.a = socketChannelAccept;
                socketChannelAccept.configureBlocking(false);
                this.a.b = socketChannelAccept.register(ProxyService.m.e, 1, this);
            } else {
                Log.w("ChannelPair", "invalid accept key");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d(X8 x8) {
        ByteBuffer byteBuffer;
        X8 x82;
        boolean z = x8.i;
        if (z && this.b != null) {
            if (x8.c == null) {
                x8.c = ByteBuffer.allocate(8192);
            }
            byteBuffer = x8.c;
            x82 = this.b;
        } else {
            if (z || this.a == null) {
                return;
            }
            if (x8.c == null) {
                x8.c = ByteBuffer.allocate(8192);
            }
            byteBuffer = x8.c;
            x82 = this.a;
        }
        x82.g(byteBuffer);
    }
}
