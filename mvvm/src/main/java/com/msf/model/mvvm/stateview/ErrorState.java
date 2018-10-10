package com.msf.model.mvvm.stateview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.stock.equtity.dividend.mvvm.R;
import com.tqzhang.stateview.stateview.BaseStateControl;

public class ErrorState extends BaseStateControl {
    @Override
    protected int onCreateView() {
        return R.layout.common_empty_view;
    }

    @Override
    protected void onViewCreate(Context context, View view) {
        TextView errorDesc = view.findViewById(R.id.tv_error_desc);
        ImageView errorIcon = view.findViewById(R.id.iv_error_icon);
        if (view.getTag() != null) {
            if (view.getTag().equals("1")) {
                errorDesc.setText("网络不给力～_~");
                errorIcon.setImageResource(R.mipmap.empty_network);
            } else if (view.getTag().equals("2")) {
                errorDesc.setText("服务器异常");
                errorIcon.setImageResource(R.mipmap.empty_server);
            }

        }
    }

    @Override
    public boolean isVisible() {
        return super.isVisible();
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return false;
    }
}