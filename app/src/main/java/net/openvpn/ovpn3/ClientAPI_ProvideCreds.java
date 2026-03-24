package net.openvpn.ovpn3;

/* loaded from: classes2.dex */
public class ClientAPI_ProvideCreds {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_ProvideCreds() {
        this(ovpncliJNI.new_ClientAPI_ProvideCreds(), true);
    }

    public static long getCPtr(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        if (clientAPI_ProvideCreds == null) {
            return 0L;
        }
        return clientAPI_ProvideCreds.swigCPtr;
    }

    public static long swigRelease(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        if (clientAPI_ProvideCreds == null) {
            return 0L;
        }
        if (!clientAPI_ProvideCreds.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = clientAPI_ProvideCreds.swigCPtr;
        clientAPI_ProvideCreds.swigCMemOwn = false;
        clientAPI_ProvideCreds.delete();
        return j;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ProvideCreds(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public boolean getCachePassword() {
        return ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_get(this.swigCPtr, this);
    }

    public String getDynamicChallengeCookie() {
        return ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_get(this.swigCPtr, this);
    }

    public String getHttp_proxy_pass() {
        return ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_pass_get(this.swigCPtr, this);
    }

    public String getHttp_proxy_user() {
        return ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_user_get(this.swigCPtr, this);
    }

    public String getPassword() {
        return ovpncliJNI.ClientAPI_ProvideCreds_password_get(this.swigCPtr, this);
    }

    public boolean getReplacePasswordWithSessionID() {
        return ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_get(this.swigCPtr, this);
    }

    public String getResponse() {
        return ovpncliJNI.ClientAPI_ProvideCreds_response_get(this.swigCPtr, this);
    }

    public String getUsername() {
        return ovpncliJNI.ClientAPI_ProvideCreds_username_get(this.swigCPtr, this);
    }

    public void setCachePassword(boolean z) {
        ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_set(this.swigCPtr, this, z);
    }

    public void setDynamicChallengeCookie(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_set(this.swigCPtr, this, str);
    }

    public void setHttp_proxy_pass(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_pass_set(this.swigCPtr, this, str);
    }

    public void setHttp_proxy_user(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_user_set(this.swigCPtr, this, str);
    }

    public void setPassword(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_password_set(this.swigCPtr, this, str);
    }

    public void setReplacePasswordWithSessionID(boolean z) {
        ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_set(this.swigCPtr, this, z);
    }

    public void setResponse(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_response_set(this.swigCPtr, this, str);
    }

    public void setUsername(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_username_set(this.swigCPtr, this, str);
    }

    public ClientAPI_ProvideCreds(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
