package com.google.android.recaptcha;

import defpackage.AbstractC0137Hf;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class RecaptchaException extends Exception {

    @NotNull
    private final RecaptchaErrorCode errorCode;

    @NotNull
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    @NotNull
    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i, AbstractC0137Hf abstractC0137Hf) {
        this(recaptchaErrorCode, (i & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}
