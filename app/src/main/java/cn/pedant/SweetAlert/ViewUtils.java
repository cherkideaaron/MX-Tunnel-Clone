package cn.pedant.SweetAlert;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/* loaded from: classes.dex */
public class ViewUtils {
    public static Drawable[] getDrawable(View view) {
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) ((StateListDrawable) view.getBackground()).getConstantState();
        if (drawableContainerState != null) {
            return drawableContainerState.getChildren();
        }
        return null;
    }
}
