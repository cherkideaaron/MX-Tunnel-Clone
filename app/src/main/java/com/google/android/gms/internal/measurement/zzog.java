package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzog {
    public static String zza(zzlh zzlhVar) {
        String str;
        StringBuilder sb = new StringBuilder(zzlhVar.zzc());
        for (int i = 0; i < zzlhVar.zzc(); i++) {
            int iZza = zzlhVar.zza(i);
            if (iZza == 34) {
                str = "\\\"";
            } else if (iZza == 39) {
                str = "\\'";
            } else if (iZza != 92) {
                switch (iZza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZza < 32 || iZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((iZza >>> 6) & 3) + 48));
                            sb.append((char) (((iZza >>> 3) & 7) + 48));
                            iZza = (iZza & 7) + 48;
                        }
                        sb.append((char) iZza);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
