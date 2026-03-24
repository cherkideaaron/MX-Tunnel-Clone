package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import defpackage.AbstractC0500aq;
import defpackage.C0061Co;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Api.BaseClientBuilder.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
        this.b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        if (stringExtra != null) {
            Task<BeginSignInResult> taskAddOnFailureListener = null;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (beginSignInRequest != null) {
                            Task<BeginSignInResult> taskBeginSignIn = Identity.getSignInClient((Activity) this).beginSignIn(beginSignInRequest);
                            final C0061Co c0061Co = new C0061Co(this, intExtra, 0);
                            final int i = 3;
                            Task<BeginSignInResult> taskAddOnSuccessListener = taskBeginSignIn.addOnSuccessListener(new OnSuccessListener(c0061Co, i) { // from class: Ao
                                public final /* synthetic */ int a;
                                public final /* synthetic */ InterfaceC2631en b;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.a = i;
                                    this.b = (InterfaceC2631en) c0061Co;
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    InterfaceC2631en interfaceC2631en = this.b;
                                    switch (this.a) {
                                        case 0:
                                            int i2 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 1:
                                            int i3 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 2:
                                            int i4 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        default:
                                            int i5 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                    }
                                }
                            });
                            final int i2 = 3;
                            taskAddOnFailureListener = taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener(this) { // from class: Bo
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i2) {
                                        case 0:
                                            int i3 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i4 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (publicKeyCredentialCreationOptions != null) {
                            Task<PendingIntent> registerPendingIntent = Fido.getFido2ApiClient((Activity) this).getRegisterPendingIntent(publicKeyCredentialCreationOptions);
                            final C0061Co c0061Co2 = new C0061Co(this, intExtra2, 2);
                            final int i3 = 0;
                            Task<PendingIntent> taskAddOnSuccessListener2 = registerPendingIntent.addOnSuccessListener(new OnSuccessListener(c0061Co2, i3) { // from class: Ao
                                public final /* synthetic */ int a;
                                public final /* synthetic */ InterfaceC2631en b;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.a = i3;
                                    this.b = (InterfaceC2631en) c0061Co2;
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    InterfaceC2631en interfaceC2631en = this.b;
                                    switch (this.a) {
                                        case 0:
                                            int i22 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 1:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 2:
                                            int i4 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        default:
                                            int i5 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                    }
                                }
                            });
                            final int i4 = 0;
                            taskAddOnFailureListener = taskAddOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) { // from class: Bo
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i4) {
                                        case 0:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i42 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (savePasswordRequest != null) {
                            Task<SavePasswordResult> taskSavePassword = Identity.getCredentialSavingClient((Activity) this).savePassword(savePasswordRequest);
                            final int i5 = 1;
                            final C0061Co c0061Co3 = new C0061Co(this, intExtra3, 1);
                            Task<SavePasswordResult> taskAddOnSuccessListener3 = taskSavePassword.addOnSuccessListener(new OnSuccessListener(c0061Co3, i5) { // from class: Ao
                                public final /* synthetic */ int a;
                                public final /* synthetic */ InterfaceC2631en b;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.a = i5;
                                    this.b = (InterfaceC2631en) c0061Co3;
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    InterfaceC2631en interfaceC2631en = this.b;
                                    switch (this.a) {
                                        case 0:
                                            int i22 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 1:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 2:
                                            int i42 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        default:
                                            int i52 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                    }
                                }
                            });
                            final int i6 = 1;
                            taskAddOnFailureListener = taskAddOnSuccessListener3.addOnFailureListener(new OnFailureListener(this) { // from class: Bo
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i6) {
                                        case 0:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i42 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i52 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i62 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (getSignInIntentRequest != null) {
                            Task<PendingIntent> signInIntent = Identity.getSignInClient((Activity) this).getSignInIntent(getSignInIntentRequest);
                            final C0061Co c0061Co4 = new C0061Co(this, intExtra4, 3);
                            final int i7 = 2;
                            Task<PendingIntent> taskAddOnSuccessListener4 = signInIntent.addOnSuccessListener(new OnSuccessListener(c0061Co4, i7) { // from class: Ao
                                public final /* synthetic */ int a;
                                public final /* synthetic */ InterfaceC2631en b;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.a = i7;
                                    this.b = (InterfaceC2631en) c0061Co4;
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    InterfaceC2631en interfaceC2631en = this.b;
                                    switch (this.a) {
                                        case 0:
                                            int i22 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 1:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        case 2:
                                            int i42 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                        default:
                                            int i52 = HiddenActivity.c;
                                            AbstractC0500aq.m(interfaceC2631en, "$tmp0");
                                            interfaceC2631en.invoke(obj);
                                            break;
                                    }
                                }
                            });
                            final int i8 = 2;
                            taskAddOnFailureListener = taskAddOnSuccessListener4.addOnFailureListener(new OnFailureListener(this) { // from class: Bo
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i8) {
                                        case 0:
                                            int i32 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i42 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver3);
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i52 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver4);
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i62 = HiddenActivity.c;
                                            AbstractC0500aq.m(hiddenActivity, "this$0");
                                            AbstractC0500aq.m(exc, "e");
                                            if ((exc instanceof ApiException) && AbstractC0441Zd.a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            AbstractC0500aq.j(resultReceiver5);
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC0500aq.m(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
