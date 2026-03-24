package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class R8 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R8(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).F);
            case 6:
                return Float.valueOf(AbstractC3215pM.a.t((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                U8 u8 = (U8) obj;
                PointF pointF = (PointF) obj2;
                u8.getClass();
                u8.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                u8.b = iRound;
                int i = u8.f + 1;
                u8.f = i;
                if (i == u8.g) {
                    AbstractC3215pM.a(u8.e, u8.a, iRound, u8.c, u8.d);
                    u8.f = 0;
                    u8.g = 0;
                    break;
                }
                break;
            case 1:
                U8 u82 = (U8) obj;
                PointF pointF2 = (PointF) obj2;
                u82.getClass();
                u82.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                u82.d = iRound2;
                int i2 = u82.g + 1;
                u82.g = i2;
                if (u82.f == i2) {
                    AbstractC3215pM.a(u82.e, u82.a, u82.b, u82.c, iRound2);
                    u82.f = 0;
                    u82.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC3215pM.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC3215pM.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC3215pM.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC3215pM.a.J((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
