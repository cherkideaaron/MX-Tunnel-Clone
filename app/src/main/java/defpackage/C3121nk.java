package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121nk {
    public final Object a;
    public final Object b;
    public final Object c;
    public Serializable d;
    public final Object e;
    public final Serializable f;
    public final Object g;

    /* JADX WARN: Type inference failed for: r0v3, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [float[], java.io.Serializable] */
    public C3121nk(C2832iM c2832iM) {
        this.a = new Matrix();
        this.b = new Matrix();
        this.d = new float[1];
        this.e = new Matrix();
        this.f = new float[2];
        this.g = new Matrix();
        new Matrix();
        this.c = c2832iM;
    }

    public static synchronized void g(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean j(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                j(file2);
            }
        }
        return file.delete();
    }

    public static List k(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && j(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c(float f, float f2, C3456tt c3456tt) {
        float[] fArr = (float[]) this.f;
        fArr[0] = f;
        fArr[1] = f2;
        e(fArr);
        c3456tt.b = fArr[0];
        c3456tt.c = fArr[1];
    }

    public void d(Path path) {
        path.transform((Matrix) this.a);
        path.transform(((C2832iM) this.c).a);
        path.transform((Matrix) this.b);
    }

    public void e(float[] fArr) {
        Matrix matrix = (Matrix) this.e;
        matrix.reset();
        ((Matrix) this.b).invert(matrix);
        matrix.mapPoints(fArr);
        ((C2832iM) this.c).a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.a).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void f(float[] fArr) {
        ((Matrix) this.a).mapPoints(fArr);
        ((C2832iM) this.c).a.mapPoints(fArr);
        ((Matrix) this.b).mapPoints(fArr);
    }

    public void h() {
        Matrix matrix = (Matrix) this.b;
        matrix.reset();
        C2832iM c2832iM = (C2832iM) this.c;
        RectF rectF = c2832iM.b;
        float f = rectF.left;
        float f2 = c2832iM.d;
        matrix.postTranslate(f, f2 - (f2 - rectF.bottom));
    }

    public void i(float f, float f2, float f3, float f4) {
        C2832iM c2832iM = (C2832iM) this.c;
        float fWidth = c2832iM.b.width() / f2;
        float fHeight = c2832iM.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        Matrix matrix = (Matrix) this.a;
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }

    public C3121nk(Context context) {
        String string;
        String str = ((T5) C0360Uh.m.w(context)).a;
        this.a = str;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? AbstractC0115Ga.R(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        g(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.g = file5;
    }
}
