package com.wzy.mvpproject.presenter;

import java.lang.ref.WeakReference;
/**
 * BasePresenter
 */
public class BasePresenter<T> {

	/**
     * View的弱引用
     */
    protected WeakReference<T> mViewRef;
    
    /**
     * 关联
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }

    /**
     * 得到VIew
     * @return
     */
    protected T getView() {
        return mViewRef.get();
    }
}
