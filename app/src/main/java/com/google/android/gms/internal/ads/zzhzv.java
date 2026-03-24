package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import defpackage.A;
import defpackage.AbstractC3219pQ;
import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzhzv<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        AbstractC3264qG.v(sb, "Reading ", name, " from a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static zziee zzaR(zzidc zzidcVar) {
        return new zziee(zzidcVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzice.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzicn)) {
            if (iterable instanceof zzidl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzicn) iterable).zza();
        zzicn zzicnVar = (zzicn) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzicnVar.size() - size;
                String strE = AbstractC3219pQ.e(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzicnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strE);
                    }
                    zzicnVar.remove(size3);
                }
            } else {
                if (obj instanceof zzian) {
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzian.zzs(bArr2, 0, bArr2.length);
                } else {
                    zzicnVar.add((String) obj);
                }
                zzicnVar.zzb();
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzidn) {
                ((zzidn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            A a = (Object) list2.get(i);
            if (a == null) {
                zzc(list, size2);
            }
            list.add(a);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        String strE = AbstractC3219pQ.e(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strE);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziaq zziaqVar) {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (BuilderType) zzbd(zziaqVar, zzibb.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziaq zziaqVar, zzibb zzibbVar);

    public BuilderType zzaF(zzian zzianVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbe(zziaqVarZzm);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbd(zziaqVarZzm, zzibbVar);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i, i2, false);
            zzbe(zziaqVarZzG);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzibb zzibbVar) {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzibbVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i, i2, false);
            zzbd(zziaqVarZzG, zzibbVar);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(InputStream inputStream) {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbe(zziaqVarZzF);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzibb zzibbVar) {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbd(zziaqVarZzF, zzibbVar);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzibb zzibbVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaM(new zzhzu(inputStream, zziaq.zzM(i, inputStream)), zzibbVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzaN(inputStream, zzibb.zza);
    }

    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzidc zzidcVar) {
        if (zzbw().getClass().isInstance(zzidcVar)) {
            return (BuilderType) zzaQ((zzhzw) zzidcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzidb zzaV(InputStream inputStream, zzibb zzibbVar) {
        zzaM(inputStream, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaW(InputStream inputStream) {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zzaG(zzianVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbc(zzian zzianVar) throws zzicg {
        zzaF(zzianVar);
        return this;
    }
}
