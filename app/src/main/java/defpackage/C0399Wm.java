package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* renamed from: Wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0399Wm implements Closeable {
    public static final String[] c = new String[0];
    public final /* synthetic */ int a;
    public final SQLiteClosable b;

    public /* synthetic */ C0399Wm(SQLiteClosable sQLiteClosable, int i) {
        this.a = i;
        this.b = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public void b(int i, byte[] bArr) {
        ((SQLiteProgram) this.b).bindBlob(i, bArr);
    }

    public void c(int i, double d) {
        ((SQLiteProgram) this.b).bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                break;
            default:
                ((SQLiteProgram) this.b).close();
                break;
        }
    }

    public void e(int i, long j) {
        ((SQLiteProgram) this.b).bindLong(i, j);
    }

    public void f(int i) {
        ((SQLiteProgram) this.b).bindNull(i);
    }

    public void g(int i, String str) {
        ((SQLiteProgram) this.b).bindString(i, str);
    }

    public void h() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void i(String str) throws SQLException {
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    public Cursor j(VH vh) {
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new C0382Vm(vh), vh.b(), c, null);
    }

    public Cursor k(String str) {
        return j(new C3337ri(str, 2));
    }

    public void l() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }
}
