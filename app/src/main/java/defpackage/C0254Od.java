package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Od, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0254Od {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final C0237Nd g = new C0237Nd();
    public static final C0440Zc h = new C0440Zc(1);
    public static final C0423Yc i = new C0423Yc(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final C3121nk b;
    public final C3308r6 c;
    public final C0487ad d;

    public C0254Od(C3121nk c3121nk, C3308r6 c3308r6, C0487ad c0487ad) {
        this.b = c3121nk;
        this.c = c3308r6;
        this.d = c0487ad;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C3121nk c3121nk = this.b;
        arrayList.addAll(C3121nk.k(((File) c3121nk.f).listFiles()));
        arrayList.addAll(C3121nk.k(((File) c3121nk.g).listFiles()));
        C0440Zc c0440Zc = h;
        Collections.sort(arrayList, c0440Zc);
        List listK = C3121nk.k(((File) c3121nk.e).listFiles());
        Collections.sort(listK, c0440Zc);
        arrayList.addAll(listK);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C3121nk.k(((File) this.b.d).list())).descendingSet();
    }

    public final void d(AbstractC0118Gd abstractC0118Gd, String str, boolean z) {
        C3121nk c3121nk = this.b;
        int i2 = this.c.f().a.a;
        g.getClass();
        try {
            f(c3121nk.b(str, AbstractC3264qG.x("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), C0237Nd.a.s(abstractC0118Gd));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        C0423Yc c0423Yc = new C0423Yc(3);
        c3121nk.getClass();
        File file = new File((File) c3121nk.d, str);
        file.mkdirs();
        List<File> listK = C3121nk.k(file.listFiles(c0423Yc));
        Collections.sort(listK, new C0440Zc(2));
        int size = listK.size();
        for (File file2 : listK) {
            if (size <= i2) {
                return;
            }
            C3121nk.j(file2);
            size--;
        }
    }
}
