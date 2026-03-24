package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzibr<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzibr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            AbstractC3264qG.v(sb, "Generated message class \"", name, "\" missing method \"", str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static zzibz zzbC() {
        return zzibs.zzd();
    }

    public static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zzh(size + size);
    }

    public static zzicc zzbE() {
        return zzicq.zzg();
    }

    public static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzh(size + size);
    }

    public static zziby zzbG() {
        return zzibi.zzd();
    }

    public static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zzh(size + size);
    }

    public static zzibu zzbI() {
        return zziay.zzd();
    }

    public static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zzh(size + size);
    }

    public static zzibt zzbK() {
        return zziad.zzd();
    }

    public static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zzh(size + size);
    }

    public static <E> zzicd<E> zzbM() {
        return zzidn.zzd();
    }

    public static <E> zzicd<E> zzbN(zzicd<E> zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    public static <T extends zzibr<T, ?>> T zzbO(T t, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) t.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t2.getClass());
            zziduVarZzb.zzg(t2, zziar.zza(zziaqVar), zzibbVar);
            zziduVarZzb.zzk(t2);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw ((zzicg) e3.getCause());
            }
            throw new zzicg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzicg) {
                throw ((zzicg) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends zzibr<T, ?>> T zzbP(T t, zziaq zziaqVar) {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbO(t, zziaqVar, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
        zziaq zziaqVarZzG;
        if (byteBuffer.hasArray()) {
            zziaqVarZzG = zziaq.zzG(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zziaqVarZzG = zziaq.zzG(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbZ(t, zziaqVarZzG, zzibbVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbQ(t, byteBuffer, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbS(T t, zzian zzianVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzbT(t, zzianVar, zzibb.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbT(T t, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzj(t, zzianVar, zzibbVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbU(T t, byte[] bArr) throws zzicg {
        int length = bArr.length;
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzibb.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbV(T t, byte[] bArr, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzibbVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbW(T t, InputStream inputStream) throws zzicg {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzbO(t, zziaqVarZzF, zzibb.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbX(T t, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzbO(t, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzbY(T t, zziaq zziaqVar) {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbZ(t, zziaqVar, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbZ(T t, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzbO(t, zziaqVar, zzibbVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr> T zzbt(Class<T> cls) throws ClassNotFoundException {
        zzibr<?, ?> zzibrVarZzbw = zzd.get(cls);
        if (zzibrVarZzbw == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVarZzbw = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzibrVarZzbw == null) {
            zzibrVarZzbw = ((zzibr) zziem.zzc(cls)).zzbw();
            if (zzibrVarZzbw == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzibrVarZzbw);
        }
        return zzibrVarZzbw;
    }

    public static <T extends zzibr> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    public static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzidc zzidcVar, zzibw zzibwVar, int i, zzies zziesVar, Class cls) {
        return new zzibp<>(containingtype, type, zzidcVar, new zzibo(zzibwVar, i, zziesVar, false, false), cls);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzbz(ContainingType containingtype, zzidc zzidcVar, zzibw zzibwVar, int i, zzies zziesVar, boolean z, Class cls) {
        return new zzibp<>(containingtype, zzidn.zzd(), zzidcVar, new zzibo(zzibwVar, i, zziesVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    public static <T extends zzibr<T, ?>> T zzca(T t, InputStream inputStream) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzk(t, inputStream, zzibb.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzibr<T, ?>> T zzcb(T t, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzk(t, inputStream, zzibbVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzidu<?> zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzibn<MessageType, BuilderType>, BuilderType, T> zzibp<MessageType, T> zze(zziaz<MessageType, T> zziazVar) {
        return (zzibp) zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzibr<T, ?>> boolean zzg(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzidm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    private static <T extends zzibr<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t2.getClass());
            zziduVarZzb.zzj(t2, bArr, i, i + i2, new zziab(zzibbVar));
            zziduVarZzb.zzk(t2);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw ((zzicg) e3.getCause());
            }
            throw new zzicg(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzibr<T, ?>> T zzi(T t) throws zzicg {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzibr<T, ?>> T zzj(T t, zzian zzianVar, zzibb zzibbVar) {
        zziaq zziaqVarZzm = zzianVar.zzm();
        T t2 = (T) zzbO(t, zziaqVarZzm, zzibbVar);
        zziaqVarZzm.zzb(0);
        return t2;
    }

    private static <T extends zzibr<T, ?>> T zzk(T t, InputStream inputStream, zzibb zzibbVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zziaq zziaqVarZzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(i, inputStream)), 4096);
            T t2 = (T) zzbO(t, zziaqVarZzF, zzibbVar);
            zziaqVarZzF.zzb(0);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzicg(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzide.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public int zzaQ() {
        return this.zzc & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public void zzaR(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 42), "serialized size must be non-negative, was ", i));
        }
        this.zzc = i | (this.zzc & zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public int zzaT(zzidu zziduVar) {
        if (zzaX()) {
            int iZzd = zzd(zziduVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZzd).length() + 42), "serialized size must be non-negative, was ", iZzd));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zziduVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public boolean zzaX() {
        return (this.zzc & zza) != 0;
    }

    public void zzaY() {
        this.zzc &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i) {
        this.zzq = i;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final zzidk<MessageType> zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public MessageType zzbg() {
        return (MessageType) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i, zziaq zziaqVar) {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zziaqVar);
    }

    public void zzbk(int i, int i2) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk(i << 3, Long.valueOf(i2));
    }

    public void zzbl(int i, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk((i << 3) | 2, zzianVar);
    }

    public void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public void zzbq() {
        zzaR(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzcX(zziaw zziawVar) {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }

    public abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);
}
