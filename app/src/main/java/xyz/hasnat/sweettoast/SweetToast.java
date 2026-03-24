package xyz.hasnat.sweettoast;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes2.dex */
public class SweetToast {
    private static LayoutInflater layoutInflater;
    private static View myView;
    private static Toast toast;
    private static View view;

    public static void custom(Context context, String str, int i, int i2) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape);
        setToastText(str, DefaultRenderer.BACKGROUND_COLOR);
        setToastIcon(i);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i2);
    }

    public static void defaultLong(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    public static void defaultShort(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    public static void error(Context context, String str) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_close);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.setDuration(0);
        toast.show();
    }

    private static View inflateMyLayout(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflater = layoutInflaterFrom;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.toast_layout, (ViewGroup) null);
        view = viewInflate;
        return viewInflate;
    }

    public static void info(Context context, String str) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_info);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_info);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.setDuration(0);
        toast.show();
    }

    private static void setBackgroundLayout(int i) {
        ((LinearLayout) view.findViewById(R.id.toastLay)).setBackgroundResource(i);
    }

    private static ImageView setToastIcon(int i) {
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIcon);
        imageView.setImageResource(i);
        return imageView;
    }

    private static void setToastText(String str, int i) {
        TextView textView = (TextView) view.findViewById(R.id.toastTitle);
        textView.setText(str);
        textView.setTextColor(i);
    }

    public static void success(Context context, String str) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_success);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_done);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.setDuration(0);
        toast.show();
    }

    public static Toast supperCustom(Context context, String str, int i) {
        Toast toast2 = new Toast(context);
        toast = toast2;
        return toast2;
    }

    private static void waitingSec(int i) {
        new Handler().postDelayed(new Runnable() { // from class: xyz.hasnat.sweettoast.SweetToast.1
            @Override // java.lang.Runnable
            public void run() {
                SweetToast.toast.cancel();
            }
        }, i);
    }

    public static void warning(Context context, String str) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_warning);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_info);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.setDuration(0);
        toast.show();
    }

    public static void custom(Context context, String str, int i, int i2, int i3) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(i2);
        setToastText(str, i);
        setToastIcon(R.drawable.ic_done).setVisibility(8);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i3);
    }

    public static void error(Context context, String str, int i) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_close);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i);
    }

    public static void info(Context context, String str, int i) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_info);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_info);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i);
    }

    public static void success(Context context, String str, int i) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_success);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_done);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i);
    }

    public static void warning(Context context, String str, int i) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_warning);
        setToastText(str, -1);
        setToastIcon(R.drawable.ic_info);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i);
    }

    public static void custom(Context context, String str, int i, int i2, int i3, int i4) {
        myView = inflateMyLayout(context);
        setBackgroundLayout(i3);
        setToastText(str, i2);
        setToastIcon(i);
        Toast toast2 = new Toast(context);
        toast = toast2;
        toast2.setView(myView);
        toast.show();
        waitingSec(i4);
    }
}
