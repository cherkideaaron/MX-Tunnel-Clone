package cn.pedant.SweetAlert;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class Rotate3dAnimation extends Animation {
    public static final int ROLL_BY_X = 0;
    public static final int ROLL_BY_Y = 1;
    public static final int ROLL_BY_Z = 2;
    private Camera mCamera;
    private float mFromDegrees;
    private float mPivotX;
    private int mPivotXType;
    private float mPivotXValue;
    private float mPivotY;
    private int mPivotYType;
    private float mPivotYValue;
    private int mRollType;
    private float mToDegrees;

    public static class Description {
        public int type;
        public float value;
    }

    public Rotate3dAnimation(int i, float f, float f2) {
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        this.mRollType = i;
        this.mFromDegrees = f;
        this.mToDegrees = f2;
        this.mPivotX = 0.0f;
        this.mPivotY = 0.0f;
    }

    private void initializePivotPoint() {
        if (this.mPivotXType == 0) {
            this.mPivotX = this.mPivotXValue;
        }
        if (this.mPivotYType == 0) {
            this.mPivotY = this.mPivotYValue;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.mFromDegrees;
        float f3 = ((this.mToDegrees - f2) * f) + f2;
        Matrix matrix = transformation.getMatrix();
        this.mCamera.save();
        int i = this.mRollType;
        if (i == 0) {
            this.mCamera.rotateX(f3);
        } else if (i == 1) {
            this.mCamera.rotateY(f3);
        } else if (i == 2) {
            this.mCamera.rotateZ(f3);
        }
        this.mCamera.getMatrix(matrix);
        this.mCamera.restore();
        matrix.preTranslate(-this.mPivotX, -this.mPivotY);
        matrix.postTranslate(this.mPivotX, this.mPivotY);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.mCamera = new Camera();
        this.mPivotX = resolveSize(this.mPivotXType, this.mPivotXValue, i, i3);
        this.mPivotY = resolveSize(this.mPivotYType, this.mPivotYValue, i2, i4);
    }

    public Description parseValue(TypedValue typedValue) {
        Description description = new Description();
        if (typedValue == null) {
            description.type = 0;
            description.value = 0.0f;
        } else {
            int i = typedValue.type;
            if (i == 6) {
                int i2 = typedValue.data;
                description.type = (i2 & 15) == 1 ? 2 : 1;
                description.value = TypedValue.complexToFloat(i2);
                return description;
            }
            if (i == 4) {
                description.type = 0;
                description.value = typedValue.getFloat();
                return description;
            }
            if (i >= 16 && i <= 31) {
                description.type = 0;
                description.value = typedValue.data;
                return description;
            }
        }
        description.type = 0;
        description.value = 0.0f;
        return description;
    }

    public Rotate3dAnimation(int i, float f, float f2, float f3, float f4) {
        this.mRollType = i;
        this.mFromDegrees = f;
        this.mToDegrees = f2;
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = f3;
        this.mPivotYValue = f4;
        initializePivotPoint();
    }

    public Rotate3dAnimation(int i, float f, float f2, int i2, float f3, int i3, float f4) {
        this.mRollType = i;
        this.mFromDegrees = f;
        this.mToDegrees = f2;
        this.mPivotXValue = f3;
        this.mPivotXType = i2;
        this.mPivotYValue = f4;
        this.mPivotYType = i3;
        initializePivotPoint();
    }

    public Rotate3dAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Rotate3dAnimation);
        this.mFromDegrees = typedArrayObtainStyledAttributes.getFloat(R.styleable.Rotate3dAnimation_fromDeg, 0.0f);
        this.mToDegrees = typedArrayObtainStyledAttributes.getFloat(R.styleable.Rotate3dAnimation_toDeg, 0.0f);
        this.mRollType = typedArrayObtainStyledAttributes.getInt(R.styleable.Rotate3dAnimation_rollType, 0);
        Description value = parseValue(typedArrayObtainStyledAttributes.peekValue(R.styleable.Rotate3dAnimation_customPivotX));
        this.mPivotXType = value.type;
        this.mPivotXValue = value.value;
        Description value2 = parseValue(typedArrayObtainStyledAttributes.peekValue(R.styleable.Rotate3dAnimation_customPivotY));
        this.mPivotYType = value2.type;
        this.mPivotYValue = value2.value;
        typedArrayObtainStyledAttributes.recycle();
        initializePivotPoint();
    }
}
