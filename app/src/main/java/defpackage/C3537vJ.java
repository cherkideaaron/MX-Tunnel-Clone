package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* renamed from: vJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3537vJ {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public C3537vJ(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC3264qG.x("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = AbstractC3264qG.h(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3537vJ)) {
            return false;
        }
        C3537vJ c3537vJ = (C3537vJ) obj;
        return this.a.equals(c3537vJ.a) && this.b.equals(c3537vJ.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }
}
