package androidx.media;

import defpackage.BL;
import defpackage.DL;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(BL bl) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        DL dlH = audioAttributesCompat.a;
        if (bl.e(1)) {
            dlH = bl.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) dlH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, BL bl) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bl.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        bl.i(1);
        bl.k(audioAttributesImpl);
    }
}
