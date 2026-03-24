package cn.pedant.SweetAlert;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.animation.Animation;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class OptAnimationLoader {
    private static Animation createAnimationFromXml(Context context, XmlPullParser xmlPullParser) {
        return createAnimationFromXml(context, xmlPullParser, null, Xml.asAttributeSet(xmlPullParser));
    }

    public static Animation loadAnimation(Context context, int i) {
        XmlResourceParser animation = null;
        try {
            try {
                animation = context.getResources().getAnimation(i);
                return createAnimationFromXml(context, animation);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.animation.Animation createAnimationFromXml(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9, android.view.animation.AnimationSet r10, android.util.AttributeSet r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            int r3 = r9.getDepth()
            r4 = 0
        L8:
            int r5 = r9.next()
            r6 = 3
            if (r5 != r6) goto L15
            int r7 = r9.getDepth()
            if (r7 <= r3) goto Lcd
        L15:
            if (r5 == r2) goto Lcd
            if (r5 == r1) goto L1a
            goto L8
        L1a:
            java.lang.String r4 = r9.getName()
            r4.getClass()
            int r5 = r4.hashCode()
            r7 = -1
            switch(r5) {
                case -925180581: goto L55;
                case 113762: goto L4a;
                case 92909918: goto L3f;
                case 109250890: goto L36;
                case 1052832078: goto L2b;
                default: goto L29;
            }
        L29:
            r6 = r7
            goto L5f
        L2b:
            java.lang.String r5 = "translate"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r6 = 4
            goto L5f
        L36:
            java.lang.String r5 = "scale"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5f
            goto L29
        L3f:
            java.lang.String r5 = "alpha"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L48
            goto L29
        L48:
            r6 = r1
            goto L5f
        L4a:
            java.lang.String r5 = "set"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L53
            goto L29
        L53:
            r6 = r2
            goto L5f
        L55:
            java.lang.String r5 = "rotate"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5e
            goto L29
        L5e:
            r6 = r0
        L5f:
            switch(r6) {
                case 0: goto Lc1;
                case 1: goto Lb8;
                case 2: goto Lb2;
                case 3: goto Lac;
                case 4: goto La6;
                default: goto L62;
            }
        L62:
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L81
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L81
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r0] = r6     // Catch: java.lang.Exception -> L81
            java.lang.Class<android.util.AttributeSet> r6 = android.util.AttributeSet.class
            r5[r2] = r6     // Catch: java.lang.Exception -> L81
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch: java.lang.Exception -> L81
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L81
            r5[r0] = r8     // Catch: java.lang.Exception -> L81
            r5[r2] = r11     // Catch: java.lang.Exception -> L81
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L81
            android.view.animation.Animation r4 = (android.view.animation.Animation) r4     // Catch: java.lang.Exception -> L81
            goto Lc6
        L81:
            r8 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown animation name: "
            r11.<init>(r0)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = " error:"
            r11.append(r9)
            java.lang.String r8 = r8.getMessage()
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8)
            throw r10
        La6:
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r4.<init>(r8, r11)
            goto Lc6
        Lac:
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r4.<init>(r8, r11)
            goto Lc6
        Lb2:
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r4.<init>(r8, r11)
            goto Lc6
        Lb8:
            android.view.animation.AnimationSet r4 = new android.view.animation.AnimationSet
            r4.<init>(r8, r11)
            createAnimationFromXml(r8, r9, r4, r11)
            goto Lc6
        Lc1:
            android.view.animation.RotateAnimation r4 = new android.view.animation.RotateAnimation
            r4.<init>(r8, r11)
        Lc6:
            if (r10 == 0) goto L8
            r10.addAnimation(r4)
            goto L8
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.OptAnimationLoader.createAnimationFromXml(android.content.Context, org.xmlpull.v1.XmlPullParser, android.view.animation.AnimationSet, android.util.AttributeSet):android.view.animation.Animation");
    }
}
