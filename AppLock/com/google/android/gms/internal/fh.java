package com.google.android.gms.internal;

import com.google.android.gms.internal.bp.C2711a;

public class fh extends ml {
    public fh(ez ezVar, String str, String str2, C2711a c2711a, int i, int i2) {
        super(ezVar, str, str2, c2711a, i, i2);
    }

    protected void mo3587a() {
        this.e.f8046e = Long.valueOf(-1);
        this.e.f8047f = Long.valueOf(-1);
        int[] iArr = (int[]) this.f.invoke(null, new Object[]{this.b.m10718a()});
        synchronized (this.e) {
            this.e.f8046e = Long.valueOf((long) iArr[0]);
            this.e.f8047f = Long.valueOf((long) iArr[1]);
        }
    }
}
