package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: kI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2936kI {
    public static final String b = C3130nt.f("SystemJobInfoConverter");
    public final ComponentName a;

    public C2936kI(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
