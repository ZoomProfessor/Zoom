package com.zoom.wise.basepages;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * @author 李阳
 * @创建时间 2017-02-28  上午9:54
 * @描述 TODO
 * @ 当前版本:
 */
public class HomeBaseTagPager extends BaseTagPage {

    public HomeBaseTagPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        //设置本page的标题
        tv_title.setText("首页");

        //要展示的内容

        TextView tv=new TextView(mainActivity);
        tv.setText("首页的内容");
        tv.setTextSize(25);
        tv.setGravity(Gravity.CENTER);
        //替换掉白纸
        fl_content.addView(tv);

        //屏蔽左侧菜单按钮
        iv_menu.setVisibility(View.GONE);

        super.initData();
    }
}
