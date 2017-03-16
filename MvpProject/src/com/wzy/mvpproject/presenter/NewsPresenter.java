package com.wzy.mvpproject.presenter;

import java.util.List;

import com.wzy.mvpproject.bean.News;
import com.wzy.mvpproject.module.INewsModel;
import com.wzy.mvpproject.module.NewsModelImpl;
import com.wzy.mvpproject.view.BaseView;

/**
 * <p>
 * �м���
 * girls view �� model ������
 * BaseView<T>  ���͸���Ҫ���صĶ�����з�װ
 */

public class NewsPresenter extends BasePresenter<BaseView<List<News>>> {

    private INewsModel mGirlModel = new NewsModelImpl();

    /**
     * view ��model bind
     */
    public void fetch() {
        //��ʾ����
        getView().showLoading();
        //��ȡ����
        mGirlModel.loadGirls(new INewsModel.GirlLoadOnListener<List<News>>() {
            @Override
            public void onComplete(List<News> girls) {
                //��ʾ����
                getView().showData(girls);
                //���ؽ���
                getView().hideLoading();
            }
        });
    }

}
