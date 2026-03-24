package net.openvpn.ovpn3;

/* loaded from: classes2.dex */
public class ClientAPI_ServerEntry {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_ServerEntry() {
        this(ovpncliJNI.new_ClientAPI_ServerEntry(), true);
    }

    public static long getCPtr(ClientAPI_ServerEntry clientAPI_ServerEntry) {
        if (clientAPI_ServerEntry == null) {
            return 0L;
        }
        return clientAPI_ServerEntry.swigCPtr;
    }

    public static long swigRelease(ClientAPI_ServerEntry clientAPI_ServerEntry) {
        if (clientAPI_ServerEntry == null) {
            return 0L;
        }
        if (!clientAPI_ServerEntry.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = clientAPI_ServerEntry.swigCPtr;
        clientAPI_ServerEntry.swigCMemOwn = false;
        clientAPI_ServerEntry.delete();
        return j;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ServerEntry(j);
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

    public String getFriendlyName() {
        return ovpncliJNI.ClientAPI_ServerEntry_friendlyName_get(this.swigCPtr, this);
    }

    public String getServer() {
        return ovpncliJNI.ClientAPI_ServerEntry_server_get(this.swigCPtr, this);
    }

    public void setFriendlyName(String str) {
        ovpncliJNI.ClientAPI_ServerEntry_friendlyName_set(this.swigCPtr, this, str);
    }

    public void setServer(String str) {
        ovpncliJNI.ClientAPI_ServerEntry_server_set(this.swigCPtr, this, str);
    }

    public ClientAPI_ServerEntry(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
