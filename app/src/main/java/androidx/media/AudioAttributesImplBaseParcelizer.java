package androidx.media;

import defpackage.BL;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(BL bl) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bl.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bl.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bl.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bl.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, BL bl) {
        bl.getClass();
        bl.j(audioAttributesImplBase.a, 1);
        bl.j(audioAttributesImplBase.b, 2);
        bl.j(audioAttributesImplBase.c, 3);
        bl.j(audioAttributesImplBase.d, 4);
    }
}
