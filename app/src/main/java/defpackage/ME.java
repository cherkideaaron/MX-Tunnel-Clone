package defpackage;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class ME {
    public final YI a;
    public final C2884jL b;

    public ME(YI yi, C2884jL c2884jL) {
        AbstractC0500aq.m(yi, "timeProvider");
        AbstractC0500aq.m(c2884jL, "uuidGenerator");
        this.a = yi;
        this.b = c2884jL;
    }

    public final FE a(FE fe) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC0500aq.l(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        AbstractC0500aq.l(string, "toString(...)");
        String lowerCase = CH.Z(string, "-", "").toLowerCase(Locale.ROOT);
        AbstractC0500aq.l(lowerCase, "toLowerCase(...)");
        return new FE(this.a.a().b, lowerCase, (fe == null || (str = fe.b) == null) ? lowerCase : str, fe != null ? fe.c + 1 : 0);
    }
}
