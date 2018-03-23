package com.mindnotix.mvp_base_retrofit.presenter;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.mindnotix.mvp_base_retrofit.adapter.CustomAdapter;
import com.mindnotix.mvp_base_retrofit.adapter.listener.IBaseCallback;
import com.mindnotix.mvp_base_retrofit.model.User;
import com.mindnotix.mvp_base_retrofit.presenter.ipresenter.ILoginPresenter;
import com.mindnotix.mvp_base_retrofit.view.iview.ILoginView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 3/23/2018.
 */

public class LoginPresenter extends BasePresenter implements ILoginPresenter{

    private ILoginView iLoginView;
    private CustomAdapter customAdapter;
    private IBaseCallback iBaseCallback;

    public LoginPresenter(ILoginView iLoginView,IBaseCallback iBaseCallback){
        super(iLoginView);
        this.iLoginView = iLoginView;
        this.iBaseCallback = iBaseCallback;
    }

    @Override
    public void onCreatePresenter(Bundle bundle) {

        iLoginView.getHandler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        setAdapterData();
                    iLoginView.showMessage("ashdkhkshadkfh");
                    }
                }
                , 3000);
    }

    private void setAdapterData() {

        List<User> mList= new ArrayList<>();
        mList.add( new User("Sree","Daran"));
        mList.add( new User("Mohan","Kuppan"));
        mList.add( new User("Perusu","ascac"));

        if(customAdapter == null){
            customAdapter = new CustomAdapter(mList,iBaseCallback);
        }else{
            customAdapter.refresh(mList);
        }
        iLoginView.setReyclerAdapter(customAdapter);
    }


}



