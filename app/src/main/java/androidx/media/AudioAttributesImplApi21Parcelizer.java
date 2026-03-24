package androidx.media;

import android.media.AudioAttributes;
import defpackage.BL;
import defpackage.CL;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(BL bl) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bl.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bl.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, BL bl) {
        bl.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        bl.i(1);
        ((CL) bl).e.writeParcelable(audioAttributes, 0);
        bl.j(audioAttributesImplApi21.b, 2);
    }
}
