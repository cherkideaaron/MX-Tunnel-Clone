package defpackage;

/* loaded from: classes2.dex */
public final class QB {
    public static String a(InterfaceC0060Cn interfaceC0060Cn) {
        String string = interfaceC0060Cn.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
