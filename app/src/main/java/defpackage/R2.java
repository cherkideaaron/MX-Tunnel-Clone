package defpackage;

import android.R;
import android.animation.Animator;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.z;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class R2 implements E0, SuccessContinuation, C8, InterfaceC3284qi, InterfaceC3067ml {
    public static ON f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final Object e = new Object();
    public static final C0360Uh m = new C0360Uh(20);
    public static final By n = new By();
    public static final Ay o = new Ay();

    public R2(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
            case 6:
                this.b = new Rect();
                this.c = new Rect();
                break;
            default:
                this.b = new Qv();
                this.c = new VE();
                F(o);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Vector A(java.lang.String r17) throws defpackage.C3438tb {
        /*
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r17.length()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r1 = 1
            java.lang.String r2 = ""
            r6 = r1
            r8 = r2
            r4 = 0
            r5 = 0
            r7 = 0
        L14:
            int r9 = r17.length()
            if (r4 >= r9) goto L21
            r9 = r17
            char r10 = r9.charAt(r4)
            goto L24
        L21:
            r9 = r17
            r10 = 0
        L24:
            r11 = 92
            r12 = 2
            if (r5 != 0) goto L30
            if (r10 != r11) goto L30
            if (r6 == r12) goto L30
            r5 = r1
            goto L9a
        L30:
            r13 = 4
            r14 = 39
            r15 = 3
            r3 = 34
            r11 = 5
            if (r6 != r1) goto L5b
            boolean r16 = java.lang.Character.isWhitespace(r10)
            if (r16 != 0) goto L76
            if (r10 != 0) goto L42
            goto L76
        L42:
            r6 = 59
            if (r10 == r6) goto Lb4
            r6 = 35
            if (r10 != r6) goto L4c
            goto Lb4
        L4c:
            if (r5 != 0) goto L52
            if (r10 != r3) goto L52
            r6 = r15
            goto L76
        L52:
            if (r5 != 0) goto L58
            if (r10 != r14) goto L58
            r6 = r12
            goto L76
        L58:
            r7 = r10
            r6 = r13
            goto L76
        L5b:
            if (r6 != r13) goto L69
            if (r5 != 0) goto L75
            boolean r12 = java.lang.Character.isWhitespace(r10)
            if (r12 != 0) goto L67
            if (r10 != 0) goto L75
        L67:
            r6 = r11
            goto L76
        L69:
            if (r6 != r15) goto L70
            if (r5 != 0) goto L75
            if (r10 != r3) goto L75
            goto L67
        L70:
            if (r6 != r12) goto L76
            if (r10 != r14) goto L75
            goto L67
        L75:
            r7 = r10
        L76:
            if (r6 != r11) goto L7e
            r0.add(r8)
            r6 = r1
            r8 = r2
            r7 = 0
        L7e:
            if (r5 == 0) goto L99
            if (r7 == 0) goto L99
            r5 = 92
            if (r7 == r5) goto L99
            if (r7 == r3) goto L99
            boolean r3 = java.lang.Character.isWhitespace(r7)
            if (r3 != 0) goto L99
            if (r7 != 0) goto L91
            goto L99
        L91:
            tb r0 = new tb
            java.lang.String r1 = "Options warning: Bad backslash ('\\') usage"
            r0.<init>(r1)
            throw r0
        L99:
            r5 = 0
        L9a:
            if (r7 == 0) goto Lac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r8 = r3
        Lac:
            int r3 = r4 + 1
            int r10 = r17.length()
            if (r4 < r10) goto Lb5
        Lb4:
            return r0
        Lb5:
            r4 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R2.A(java.lang.String):java.util.Vector");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.R2 j(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2d java.io.IOException -> L2f
            R2 r2 = new R2     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            r3 = 20
            r4 = 0
            r2.<init>(r5, r0, r3, r4)     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            return r2
        L24:
            r2 = move-exception
            goto L39
        L26:
            r2 = move-exception
            goto L39
        L28:
            r2 = move-exception
            goto L39
        L2a:
            r2 = move-exception
        L2b:
            r0 = r1
            goto L39
        L2d:
            r2 = move-exception
            goto L2b
        L2f:
            r2 = move-exception
            goto L2b
        L31:
            r2 = move-exception
        L32:
            r5 = r1
            r0 = r5
            goto L39
        L35:
            r2 = move-exception
            goto L32
        L37:
            r2 = move-exception
            goto L32
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R2.j(android.content.Context):R2");
    }

    public static void k(D3 d3, C2715gF c2715gF) {
        l(d3, "X-CRASHLYTICS-GOOGLE-APP-ID", c2715gF.a);
        l(d3, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        l(d3, "X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        l(d3, "Accept", "application/json");
        l(d3, "X-CRASHLYTICS-DEVICE-MODEL", c2715gF.b);
        l(d3, "X-CRASHLYTICS-OS-BUILD-VERSION", c2715gF.c);
        l(d3, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c2715gF.d);
        l(d3, "X-CRASHLYTICS-INSTALLATION-ID", ((C2578dp) c2715gF.e).c().a);
    }

    public static void l(D3 d3, String str, String str2) {
        if (str2 != null) {
            ((HashMap) d3.b).put(str, str2);
        }
    }

    public static Task m(Context context, Intent intent, boolean z) {
        ON on;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (e) {
            try {
                if (f == null) {
                    f = new ON(context);
                }
                on = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return on.b(intent).continueWith(new P3(1), new C0220Md(14));
        }
        if (C3532vE.b().h(context)) {
            KM.b(context, on, intent);
        } else {
            on.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public static void n(Vector vector, BufferedReader bufferedReader) throws IOException, C3438tb {
        String strTrim = ((String) vector.get(0)).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String strX = AbstractC3264qG.x("</", strSubstring, ">");
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new C3438tb(Vs.m("No endtag </", strSubstring, "> for starttag <", strSubstring, "> found"));
            }
            if (line.trim().equals(strX)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = AbstractC3264qG.g(AbstractC3264qG.g(strSubstring2, line), "\n");
        }
    }

    public static HashMap r(C2715gF c2715gF) {
        HashMap map = new HashMap();
        map.put("build_version", c2715gF.h);
        map.put("display_version", c2715gF.g);
        map.put("source", Integer.toString(c2715gF.i));
        String str = c2715gF.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public Task B(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = (Context) this.b;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return m(context, intent, z2);
        }
        Callable callable = new Callable() { // from class: Vj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                String str3;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                C3532vE c3532vEB = C3532vE.b();
                c3532vEB.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c3532vEB.d).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c3532vEB) {
                    try {
                        str = (String) c3532vEB.a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        str3 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        str3 = serviceInfo.name;
                                    }
                                    c3532vEB.a = str3;
                                    str = (String) c3532vEB.a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (c3532vEB.h(context2)) {
                        componentNameStartService = KM.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i = 402;
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        P3 p3 = (P3) this.c;
        return Tasks.call(p3, callable).continueWithTask(p3, new Continuation() { // from class: Wj
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? R2.m(context, intent, z2).continueWith(new P3(1), new C0220Md(13)) : task;
            }
        });
    }

    public void C() throws IOException {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public void D(boolean z) {
        C3607wi c3607wi = (C3607wi) ((R2) ((C2827iH) this.c).b).c;
        if (c3607wi.d != z) {
            if (c3607wi.c != null) {
                C2626ei c2626eiA = C2626ei.a();
                C3553vi c3553vi = c3607wi.c;
                c2626eiA.getClass();
                AbstractC0136He.g(c3553vi, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c2626eiA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c2626eiA.b.remove(c3553vi);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c3607wi.d = z;
            if (z) {
                C3607wi.a(c3607wi.a, C2626ei.a().b());
            }
        }
    }

    public void E(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void F(AbstractC0069Df abstractC0069Df) {
        ((Qv) this.b).i(abstractC0069Df);
        boolean z = abstractC0069Df instanceof By;
        VE ve = (VE) this.c;
        if (z) {
            ve.i((By) abstractC0069Df);
        } else if (abstractC0069Df instanceof C3785zy) {
            ve.j(((C3785zy) abstractC0069Df).k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable G(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC3380sO) {
            ((AbstractC3434tO) ((InterfaceC3380sO) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = G(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // defpackage.E0
    public boolean a(F0 f0, MenuItem menuItem) {
        return ((E0) this.b).a(f0, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3067ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.InterfaceC3177ol r6, defpackage.InterfaceC3493uc r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C3556vl
            if (r0 == 0) goto L13
            r0 = r7
            vl r0 = (defpackage.C3556vl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vl r0 = new vl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC0115Ga.U(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ol r6 = r0.e
            R2 r2 = r0.d
            defpackage.AbstractC0115Ga.U(r7)
            goto L4f
        L3a:
            defpackage.AbstractC0115Ga.U(r7)
            r0.d = r5
            r0.e = r6
            r0.b = r4
            java.lang.Object r7 = r5.b
            ml r7 = (defpackage.InterfaceC3067ml) r7
            java.io.Serializable r7 = defpackage.AbstractC0069Df.d(r7, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L65
            java.lang.Object r2 = r2.c
            un r2 = (defpackage.InterfaceC3504un) r2
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.b = r3
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            DK r6 = defpackage.DK.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R2.b(ol, uc):java.lang.Object");
    }

    @Override // defpackage.E0
    public void c(F0 f0) {
        ((E0) this.b).c(f0);
        F2 f2 = (F2) this.c;
        if (f2.C != null) {
            f2.r.getDecorView().removeCallbacks(f2.D);
        }
        if (f2.B != null) {
            C2885jM c2885jM = f2.E;
            if (c2885jM != null) {
                c2885jM.b();
            }
            C2885jM c2885jMA = UL.a(f2.B);
            c2885jMA.a(0.0f);
            f2.E = c2885jMA;
            c2885jMA.d(new C3466u2(this, 2));
        }
        f2.A = null;
        ViewGroup viewGroup = f2.G;
        WeakHashMap weakHashMap = UL.a;
        KL.c(viewGroup);
        f2.J();
    }

    @Override // defpackage.E0
    public boolean d(F0 f0, MenuC3511uu menuC3511uu) {
        return ((E0) this.b).d(f0, menuC3511uu);
    }

    @Override // defpackage.InterfaceC3284qi
    public Object e() {
        return (KK) this.b;
    }

    @Override // defpackage.C8
    public void f() {
        ((Animator) this.b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((z) this.c) + " has been canceled.");
        }
    }

    @Override // defpackage.E0
    public boolean g(F0 f0, MenuC3511uu menuC3511uu) {
        ViewGroup viewGroup = ((F2) this.c).G;
        WeakHashMap weakHashMap = UL.a;
        KL.c(viewGroup);
        return ((E0) this.b).g(f0, menuC3511uu);
    }

    @Override // defpackage.InterfaceC3284qi
    public boolean h(CharSequence charSequence, int i, int i2, C3268qK c3268qK) {
        if ((c3268qK.c & 4) > 0) {
            return true;
        }
        if (((KK) this.b) == null) {
            this.b = new KK(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C3397so) this.c).getClass();
        ((KK) this.b).setSpan(new C3322rK(c3268qK), i, i2, 33);
        return true;
    }

    public void o() throws IOException {
        String str = (String) this.b;
        try {
            C3121nk c3121nk = (C3121nk) this.c;
            c3121nk.getClass();
            new File((File) c3121nk.c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + str, e2);
        }
    }

    public ArrayList p(String str) {
        UC ucC = UC.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.b;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public KeyListener q(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((R2) ((C2827iH) this.c).b).getClass();
        if (keyListener instanceof C3229pi) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C3229pi(keyListener);
    }

    public JSONObject s(C2544d8 c2544d8) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = c2544d8.b;
        sb.append(i);
        String string = sb.toString();
        C0360Uh c0360Uh = C0360Uh.f;
        c0360Uh.z(string);
        String str = (String) this.b;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (!c0360Uh.r(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = c2544d8.c;
        try {
            return new JSONObject(str3);
        } catch (Exception e2) {
            c0360Uh.A("Failed to parse settings JSON from " + str, e2);
            c0360Uh.A("Settings response " + str3, null);
            return null;
        }
    }

    public boolean t(String str) {
        UC ucC = UC.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.b;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            boolean z = false;
            if (cursorG.moveToFirst()) {
                z = cursorG.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.a) {
            case 17:
                if (((XE) obj) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                CallableC0542bd callableC0542bd = (CallableC0542bd) this.c;
                Task taskA = C2567dd.a(callableC0542bd.f);
                C2567dd c2567dd = callableC0542bd.f;
                return Tasks.whenAll((Task<?>[]) new Task[]{taskA, c2567dd.m.q((ExecutorC0305Rd) c2567dd.e.b, callableC0542bd.e ? (String) this.b : null)});
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                C2567dd c2567dd2 = (C2567dd) this.c;
                if (zBooleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue2 = bool.booleanValue();
                    C0102Fe c0102Fe = c2567dd2.b;
                    if (zBooleanValue2) {
                        ((TaskCompletionSource) c0102Fe.e).trySetResult(null);
                        return ((Task) this.b).onSuccessTask((ExecutorC0305Rd) c2567dd2.e.b, new C2524cp(this, 10));
                    }
                    c0102Fe.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = C3121nk.k(((File) c2567dd2.g.c).listFiles(C2567dd.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C3121nk c3121nk = ((C0254Od) c2567dd2.m.b).b;
                C0254Od.a(C3121nk.k(((File) c3121nk.e).listFiles()));
                C0254Od.a(C3121nk.k(((File) c3121nk.f).listFiles()));
                C0254Od.a(C3121nk.k(((File) c3121nk.g).listFiles()));
                c2567dd2.q.trySetResult(null);
                return Tasks.forResult(null);
        }
    }

    public void u(AttributeSet attributeSet, int i) {
        switch (this.a) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.b;
                D3 d3L = D3.L(i, 0, progressBar.getContext(), attributeSet, d);
                Drawable drawableY = d3L.y(0);
                if (drawableY != null) {
                    if (drawableY instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableY;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableG = G(animationDrawable.getFrame(i2), true);
                            drawableG.setLevel(10000);
                            animationDrawable2.addFrame(drawableG, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableY = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(drawableY);
                }
                Drawable drawableY2 = d3L.y(1);
                if (drawableY2 != null) {
                    progressBar.setProgressDrawable(G(drawableY2, false));
                }
                d3L.P();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, AbstractC2547dB.i, i, 0);
                try {
                    boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    D(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C3064mi v(InputConnection inputConnection, EditorInfo editorInfo) {
        C2827iH c2827iH = (C2827iH) this.c;
        if (inputConnection == null) {
            c2827iH.getClass();
            inputConnection = null;
        } else {
            R2 r2 = (R2) c2827iH.b;
            r2.getClass();
            if (!(inputConnection instanceof C3064mi)) {
                inputConnection = new C3064mi((EditText) r2.b, inputConnection, editorInfo);
            }
        }
        return (C3064mi) inputConnection;
    }

    public void w(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC3681y1 interfaceC3681y1 = (InterfaceC3681y1) ("clx".equals(bundle2.getString("_o")) ? this.b : this.c);
            if (interfaceC3681y1 == null) {
                return;
            }
            interfaceC3681y1.f(bundle2, string);
        }
    }

    public void x(C0279Pl c0279Pl) {
        int i = c0279Pl.b;
        Executor executor = (Executor) this.c;
        C3588wG c3588wG = (C3588wG) this.b;
        if (i == 0) {
            executor.execute(new RunnableC3680y0(c3588wG, c0279Pl.a, 5, false));
        } else {
            executor.execute(new RunnableC3256q8(i, 0, c3588wG));
        }
    }

    public void y(InputStreamReader inputStreamReader) {
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int i = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i++;
                if (line == null) {
                    return;
                }
                if (i == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    String[] strArrSplit = line.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
                    Vector vector = new Vector();
                    Collections.addAll(vector, strArrSplit);
                    ((HashMap) this.c).put((String) vector.get(0), vector);
                } else {
                    Vector vectorA = A(line);
                    if (vectorA.size() != 0) {
                        if (((String) vectorA.get(0)).startsWith("--")) {
                            vectorA.set(0, ((String) vectorA.get(0)).substring(2));
                        }
                        n(vectorA, bufferedReader);
                        String str = (String) vectorA.get(0);
                        if (map.get(str) != null) {
                            str = (String) map.get(str);
                        }
                        HashMap map2 = (HashMap) this.b;
                        if (!map2.containsKey(str)) {
                            map2.put(str, new Vector());
                        }
                        ((Vector) map2.get(str)).add(vectorA);
                    }
                }
            } catch (OutOfMemoryError e2) {
                throw new C3438tb("File too large to parse: " + e2.getLocalizedMessage());
            }
        }
        throw new C3438tb("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R2.z(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public /* synthetic */ R2(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ R2(int i, boolean z) {
        this.a = i;
    }

    public R2(C3121nk c3121nk) {
        this.a = 2;
        this.b = c3121nk;
        this.c = m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public R2(C3121nk c3121nk, String str) {
        this(c3121nk);
        this.a = 2;
        C0360Uh c0360Uh = m;
        c0360Uh.c();
        this.c = c0360Uh;
        if (str == null) {
            return;
        }
        this.c = new PA(c3121nk.b(str, "userlog"));
    }

    public R2(TC tc) {
        this.a = 24;
        this.b = tc;
        this.c = new C0087Eg(tc, 0);
    }

    public R2(Animator animator) {
        this.a = 29;
        this.b = null;
        this.c = animator;
    }

    public R2(Application application) {
        this.a = 14;
        this.b = new ArrayList();
        this.c = application.getApplicationContext();
    }

    public R2(Context context, int i) throws Resources.NotFoundException {
        this.a = i;
        switch (i) {
            case 10:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0069Df.W(context, com.mxtunnel.pro.R.attr.materialCalendarStyle, Ut.class.getCanonicalName()).data, RA.o);
                C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
                ColorStateList colorStateListX = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 7);
                this.b = C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                this.c = C0108Fk.f(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(colorStateListX.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
            default:
                this.b = context;
                this.c = new P3(1);
                break;
        }
    }

    public R2(EditText editText, int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.b = editText;
                C3607wi c3607wi = new C3607wi(editText);
                this.c = c3607wi;
                editText.addTextChangedListener(c3607wi);
                if (C2954ki.b == null) {
                    synchronized (C2954ki.a) {
                        try {
                            if (C2954ki.b == null) {
                                C2954ki c2954ki = new C2954ki();
                                try {
                                    C2954ki.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2954ki.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                C2954ki.b = c2954ki;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(C2954ki.b);
                return;
            default:
                this.b = editText;
                this.c = new C2827iH(editText);
                return;
        }
    }

    public R2(ProgressBar progressBar) {
        this.a = 0;
        this.b = progressBar;
    }

    public /* synthetic */ R2(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ R2(Object obj, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ R2(Object obj, Object obj2, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public R2(String str, C3397so c3397so) {
        this.a = 22;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = c3397so;
        this.b = str;
    }
}
