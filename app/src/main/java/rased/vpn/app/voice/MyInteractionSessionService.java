package rased.vpn.app.voice;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import defpackage.Wv;

/* loaded from: classes2.dex */
public class MyInteractionSessionService extends VoiceInteractionSessionService {
    @Override // android.service.voice.VoiceInteractionSessionService
    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        Wv wv = new Wv(this);
        wv.a = bundle;
        return wv;
    }
}
