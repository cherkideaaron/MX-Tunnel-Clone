package defpackage;

import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.MediaCodec;
import java.util.Comparator;
import java.util.PriorityQueue;

/* renamed from: zQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3760zQ {
    public static /* bridge */ /* synthetic */ AudioRouting$OnRoutingChangedListener d(Object obj) {
        return (AudioRouting$OnRoutingChangedListener) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* synthetic */ PriorityQueue l(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void o() {
    }
}
