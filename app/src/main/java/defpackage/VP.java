package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public abstract class VP {
    public abstract void b(boolean z);

    public abstract void c();

    public Task d(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z;
        VO vo = new VO();
        vo.a = this;
        H2 h2F = firebaseAuth.f();
        if (h2F != null) {
            synchronized (h2F.a) {
                try {
                    zzahs zzahsVar = (zzahs) h2F.c;
                    z = zzahsVar != null && zzahsVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                return h2F.u(str, Boolean.FALSE, recaptchaAction).continueWithTask(vo).continueWithTask(new C3532vE(str, h2F, recaptchaAction, vo));
            }
        }
        Task taskE = e(null);
        KJ kj = new KJ();
        kj.a = recaptchaAction;
        kj.b = firebaseAuth;
        kj.c = str;
        kj.d = vo;
        return taskE.continueWithTask(kj);
    }

    public abstract Task e(String str);

    public void a(boolean z) {
    }
}
