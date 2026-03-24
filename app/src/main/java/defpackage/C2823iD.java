package defpackage;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

/* renamed from: iD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2823iD implements HandshakeCompletedListener {
    public final /* synthetic */ C2931kD a;

    public C2823iD(C2931kD c2931kD) {
        this.a = c2931kD;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        String strX = AbstractC3264qG.x("<b>Cipher Suite: ", handshakeCompletedEvent.getSession().getCipherSuite(), "</b>");
        C2931kD c2931kD = this.a;
        c2931kD.b.j(strX);
        c2931kD.b.j("HandshakeCompleted!");
    }
}
