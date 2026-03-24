package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Iv extends AbstractC3400sr implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Iv(Lv lv, int i) {
        super(0);
        this.a = i;
        this.b = lv;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.a) {
            case 0:
                Lv lv = this.b;
                File file = new File(lv.b.getAbsolutePath() + lv.e);
                Lv.f(lv, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new Iv(this.b, 0).invoke(), 939524096);
                    try {
                        int fd = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = C3587wF.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        C3587wF c3587wF = new C3587wF(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return c3587wF;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
            default:
                Lv lv2 = this.b;
                File file2 = new File(lv2.b.getAbsolutePath() + lv2.d);
                Lv.f(lv2, file2);
                return file2;
        }
    }
}
