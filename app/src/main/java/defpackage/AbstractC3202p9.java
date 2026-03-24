package defpackage;

import java.nio.charset.Charset;

/* renamed from: p9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3202p9 {
    public static final Charset a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0500aq.l(charsetForName, "forName(...)");
        a = charsetForName;
        AbstractC0500aq.l(Charset.forName("UTF-16"), "forName(...)");
        AbstractC0500aq.l(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC0500aq.l(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC0500aq.l(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC0500aq.l(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
