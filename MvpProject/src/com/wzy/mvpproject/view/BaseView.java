package com.wzy.mvpproject.view;

/**
 * VIew层接口
 */
public interface BaseView<T> {
	/**
     * 显示数据
     */
    void showData(T t);

    /***
     * 显示进度
     */
    void showLoading();

    /**
     * 隐藏进度
     */
    void hideLoading();
}
