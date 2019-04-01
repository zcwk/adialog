package com.zdzyc.adialog.listener;

import android.view.View;

import com.zdzyc.adialog.base.BindViewHolder;
import com.zdzyc.adialog.TDialog;

public interface OnViewClickListener {
    void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog);
}
