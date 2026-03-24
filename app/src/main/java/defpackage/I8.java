package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class I8 {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    public I8(int i) {
        this.a = i;
    }

    public final int a() {
        switch (this.b) {
            case 0:
                return this.c.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.o - carouselLayoutManager.D();
        }
    }

    public final int b() {
        switch (this.b) {
            case 0:
                return this.c.E();
            default:
                return 0;
        }
    }

    public final int c() {
        switch (this.b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.n - carouselLayoutManager.F();
            default:
                return this.c.n;
        }
    }

    public final int d() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.H0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    public final int e() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return this.c.G();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I8(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }
}
