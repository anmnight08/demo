package music.play.cool.base;

import android.content.Context;
import android.view.View;

public abstract class BasePager {
    public Context context;

    public View view;

    public BasePager(Context context) {

        this.context = context;
        view = initView();
    }


    /**
     * 显示布局
     */
    public abstract View initView();

    /**
     * 显示数据
     */
    public abstract Void initData();


    public View getRootView() {
        return view;

    }

}
