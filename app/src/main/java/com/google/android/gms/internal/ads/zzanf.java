package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    public zzanf() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzani zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzani r18) throws com.google.android.gms.internal.ads.zzamb {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzani):com.google.android.gms.internal.ads.zzani");
    }

    private static zzani zze(zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgql.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzand r14) throws com.google.android.gms.internal.ads.zzamb, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzg(java.lang.String, com.google.android.gms.internal.ads.zzand):long");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i, i2), zzameVar, zzdrVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(14:279|441|280|281|(8:425|283|284|(2:306|(2:308|(3:310|(2:312|(2:314|(3:445|317|(1:319)))(2:325|(1:327)))(2:328|(1:330))|320)(2:331|332))(1:335))(1:336)|321|433|337|454)|453|340|(4:(3:342|343|(4:345|(1:347)(1:348)|349|(1:351)(9:353|356|(2:358|(1:360)(2:(5:362|421|363|364|(1:366))(1:370)|367))(1:371)|437|372|373|423|374|(1:376)))(1:354))(1:355)|423|374|(0))|352|356|(0)(0)|437|372|373) */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06cc, code lost:
    
        r9 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030f A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b0 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0446 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x049a A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04ee A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06ba A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, zzamb -> 0x06be, TRY_LEAVE, TryCatch #4 {zzamb -> 0x06be, blocks: (B:374:0x06b5, B:376:0x06ba), top: B:423:0x06b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:21:0x00a1, B:23:0x00a9, B:27:0x00be, B:29:0x00da, B:31:0x00e4, B:32:0x00e8, B:34:0x00f4, B:36:0x00ff, B:63:0x0169, B:81:0x01bf, B:84:0x01d3, B:86:0x01d9, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0207, B:100:0x020f, B:102:0x0217, B:104:0x021d, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:113:0x023a, B:407:0x073b, B:115:0x026c, B:117:0x0272, B:119:0x027b, B:121:0x028a, B:123:0x0297, B:125:0x02ad, B:127:0x02b3, B:275:0x053e, B:129:0x02c2, B:132:0x02ce, B:259:0x04ee, B:136:0x02ea, B:138:0x02f2, B:140:0x02fa, B:142:0x0302, B:147:0x030f, B:150:0x0328, B:152:0x032f, B:154:0x033d, B:174:0x0396, B:176:0x039c, B:178:0x03a2, B:180:0x03aa, B:182:0x03b0, B:185:0x03c3, B:187:0x03ca, B:189:0x03d8, B:207:0x043e, B:209:0x0446, B:229:0x0492, B:231:0x049a, B:257:0x04e1, B:191:0x03e3, B:158:0x034a, B:192:0x03ed, B:195:0x03f5, B:198:0x0400, B:200:0x0407, B:202:0x0413, B:204:0x0426, B:205:0x0430, B:157:0x0346, B:159:0x0350, B:162:0x035a, B:165:0x0360, B:167:0x0367, B:169:0x0373, B:171:0x0383, B:172:0x0388, B:262:0x0501, B:264:0x050e, B:266:0x0519, B:268:0x051f, B:270:0x052b, B:280:0x0560, B:283:0x0582, B:317:0x05ec, B:319:0x05f4, B:337:0x0636, B:387:0x06d4, B:325:0x0605, B:328:0x060f, B:332:0x061d, B:335:0x0626, B:336:0x062e, B:342:0x0648, B:372:0x06a7, B:374:0x06b5, B:376:0x06ba, B:363:0x0692, B:66:0x0176, B:68:0x0182, B:69:0x0186, B:72:0x018b, B:74:0x0192, B:76:0x019e, B:78:0x01aa, B:40:0x0117, B:42:0x0123, B:45:0x012c, B:47:0x0133, B:49:0x013a, B:51:0x0141, B:58:0x0153, B:62:0x0161, B:392:0x06f4, B:395:0x0703, B:397:0x070d, B:399:0x0718, B:400:0x071d, B:403:0x0730, B:406:0x0738), top: B:447:0x0009, inners: #0, #1, #7, #8, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzama zzb(byte[] r49, int r50, int r51) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.zzamb, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzama");
    }
}
