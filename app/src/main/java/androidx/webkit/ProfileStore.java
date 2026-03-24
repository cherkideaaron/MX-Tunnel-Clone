package androidx.webkit;

import defpackage.Tz;
import java.util.List;

/* loaded from: classes.dex */
public interface ProfileStore {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    Tz getOrCreateProfile(String str);

    Tz getProfile(String str);
}
