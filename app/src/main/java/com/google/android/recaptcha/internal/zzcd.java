package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.C3392sj;
import defpackage.MO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzcd {
    public zzcd(@NotNull Context context) {
    }

    @NotNull
    public static final byte[] zza(@NotNull File file) throws IOException {
        AbstractC0500aq.m(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                AbstractC0500aq.l(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    C3392sj c3392sj = new C3392sj(8193);
                    c3392sj.write(i5);
                    MO.k(fileInputStream, c3392sj);
                    int size = c3392sj.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = c3392sj.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC0500aq.l(bArrCopyOf, "copyOf(...)");
                    System.arraycopy(bArrA, 0, bArrCopyOf, i, c3392sj.size());
                }
            }
            AbstractC2883jK.m(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2883jK.m(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(@NotNull File file, @NotNull byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        AbstractC0500aq.m(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            AbstractC2883jK.m(fileOutputStream, null);
        } finally {
        }
    }
}
