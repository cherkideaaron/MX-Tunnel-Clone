package net.openvpn.ovpn3;

/* loaded from: classes2.dex */
public class ClientAPI_Config {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_Config() {
        this(ovpncliJNI.new_ClientAPI_Config(), true);
    }

    public static long getCPtr(ClientAPI_Config clientAPI_Config) {
        if (clientAPI_Config == null) {
            return 0L;
        }
        return clientAPI_Config.swigCPtr;
    }

    public static long swigRelease(ClientAPI_Config clientAPI_Config) {
        if (clientAPI_Config == null) {
            return 0L;
        }
        if (!clientAPI_Config.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = clientAPI_Config.swigCPtr;
        clientAPI_Config.swigCMemOwn = false;
        clientAPI_Config.delete();
        return j;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_Config(j);
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

    public boolean getAllowLocalLanAccess() {
        return ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_get(this.swigCPtr, this);
    }

    public boolean getAltProxy() {
        return ovpncliJNI.ClientAPI_Config_altProxy_get(this.swigCPtr, this);
    }

    public boolean getAutologinSessions() {
        return ovpncliJNI.ClientAPI_Config_autologinSessions_get(this.swigCPtr, this);
    }

    public long getClockTickMS() {
        return ovpncliJNI.ClientAPI_Config_clockTickMS_get(this.swigCPtr, this);
    }

    public String getCompressionMode() {
        return ovpncliJNI.ClientAPI_Config_compressionMode_get(this.swigCPtr, this);
    }

    public int getConnTimeout() {
        return ovpncliJNI.ClientAPI_Config_connTimeout_get(this.swigCPtr, this);
    }

    public String getContent() {
        return ovpncliJNI.ClientAPI_Config_content_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t getContentList() {
        long jClientAPI_Config_contentList_get = ovpncliJNI.ClientAPI_Config_contentList_get(this.swigCPtr, this);
        if (jClientAPI_Config_contentList_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t(jClientAPI_Config_contentList_get, false);
    }

    public boolean getDco() {
        return ovpncliJNI.ClientAPI_Config_dco_get(this.swigCPtr, this);
    }

    public int getDefaultKeyDirection() {
        return ovpncliJNI.ClientAPI_Config_defaultKeyDirection_get(this.swigCPtr, this);
    }

    public boolean getDisableClientCert() {
        return ovpncliJNI.ClientAPI_Config_disableClientCert_get(this.swigCPtr, this);
    }

    public boolean getEcho() {
        return ovpncliJNI.ClientAPI_Config_echo_get(this.swigCPtr, this);
    }

    public String getExternalPkiAlias() {
        return ovpncliJNI.ClientAPI_Config_externalPkiAlias_get(this.swigCPtr, this);
    }

    public boolean getForceAesCbcCiphersuites() {
        return ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_get(this.swigCPtr, this);
    }

    public boolean getGoogleDnsFallback() {
        return ovpncliJNI.ClientAPI_Config_googleDnsFallback_get(this.swigCPtr, this);
    }

    public String getGremlinConfig() {
        return ovpncliJNI.ClientAPI_Config_gremlinConfig_get(this.swigCPtr, this);
    }

    public String getGuiVersion() {
        return ovpncliJNI.ClientAPI_Config_guiVersion_get(this.swigCPtr, this);
    }

    public String getHwAddrOverride() {
        return ovpncliJNI.ClientAPI_Config_hwAddrOverride_get(this.swigCPtr, this);
    }

    public boolean getInfo() {
        return ovpncliJNI.ClientAPI_Config_info_get(this.swigCPtr, this);
    }

    public String getIpv6() {
        return ovpncliJNI.ClientAPI_Config_ipv6_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t getPeerInfo() {
        long jClientAPI_Config_peerInfo_get = ovpncliJNI.ClientAPI_Config_peerInfo_get(this.swigCPtr, this);
        if (jClientAPI_Config_peerInfo_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t(jClientAPI_Config_peerInfo_get, false);
    }

    public String getPlatformVersion() {
        return ovpncliJNI.ClientAPI_Config_platformVersion_get(this.swigCPtr, this);
    }

    public String getPortOverride() {
        return ovpncliJNI.ClientAPI_Config_portOverride_get(this.swigCPtr, this);
    }

    public String getPrivateKeyPassword() {
        return ovpncliJNI.ClientAPI_Config_privateKeyPassword_get(this.swigCPtr, this);
    }

    public String getProtoOverride() {
        return ovpncliJNI.ClientAPI_Config_protoOverride_get(this.swigCPtr, this);
    }

    public int getProtoVersionOverride() {
        return ovpncliJNI.ClientAPI_Config_protoVersionOverride_get(this.swigCPtr, this);
    }

    public boolean getProxyAllowCleartextAuth() {
        return ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_get(this.swigCPtr, this);
    }

    public String getProxyHost() {
        return ovpncliJNI.ClientAPI_Config_proxyHost_get(this.swigCPtr, this);
    }

    public String getProxyPassword() {
        return ovpncliJNI.ClientAPI_Config_proxyPassword_get(this.swigCPtr, this);
    }

    public String getProxyPort() {
        return ovpncliJNI.ClientAPI_Config_proxyPort_get(this.swigCPtr, this);
    }

    public String getProxyUsername() {
        return ovpncliJNI.ClientAPI_Config_proxyUsername_get(this.swigCPtr, this);
    }

    public boolean getRetryOnAuthFailed() {
        return ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_get(this.swigCPtr, this);
    }

    public String getServerOverride() {
        return ovpncliJNI.ClientAPI_Config_serverOverride_get(this.swigCPtr, this);
    }

    public int getSslDebugLevel() {
        return ovpncliJNI.ClientAPI_Config_sslDebugLevel_get(this.swigCPtr, this);
    }

    public String getSsoMethods() {
        return ovpncliJNI.ClientAPI_Config_ssoMethods_get(this.swigCPtr, this);
    }

    public boolean getSynchronousDnsLookup() {
        return ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_get(this.swigCPtr, this);
    }

    public String getTlsCertProfileOverride() {
        return ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_get(this.swigCPtr, this);
    }

    public String getTlsCipherList() {
        return ovpncliJNI.ClientAPI_Config_tlsCipherList_get(this.swigCPtr, this);
    }

    public String getTlsCiphersuitesList() {
        return ovpncliJNI.ClientAPI_Config_tlsCiphersuitesList_get(this.swigCPtr, this);
    }

    public String getTlsVersionMinOverride() {
        return ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_get(this.swigCPtr, this);
    }

    public boolean getTunPersist() {
        return ovpncliJNI.ClientAPI_Config_tunPersist_get(this.swigCPtr, this);
    }

    public boolean getWintun() {
        return ovpncliJNI.ClientAPI_Config_wintun_get(this.swigCPtr, this);
    }

    public void setAllowLocalLanAccess(boolean z) {
        ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_set(this.swigCPtr, this, z);
    }

    public void setAltProxy(boolean z) {
        ovpncliJNI.ClientAPI_Config_altProxy_set(this.swigCPtr, this, z);
    }

    public void setAutologinSessions(boolean z) {
        ovpncliJNI.ClientAPI_Config_autologinSessions_set(this.swigCPtr, this, z);
    }

    public void setClockTickMS(long j) {
        ovpncliJNI.ClientAPI_Config_clockTickMS_set(this.swigCPtr, this, j);
    }

    public void setCompressionMode(String str) {
        ovpncliJNI.ClientAPI_Config_compressionMode_set(this.swigCPtr, this, str);
    }

    public void setConnTimeout(int i) {
        ovpncliJNI.ClientAPI_Config_connTimeout_set(this.swigCPtr, this, i);
    }

    public void setContent(String str) {
        ovpncliJNI.ClientAPI_Config_content_set(this.swigCPtr, this, str);
    }

    public void setContentList(SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t sWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t) {
        ovpncliJNI.ClientAPI_Config_contentList_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t.getCPtr(sWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t));
    }

    public void setDco(boolean z) {
        ovpncliJNI.ClientAPI_Config_dco_set(this.swigCPtr, this, z);
    }

    public void setDefaultKeyDirection(int i) {
        ovpncliJNI.ClientAPI_Config_defaultKeyDirection_set(this.swigCPtr, this, i);
    }

    public void setDisableClientCert(boolean z) {
        ovpncliJNI.ClientAPI_Config_disableClientCert_set(this.swigCPtr, this, z);
    }

    public void setEcho(boolean z) {
        ovpncliJNI.ClientAPI_Config_echo_set(this.swigCPtr, this, z);
    }

    public void setExternalPkiAlias(String str) {
        ovpncliJNI.ClientAPI_Config_externalPkiAlias_set(this.swigCPtr, this, str);
    }

    public void setForceAesCbcCiphersuites(boolean z) {
        ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_set(this.swigCPtr, this, z);
    }

    public void setGoogleDnsFallback(boolean z) {
        ovpncliJNI.ClientAPI_Config_googleDnsFallback_set(this.swigCPtr, this, z);
    }

    public void setGremlinConfig(String str) {
        ovpncliJNI.ClientAPI_Config_gremlinConfig_set(this.swigCPtr, this, str);
    }

    public void setGuiVersion(String str) {
        ovpncliJNI.ClientAPI_Config_guiVersion_set(this.swigCPtr, this, str);
    }

    public void setHwAddrOverride(String str) {
        ovpncliJNI.ClientAPI_Config_hwAddrOverride_set(this.swigCPtr, this, str);
    }

    public void setInfo(boolean z) {
        ovpncliJNI.ClientAPI_Config_info_set(this.swigCPtr, this, z);
    }

    public void setIpv6(String str) {
        ovpncliJNI.ClientAPI_Config_ipv6_set(this.swigCPtr, this, str);
    }

    public void setPeerInfo(SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t sWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t) {
        ovpncliJNI.ClientAPI_Config_peerInfo_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t.getCPtr(sWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t));
    }

    public void setPlatformVersion(String str) {
        ovpncliJNI.ClientAPI_Config_platformVersion_set(this.swigCPtr, this, str);
    }

    public void setPortOverride(String str) {
        ovpncliJNI.ClientAPI_Config_portOverride_set(this.swigCPtr, this, str);
    }

    public void setPrivateKeyPassword(String str) {
        ovpncliJNI.ClientAPI_Config_privateKeyPassword_set(this.swigCPtr, this, str);
    }

    public void setProtoOverride(String str) {
        ovpncliJNI.ClientAPI_Config_protoOverride_set(this.swigCPtr, this, str);
    }

    public void setProtoVersionOverride(int i) {
        ovpncliJNI.ClientAPI_Config_protoVersionOverride_set(this.swigCPtr, this, i);
    }

    public void setProxyAllowCleartextAuth(boolean z) {
        ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_set(this.swigCPtr, this, z);
    }

    public void setProxyHost(String str) {
        ovpncliJNI.ClientAPI_Config_proxyHost_set(this.swigCPtr, this, str);
    }

    public void setProxyPassword(String str) {
        ovpncliJNI.ClientAPI_Config_proxyPassword_set(this.swigCPtr, this, str);
    }

    public void setProxyPort(String str) {
        ovpncliJNI.ClientAPI_Config_proxyPort_set(this.swigCPtr, this, str);
    }

    public void setProxyUsername(String str) {
        ovpncliJNI.ClientAPI_Config_proxyUsername_set(this.swigCPtr, this, str);
    }

    public void setRetryOnAuthFailed(boolean z) {
        ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_set(this.swigCPtr, this, z);
    }

    public void setServerOverride(String str) {
        ovpncliJNI.ClientAPI_Config_serverOverride_set(this.swigCPtr, this, str);
    }

    public void setSslDebugLevel(int i) {
        ovpncliJNI.ClientAPI_Config_sslDebugLevel_set(this.swigCPtr, this, i);
    }

    public void setSsoMethods(String str) {
        ovpncliJNI.ClientAPI_Config_ssoMethods_set(this.swigCPtr, this, str);
    }

    public void setSynchronousDnsLookup(boolean z) {
        ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_set(this.swigCPtr, this, z);
    }

    public void setTlsCertProfileOverride(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_set(this.swigCPtr, this, str);
    }

    public void setTlsCipherList(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCipherList_set(this.swigCPtr, this, str);
    }

    public void setTlsCiphersuitesList(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCiphersuitesList_set(this.swigCPtr, this, str);
    }

    public void setTlsVersionMinOverride(String str) {
        ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_set(this.swigCPtr, this, str);
    }

    public void setTunPersist(boolean z) {
        ovpncliJNI.ClientAPI_Config_tunPersist_set(this.swigCPtr, this, z);
    }

    public void setWintun(boolean z) {
        ovpncliJNI.ClientAPI_Config_wintun_set(this.swigCPtr, this, z);
    }

    public ClientAPI_Config(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
