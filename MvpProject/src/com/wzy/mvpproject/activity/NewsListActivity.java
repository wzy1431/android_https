package com.wzy.mvpproject.activity;

import java.util.List;

import com.wzy.mvpproject.R;
import com.wzy.mvpproject.bean.News;
import com.wzy.mvpproject.presenter.NewsPresenter;
import com.wzy.mvpproject.view.BaseView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

public class NewsListActivity extends BaseActivity<BaseView<List<News>>, NewsPresenter> implements BaseView<List<News>> {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view 和 model绑定
        mPresenter.fetch();
    }

    @Override
    protected NewsPresenter createPresenter() {
        return new NewsPresenter();
    }

    @Override
    public void showData(List<News> news) {
    	Log.i("TAG", news+"");
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载中...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
    	Toast.makeText(this, "正在加载中...", Toast.LENGTH_SHORT).show();
    }
}
