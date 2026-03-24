package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3383sa;
import defpackage.AbstractC3491ua;
import defpackage.C3092n9;
import defpackage.C3147o9;
import defpackage.CH;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzbm implements zzaq {

    @NotNull
    private final Context zza;

    @NotNull
    private final String zzb = "rce_";

    public zzbm(@NotNull Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    @Nullable
    public final String zza(@NotNull String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (CH.a0(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(@NotNull String str, @NotNull String str2) {
        C3147o9 c3147o9 = new C3147o9('A', 'z');
        ArrayList arrayList = new ArrayList(AbstractC3491ua.Z(c3147o9, 10));
        Iterator it = c3147o9.iterator();
        while (((C3092n9) it).c) {
            C3092n9 c3092n9 = (C3092n9) it;
            int i = c3092n9.d;
            if (i != c3092n9.b) {
                c3092n9.d = c3092n9.a + i;
            } else {
                if (!c3092n9.c) {
                    throw new NoSuchElementException();
                }
                c3092n9.c = false;
            }
            arrayList.add(Character.valueOf((char) i));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.shuffle(arrayList2);
        String strC0 = AbstractC3383sa.c0(arrayList2.subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strC0)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(@NotNull String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (AbstractC0500aq.b(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
