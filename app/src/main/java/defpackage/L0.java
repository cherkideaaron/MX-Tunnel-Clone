package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.b;
import androidx.fragment.app.v;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.L0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ L0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        Bundle bundleCreateBundle = null;
        InterfaceC0452Zo interfaceC0452Zo = null;
        switch (this.a) {
            case 0:
                return new M0(parcel);
            case 1:
                C2648f3 c2648f3 = new C2648f3(parcel);
                c2648f3.a = parcel.readByte() != 0;
                return c2648f3;
            case 2:
                return new b(parcel);
            case 3:
                return new T6(parcel);
            case 4:
                return new C2871j8((C3512uv) parcel.readParcelable(C3512uv.class.getClassLoader()), (C3512uv) parcel.readParcelable(C3512uv.class.getClassLoader()), (C0018Af) parcel.readParcelable(C0018Af.class.getClassLoader()), (C3512uv) parcel.readParcelable(C3512uv.class.getClassLoader()), parcel.readInt());
            case 5:
                return new C0018Af(parcel.readLong());
            case 6:
                C0327Si c0327Si = new C0327Si();
                c0327Si.a = 0.0f;
                c0327Si.b = null;
                c0327Si.c = 0.0f;
                c0327Si.c = parcel.readFloat();
                c0327Si.a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    c0327Si.b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return c0327Si;
            case 7:
                C3503um c3503um = new C3503um();
                c3503um.a = parcel.readString();
                c3503um.b = parcel.readInt();
                return c3503um;
            case 8:
                C3719ym c3719ym = new C3719ym();
                c3719ym.e = null;
                c3719ym.f = new ArrayList();
                c3719ym.m = new ArrayList();
                c3719ym.a = parcel.createStringArrayList();
                c3719ym.b = parcel.createStringArrayList();
                c3719ym.c = (b[]) parcel.createTypedArray(b.CREATOR);
                c3719ym.d = parcel.readInt();
                c3719ym.e = parcel.readString();
                c3719ym.f = parcel.createStringArrayList();
                c3719ym.m = parcel.createTypedArrayList(T6.CREATOR);
                c3719ym.n = parcel.createTypedArrayList(C3503um.CREATOR);
                return c3719ym;
            case 9:
                return new v(parcel);
            case 10:
                AbstractC0500aq.m(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC0500aq.j(parcelable);
                return new C0317Rp((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                C2746gs c2746gs = new C2746gs();
                c2746gs.a = parcel.readInt();
                c2746gs.b = parcel.readInt();
                c2746gs.c = parcel.readInt() == 1;
                return c2746gs;
            case 12:
                Wt wt = new Wt(parcel);
                wt.a = ((Integer) parcel.readValue(Wt.class.getClassLoader())).intValue();
                return wt;
            case 13:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new L0(13);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 14:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(AbstractC3296qu.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.o = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 15:
                return new MediaMetadataCompat(parcel);
            case 16:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new L0(16);
                    public final MediaDescriptionCompat a;
                    public final long b;

                    {
                        this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.b);
                    }
                };
            case 17:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 18:
                final Parcelable parcelable2 = parcel.readParcelable(null);
                return new Parcelable(parcelable2) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new L0(18);
                    public final Object a;

                    {
                        this.a = parcelable2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = this.a;
                        Object obj3 = ((MediaSessionCompat$Token) obj).a;
                        if (obj2 == null) {
                            return obj3 == null;
                        }
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.a, i);
                    }
                };
            case 19:
                return C3512uv.a(parcel.readInt(), parcel.readInt());
            case 20:
                C0506aw c0506aw = new C0506aw(parcel);
                c0506aw.a = parcel.readInt();
                return c0506aw;
            case 21:
                return new ParcelImpl(parcel);
            case 22:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case ConnectionResult.API_DISABLED /* 23 */:
                return new PlaybackStateCompat(parcel);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                C0575cA c0575cA = new C0575cA(parcel);
                c0575cA.a = parcel.readFloat();
                c0575cA.b = parcel.readFloat();
                c0575cA.c = parcel.readByte() != 0;
                c0575cA.d = parcel.readFloat();
                c0575cA.e = parcel.readInt();
                c0575cA.f = parcel.readInt();
                c0575cA.m = parcel.readInt();
                c0575cA.n = parcel.readInt();
                c0575cA.o = parcel.readInt();
                c0575cA.p = parcel.readByte() != 0;
                c0575cA.q = parcel.readByte() != 0;
                return c0575cA;
            case 25:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 26:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new C0468aC(bundleCreateBundle);
            case 27:
                KC kc = new KC();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = JC.b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0452Zo.l);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0452Zo)) {
                        C0435Yo c0435Yo = new C0435Yo();
                        c0435Yo.a = strongBinder;
                        interfaceC0452Zo = c0435Yo;
                    } else {
                        interfaceC0452Zo = (InterfaceC0452Zo) iInterfaceQueryLocalInterface;
                    }
                }
                kc.a = interfaceC0452Zo;
                return kc;
            case 28:
                MG mg = new MG();
                mg.a = parcel.readInt();
                mg.b = parcel.readInt();
                mg.d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    mg.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return mg;
            default:
                NG ng = new NG();
                ng.a = parcel.readInt();
                ng.b = parcel.readInt();
                int i3 = parcel.readInt();
                ng.c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    ng.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                ng.e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    ng.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                ng.n = parcel.readInt() == 1;
                ng.o = parcel.readInt() == 1;
                ng.p = parcel.readInt() == 1;
                ng.m = parcel.readArrayList(MG.class.getClassLoader());
                return ng;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new M0[i];
            case 1:
                return new C2648f3[i];
            case 2:
                return new b[i];
            case 3:
                return new T6[i];
            case 4:
                return new C2871j8[i];
            case 5:
                return new C0018Af[i];
            case 6:
                return new C0327Si[i];
            case 7:
                return new C3503um[i];
            case 8:
                return new C3719ym[i];
            case 9:
                return new v[i];
            case 10:
                return new C0317Rp[i];
            case 11:
                return new C2746gs[i];
            case 12:
                return new Wt[i];
            case 13:
                return new MediaBrowserCompat$MediaItem[i];
            case 14:
                return new MediaDescriptionCompat[i];
            case 15:
                return new MediaMetadataCompat[i];
            case 16:
                return new MediaSessionCompat$QueueItem[i];
            case 17:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 18:
                return new MediaSessionCompat$Token[i];
            case 19:
                return new C3512uv[i];
            case 20:
                return new C0506aw[i];
            case 21:
                return new ParcelImpl[i];
            case 22:
                return new ParcelableVolumeInfo[i];
            case ConnectionResult.API_DISABLED /* 23 */:
                return new PlaybackStateCompat[i];
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new C0575cA[i];
            case 25:
                return new RatingCompat[i];
            case 26:
                return new C0468aC[i];
            case 27:
                return new KC[i];
            case 28:
                return new MG[i];
            default:
                return new NG[i];
        }
    }
}
