package com.domobile.eframe.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.domobile.eframe.ui.C1232b.C1243a;

public class NotifyChangedTextView extends TextView implements C1232b {
    private C1243a mSizeChangedListener;

    public NotifyChangedTextView(Context context) {
        super(context);
    }

    public NotifyChangedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mSizeChangedListener != null) {
            this.mSizeChangedListener.m2927a(this, i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(C1243a c1243a) {
        this.mSizeChangedListener = c1243a;
    }
}
