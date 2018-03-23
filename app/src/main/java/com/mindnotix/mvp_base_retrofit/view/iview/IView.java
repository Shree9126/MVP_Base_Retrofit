package com.mindnotix.mvp_base_retrofit.view.iview;

import android.app.Activity;
import android.os.Handler;

import com.mindnotix.mvp_base_retrofit.presenter.BasePresenter;

/**
 * Created by Admin on 3/23/2018.
 */

public interface IView {

    void showMessage(String msg);

    Handler getHandler();

    Activity getActivity();

    void bindPresenter(BasePresenter basePresenter);
}
