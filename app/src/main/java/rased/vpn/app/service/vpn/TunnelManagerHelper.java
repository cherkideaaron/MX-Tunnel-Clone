package rased.vpn.app.service.vpn;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;

/* loaded from: classes2.dex */
public class TunnelManagerHelper {
    public static void restartSocksHttp(Context context) {
        context.sendBroadcast(new Intent(SocksDNSService.v));
    }

    public static void startPsiphon(Context context) {
        Intent intent = new Intent(context, (Class<?>) PsiphonDNSService.class);
        TunnelUtils.restartRotate();
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void startSocksHttp(Context context) {
        Intent intent = new Intent(context, (Class<?>) SocksDNSService.class);
        TunnelUtils.restartRotate();
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void startXRay(Context context) {
        Intent intent = new Intent(context, (Class<?>) XRayDNSService.class);
        TunnelUtils.restartRotate();
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void stopPsiphon(Context context) {
        context.sendBroadcast(new Intent(PsiphonDNSService.u));
    }

    public static void stopSocksHttp(Context context) {
        context.sendBroadcast(new Intent(SocksDNSService.w));
    }

    public static void stopXRay(Context context) {
        context.sendBroadcast(new Intent(XRayDNSService.v));
    }
}
