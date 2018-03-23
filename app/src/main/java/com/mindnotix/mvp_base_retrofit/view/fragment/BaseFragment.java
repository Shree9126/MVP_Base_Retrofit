package com.mindnotix.mvp_base_retrofit.view.fragment;

import android.os.Handler;
import android.support.v4.app.Fragment;

import com.mindnotix.mvp_base_retrofit.presenter.BasePresenter;
import com.mindnotix.mvp_base_retrofit.view.iview.IView;

/**
 * Created by Admin on 3/23/2018.
 */

public class BaseFragment extends Fragment implements IView {


    @Override
    public void showMessage(String msg) {
        ((IView) getActivity()).showMessage(msg);
    }

    @Override
    public Handler getHandler() {
        return ((IView) getActivity()).getHandler();
    }

    @Override
    public void bindPresenter(BasePresenter basePresenter) {

    }
}
