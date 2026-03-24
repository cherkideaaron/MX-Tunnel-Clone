package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;

/* renamed from: Co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061Co extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ HiddenActivity b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061Co(HiddenActivity hiddenActivity, int i, int i2) {
        super(1);
        this.a = i2;
        this.b = hiddenActivity;
        this.c = i;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) throws IntentSender.SendIntentException {
        switch (this.a) {
            case 0:
                HiddenActivity hiddenActivity = this.b;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.b = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e) {
                    ResultReceiver resultReceiver = hiddenActivity.a;
                    AbstractC0500aq.j(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.b;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.b = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.a;
                    AbstractC0500aq.j(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e2.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                AbstractC0500aq.m(pendingIntent, "result");
                try {
                    hiddenActivity3.b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e3) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.a;
                    AbstractC0500aq.j(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e3.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e4) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.a;
                    AbstractC0500aq.j(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e4.getMessage());
                }
                break;
        }
        return DK.a;
    }
}
