package com.mindnotix.mvp_base_retrofit.view.activity;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mindnotix.mvp_base_retrofit.presenter.BasePresenter;
import com.mindnotix.mvp_base_retrofit.view.iview.IView;


/**
 * Created by Admin on 3/23/2018.
 */

public class BaseActivity extends AppCompatActivity implements IView {

    private Handler mHandler;
    private BasePresenter basePresenter;

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Handler getHandler() {

        synchronized (this) {
            if (mHandler == null) {
                mHandler = new Handler();
            }
        }

        return mHandler;
    }

    @Override
    public Activity getActivity() {
        return BaseActivity.this;
    }

    @Override
    public void bindPresenter(BasePresenter basePresenter) {
        this.basePresenter = basePresenter;
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (this.basePresenter != null)
            basePresenter.onResumePresenter();
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (this.basePresenter != null)
            basePresenter.onPausePresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (this.basePresenter != null)
            basePresenter.onStartPresenter();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (this.basePresenter != null)
            basePresenter.onStopPresenter();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (this.basePresenter != null)
            basePresenter.onRestartPresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.basePresenter != null)
            basePresenter.onDestroyPresenter();
    }
}
