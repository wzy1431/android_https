package com.wzy.mvpproject.module;

import java.util.ArrayList;
import java.util.List;

import com.wzy.mvpproject.bean.News;

/**
 * Model�ӿ�ʵ����
 */
public class NewsModelImpl implements INewsModel {

	//��������

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void loadGirls(GirlLoadOnListener listener) {
		List<News> dataList = new ArrayList<News>();
        for (int i = 0; i < 15; i++) {
            News g = new News();
            //��������õģ�����Ҫ
            g.setName("������is�ļ���" + i);
            g.setContent("������is���ٷ���˾���żٰ�����ʵ�ʵ÷�i11" + i);
            dataList.add(g);
        }
        listener.onComplete(dataList);
		
	}

}
