package com.wzy.mvpproject.activity;

import com.wzy.mvpproject.presenter.BasePresenter;

import android.app.Activity;
import android.os.Bundle;

/**
 * BaseActivity
 */
public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity {

    protected T mPresenter;

    @SuppressWarnings("unchecked")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建presenter
        mPresenter = createPresenter();
        //绑定VIew
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定
        mPresenter.detachView();
    }

    //创建Presenter
    protected abstract T createPresenter();
}
