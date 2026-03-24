package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.mxtunnel.pro.R;

/* renamed from: n7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3090n7 extends M {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C3090n7(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.M
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        int i = this.d;
        super.c(view, accessibilityEvent);
        switch (i) {
            case 1:
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).d);
                break;
        }
    }

    @Override // defpackage.M
    public final void d(View view, Z z) {
        int i;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = z.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                z.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = z.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = z.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                int i2 = MaterialButtonToggleGroup.w;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                i3++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).u));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, z.a);
                Ut ut = (Ut) obj;
                z.b(new V(16, ut.getString(ut.r.getVisibility() == 0 ? R.string.mtrl_picker_toggle_to_year_selection : R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = z.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).D);
                break;
        }
    }

    @Override // defpackage.M
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((C2771hG) ((AbstractC3309r7) this.e)).a(3);
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
