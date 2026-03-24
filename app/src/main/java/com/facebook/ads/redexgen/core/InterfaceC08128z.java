package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC08128z {
    void A59(C2461qI c2461qI, int i, int[] iArr) throws C08078s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C2440px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i) throws C08118y, C08088t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C08118y;

    void AJG(C2467qQ c2467qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC08098v interfaceC08098v);

    void AJd(C2440px c2440px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C2461qI c2461qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
