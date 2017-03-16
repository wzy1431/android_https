package com.wzy.mvpproject.presenter;

import java.lang.ref.WeakReference;
/**
 * BasePresenter
 */
public class BasePresenter<T> {

	/**
     * View��������
     */
    protected WeakReference<T> mViewRef;
    
    /**
     * ����
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * �������
     */
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }

    /**
     * �õ�VIew
     * @return
     */
    protected T getView() {
        return mViewRef.get();
    }
}
