package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0177Jl {
    public static final C3348rt a = new C3348rt(2);
    public static final C0440Zc b = new C0440Zc(3);

    public static C3249q1 a(Context context, List list) {
        AbstractC0115Ga.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C0194Kl c0194Kl = (C0194Kl) list.get(i);
                ProviderInfo providerInfoB = b(context.getPackageManager(), c0194Kl, context.getResources());
                if (providerInfoB == null) {
                    C3249q1 c3249q1 = new C3249q1(2);
                    Trace.endSection();
                    return c3249q1;
                }
                arrayList.add(c(context, c0194Kl, providerInfoB.authority));
            }
            C3249q1 c3249q12 = new C3249q1(arrayList);
            Trace.endSection();
            return c3249q12;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static ProviderInfo b(PackageManager packageManager, C0194Kl c0194Kl, Resources resources) {
        AbstractC0115Ga.c("FontProvider.getProvider");
        try {
            List listC = c0194Kl.d;
            String str = c0194Kl.a;
            String str2 = c0194Kl.b;
            if (listC == null) {
                listC = MO.C(resources, 0);
            }
            C0160Il c0160Il = new C0160Il();
            c0160Il.a = str;
            c0160Il.b = str2;
            c0160Il.c = listC;
            C3348rt c3348rt = a;
            ProviderInfo providerInfo = (ProviderInfo) c3348rt.get(c0160Il);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C0440Zc c0440Zc = b;
            Collections.sort(arrayList, c0440Zc);
            for (int i = 0; i < listC.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listC.get(i));
                Collections.sort(arrayList2, c0440Zc);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    c3348rt.put(c0160Il, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static C0381Vl[] c(Context context, C0194Kl c0194Kl, String str) {
        InterfaceC0143Hl c2827iH;
        AbstractC0115Ga.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                c2827iH = new C2827iH(context, uriBuild);
            } else {
                C0607co c0607co = new C0607co();
                c0607co.a = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                c2827iH = c0607co;
            }
            Cursor cursorL = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0115Ga.c("ContentQueryWrapper.query");
                try {
                    cursorL = c2827iH.l(uriBuild, strArr, new String[]{c0194Kl.c});
                    Trace.endSection();
                    if (cursorL != null && cursorL.getCount() > 0) {
                        int columnIndex = cursorL.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorL.getColumnIndex("_id");
                        int columnIndex3 = cursorL.getColumnIndex("file_id");
                        int columnIndex4 = cursorL.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorL.getColumnIndex("font_weight");
                        int columnIndex6 = cursorL.getColumnIndex("font_italic");
                        while (cursorL.moveToNext()) {
                            int i = columnIndex != -1 ? cursorL.getInt(columnIndex) : 0;
                            arrayList2.add(new C0381Vl(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorL.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorL.getLong(columnIndex3)), columnIndex4 != -1 ? cursorL.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorL.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorL.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorL != null) {
                        cursorL.close();
                    }
                    c2827iH.close();
                    return (C0381Vl[]) arrayList.toArray(new C0381Vl[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorL != null) {
                    cursorL.close();
                }
                c2827iH.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
