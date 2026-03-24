package defpackage;

/* loaded from: classes2.dex */
public abstract class IG {
    public static final /* synthetic */ int a = 0;

    static {
        Object objN;
        Object objN2;
        Exception exc = new Exception();
        String simpleName = MO.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objN = AbstractC2543d7.class.getCanonicalName();
        } catch (Throwable th) {
            objN = AbstractC0115Ga.n(th);
        }
        if (IC.a(objN) != null) {
            objN = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objN2 = IG.class.getCanonicalName();
        } catch (Throwable th2) {
            objN2 = AbstractC0115Ga.n(th2);
        }
        if (IC.a(objN2) != null) {
            objN2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
