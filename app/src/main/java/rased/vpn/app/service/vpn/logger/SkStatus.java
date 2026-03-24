package rased.vpn.app.service.vpn.logger;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3264qG;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;

/* loaded from: classes2.dex */
public class SkStatus {
    static final int MAXLOGENTRIES = 1000;
    public static final String SSH_AUTHENTICATING = "AUTHENTICATING";
    public static final String SSH_CONNECTED = "CONNECTED";
    public static final String SSH_CONNECTING = "CONNECTING";
    public static final String SSH_DISCONNECTED = "DISCONNECTED";
    public static final String SSH_RECONECTANDO = "RECONECTANDO";
    public static final String SSH_STARTING = "STARTING";
    public static final String SSH_STOPPING = "STOPPING";
    public static final String SSH_WAITING = "WAITING";
    private static ConnectionStatus mLastLevel = ConnectionStatus.LEVEL_NOTCONNECTED;
    private static String mLaststatemsg = "";
    private static String mLaststate = "NOPROCESS";
    private static int mLastStateresid = R.string.state_noprocess;
    private static Intent mLastIntent = null;
    private static final LinkedList<LogItem> logbuffer = new LinkedList<>();
    private static Vector<LogListener> logListener = new Vector<>();
    private static Vector<StateListener> stateListener = new Vector<>();

    /* renamed from: rased.vpn.app.service.vpn.logger.SkStatus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$rased$vpn$app$service$vpn$logger$ConnectionStatus;

        static {
            int[] iArr = new int[ConnectionStatus.values().length];
            $SwitchMap$rased$vpn$app$service$vpn$logger$ConnectionStatus = iArr;
            try {
                iArr[ConnectionStatus.LEVEL_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum LogLevel {
        INFO(2),
        ERROR(-2),
        WARNING(1),
        VERBOSE(3),
        DEBUG(4);

        protected int mValue;

        LogLevel(int i) {
            this.mValue = i;
        }

        public static LogLevel getEnumByValue(int i) {
            if (i == -2) {
                return ERROR;
            }
            if (i == 1) {
                return WARNING;
            }
            if (i == 2) {
                return INFO;
            }
            if (i == 3) {
                return VERBOSE;
            }
            if (i != 4) {
                return null;
            }
            return DEBUG;
        }

        public int getInt() {
            return this.mValue;
        }
    }

    public interface LogListener {
        void newLog(LogItem logItem);

        void onClear();
    }

    public interface StateListener {
        void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent);
    }

    static {
        logInformation();
    }

    public static synchronized void addLogListener(LogListener logListener2) {
        if (!logListener.contains(logListener2)) {
            logListener.add(logListener2);
        }
    }

    public static synchronized void addStateListener(StateListener stateListener2) {
        if (!stateListener.contains(stateListener2)) {
            stateListener.add(stateListener2);
            String str = mLaststate;
            if (str != null) {
                stateListener2.updateState(str, mLaststatemsg, mLastStateresid, mLastLevel, mLastIntent);
            }
        }
    }

    public static synchronized void clearLog() {
        logbuffer.clear();
        logInformation();
        logInfo(R.string.clear_logs, new Object[0]);
        Iterator<LogListener> it = logListener.iterator();
        while (it.hasNext()) {
            it.next().onClear();
        }
    }

    public static String getLastCleanLogMessage(Context context) {
        String strConcat = mLaststatemsg;
        if (AnonymousClass1.$SwitchMap$rased$vpn$app$service$vpn$logger$ConnectionStatus[mLastLevel.ordinal()] == 1) {
            String[] strArrSplit = mLaststatemsg.split(",");
            if (strArrSplit.length >= 7) {
                Locale locale = Locale.US;
                strConcat = AbstractC3264qG.h(strArrSplit[1], " ", strArrSplit[6]);
            }
        }
        while (strConcat.endsWith(",")) {
            strConcat = strConcat.substring(0, strConcat.length() - 1);
        }
        String str = mLaststate;
        if (str.equals("NOPROCESS")) {
            return strConcat;
        }
        int i = mLastStateresid;
        if (i == R.string.state_waitconnectretry) {
            return context.getString(R.string.state_waitconnectretry, mLaststatemsg);
        }
        String string = context.getString(i);
        if (mLastStateresid == R.string.unknown_state) {
            strConcat = str.concat(strConcat);
        }
        if (strConcat.length() > 0) {
            string = AbstractC3264qG.g(string, ": ");
        }
        return AbstractC3264qG.g(string, strConcat);
    }

    public static String getLastState() {
        return mLaststate;
    }

    private static ConnectionStatus getLevel(String str) {
        String[] strArr = {SSH_STARTING, SSH_CONNECTING, SSH_WAITING, SSH_RECONECTANDO, "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {SSH_AUTHENTICATING, "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"};
        String[] strArr3 = {SSH_CONNECTED};
        String[] strArr4 = {SSH_DISCONNECTED};
        for (int i = 0; i < 6; i++) {
            if (str.equals(strArr[i])) {
                return ConnectionStatus.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (str.equals(strArr2[i2])) {
                return ConnectionStatus.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        return str.equals(strArr3[0]) ? ConnectionStatus.LEVEL_CONNECTED : str.equals(strArr4[0]) ? ConnectionStatus.LEVEL_NOTCONNECTED : ConnectionStatus.UNKNOWN_LEVEL;
    }

    public static int getLocalizedState(String str) {
        str.getClass();
        switch (str) {
            case "CONNECTED":
                return R.string.state_connected;
            case "STOPPING":
                return R.string.state_stopping;
            case "AUTHENTICATING":
                return R.string.state_auth;
            case "RECONECTANDO":
                return R.string.state_reconnecting;
            case "AUTH_PENDING":
                return R.string.state_auth_pending;
            case "GET_CONFIG":
                return R.string.state_get_config;
            case "CONNECTING":
                return R.string.state_connecting;
            case "ASSIGN_IP":
                return R.string.state_assign_ip;
            case "TCP_CONNECT":
                return R.string.state_tcp_connect;
            case "ADD_ROUTES":
                return R.string.state_add_routes;
            case "DISCONNECTED":
                return R.string.state_disconnected;
            case "RESOLVE":
                return R.string.state_resolve;
            case "WAITING":
                return R.string.state_nonetwork;
            case "STARTING":
                return R.string.connecting;
            default:
                return R.string.unknown_state;
        }
    }

    public static synchronized LogItem[] getlogbuffer() {
        LinkedList<LogItem> linkedList;
        linkedList = logbuffer;
        return (LogItem[]) linkedList.toArray(new LogItem[linkedList.size()]);
    }

    public static boolean isTunnelActive() {
        return (mLastLevel == ConnectionStatus.LEVEL_AUTH_FAILED || mLastLevel == ConnectionStatus.LEVEL_NOTCONNECTED) ? false : true;
    }

    public static void logDebug(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.DEBUG, i, objArr));
    }

    public static void logError(int i) {
        newLogItem(new LogItem(LogLevel.ERROR, i));
    }

    public static void logException(Exception exc) {
        logException(LogLevel.ERROR, null, exc);
    }

    public static void logInfo(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.INFO, i, objArr));
    }

    private static void logInformation() {
        logInfo(R.string.mobile_info, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE);
        logInfo(R.string.app_mobile_info, "", "");
    }

    public static void logWarning(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.WARNING, i, objArr));
    }

    public static void newLogItem(LogItem logItem) {
        newLogItem(logItem, false);
    }

    public static synchronized void removeLogListener(LogListener logListener2) {
        if (logListener.contains(logListener2)) {
            logListener.remove(logListener2);
        }
    }

    public static synchronized void removeStateListener(StateListener stateListener2) {
        if (stateListener.contains(stateListener2)) {
            stateListener.remove(stateListener2);
        }
    }

    public static void updateStateString(String str, String str2) {
        updateStateString(str, str2, getLocalizedState(str), getLevel(str));
    }

    public static void logDebug(String str) {
        newLogItem(new LogItem(LogLevel.DEBUG, str));
    }

    public static void logError(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.ERROR, i, objArr));
    }

    public static void logException(String str, Exception exc) {
        logException(LogLevel.ERROR, str, exc);
    }

    public static void logInfo(String str) {
        newLogItem(new LogItem(LogLevel.INFO, str));
    }

    public static void logWarning(String str) {
        newLogItem(new LogItem(LogLevel.WARNING, str));
    }

    public static synchronized void newLogItem(LogItem logItem, boolean z) {
        try {
            if (z) {
                logbuffer.addFirst(logItem);
            } else {
                logbuffer.addLast(logItem);
            }
            if (logbuffer.size() > 1500) {
                while (true) {
                    LinkedList<LogItem> linkedList = logbuffer;
                    if (linkedList.size() <= 1000) {
                        break;
                    } else {
                        linkedList.removeFirst();
                    }
                }
            }
            Iterator<LogListener> it = logListener.iterator();
            while (it.hasNext()) {
                it.next().newLog(logItem);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void updateStateString(String str, String str2, int i, ConnectionStatus connectionStatus) {
        updateStateString(str, str2, i, connectionStatus, null);
    }

    public static void logError(String str) {
        newLogItem(new LogItem(LogLevel.ERROR, str));
    }

    public static void logException(LogLevel logLevel, String str, Exception exc) {
        LogItem logItem;
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        if (str != null) {
            logItem = new LogItem(logLevel, str + ": " + exc.getMessage() + ", " + stringWriter.toString());
        } else {
            logItem = new LogItem(logLevel, "Erro: " + exc.getMessage() + ", " + stringWriter.toString());
        }
        newLogItem(logItem);
    }

    public static synchronized void updateStateString(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        if (mLastLevel != ConnectionStatus.LEVEL_CONNECTED || !str.equals(SSH_AUTHENTICATING)) {
            mLaststate = str;
            mLaststatemsg = str2;
            mLastStateresid = i;
            mLastLevel = connectionStatus;
            mLastIntent = intent;
            Iterator<StateListener> it = stateListener.iterator();
            while (it.hasNext()) {
                it.next().updateState(str, str2, i, connectionStatus, intent);
            }
            return;
        }
        newLogItem(new LogItem(LogLevel.DEBUG, "Ignoring SocksHttp Status in CONNECTED state (" + str + "->" + connectionStatus.toString() + "): " + str2));
    }
}
