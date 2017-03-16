package com.wzy.mvpproject.module;

/**
 * model 接口
 */
public interface INewsModel {
	/**
     * 加载数据
     */
    void loadGirls(GirlLoadOnListener<?> listener);

    /**
     * 回调监听，数据接收完成
     */
    interface GirlLoadOnListener<T> {
        //数据传递过来
        void onComplete(T t);
    }
//    interface GirlLoadOnListener {
//    	//数据传递过来
//    	void onComplete(List<News> news);
//    }
}
