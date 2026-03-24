package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class B3 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final WF h = new WF();
    public final Object[] a = new Object[2];

    public C2647f2 a(Context context, AttributeSet attributeSet) {
        return new C2647f2(context, attributeSet);
    }

    public C2757h2 b(Context context, AttributeSet attributeSet) {
        return new C2757h2(context, attributeSet, com.mxtunnel.pro.R.attr.buttonStyle);
    }

    public C2865j2 c(Context context, AttributeSet attributeSet) {
        return new C2865j2(context, attributeSet, com.mxtunnel.pro.R.attr.checkboxStyle);
    }

    public S2 d(Context context, AttributeSet attributeSet) {
        return new S2(context, attributeSet);
    }

    public C3413t3 e(Context context, AttributeSet attributeSet) {
        return new C3413t3(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        WF wf = h;
        Constructor constructor = (Constructor) wf.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            wf.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
