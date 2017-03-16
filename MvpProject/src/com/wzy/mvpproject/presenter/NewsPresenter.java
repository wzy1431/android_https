package com.wzy.mvpproject.presenter;

import java.util.List;

import com.wzy.mvpproject.bean.News;
import com.wzy.mvpproject.module.INewsModel;
import com.wzy.mvpproject.module.NewsModelImpl;
import com.wzy.mvpproject.view.BaseView;

/**
 * <p>
 * 中间人
 * girls view 和 model 的桥梁
 * BaseView<T>  泛型根据要返回的对象进行封装
 */

public class NewsPresenter extends BasePresenter<BaseView<List<News>>> {

    private INewsModel mGirlModel = new NewsModelImpl();

    /**
     * view 和model bind
     */
    public void fetch() {
        //显示进度
        getView().showLoading();
        //获取数据
        mGirlModel.loadGirls(new INewsModel.GirlLoadOnListener<List<News>>() {
            @Override
            public void onComplete(List<News> girls) {
                //显示数据
                getView().showData(girls);
                //隐藏进度
                getView().hideLoading();
            }
        });
    }

}
