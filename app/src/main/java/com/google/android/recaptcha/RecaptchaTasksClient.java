package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public interface RecaptchaTasksClient {
    @NotNull
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    @NotNull
    Task<String> executeTask(RecaptchaAction recaptchaAction, long j);
}
