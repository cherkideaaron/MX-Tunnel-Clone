package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class RB implements Serializable {
    public final Pattern a;

    public RB(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0500aq.l(patternCompile, "compile(...)");
        this.a = patternCompile;
    }

    public final String toString() {
        String string = this.a.toString();
        AbstractC0500aq.l(string, "toString(...)");
        return string;
    }
}
