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
        //����presenter
        mPresenter = createPresenter();
        //��VIew
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //�����
        mPresenter.detachView();
    }

    //����Presenter
    protected abstract T createPresenter();
}
