package defpackage;

import android.graphics.Color;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: as, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502as implements InterfaceC0265Oo {
    public ArrayList A;
    public int B;
    public float C;
    public final float D;
    public float E;
    public final C3397so F;
    public final boolean G;
    public boolean H;
    public ArrayList a;
    public ArrayList b;
    public String c;
    public transient InterfaceC0554bp f;
    public List m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public boolean s;
    public boolean t;
    public float u;
    public int v;
    public int w;
    public float x;
    public boolean y;
    public int z;
    public int d = 1;
    public boolean e = true;
    public int g = 3;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public boolean j = true;
    public float k = 17.0f;
    public boolean l = true;

    public C0502as(String str, ArrayList arrayList) {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.a = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList2.add(Integer.valueOf(DefaultRenderer.BACKGROUND_COLOR));
        this.c = str;
        this.n = -3.4028235E38f;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.m = arrayList;
        if (arrayList == null) {
            this.m = new ArrayList();
        }
        List<C0327Si> list = this.m;
        if (list != null && !list.isEmpty()) {
            this.n = -3.4028235E38f;
            this.o = Float.MAX_VALUE;
            this.p = -3.4028235E38f;
            this.q = Float.MAX_VALUE;
            for (C0327Si c0327Si : list) {
                if (c0327Si != null) {
                    float f = this.q;
                    float f2 = c0327Si.c;
                    if (f2 < f) {
                        this.q = f2;
                    }
                    if (f2 > this.p) {
                        this.p = f2;
                    }
                    float f3 = c0327Si.a;
                    if (f3 < this.o) {
                        this.o = f3;
                    }
                    if (f3 > this.n) {
                        this.n = f3;
                    }
                }
            }
        }
        this.r = Color.rgb(255, 187, 115);
        this.s = true;
        this.t = true;
        this.u = 0.5f;
        this.u = AbstractC2831iL.c(0.5f);
        this.v = Color.rgb(140, 234, 255);
        this.w = 85;
        this.x = 2.5f;
        this.y = false;
        this.z = 1;
        this.A = null;
        this.B = -1;
        this.C = 8.0f;
        this.D = 4.0f;
        this.E = 0.2f;
        this.F = new C3397so(12);
        this.G = true;
        this.H = true;
        ArrayList arrayList3 = new ArrayList();
        this.A = arrayList3;
        arrayList3.clear();
        this.A.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public final ArrayList a(float f) {
        ArrayList arrayList = new ArrayList();
        List list = this.m;
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            float f2 = ((C0327Si) list.get(i2)).c;
            if (f == f2) {
                while (i2 > 0 && ((C0327Si) list.get(i2 - 1)).c == f) {
                    i2--;
                }
                int size2 = list.size();
                while (i2 < size2) {
                    C0327Si c0327Si = (C0327Si) list.get(i2);
                    if (c0327Si.c != f) {
                        break;
                    }
                    arrayList.add(c0327Si);
                    i2++;
                }
            } else if (f > f2) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public final C0327Si b(int i) {
        return (C0327Si) this.m.get(i);
    }

    public final C0327Si c(float f, float f2, int i) {
        int iD = d(f, f2, i);
        if (iD > -1) {
            return (C0327Si) this.m.get(iD);
        }
        return null;
    }

    public final int d(float f, float f2, int i) {
        int i2;
        C0327Si c0327Si;
        List list = this.m;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float f3 = ((C0327Si) list.get(i4)).c - f;
            int i5 = i4 + 1;
            float f4 = ((C0327Si) list.get(i5)).c - f;
            float fAbs = Math.abs(f3);
            float fAbs2 = Math.abs(f4);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = f3;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size == -1) {
            return size;
        }
        float f5 = ((C0327Si) list.get(size)).c;
        if (i == 1) {
            if (f5 < f && size < list.size() - 1) {
                size++;
            }
        } else if (i == 2 && f5 > f && size > 0) {
            size--;
        }
        if (Float.isNaN(f2)) {
            return size;
        }
        while (size > 0 && ((C0327Si) list.get(size - 1)).c == f5) {
            size--;
        }
        float f6 = ((C0327Si) list.get(size)).a;
        loop2: while (true) {
            i2 = size;
            do {
                size++;
                if (size >= list.size()) {
                    break loop2;
                }
                c0327Si = (C0327Si) list.get(size);
                if (c0327Si.c != f5) {
                    break loop2;
                }
            } while (Math.abs(c0327Si.a - f2) >= Math.abs(f6 - f2));
            f6 = f2;
        }
        return i2;
    }

    public final void e() {
        if (this.A == null) {
            this.A = new ArrayList();
        }
        this.A.clear();
        this.A.add(0);
    }

    public final void f(float f) {
        if (f >= 1.0f) {
            this.C = AbstractC2831iL.c(f);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    public final void g(int i) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        this.a.add(Integer.valueOf(i));
    }

    public final void h(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.x = AbstractC2831iL.c(f);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        List list = this.m;
        sb.append(list.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(((C0327Si) list.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
