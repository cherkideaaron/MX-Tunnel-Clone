package defpackage;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.LinkedHashSet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import rased.vpn.app.service.InjectorService;

/* renamed from: kD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2931kD extends SSLSocketFactory {
    public SSLContext a;
    public InjectorService b;

    public final void a(int i, String str, boolean z) {
        SSLSocketFactory socketFactory = this.a.getSocketFactory();
        InjectorService injectorService = this.b;
        injectorService.q = (SSLSocket) socketFactory.createSocket(injectorService.f, str, i, z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, injectorService.q.getEnabledProtocols());
        injectorService.q.setEnabledProtocols((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
        this.b.j("Enabled Protocols: " + TextUtils.join(", ", injectorService.q.getEnabledProtocols()));
        injectorService.q.addHandshakeCompletedListener(new C2823iD(this));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        a(i, str, true);
        return this.b.q;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        a(i, str, z);
        return this.b.q;
    }
}
