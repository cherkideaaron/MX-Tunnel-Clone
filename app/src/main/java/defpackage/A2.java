package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import org.achartengine.chart.TimeChart;

/* loaded from: classes.dex */
public final class A2 extends C2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ F2 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(F2 f2, D3 d3) {
        super(f2);
        this.d = f2;
        this.e = d3;
    }

    @Override // defpackage.C2
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.C2
    public final int e() {
        Location location;
        boolean z;
        long j;
        switch (this.c) {
            case 0:
                return AbstractC3520v2.a((PowerManager) this.e) ? 2 : 1;
            default:
                D3 d3 = (D3) this.e;
                C2775hK c2775hK = (C2775hK) d3.c;
                if (c2775hK.b > System.currentTimeMillis()) {
                    z = c2775hK.a;
                } else {
                    Context context = (Context) d3.d;
                    int iJ = AbstractC3296qu.j(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) d3.b;
                    if (iJ == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC3296qu.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C2720gK.d == null) {
                            C2720gK.d = new C2720gK();
                        }
                        C2720gK c2720gK = C2720gK.d;
                        c2720gK.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - TimeChart.DAY);
                        c2720gK.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c2720gK.c == 1;
                        long j2 = c2720gK.b;
                        long j3 = c2720gK.a;
                        c2720gK.a(location.getLatitude(), location.getLongitude(), TimeChart.DAY + jCurrentTimeMillis);
                        long j4 = c2720gK.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        c2775hK.a = z;
                        c2775hK.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.C2
    public final void g() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.c) {
            case 0:
                this.d.n(true, true);
                break;
            default:
                this.d.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(F2 f2, Context context) {
        super(f2);
        this.d = f2;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
