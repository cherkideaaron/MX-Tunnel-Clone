package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class I1 extends MO {
    public final ObjectAnimator w;
    public final boolean x;

    public I1(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super(7);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        J1 j1 = new J1();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        j1.b = numberOfFrames2;
        int[] iArr = j1.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            j1.a = new int[numberOfFrames2];
        }
        int[] iArr2 = j1.a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        j1.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(j1.c);
        objectAnimatorOfInt.setInterpolator(j1);
        this.x = z2;
        this.w = objectAnimatorOfInt;
    }

    @Override // defpackage.MO
    public final void F() {
        this.w.reverse();
    }

    @Override // defpackage.MO
    public final void M() {
        this.w.start();
    }

    @Override // defpackage.MO
    public final void N() {
        this.w.cancel();
    }

    @Override // defpackage.MO
    public final boolean e() {
        return this.x;
    }
}
