package music.play.cool.pager;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import music.play.cool.R;
import music.play.cool.adapter.MusicAdapter;
import music.play.cool.base.BasePager;
import music.play.cool.bean.Music;

/**
 * 主页
 */

public class HomePager extends BasePager {
    private List<Music> musicList;

    public HomePager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        initMusic();
        view = View.inflate(context, R.layout.home_pager, null);
        RecyclerView recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        MusicAdapter adapter = new MusicAdapter(musicList);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setAdapter(adapter);
        return view;
    }

    /**
     * 加载数据
     */
    private void initMusic() {
        musicList = new ArrayList<>();
        musicList.add(new Music("张三", R.drawable.channel1, R.drawable.home_press, "我是描述", "3000"));
        musicList.add(new Music("李四", R.drawable.channel1, R.drawable.home_press, "我是描述", "2800"));
        musicList.add(new Music("王五", R.drawable.channel1, R.drawable.home_press, "我是描述", "2550"));
    }

    @Override
    public Void initData() {
        return null;
    }
}
