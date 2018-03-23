package com.mindnotix.mvp_base_retrofit.presenter;

import android.content.Intent;
import android.util.Log;

import com.mindnotix.mvp_base_retrofit.presenter.ipresenter.IPresenter;
import com.mindnotix.mvp_base_retrofit.view.iview.IView;

/**
 * Created by Admin on 3/23/2018.
 */

public abstract class BasePresenter implements IPresenter {

    private static final String TAG = BasePresenter.class.getSimpleName();
    private IView iView;


   public BasePresenter(IView iView) {
        this.iView = iView;
        iView.bindPresenter(this);
    }

    @Override
    public void onStartPresenter() {
        Log.d(TAG, "onStartPresenter: ");
    }


    @Override
    public void onStopPresenter() {
        Log.d(TAG, "onStopPresenter: ");
    }

    @Override
    public void onPausePresenter() {

        Log.d(TAG, "onPausePresenter: ");
    }

    @Override
    public void onResumePresenter() {
        Log.d(TAG, "onResumePresenter ");

    }

    @Override
    public void onDestroyPresenter() {

        Log.d(TAG, "onDestroyPresenter: ");
    }

    @Override
    public void onActivityResultPresenter(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "onActivityResultPresenter: ");
    }

    @Override
    public void onRestartPresenter() {

    }
}
