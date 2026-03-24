package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    public zzit(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e0 A[Catch: all -> 0x03fc, TryCatch #4 {all -> 0x03fc, blocks: (B:103:0x03bd, B:104:0x03da, B:106:0x03e0, B:108:0x03f1, B:111:0x03ff, B:113:0x0447, B:114:0x0455, B:116:0x045d, B:117:0x0460, B:119:0x0468, B:122:0x0471, B:125:0x0488, B:126:0x048b, B:121:0x046e, B:134:0x0511, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9), top: B:139:0x01eb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0447 A[Catch: all -> 0x03fc, TryCatch #4 {all -> 0x03fc, blocks: (B:103:0x03bd, B:104:0x03da, B:106:0x03e0, B:108:0x03f1, B:111:0x03ff, B:113:0x0447, B:114:0x0455, B:116:0x045d, B:117:0x0460, B:119:0x0468, B:122:0x0471, B:125:0x0488, B:126:0x048b, B:121:0x046e, B:134:0x0511, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9), top: B:139:0x01eb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045d A[Catch: all -> 0x03fc, TryCatch #4 {all -> 0x03fc, blocks: (B:103:0x03bd, B:104:0x03da, B:106:0x03e0, B:108:0x03f1, B:111:0x03ff, B:113:0x0447, B:114:0x0455, B:116:0x045d, B:117:0x0460, B:119:0x0468, B:122:0x0471, B:125:0x0488, B:126:0x048b, B:121:0x046e, B:134:0x0511, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9), top: B:139:0x01eb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0468 A[Catch: all -> 0x03fc, TryCatch #4 {all -> 0x03fc, blocks: (B:103:0x03bd, B:104:0x03da, B:106:0x03e0, B:108:0x03f1, B:111:0x03ff, B:113:0x0447, B:114:0x0455, B:116:0x045d, B:117:0x0460, B:119:0x0468, B:122:0x0471, B:125:0x0488, B:126:0x048b, B:121:0x046e, B:134:0x0511, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9), top: B:139:0x01eb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x007d, blocks: (B:8:0x0058, B:10:0x0063, B:11:0x0072, B:16:0x0081, B:18:0x0087, B:19:0x0097, B:21:0x00ae, B:22:0x00b5, B:24:0x00bf, B:25:0x00cc, B:27:0x00d6, B:28:0x00e3, B:30:0x00ee, B:31:0x00f6, B:33:0x010e, B:34:0x0111, B:36:0x012b, B:38:0x013b, B:40:0x0143, B:42:0x0149, B:43:0x014c, B:45:0x015b, B:47:0x0161, B:49:0x0173, B:51:0x017d, B:52:0x018e, B:54:0x0192, B:56:0x019d, B:59:0x01ba, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025d, B:84:0x0286, B:85:0x028d, B:87:0x0293, B:88:0x02c7, B:83:0x0261), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220 A[Catch: all -> 0x007d, TryCatch #5 {all -> 0x007d, blocks: (B:8:0x0058, B:10:0x0063, B:11:0x0072, B:16:0x0081, B:18:0x0087, B:19:0x0097, B:21:0x00ae, B:22:0x00b5, B:24:0x00bf, B:25:0x00cc, B:27:0x00d6, B:28:0x00e3, B:30:0x00ee, B:31:0x00f6, B:33:0x010e, B:34:0x0111, B:36:0x012b, B:38:0x013b, B:40:0x0143, B:42:0x0149, B:43:0x014c, B:45:0x015b, B:47:0x0161, B:49:0x0173, B:51:0x017d, B:52:0x018e, B:54:0x0192, B:56:0x019d, B:59:0x01ba, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025d, B:84:0x0286, B:85:0x028d, B:87:0x0293, B:88:0x02c7, B:83:0x0261), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245 A[Catch: all -> 0x007d, TryCatch #5 {all -> 0x007d, blocks: (B:8:0x0058, B:10:0x0063, B:11:0x0072, B:16:0x0081, B:18:0x0087, B:19:0x0097, B:21:0x00ae, B:22:0x00b5, B:24:0x00bf, B:25:0x00cc, B:27:0x00d6, B:28:0x00e3, B:30:0x00ee, B:31:0x00f6, B:33:0x010e, B:34:0x0111, B:36:0x012b, B:38:0x013b, B:40:0x0143, B:42:0x0149, B:43:0x014c, B:45:0x015b, B:47:0x0161, B:49:0x0173, B:51:0x017d, B:52:0x018e, B:54:0x0192, B:56:0x019d, B:59:0x01ba, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025d, B:84:0x0286, B:85:0x028d, B:87:0x0293, B:88:0x02c7, B:83:0x0261), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0261 A[Catch: all -> 0x007d, TryCatch #5 {all -> 0x007d, blocks: (B:8:0x0058, B:10:0x0063, B:11:0x0072, B:16:0x0081, B:18:0x0087, B:19:0x0097, B:21:0x00ae, B:22:0x00b5, B:24:0x00bf, B:25:0x00cc, B:27:0x00d6, B:28:0x00e3, B:30:0x00ee, B:31:0x00f6, B:33:0x010e, B:34:0x0111, B:36:0x012b, B:38:0x013b, B:40:0x0143, B:42:0x0149, B:43:0x014c, B:45:0x015b, B:47:0x0161, B:49:0x0173, B:51:0x017d, B:52:0x018e, B:54:0x0192, B:56:0x019d, B:59:0x01ba, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025d, B:84:0x0286, B:85:0x028d, B:87:0x0293, B:88:0x02c7, B:83:0x0261), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0293 A[Catch: all -> 0x007d, LOOP:1: B:85:0x028d->B:87:0x0293, LOOP_END, TryCatch #5 {all -> 0x007d, blocks: (B:8:0x0058, B:10:0x0063, B:11:0x0072, B:16:0x0081, B:18:0x0087, B:19:0x0097, B:21:0x00ae, B:22:0x00b5, B:24:0x00bf, B:25:0x00cc, B:27:0x00d6, B:28:0x00e3, B:30:0x00ee, B:31:0x00f6, B:33:0x010e, B:34:0x0111, B:36:0x012b, B:38:0x013b, B:40:0x0143, B:42:0x0149, B:43:0x014c, B:45:0x015b, B:47:0x0161, B:49:0x0173, B:51:0x017d, B:52:0x018e, B:54:0x0192, B:56:0x019d, B:59:0x01ba, B:60:0x01eb, B:62:0x01f3, B:64:0x01f9, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025d, B:84:0x0286, B:85:0x028d, B:87:0x0293, B:88:0x02c7, B:83:0x0261), top: B:147:0x0058, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032e A[Catch: all -> 0x0343, TryCatch #2 {all -> 0x0343, blocks: (B:90:0x0302, B:92:0x032e, B:95:0x0348, B:97:0x0354, B:99:0x03a5, B:98:0x038b), top: B:143:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0354 A[Catch: all -> 0x0343, TryCatch #2 {all -> 0x0343, blocks: (B:90:0x0302, B:92:0x032e, B:95:0x0348, B:97:0x0354, B:99:0x03a5, B:98:0x038b), top: B:143:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x038b A[Catch: all -> 0x0343, TryCatch #2 {all -> 0x0343, blocks: (B:90:0x0302, B:92:0x032e, B:95:0x0348, B:97:0x0354, B:99:0x03a5, B:98:0x038b), top: B:143:0x0302 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzit.call():java.lang.Object");
    }
}
