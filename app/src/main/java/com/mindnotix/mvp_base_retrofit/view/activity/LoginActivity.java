package com.mindnotix.mvp_base_retrofit.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.mindnotix.mvp_base_retrofit.R;
import com.mindnotix.mvp_base_retrofit.adapter.CustomAdapter;
import com.mindnotix.mvp_base_retrofit.adapter.listener.IBaseCallback;
import com.mindnotix.mvp_base_retrofit.databinding.ActivityLoginBinding;
import com.mindnotix.mvp_base_retrofit.model.User;
import com.mindnotix.mvp_base_retrofit.presenter.LoginPresenter;
import com.mindnotix.mvp_base_retrofit.presenter.ipresenter.ILoginPresenter;
import com.mindnotix.mvp_base_retrofit.view.iview.ILoginView;

public class LoginActivity extends BaseActivity implements ILoginView, IBaseCallback {

    private ActivityLoginBinding loginBinding;
    private ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        setAssets();
        iLoginPresenter = new LoginPresenter(this, this);
        iLoginPresenter.onCreatePresenter(getIntent().getExtras());
    }

    private void setAssets() {
        loginBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setReyclerAdapter(CustomAdapter adapter) {
        loginBinding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(Object object) {
        if(object instanceof User){
            Toast.makeText(this, "clicked "+ ((User) object).getName(), Toast.LENGTH_SHORT).show();
        }
    }
}
