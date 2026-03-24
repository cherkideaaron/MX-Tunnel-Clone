package defpackage;

import android.view.View;
import rased.vpn.app.activities.FileDialog;

/* renamed from: bk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0549bk implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileDialog b;

    public /* synthetic */ ViewOnClickListenerC0549bk(FileDialog fileDialog, int i) {
        this.a = i;
        this.b = fileDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FileDialog fileDialog = this.b;
                if (fileDialog.w != null) {
                    fileDialog.getIntent().putExtra("RESULT_PATH", fileDialog.w.getPath());
                    fileDialog.setResult(-1, fileDialog.getIntent());
                    fileDialog.finish();
                    break;
                }
                break;
            case 1:
                FileDialog fileDialog2 = this.b;
                fileDialog2.f.setVisibility(0);
                fileDialog2.m.setVisibility(8);
                fileDialog2.d.hideSoftInputFromWindow(view.getWindowToken(), 0);
                fileDialog2.v.setEnabled(false);
                fileDialog2.n.setText("");
                fileDialog2.n.requestFocus();
                break;
            case 2:
                FileDialog fileDialog3 = this.b;
                fileDialog3.setResult(0, fileDialog3.getIntent());
                fileDialog3.finish();
                break;
            default:
                FileDialog fileDialog4 = this.b;
                if (fileDialog4.n.getText().length() > 0) {
                    fileDialog4.getIntent().putExtra("RESULT_PATH", fileDialog4.b + "/" + ((Object) fileDialog4.n.getText()));
                    fileDialog4.setResult(-1, fileDialog4.getIntent());
                    fileDialog4.finish();
                    break;
                }
                break;
        }
    }
}
