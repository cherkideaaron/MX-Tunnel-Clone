package defpackage;

import java.util.Iterator;

/* renamed from: m9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3037m9 implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public AbstractC3037m9(char c, char c2) {
        this.a = c;
        this.b = (char) MO.s(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3092n9(this.a, this.b, this.c);
    }
}
