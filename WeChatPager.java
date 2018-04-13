package music.play.cool.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import music.play.cool.R;
import music.play.cool.base.BasePager;

public class WeChatPager extends BasePager {

    /**
     * 聊天页面
     */
    public WeChatPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        TextView textView = new TextView(context);
        textView.setText("aaa");

        return textView;
    }

    @Override
    public Void initData() {
        return null;
    }
}
