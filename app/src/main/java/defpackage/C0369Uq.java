package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: Uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0369Uq implements InterfaceC3049mL {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        ((InterfaceC3104nL) obj2).b(a.format((Date) obj));
    }
}
