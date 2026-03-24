package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class CE implements InterfaceC3478uE {
    public final ME a;

    public CE(ME me) {
        AbstractC0500aq.m(me, "sessionGenerator");
        this.a = me;
    }

    @Override // defpackage.InterfaceC3478uE
    public final Object getDefaultValue() {
        return new BE(this.a.a(null), null, null);
    }

    @Override // defpackage.InterfaceC3478uE
    public final Object readFrom(InputStream inputStream, InterfaceC3493uc interfaceC3493uc) throws C0389Wc {
        try {
            C0284Pq c0284Pq = C0284Pq.d;
            String strX = CH.X(MO.B(inputStream));
            c0284Pq.getClass();
            return (BE) c0284Pq.a(BE.Companion.serializer(), strX);
        } catch (Exception e) {
            throw new C0389Wc("Cannot parse session data", e);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public final Object writeTo(Object obj, OutputStream outputStream, InterfaceC3493uc interfaceC3493uc) throws IOException {
        byte[] bytes = C0284Pq.d.b(BE.Companion.serializer(), (BE) obj).getBytes(AbstractC3202p9.a);
        AbstractC0500aq.l(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return DK.a;
    }
}
