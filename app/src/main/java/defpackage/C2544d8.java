package defpackage;

import java.util.Locale;

/* renamed from: d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2544d8 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final String c;

    public C2544d8(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Locale locale = Locale.ENGLISH;
                return this.c + "/" + this.b;
            default:
                return super.toString();
        }
    }

    public C2544d8(String str, int i) {
        this.b = i;
        this.c = str;
    }
}
