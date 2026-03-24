package com.google.android.recaptcha;

import defpackage.AbstractC0137Hf;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3264qG;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class RecaptchaAction {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");

    @NotNull
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");

    @NotNull
    private final String action;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, null);
        }

        public /* synthetic */ Companion(AbstractC0137Hf abstractC0137Hf) {
            this();
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    @NotNull
    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    @NotNull
    public final String component1() {
        return this.action;
    }

    @NotNull
    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && AbstractC0500aq.b(this.action, ((RecaptchaAction) obj).action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC3264qG.l(new StringBuilder("RecaptchaAction(action="), this.action, ")");
    }

    public /* synthetic */ RecaptchaAction(String str, AbstractC0137Hf abstractC0137Hf) {
        this(str);
    }
}
