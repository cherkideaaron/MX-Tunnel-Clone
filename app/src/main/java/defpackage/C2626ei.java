package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2626ei {
    public static final Object j = new Object();
    public static volatile C2626ei k;
    public final ReentrantReadWriteLock a;
    public final C0569c4 b;
    public volatile int c;
    public final Handler d;
    public final C3573w1 e;
    public final InterfaceC2572di f;
    public final C3397so g;
    public final int h;
    public final C0205Lf i;

    public C2626ei(C0228Ml c0228Ml) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC2572di interfaceC2572di = (InterfaceC2572di) c0228Ml.b;
        this.f = interfaceC2572di;
        int i = c0228Ml.a;
        this.h = i;
        this.i = (C0205Lf) c0228Ml.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new C0569c4(0);
        this.g = new C3397so(13);
        C3573w1 c3573w1 = new C3573w1(this);
        this.e = c3573w1;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC2572di.a(new C0445Zh(c3573w1));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C2626ei a() {
        C2626ei c2626ei;
        synchronized (j) {
            try {
                c2626ei = k;
                if (!(c2626ei != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2626ei;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            C3573w1 c3573w1 = this.e;
            C2626ei c2626ei = (C2626ei) c3573w1.a;
            try {
                c2626ei.f.a(new C0445Zh(c3573w1));
            } catch (Throwable th) {
                c2626ei.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC3256q8(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC3256q8(arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(CharSequence charSequence, int i, int i2) {
        C3322rK[] c3322rKArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0136He.e("start should be <= than end", i <= i2);
        KK kk = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC0136He.e("start should be < than charSequence length", i <= charSequence.length());
        AbstractC0136He.e("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        D3 d3 = (D3) this.e.b;
        d3.getClass();
        boolean z = charSequence instanceof C3480uG;
        if (z) {
            ((C3480uG) charSequence).a();
        }
        if (z) {
            kk = new KK((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    kk = new KK((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C3322rK.class) <= i2) {
                    kk = new KK();
                    kk.a = false;
                    kk.b = new SpannableString(charSequence);
                }
            } finally {
                if (z) {
                    ((C3480uG) charSequence).b();
                }
            }
        }
        if (kk != null && (c3322rKArr = (C3322rK[]) kk.b.getSpans(i, i2, C3322rK.class)) != null && c3322rKArr.length > 0) {
            for (C3322rK c3322rK : c3322rKArr) {
                int spanStart = kk.b.getSpanStart(c3322rK);
                int spanEnd = kk.b.getSpanEnd(c3322rK);
                if (spanStart != i2) {
                    kk.removeSpan(c3322rK);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            KK kk2 = (KK) d3.O(charSequence, i3, i4, Api.BaseClientBuilder.API_PRIORITY_OTHER, false, new R2(kk, (C3397so) d3.b, 27, false));
            if (kk2 != null) {
                Spannable spannable = kk2.b;
                if (z) {
                    ((C3480uG) charSequence).b();
                }
                return spannable;
            }
            if (!z) {
                return charSequence;
            }
        } else if (!z) {
            return charSequence;
        }
        return charSequence;
    }

    public final void g(AbstractC0601ci abstractC0601ci) {
        AbstractC0136He.g(abstractC0601ci, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new RunnableC3256q8(Arrays.asList(abstractC0601ci), this.c, (Throwable) null));
            } else {
                this.b.add(abstractC0601ci);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
