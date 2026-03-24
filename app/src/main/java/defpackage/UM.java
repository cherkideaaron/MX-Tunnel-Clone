package defpackage;

/* loaded from: classes.dex */
public final class UM extends X1 {
    @Override // defpackage.Y1
    public final boolean b() {
        if (!super.b() || !AbstractC3650xO.b("MULTI_PROCESS")) {
            return false;
        }
        int i = SM.a;
        if (VM.c.b()) {
            return WM.a.getStatics().isMultiProcessEnabled();
        }
        throw VM.a();
    }
}
