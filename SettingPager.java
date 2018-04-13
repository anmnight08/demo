package music.play.cool.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import music.play.cool.base.BasePager;

/***
 * 设置页面
 */



public class SettingPager  extends BasePager {
    public SettingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        TextView textView = new TextView(context);
        textView.setText("设置页面");
        textView.setTextColor(Color.RED);
        textView.setTextSize(23);
        textView.setGravity(Gravity.CENTER);

        return textView;
    }

    @Override
    public Void initData() {
        return null;
    }
}
