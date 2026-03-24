package defpackage;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* loaded from: classes2.dex */
public final class Wv extends VoiceInteractionSession {
    public Bundle a;

    @Override // android.service.voice.VoiceInteractionSession
    public final void onCreate() {
        super.onCreate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    @Override // android.service.voice.VoiceInteractionSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleAssist(android.service.voice.VoiceInteractionSession.AssistState r6) {
        /*
            r5 = this;
            super.onHandleAssist(r6)
            android.os.Bundle r6 = r6.getAssistData()
            java.lang.String r0 = "command"
            if (r6 == 0) goto L10
            java.lang.String r6 = r6.getString(r0)
            goto L11
        L10:
            r6 = 0
        L11:
            if (r6 != 0) goto L1b
            android.os.Bundle r1 = r5.a
            if (r1 == 0) goto L1b
            java.lang.String r6 = r1.getString(r0)
        L1b:
            java.lang.String r0 = "airplane_mode_simul"
            if (r6 != 0) goto L20
            r6 = r0
        L20:
            int r1 = r6.hashCode()
            r2 = -1354941664(0xffffffffaf3d3b20, float:-1.7210455E-10)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L48
            r2 = -720054497(0xffffffffd514d71f, float:-1.0228229E13)
            if (r1 == r2) goto L40
            r0 = 926123534(0x3733860e, float:1.0700443E-5)
            if (r1 == r0) goto L36
            goto L52
        L36:
            java.lang.String r0 = "airplane_mode_on"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r3
            goto L53
        L40:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = 2
            goto L53
        L48:
            java.lang.String r0 = "airplane_mode_off"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r4
            goto L53
        L52:
            r6 = -1
        L53:
            java.lang.String r0 = "airplane_mode_enabled"
            java.lang.String r1 = "android.settings.VOICE_CONTROL_AIRPLANE_MODE"
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L72
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1)
            r6.putExtra(r0, r4)
            r5.startVoiceActivity(r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1)
            r6.putExtra(r0, r3)
            r5.startVoiceActivity(r6)
            goto L89
        L72:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1)
            r6.putExtra(r0, r3)
            r5.startVoiceActivity(r6)
            goto L89
        L7e:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1)
            r6.putExtra(r0, r4)
            r5.startVoiceActivity(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Wv.onHandleAssist(android.service.voice.VoiceInteractionSession$AssistState):void");
    }
}
