package defpackage;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.LocaleList;
import java.util.StringJoiner;

/* loaded from: classes.dex */
public abstract /* synthetic */ class N {
    public static /* synthetic */ StringJoiner B() {
        return new StringJoiner(", ", " conversion category (one of: ", ")");
    }

    public static /* synthetic */ JobInfo.TriggerContentUri c(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ StringJoiner m() {
        return new StringJoiner(", ", "(one of: ", ")");
    }

    public static /* synthetic */ void n() {
    }
}
