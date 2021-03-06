package com.mindnotix.mvp_base_retrofit.presenter.ipresenter;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Admin on 3/23/2018.
 */

public interface IPresenter {


    void onCreatePresenter(Bundle bundle);

    void onStartPresenter();

    void onStopPresenter();

    void onPausePresenter();

    void onResumePresenter();

    void onDestroyPresenter();

    void onRestartPresenter();

    void onActivityResultPresenter(int requestCode, int resultCode, Intent data);


}
