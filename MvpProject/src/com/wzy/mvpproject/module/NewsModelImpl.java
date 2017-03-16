package com.wzy.mvpproject.module;

import java.util.ArrayList;
import java.util.List;

import com.wzy.mvpproject.bean.News;

/**
 * Model接口实现类
 */
public class NewsModelImpl implements INewsModel {

	//加载数据

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void loadGirls(GirlLoadOnListener listener) {
		List<News> dataList = new ArrayList<News>();
        for (int i = 0; i < 15; i++) {
            News g = new News();
            //内容随便敲的，不重要
            g.setName("案件发is的肌肤" + i);
            g.setContent("撒娇佛is戴假发老司机放假啊考虑实际得分i11" + i);
            dataList.add(g);
        }
        listener.onComplete(dataList);
		
	}

}
