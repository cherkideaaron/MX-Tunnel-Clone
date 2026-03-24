package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: pK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3213pK extends AbstractC0069Df {
    public static Font l0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN0 = n0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iN02 = n0(fontStyle, font2.getStyle());
            if (iN02 < iN0) {
                font = font2;
                iN0 = iN02;
            }
        }
        return font;
    }

    public static FontFamily m0(C0381Vl[] c0381VlArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C0381Vl c0381Vl : c0381VlArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0381Vl.a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0381Vl.c).setSlant(c0381Vl.d ? 1 : 0).setTtcIndex(c0381Vl.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int n0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface j(Context context, C0330Sl c0330Sl, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C0347Tl c0347Tl : c0330Sl.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0347Tl.f).setWeight(c0347Tl.b).setSlant(c0347Tl.c ? 1 : 0).setTtcIndex(c0347Tl.e).setFontVariationSettings(c0347Tl.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(l0(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface k(Context context, C0381Vl[] c0381VlArr, int i) {
        try {
            FontFamily fontFamilyM0 = m0(c0381VlArr, context.getContentResolver());
            if (fontFamilyM0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM0).setStyle(l0(fontFamilyM0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface l(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM0 = m0((C0381Vl[]) list.get(0), contentResolver);
            if (fontFamilyM0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM0);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM02 = m0((C0381Vl[]) list.get(i2), contentResolver);
                if (fontFamilyM02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM02);
                }
            }
            return customFallbackBuilder.setStyle(l0(fontFamilyM0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface n(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final C0381Vl p(C0381Vl[] c0381VlArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
