package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class Aw extends Ew {
    public IconCompat b;
    public IconCompat c;
    public boolean d;

    @Override // defpackage.Ew
    public final void b(KJ kj) {
        Bitmap bitmapA;
        Object obj;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) kj.b).setBigContentTitle(null);
        IconCompat iconCompat = this.b;
        Context context = (Context) kj.a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC3783zw.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.b;
                int i = iconCompat2.a;
                if (i == -1) {
                    obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                } else if (i == 1) {
                    obj = iconCompat2.b;
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                }
            }
        }
        if (this.d) {
            IconCompat iconCompat3 = this.c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC3729yw.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC3783zw.c(bigContentTitle, false);
            AbstractC3783zw.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.Ew
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
