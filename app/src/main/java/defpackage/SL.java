package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SL {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C3113nc b(View view, C3113nc c3113nc) {
        ContentInfo contentInfoI = c3113nc.a.i();
        Objects.requireNonNull(contentInfoI);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoI);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoI ? c3113nc : new C3113nc(new C2524cp(contentInfoPerformReceiveContent));
    }
}
