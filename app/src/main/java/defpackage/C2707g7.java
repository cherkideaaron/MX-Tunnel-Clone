package defpackage;

/* renamed from: g7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2707g7 extends C2762h7 {
    public C2707g7(C2597e7 c2597e7, Character ch) {
        super(c2597e7, ch);
        if (c2597e7.b.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    public final C2762h7 a(C2597e7 c2597e7) {
        return new C2707g7(c2597e7, (Character) null);
    }

    public C2707g7(String str, String str2) {
        this(new C2597e7(str, str2.toCharArray()), (Character) '=');
    }
}
