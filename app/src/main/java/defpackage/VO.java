package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class VO implements UO, Continuation {
    public Object a;

    public VO(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.WO
    public Object a() {
        return this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String str;
        boolean zIsSuccessful = task.isSuccessful();
        VP vp = (VP) this.a;
        if (zIsSuccessful) {
            str = (String) task.getResult();
        } else {
            Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
            str = "NO_RECAPTCHA";
        }
        return vp.e(str);
    }
}
