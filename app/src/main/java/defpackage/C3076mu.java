package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: mu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3076mu extends AbstractC3131nu {
    public final AbstractC3241pu a;

    public C3076mu(AbstractC3241pu abstractC3241pu) {
        this.a = abstractC3241pu;
    }

    @Override // defpackage.AbstractC3131nu
    @NotNull
    public As b() {
        return AbstractC3296qu.g(AbstractC0136He.c(AbstractC0136He.a(AbstractC0600ch.a), new C2911ju(this, null)));
    }

    @Override // defpackage.AbstractC3131nu
    @NotNull
    public As c(@NotNull Uri uri, @Nullable InputEvent inputEvent) {
        AbstractC0500aq.m(uri, "attributionSource");
        return AbstractC3296qu.g(AbstractC0136He.c(AbstractC0136He.a(AbstractC0600ch.a), new C2966ku(this, uri, inputEvent, null)));
    }

    @Override // defpackage.AbstractC3131nu
    @NotNull
    public As d(@NotNull Uri uri) {
        AbstractC0500aq.m(uri, "trigger");
        return AbstractC3296qu.g(AbstractC0136He.c(AbstractC0136He.a(AbstractC0600ch.a), new C3021lu(this, uri, null)));
    }

    @NotNull
    public As e(@NotNull AbstractC3767zg abstractC3767zg) {
        AbstractC0500aq.m(abstractC3767zg, "deletionRequest");
        throw null;
    }

    @NotNull
    public As f(@NotNull AbstractC3372sG abstractC3372sG) {
        AbstractC0500aq.m(abstractC3372sG, "request");
        throw null;
    }

    @NotNull
    public As g(@NotNull PM pm) {
        AbstractC0500aq.m(pm, "request");
        throw null;
    }

    @NotNull
    public As h(@NotNull QM qm) {
        AbstractC0500aq.m(qm, "request");
        throw null;
    }
}
