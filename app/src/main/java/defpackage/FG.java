package defpackage;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class FG {
    public final BG a;
    public Interpolator b;
    public long c = 2000;
    public int d = 0;
    public final HashMap e = new HashMap();

    public FG(BG bg) {
        this.a = bg;
    }

    public final ObjectAnimator a() {
        HashMap map = this.e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[map.size()];
        Iterator it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            DG dg = (DG) ((Map.Entry) it.next()).getValue();
            float[] fArr = dg.a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i2 = this.d;
            float f = fArr[i2];
            while (true) {
                int i3 = this.d;
                Object[] objArr = dg.c;
                if (i2 < objArr.length + i3) {
                    int i4 = i2 - i3;
                    int length = i2 % objArr.length;
                    float f2 = fArr[length] - f;
                    if (f2 < 0.0f) {
                        f2 += fArr[fArr.length - 1];
                    }
                    if (dg instanceof EG) {
                        keyframeArr[i4] = Keyframe.ofInt(f2, ((Integer) objArr[length]).intValue());
                    } else if (dg instanceof CG) {
                        keyframeArr[i4] = Keyframe.ofFloat(f2, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i4] = Keyframe.ofObject(f2, objArr[length]);
                    }
                    i2++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(dg.b, keyframeArr);
            i++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.c);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.b);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        InterpolatorC3183or interpolatorC3183or = new InterpolatorC3183or(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        interpolatorC3183or.b = fArr;
        this.b = interpolatorC3183or;
    }

    public final void c(float[] fArr, AbstractC2957kl abstractC2957kl, Float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.e.put(abstractC2957kl.getName(), new CG(fArr, abstractC2957kl, fArr2));
    }

    public final void d(float[] fArr, AbstractC2957kl abstractC2957kl, Integer[] numArr) {
        int length = fArr.length;
        int length2 = numArr.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.e.put(abstractC2957kl.getName(), new EG(fArr, abstractC2957kl, numArr));
    }
}
