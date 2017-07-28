package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C2551a;
import com.google.android.gms.common.internal.safeparcel.C2551a.C2550a;
import com.google.android.gms.common.internal.safeparcel.C2552b;

public class C2478q implements Creator<Status> {
    static void m7804a(Status status, Parcel parcel, int i) {
        int a = C2552b.m8128a(parcel);
        C2552b.m8132a(parcel, 1, status.m7730e());
        C2552b.m8142a(parcel, 2, status.m7728c(), false);
        C2552b.m8137a(parcel, 3, status.m7727b(), i, false);
        C2552b.m8132a(parcel, 1000, status.f7263a);
        C2552b.m8129a(parcel, a);
    }

    public Status m7805a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int i = 0;
        int b = C2551a.m8100b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2551a.m8095a(parcel);
            switch (C2551a.m8094a(a)) {
                case 1:
                    i = C2551a.m8105d(parcel, a);
                    break;
                case 2:
                    str = C2551a.m8115n(parcel, a);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C2551a.m8097a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = C2551a.m8105d(parcel, a);
                    break;
                default:
                    C2551a.m8101b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Status(i2, i, str, pendingIntent);
        }
        throw new C2550a("Overread allowed size end=" + b, parcel);
    }

    public Status[] m7806a(int i) {
        return new Status[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7805a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7806a(i);
    }
}
