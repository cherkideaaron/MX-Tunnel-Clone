package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.AbstractC2547dB;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.t);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
