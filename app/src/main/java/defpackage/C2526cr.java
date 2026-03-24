package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2526cr implements Qw, InterfaceC3104nL {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final Pw e;
    public final boolean f;

    public C2526cr(Writer writer, HashMap map, HashMap map2, C0335Sq c0335Sq, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = c0335Sq;
        this.f = z;
    }

    @Override // defpackage.Qw
    public final Qw a(C0430Yj c0430Yj, Object obj) throws IOException {
        i(obj, c0430Yj.a);
        return this;
    }

    @Override // defpackage.InterfaceC3104nL
    public final InterfaceC3104nL b(String str) throws IOException {
        j();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.InterfaceC3104nL
    public final InterfaceC3104nL c(boolean z) throws IOException {
        j();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw d(C0430Yj c0430Yj, boolean z) throws IOException {
        String str = c0430Yj.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw e(C0430Yj c0430Yj, int i) throws IOException {
        String str = c0430Yj.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw f(C0430Yj c0430Yj, double d) throws IOException {
        String str = c0430Yj.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.Qw
    public final Qw g(C0430Yj c0430Yj, long j) throws IOException {
        String str = c0430Yj.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final C2526cr h(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C0191Ki(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            Pw pw = (Pw) this.c.get(obj.getClass());
            if (pw != null) {
                jsonWriter.beginObject();
                pw.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3049mL interfaceC3049mL = (InterfaceC3049mL) this.d.get(obj.getClass());
            if (interfaceC3049mL != null) {
                interfaceC3049mL.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof Mw) {
                int iA = ((Mw) obj).a();
                j();
                jsonWriter.value(iA);
            } else {
                String strName = ((Enum) obj).name();
                j();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r8[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                j();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final C2526cr i(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
