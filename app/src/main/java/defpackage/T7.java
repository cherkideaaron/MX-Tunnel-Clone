package defpackage;

/* loaded from: classes2.dex */
public abstract class T7 {
    public static final C2764h9 a = new C2764h9(-1, null, null, 0);
    public static final int b = MO.P("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = MO.P("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final C3337ri d = new C3337ri("BUFFERED", 3);
    public static final C3337ri e = new C3337ri("SHOULD_BUFFER", 3);
    public static final C3337ri f = new C3337ri("S_RESUMING_BY_RCV", 3);
    public static final C3337ri g = new C3337ri("RESUMING_BY_EB", 3);
    public static final C3337ri h = new C3337ri("POISONED", 3);
    public static final C3337ri i = new C3337ri("DONE_RCV", 3);
    public static final C3337ri j = new C3337ri("INTERRUPTED_SEND", 3);
    public static final C3337ri k = new C3337ri("INTERRUPTED_RCV", 3);
    public static final C3337ri l = new C3337ri("CHANNEL_CLOSED", 3);
    public static final C3337ri m = new C3337ri("SUSPEND", 3);
    public static final C3337ri n = new C3337ri("SUSPEND_NO_WAITER", 3);
    public static final C3337ri o = new C3337ri("FAILED", 3);
    public static final C3337ri p = new C3337ri("NO_RECEIVE_RESULT", 3);
    public static final C3337ri q = new C3337ri("CLOSE_HANDLER_CLOSED", 3);
    public static final C3337ri r = new C3337ri("CLOSE_HANDLER_INVOKED", 3);
    public static final C3337ri s = new C3337ri("NO_CLOSE_CAUSE", 3);

    public static final boolean a(InterfaceC3742z8 interfaceC3742z8, Object obj, InterfaceC3504un interfaceC3504un) {
        C3337ri c3337riC = interfaceC3742z8.c(obj, interfaceC3504un);
        if (c3337riC == null) {
            return false;
        }
        interfaceC3742z8.i(c3337riC);
        return true;
    }
}
