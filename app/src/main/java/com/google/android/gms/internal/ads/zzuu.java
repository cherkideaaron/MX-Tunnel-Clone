package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import defpackage.SQ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzuq zzC;
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;
    private zzv zzn;
    private zzv zzo;
    private zzth zzp;
    private zzth zzq;
    private zzmk zzr;
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzuk zzw;
    private zzv zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i, zzui zzuiVar, zzuw zzuwVar, boolean z, float f) {
        super(i);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            zzukVar.getClass();
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i) throws zziw, zzuq {
        zzlh zzlhVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzlhVarZzH, zzihVar, i | 4);
        if (iZzO == -5) {
            zzam(zzlhVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(zzv zzvVar) throws zziw, zzuq {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f, zzvVar, zzI());
            float f2 = this.zzA;
            if (f2 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f2 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw, zzuq {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw, zzuq {
        int i = this.zzY;
        if (i == 1) {
            zzav();
            return;
        }
        if (i == 2) {
            zzav();
            zzbp();
        } else if (i != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzo;
        if (zzvVar == null || !Objects.equals(zzvVar.zzo, "audio/opus")) {
            return true;
        }
        return !zzafu.zzf(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzA(long j, boolean z, boolean z2) throws zziw, zzuq {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final long zzT(long j, long j2) {
        return zzah(j, j2, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public void zzV(float f, float f2) throws zziw, zzuq {
        this.zzu = f;
        this.zzv = f2;
        zzbj(this.zzx);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzml
    public void zzX(long r27, long r29) throws com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzuq {
        /*
            Method dump skipped, instructions count: 1627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzX(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fb A[Catch: Exception -> 0x010b, TryCatch #5 {Exception -> 0x010b, blocks: (B:66:0x0101, B:78:0x014c, B:80:0x015d, B:81:0x0186, B:83:0x018f, B:85:0x0197, B:87:0x01a1, B:89:0x01a9, B:91:0x01b1, B:111:0x01f5, B:113:0x01fb, B:117:0x0206, B:119:0x020c, B:123:0x0217, B:125:0x021d, B:150:0x0274, B:152:0x027b, B:154:0x0281, B:155:0x028e, B:130:0x022a, B:132:0x0232, B:134:0x023a, B:136:0x0242, B:138:0x024a, B:140:0x0252, B:142:0x025a, B:144:0x0264, B:146:0x026e, B:96:0x01bf, B:98:0x01c7, B:102:0x01d2, B:104:0x01dc, B:106:0x01e4, B:108:0x01ec), top: B:200:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0281 A[Catch: Exception -> 0x010b, TryCatch #5 {Exception -> 0x010b, blocks: (B:66:0x0101, B:78:0x014c, B:80:0x015d, B:81:0x0186, B:83:0x018f, B:85:0x0197, B:87:0x01a1, B:89:0x01a9, B:91:0x01b1, B:111:0x01f5, B:113:0x01fb, B:117:0x0206, B:119:0x020c, B:123:0x0217, B:125:0x021d, B:150:0x0274, B:152:0x027b, B:154:0x0281, B:155:0x028e, B:130:0x022a, B:132:0x0232, B:134:0x023a, B:136:0x0242, B:138:0x024a, B:140:0x0252, B:142:0x025a, B:144:0x0264, B:146:0x026e, B:96:0x01bf, B:98:0x01c7, B:102:0x01d2, B:104:0x01dc, B:106:0x01e4, B:108:0x01ec), top: B:200:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e3 A[Catch: zzuq -> 0x02e6, TryCatch #9 {zzuq -> 0x02e6, blocks: (B:172:0x02ca, B:174:0x02e3, B:178:0x02ee, B:181:0x02f5, B:182:0x02f7, B:177:0x02e8, B:183:0x02f8, B:185:0x02fe, B:186:0x030a), top: B:207:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e8 A[Catch: zzuq -> 0x02e6, TryCatch #9 {zzuq -> 0x02e6, blocks: (B:172:0x02ca, B:174:0x02e3, B:178:0x02ee, B:181:0x02f5, B:182:0x02f7, B:177:0x02e8, B:183:0x02f8, B:185:0x02fe, B:186:0x030a), top: B:207:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d A[Catch: Exception -> 0x010b, TryCatch #5 {Exception -> 0x010b, blocks: (B:66:0x0101, B:78:0x014c, B:80:0x015d, B:81:0x0186, B:83:0x018f, B:85:0x0197, B:87:0x01a1, B:89:0x01a9, B:91:0x01b1, B:111:0x01f5, B:113:0x01fb, B:117:0x0206, B:119:0x020c, B:123:0x0217, B:125:0x021d, B:150:0x0274, B:152:0x027b, B:154:0x0281, B:155:0x028e, B:130:0x022a, B:132:0x0232, B:134:0x023a, B:136:0x0242, B:138:0x024a, B:140:0x0252, B:142:0x025a, B:144:0x0264, B:146:0x026e, B:96:0x01bf, B:98:0x01c7, B:102:0x01d2, B:104:0x01dc, B:106:0x01e4, B:108:0x01ec), top: B:200:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaA() throws com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzuq {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzaA():void");
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaC(zzun zzunVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    public final zzuk zzaE() {
        return this.zzw;
    }

    public final zzv zzaF() {
        return this.zzx;
    }

    public final MediaFormat zzaG() {
        return this.zzy;
    }

    public final zzun zzaH() {
        return this.zzD;
    }

    public final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                zzunVar.getClass();
                zzak(zzunVar.zza);
            }
        } finally {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        }
    }

    public final boolean zzaJ() throws zziw, zzuq {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    public boolean zzaK() {
        int i = this.zzY;
        if (i == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    public boolean zzaQ(zzv zzvVar) {
        return true;
    }

    public void zzaR(zzih zzihVar) {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    public void zzaV(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    public final float zzaX() {
        return this.zzu;
    }

    public final zzmk zzaY() {
        return this.zzr;
    }

    public final boolean zzaZ() {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e) {
            throw zzN(e, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zzuw zzuwVar, zzv zzvVar);

    public abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z);

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    public zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j, long j2, boolean z) {
        return SQ.a(this, j, j2);
    }

    public float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzio zzam(com.google.android.gms.internal.ads.zzlh r14) throws com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzuq {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzam(com.google.android.gms.internal.ads.zzlh):com.google.android.gms.internal.ads.zzio");
    }

    public void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar);

    public void zzar() {
        throw null;
    }

    public void zzas(zzih zzihVar) {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    public final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i, Object obj) {
        if (i == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzy(boolean z, boolean z2) {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzwk r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            boolean r1 = r0.zzaj
            if (r1 == 0) goto L5b
            r12.zzap()
            return
        L27:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.zzac
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.zzah
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5b
            r12.zzap()
        L5b:
            return
        L5c:
            com.google.android.gms.internal.ads.zzut r9 = new com.google.android.gms.internal.ads.zzut
            long r3 = r0.zzac
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwk):void");
    }
}
