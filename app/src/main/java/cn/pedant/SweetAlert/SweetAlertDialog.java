package cn.pedant.SweetAlert;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pnikosis.materialishprogress.ProgressWheel;

/* loaded from: classes.dex */
public class SweetAlertDialog extends Dialog implements View.OnClickListener {
    public static final int BUTTON_CANCEL = -2;
    public static final int BUTTON_CONFIRM = -1;
    public static final int CUSTOM_IMAGE_TYPE = 4;
    public static boolean DARK_STYLE = false;
    public static final int ERROR_TYPE = 1;
    public static final int NORMAL_TYPE = 0;
    public static final int PROGRESS_TYPE = 5;
    public static final int SUCCESS_TYPE = 2;
    public static final int WARNING_TYPE = 3;
    private int contentTextSize;
    private final float defStrokeWidth;
    private int mAlertType;
    private LinearLayout mButtonsContainer;
    private Button mCancelButton;
    private Integer mCancelButtonBackgroundColor;
    private Integer mCancelButtonTextColor;
    private OnSweetClickListener mCancelClickListener;
    private String mCancelText;
    private boolean mCloseFromCancel;
    private Button mConfirmButton;
    private Integer mConfirmButtonBackgroundColor;
    private Integer mConfirmButtonTextColor;
    private OnSweetClickListener mConfirmClickListener;
    private String mConfirmText;
    private String mContentText;
    private TextView mContentTextView;
    private ImageView mCustomImage;
    private Drawable mCustomImgDrawable;
    private View mCustomView;
    private FrameLayout mCustomViewContainer;
    private View mDialogView;
    private FrameLayout mErrorFrame;
    private Animation mErrorInAnim;
    private ImageView mErrorX;
    private AnimationSet mErrorXInAnim;
    private boolean mHideConfirmButton;
    private boolean mHideKeyBoardOnDismiss;
    private AnimationSet mModalInAnim;
    private AnimationSet mModalOutAnim;
    private Button mNeutralButton;
    private Integer mNeutralButtonBackgroundColor;
    private Integer mNeutralButtonTextColor;
    private OnSweetClickListener mNeutralClickListener;
    private String mNeutralText;
    private Animation mOverlayOutAnim;
    private FrameLayout mProgressFrame;
    private ProgressHelper mProgressHelper;
    private boolean mShowCancel;
    private boolean mShowContent;
    private Animation mSuccessBowAnim;
    private FrameLayout mSuccessFrame;
    private AnimationSet mSuccessLayoutAnimSet;
    private View mSuccessLeftMask;
    private View mSuccessRightMask;
    private SuccessTickView mSuccessTick;
    private String mTitleText;
    private TextView mTitleTextView;
    private FrameLayout mWarningFrame;
    private float strokeWidth;

    public interface OnSweetClickListener {
        void onClick(SweetAlertDialog sweetAlertDialog);
    }

    public SweetAlertDialog(Context context) {
        this(context, 0);
    }

    private void adjustButtonContainerVisibility() {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.mButtonsContainer.getChildCount()) {
                z = false;
                break;
            }
            View childAt = this.mButtonsContainer.getChildAt(i);
            if ((childAt instanceof Button) && childAt.getVisibility() == 0) {
                z = true;
                break;
            }
            i++;
        }
        this.mButtonsContainer.setVisibility(z ? 0 : 8);
    }

    private void applyStroke() {
        if (Float.compare(this.defStrokeWidth, this.strokeWidth) != 0) {
            Resources resources = getContext().getResources();
            setButtonBackgroundColor(this.mConfirmButton, Integer.valueOf(resources.getColor(R.color.main_green_color)));
            setButtonBackgroundColor(this.mNeutralButton, Integer.valueOf(resources.getColor(R.color.main_disabled_color)));
            setButtonBackgroundColor(this.mCancelButton, Integer.valueOf(resources.getColor(R.color.red_btn_bg_color)));
        }
    }

    private int genStrokeColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSoftKeyboard() {
        InputMethodManager inputMethodManager;
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || (inputMethodManager = (InputMethodManager) ownerActivity.getSystemService("input_method")) == null || ownerActivity.getCurrentFocus() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(ownerActivity.getCurrentFocus().getWindowToken(), 0);
    }

    private void playAnimation() {
        View view;
        Animation animation;
        int i = this.mAlertType;
        if (i == 1) {
            this.mErrorFrame.startAnimation(this.mErrorInAnim);
            view = this.mErrorX;
            animation = this.mErrorXInAnim;
        } else {
            if (i != 2) {
                return;
            }
            this.mSuccessTick.startTickAnim();
            view = this.mSuccessRightMask;
            animation = this.mSuccessBowAnim;
        }
        view.startAnimation(animation);
    }

    private void restore() {
        this.mCustomImage.setVisibility(8);
        this.mErrorFrame.setVisibility(8);
        this.mSuccessFrame.setVisibility(8);
        this.mWarningFrame.setVisibility(8);
        this.mProgressFrame.setVisibility(8);
        this.mConfirmButton.setVisibility(this.mHideConfirmButton ? 8 : 0);
        adjustButtonContainerVisibility();
        this.mConfirmButton.setBackgroundResource(R.drawable.green_button_background);
        this.mErrorFrame.clearAnimation();
        this.mErrorX.clearAnimation();
        this.mSuccessTick.clearAnimation();
        this.mSuccessLeftMask.clearAnimation();
        this.mSuccessRightMask.clearAnimation();
    }

    private void setButtonBackgroundColor(Button button, Integer num) {
        Drawable[] drawable;
        if (button == null || num == null || (drawable = ViewUtils.getDrawable(button)) == null) {
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable[1];
        gradientDrawable.setColor(num.intValue());
        gradientDrawable.setStroke((int) this.strokeWidth, genStrokeColor(num.intValue()));
    }

    public static int spToPx(float f, Context context) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        dismissWithAnimation(true);
    }

    public void changeAlertType(int i) {
        changeAlertType(i, false);
    }

    public void dismissWithAnimation() {
        dismissWithAnimation(false);
    }

    public int getAlertType() {
        return this.mAlertType;
    }

    public Button getButton(int i) {
        return i != -3 ? i != -2 ? this.mConfirmButton : this.mCancelButton : this.mNeutralButton;
    }

    public Integer getCancelButtonBackgroundColor() {
        return this.mCancelButtonBackgroundColor;
    }

    public Integer getCancelButtonTextColor() {
        return this.mCancelButtonTextColor;
    }

    public String getCancelText() {
        return this.mCancelText;
    }

    public Integer getConfirmButtonBackgroundColor() {
        return this.mConfirmButtonBackgroundColor;
    }

    public Integer getConfirmButtonTextColor() {
        return this.mConfirmButtonTextColor;
    }

    public String getConfirmText() {
        return this.mConfirmText;
    }

    public String getContentText() {
        return this.mContentText;
    }

    public int getContentTextSize() {
        return this.contentTextSize;
    }

    public Integer getNeutralButtonBackgroundColor() {
        return this.mNeutralButtonBackgroundColor;
    }

    public Integer getNeutralButtonTextColor() {
        return this.mNeutralButtonTextColor;
    }

    public ProgressHelper getProgressHelper() {
        return this.mProgressHelper;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    public SweetAlertDialog hideConfirmButton() {
        this.mHideConfirmButton = true;
        return this;
    }

    public boolean isHideKeyBoardOnDismiss() {
        return this.mHideKeyBoardOnDismiss;
    }

    public boolean isShowCancelButton() {
        return this.mShowCancel;
    }

    public boolean isShowContentText() {
        return this.mShowContent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        r3.onClick(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        dismissWithAnimation();
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            int r0 = r3.getId()
            int r1 = cn.pedant.SweetAlert.R.id.cancel_button
            if (r0 != r1) goto L14
            cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener r3 = r2.mCancelClickListener
            if (r3 == 0) goto L10
        Lc:
            r3.onClick(r2)
            goto L2e
        L10:
            r2.dismissWithAnimation()
            goto L2e
        L14:
            int r0 = r3.getId()
            int r1 = cn.pedant.SweetAlert.R.id.confirm_button
            if (r0 != r1) goto L21
            cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener r3 = r2.mConfirmClickListener
            if (r3 == 0) goto L10
            goto Lc
        L21:
            int r3 = r3.getId()
            int r0 = cn.pedant.SweetAlert.R.id.neutral_button
            if (r3 != r0) goto L2e
            cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener r3 = r2.mNeutralClickListener
            if (r3 == 0) goto L10
            goto Lc
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.alert_dialog);
        this.mDialogView = getWindow().getDecorView().findViewById(android.R.id.content);
        this.mTitleTextView = (TextView) findViewById(R.id.title_text);
        this.mContentTextView = (TextView) findViewById(R.id.content_text);
        this.mCustomViewContainer = (FrameLayout) findViewById(R.id.custom_view_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.error_frame);
        this.mErrorFrame = frameLayout;
        this.mErrorX = (ImageView) frameLayout.findViewById(R.id.error_x);
        this.mSuccessFrame = (FrameLayout) findViewById(R.id.success_frame);
        this.mProgressFrame = (FrameLayout) findViewById(R.id.progress_dialog);
        this.mSuccessTick = (SuccessTickView) this.mSuccessFrame.findViewById(R.id.success_tick);
        this.mSuccessLeftMask = this.mSuccessFrame.findViewById(R.id.mask_left);
        this.mSuccessRightMask = this.mSuccessFrame.findViewById(R.id.mask_right);
        this.mCustomImage = (ImageView) findViewById(R.id.custom_image);
        this.mWarningFrame = (FrameLayout) findViewById(R.id.warning_frame);
        this.mButtonsContainer = (LinearLayout) findViewById(R.id.buttons_container);
        Button button = (Button) findViewById(R.id.confirm_button);
        this.mConfirmButton = button;
        button.setOnClickListener(this);
        Button button2 = this.mConfirmButton;
        View.OnTouchListener onTouchListener = Constants.FOCUS_TOUCH_LISTENER;
        button2.setOnTouchListener(onTouchListener);
        Button button3 = (Button) findViewById(R.id.cancel_button);
        this.mCancelButton = button3;
        button3.setOnClickListener(this);
        this.mCancelButton.setOnTouchListener(onTouchListener);
        Button button4 = (Button) findViewById(R.id.neutral_button);
        this.mNeutralButton = button4;
        button4.setOnClickListener(this);
        this.mNeutralButton.setOnTouchListener(onTouchListener);
        this.mProgressHelper.setProgressWheel((ProgressWheel) findViewById(R.id.progressWheel));
        setTitleText(this.mTitleText);
        setContentText(this.mContentText);
        setCustomView(this.mCustomView);
        setCancelText(this.mCancelText);
        setConfirmText(this.mConfirmText);
        setNeutralText(this.mNeutralText);
        applyStroke();
        setConfirmButtonBackgroundColor(this.mConfirmButtonBackgroundColor);
        setConfirmButtonTextColor(this.mConfirmButtonTextColor);
        setCancelButtonBackgroundColor(this.mCancelButtonBackgroundColor);
        setCancelButtonTextColor(this.mCancelButtonTextColor);
        setNeutralButtonBackgroundColor(this.mNeutralButtonBackgroundColor);
        setNeutralButtonTextColor(this.mNeutralButtonTextColor);
        changeAlertType(this.mAlertType, true);
    }

    @Override // android.app.Dialog
    public void onStart() {
        this.mDialogView.startAnimation(this.mModalInAnim);
        playAnimation();
    }

    public SweetAlertDialog setCancelButton(int i, OnSweetClickListener onSweetClickListener) {
        setCancelButton(getContext().getResources().getString(i), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setCancelButtonBackgroundColor(Integer num) {
        this.mCancelButtonBackgroundColor = num;
        setButtonBackgroundColor(this.mCancelButton, num);
        return this;
    }

    public SweetAlertDialog setCancelButtonTextColor(Integer num) {
        this.mCancelButtonTextColor = num;
        Button button = this.mCancelButton;
        if (button != null && num != null) {
            button.setTextColor(num.intValue());
        }
        return this;
    }

    public SweetAlertDialog setCancelClickListener(OnSweetClickListener onSweetClickListener) {
        this.mCancelClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setCancelText(String str) {
        this.mCancelText = str;
        if (this.mCancelButton != null && str != null) {
            showCancelButton(true);
            this.mCancelButton.setText(this.mCancelText);
        }
        return this;
    }

    public SweetAlertDialog setConfirmButton(int i, OnSweetClickListener onSweetClickListener) {
        setConfirmButton(getContext().getResources().getString(i), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setConfirmButtonBackgroundColor(Integer num) {
        this.mConfirmButtonBackgroundColor = num;
        setButtonBackgroundColor(this.mConfirmButton, num);
        return this;
    }

    public SweetAlertDialog setConfirmButtonTextColor(Integer num) {
        this.mConfirmButtonTextColor = num;
        Button button = this.mConfirmButton;
        if (button != null && num != null) {
            button.setTextColor(num.intValue());
        }
        return this;
    }

    public SweetAlertDialog setConfirmClickListener(OnSweetClickListener onSweetClickListener) {
        this.mConfirmClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setConfirmText(String str) {
        this.mConfirmText = str;
        Button button = this.mConfirmButton;
        if (button != null && str != null) {
            button.setText(str);
        }
        return this;
    }

    public SweetAlertDialog setContentText(String str) {
        this.mContentText = str;
        if (this.mContentTextView != null && str != null) {
            showContentText(true);
            if (this.contentTextSize != 0) {
                this.mContentTextView.setTextSize(0, spToPx(r4, getContext()));
            }
            this.mContentTextView.setText(Html.fromHtml(this.mContentText));
            this.mContentTextView.setVisibility(0);
            this.mCustomViewContainer.setVisibility(8);
        }
        return this;
    }

    public SweetAlertDialog setContentTextSize(int i) {
        this.contentTextSize = i;
        return this;
    }

    public SweetAlertDialog setCustomImage(int i) {
        return setCustomImage(getContext().getResources().getDrawable(i));
    }

    public SweetAlertDialog setCustomView(View view) {
        FrameLayout frameLayout;
        this.mCustomView = view;
        if (view != null && (frameLayout = this.mCustomViewContainer) != null) {
            frameLayout.addView(view);
            this.mCustomViewContainer.setVisibility(0);
            this.mContentTextView.setVisibility(8);
        }
        return this;
    }

    public SweetAlertDialog setHideKeyBoardOnDismiss(boolean z) {
        this.mHideKeyBoardOnDismiss = z;
        return this;
    }

    public SweetAlertDialog setNeutralButton(int i, OnSweetClickListener onSweetClickListener) {
        setNeutralButton(getContext().getResources().getString(i), onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setNeutralButtonBackgroundColor(Integer num) {
        this.mNeutralButtonBackgroundColor = num;
        setButtonBackgroundColor(this.mNeutralButton, num);
        return this;
    }

    public SweetAlertDialog setNeutralButtonTextColor(Integer num) {
        this.mNeutralButtonTextColor = num;
        Button button = this.mNeutralButton;
        if (button != null && num != null) {
            button.setTextColor(num.intValue());
        }
        return this;
    }

    public SweetAlertDialog setNeutralClickListener(OnSweetClickListener onSweetClickListener) {
        this.mNeutralClickListener = onSweetClickListener;
        return this;
    }

    public SweetAlertDialog setNeutralText(String str) {
        this.mNeutralText = str;
        if (this.mNeutralButton != null && str != null && !str.isEmpty()) {
            this.mNeutralButton.setVisibility(0);
            this.mNeutralButton.setText(this.mNeutralText);
        }
        return this;
    }

    public SweetAlertDialog setStrokeWidth(float f) {
        this.strokeWidth = spToPx(f, getContext());
        return this;
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        setTitleText(getContext().getResources().getString(i));
    }

    public SweetAlertDialog setTitleText(int i) {
        return setTitleText(getContext().getResources().getString(i));
    }

    public SweetAlertDialog showCancelButton(boolean z) {
        this.mShowCancel = z;
        Button button = this.mCancelButton;
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
        return this;
    }

    public SweetAlertDialog showContentText(boolean z) {
        this.mShowContent = z;
        TextView textView = this.mContentTextView;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        return this;
    }

    public SweetAlertDialog(Context context, int i) throws Resources.NotFoundException {
        super(context, DARK_STYLE ? R.style.alert_dialog_dark : R.style.alert_dialog_light);
        this.mHideConfirmButton = false;
        this.mHideKeyBoardOnDismiss = true;
        this.contentTextSize = 0;
        this.strokeWidth = 0.0f;
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        float dimension = getContext().getResources().getDimension(R.dimen.buttons_stroke_width);
        this.defStrokeWidth = dimension;
        this.strokeWidth = dimension;
        this.mProgressHelper = new ProgressHelper(context);
        this.mAlertType = i;
        this.mErrorInAnim = OptAnimationLoader.loadAnimation(getContext(), R.anim.error_frame_in);
        this.mErrorXInAnim = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.error_x_in);
        this.mSuccessBowAnim = OptAnimationLoader.loadAnimation(getContext(), R.anim.success_bow_roate);
        this.mSuccessLayoutAnimSet = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.success_mask_layout);
        this.mModalInAnim = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.modal_in);
        AnimationSet animationSet = (AnimationSet) OptAnimationLoader.loadAnimation(getContext(), R.anim.modal_out);
        this.mModalOutAnim = animationSet;
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SweetAlertDialog.this.mDialogView.setVisibility(8);
                if (SweetAlertDialog.this.mHideKeyBoardOnDismiss) {
                    SweetAlertDialog.this.hideSoftKeyboard();
                }
                SweetAlertDialog.this.mDialogView.post(new Runnable() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SweetAlertDialog.this.mCloseFromCancel) {
                            SweetAlertDialog.super.cancel();
                        } else {
                            SweetAlertDialog.super.dismiss();
                        }
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        Animation animation = new Animation() { // from class: cn.pedant.SweetAlert.SweetAlertDialog.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                WindowManager.LayoutParams attributes = SweetAlertDialog.this.getWindow().getAttributes();
                attributes.alpha = 1.0f - f;
                SweetAlertDialog.this.getWindow().setAttributes(attributes);
            }
        };
        this.mOverlayOutAnim = animation;
        animation.setDuration(120L);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void changeAlertType(int r5, boolean r6) {
        /*
            r4 = this;
            r4.mAlertType = r5
            android.view.View r5 = r4.mDialogView
            if (r5 == 0) goto L76
            if (r6 != 0) goto Lb
            r4.restore()
        Lb:
            android.widget.Button r5 = r4.mConfirmButton
            boolean r0 = r4.mHideConfirmButton
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            r5.setVisibility(r0)
            int r5 = r4.mAlertType
            r0 = 1
            if (r5 == r0) goto L6b
            r3 = 2
            if (r5 == r3) goto L43
            r0 = 3
            if (r5 == r0) goto L3d
            r0 = 4
            if (r5 == r0) goto L37
            r0 = 5
            if (r5 == r0) goto L2c
            goto L6e
        L2c:
            android.widget.FrameLayout r5 = r4.mProgressFrame
            r5.setVisibility(r2)
            android.widget.Button r5 = r4.mConfirmButton
            r5.setVisibility(r1)
            goto L6e
        L37:
            android.graphics.drawable.Drawable r5 = r4.mCustomImgDrawable
            r4.setCustomImage(r5)
            goto L6e
        L3d:
            android.widget.FrameLayout r5 = r4.mWarningFrame
        L3f:
            r5.setVisibility(r2)
            goto L6e
        L43:
            android.widget.FrameLayout r5 = r4.mSuccessFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.mSuccessLeftMask
            android.view.animation.AnimationSet r1 = r4.mSuccessLayoutAnimSet
            java.util.List r1 = r1.getAnimations()
            java.lang.Object r1 = r1.get(r2)
            android.view.animation.Animation r1 = (android.view.animation.Animation) r1
            r5.startAnimation(r1)
            android.view.View r5 = r4.mSuccessRightMask
            android.view.animation.AnimationSet r1 = r4.mSuccessLayoutAnimSet
            java.util.List r1 = r1.getAnimations()
            java.lang.Object r0 = r1.get(r0)
            android.view.animation.Animation r0 = (android.view.animation.Animation) r0
            r5.startAnimation(r0)
            goto L6e
        L6b:
            android.widget.FrameLayout r5 = r4.mErrorFrame
            goto L3f
        L6e:
            r4.adjustButtonContainerVisibility()
            if (r6 != 0) goto L76
            r4.playAnimation()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void");
    }

    private void dismissWithAnimation(boolean z) {
        this.mCloseFromCancel = z;
        ((ViewGroup) this.mDialogView).getChildAt(0).startAnimation(this.mOverlayOutAnim);
        this.mDialogView.startAnimation(this.mModalOutAnim);
    }

    public SweetAlertDialog setCancelButton(String str, OnSweetClickListener onSweetClickListener) {
        setCancelText(str);
        setCancelClickListener(onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setConfirmButton(String str, OnSweetClickListener onSweetClickListener) {
        setConfirmText(str);
        setConfirmClickListener(onSweetClickListener);
        return this;
    }

    public SweetAlertDialog setCustomImage(Drawable drawable) {
        this.mCustomImgDrawable = drawable;
        ImageView imageView = this.mCustomImage;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.mCustomImage.setImageDrawable(this.mCustomImgDrawable);
        }
        return this;
    }

    public SweetAlertDialog setNeutralButton(String str, OnSweetClickListener onSweetClickListener) {
        setNeutralText(str);
        setNeutralClickListener(onSweetClickListener);
        return this;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        setTitleText(charSequence.toString());
    }

    public SweetAlertDialog setTitleText(String str) {
        this.mTitleText = str;
        if (this.mTitleTextView != null && str != null) {
            if (str.isEmpty()) {
                this.mTitleTextView.setVisibility(8);
            } else {
                this.mTitleTextView.setVisibility(0);
                this.mTitleTextView.setText(Html.fromHtml(this.mTitleText));
            }
        }
        return this;
    }
}
