package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1542at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C1901gi> A02;
    public final WeakReference<InterfaceC1539aq> A03;
    public final WeakReference<C1534al> A04;
    public final InterfaceC1538ap A01 = new InterfaceC1538ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.facebook.ads.redexgen.core.InterfaceC1538ap
        public final boolean AAf(String str) {
            return C1542at.A04(str);
        }
    };
    public WeakReference<InterfaceC1540ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1542at(WeakReference<C1901gi> weakReference, WeakReference<InterfaceC1539aq> weakReference2, WeakReference<C1534al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1901gi c1901gi) {
        c1901gi.A08().ABC(A00(11, 11, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION), AbstractC1313Td.A09, new C1314Te(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) throws URISyntaxException {
        boolean zA14;
        String strA00;
        String strA002;
        String strA003;
        Intent intent;
        String strA004 = A00(116, 8, 68);
        C1901gi c1901gi = this.A02.get();
        if (c1901gi != null) {
            if ((M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    zA14 = C1351Up.A14(c1901gi);
                    strA00 = A00(48, 33, 58);
                    strA002 = A00(22, 26, 65);
                    strA003 = A00(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, 6, 36);
                } catch (Exception e) {
                    c1901gi.A08().ABD(strA004, AbstractC1313Td.A2d, new C1314Te(e));
                    c1901gi.A0F().AA2(e.toString());
                }
                if (zA14) {
                    if (!M3.A0D.contains(scheme) && !A00(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, 4, 123).equals(scheme)) {
                        if (strA003.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(strA002, uri);
                        }
                        intent.addCategory(strA00);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!C1405Wu.A0D(c1901gi, intent)) {
                                A02(str, c1901gi);
                            }
                            return true;
                        } catch (C1403Ws unused) {
                            if (strA003.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!C1405Wu.A0D(c1901gi, new Intent(strA002, XB.A00(stringExtra)))) {
                                        A02(str, c1901gi);
                                    }
                                    return true;
                                }
                            }
                            C1314Te c1314Te = new C1314Te(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 91) + str);
                            c1314Te.A05(1);
                            c1901gi.A08().ABD(A00(11, 11, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION), AbstractC1313Td.A06, c1314Te);
                            return true;
                        }
                    }
                    return false;
                }
                if (!M3.A0A || !strA003.equalsIgnoreCase(scheme)) {
                    if ((M3.A0A && AbstractC1410Xb.A04(str)) || !M3.A0D.contains(scheme)) {
                        return C1405Wu.A0D(c1901gi, new Intent(strA002, uri));
                    }
                } else {
                    Intent uri2 = Intent.parseUri(str, 1);
                    uri2.addCategory(strA00);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1901gi.getPackageManager().resolveActivity(uri2, 65536) != null && C1405Wu.A0D(c1901gi, uri2)) {
                        webView.goBack();
                        return true;
                    }
                }
                return false;
            } catch (SecurityException e2) {
                c1901gi.A08().ABD(strA004, AbstractC1313Td.A2d, new C1314Te(e2));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC1540ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1534al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1539aq interfaceC1539aq = this.A03.get();
        if (interfaceC1539aq != null) {
            interfaceC1539aq.AF7(str);
        }
        InterfaceC1540ar interfaceC1540ar = this.A00.get();
        if (interfaceC1540ar != null) {
            interfaceC1540ar.ADB(webView.canGoBack());
            interfaceC1540ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1539aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) throws JSONException {
        super.onReceivedError(webView, i, str, str2);
        C1901gi c1901gi = this.A02.get();
        if (c1901gi != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            String errorMessage = AbstractC1410Xb.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c1901gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1901gi c1901gi = this.A02.get();
        if (c1901gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            String errorMessage = AbstractC1410Xb.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1901gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1901gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1901gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1547ay.A0D(AbstractC1313Td.A2e);
        InterfaceC1539aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
