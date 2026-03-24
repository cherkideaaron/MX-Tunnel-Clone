package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class Ls {
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    Ks mListener;
    Js mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        AbstractC0115Ga.f(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverResult(Object obj) {
        Ks ks = this.mListener;
        if (ks != null) {
            Os os = (Os) ks;
            os.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                os.h(obj);
            } else {
                os.i(obj);
            }
        }
    }

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public abstract void onStartLoading();

    public void registerListener(int i, Ks ks) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = ks;
        this.mId = i;
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AbstractC0115Ga.f(this, sb);
        sb.append(" id=");
        return AbstractC3264qG.j(sb, this.mId, "}");
    }

    public void unregisterListener(Ks ks) {
        Ks ks2 = this.mListener;
        if (ks2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (ks2 != ks) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(Js js) {
        throw new IllegalStateException("No listener register");
    }

    public void registerOnLoadCanceledListener(Js js) {
    }

    public void deliverCancellation() {
    }

    public void onAbandon() {
    }

    public void onReset() {
    }

    public void onStopLoading() {
    }
}
