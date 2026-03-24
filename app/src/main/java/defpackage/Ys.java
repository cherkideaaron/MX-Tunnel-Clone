package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Ys implements Xs {
    public final LocaleList a;

    public Ys(Object obj) {
        this.a = N.g(obj);
    }

    @Override // defpackage.Xs
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.Xs
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((Xs) obj).b());
    }

    @Override // defpackage.Xs
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.Xs
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.Xs
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
