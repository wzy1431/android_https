package com.wzy.mvpproject.view;

/**
 * VIew��ӿ�
 */
public interface BaseView<T> {
	/**
     * ��ʾ����
     */
    void showData(T t);

    /***
     * ��ʾ����
     */
    void showLoading();

    /**
     * ���ؽ���
     */
    void hideLoading();
}
