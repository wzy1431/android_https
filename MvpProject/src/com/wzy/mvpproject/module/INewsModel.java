package com.wzy.mvpproject.module;

/**
 * model �ӿ�
 */
public interface INewsModel {
	/**
     * ��������
     */
    void loadGirls(GirlLoadOnListener<?> listener);

    /**
     * �ص����������ݽ������
     */
    interface GirlLoadOnListener<T> {
        //���ݴ��ݹ���
        void onComplete(T t);
    }
//    interface GirlLoadOnListener {
//    	//���ݴ��ݹ���
//    	void onComplete(List<News> news);
//    }
}
