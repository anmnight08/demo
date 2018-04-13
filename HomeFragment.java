package music.play.cool.fragment;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import music.play.cool.R;
import music.play.cool.base.BaseFragment;
import music.play.cool.base.BasePager;
import music.play.cool.pager.HomePager;
import music.play.cool.pager.MusicPager;
import music.play.cool.pager.SettingPager;
import music.play.cool.pager.WeChatPager;

public class HomeFragment extends BaseFragment {


    private RadioGroup mradio;
    /**
     * 存放界面的集合
     */
    private List<BasePager> pagers;
    private ViewPager mviewpager;

    @Override
    public View initView() {
        view = View.inflate(context, R.layout.activity_fragment, null);

        return view;
    }

    @Override
    public void initData() {
        mviewpager = view.findViewById(R.id.vp_homefragment_viewpager);
        mradio = (RadioGroup) view.findViewById(R.id.homefragment_radiogroup);
        //给Viewpager添加页面
        pagers = new ArrayList<BasePager>();
        pagers.clear();
        //添加界面的集合
        pagers.add(new WeChatPager(context));
        pagers.add(new HomePager(context));
        pagers.add(new MusicPager(context));
        pagers.add(new SettingPager(context));


        mviewpager.setAdapter(new MyPageAdapter());
                //设置默认显示页面
            mradio.check(R.id.rb_home);

        mradio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.wechat:
                        //聊天页面
                        mviewpager.setCurrentItem(0);
                        break;

                    case R.id.rb_home:
                        mviewpager.setCurrentItem(1);
                        //主页面
                        break;
                    case R.id.music:
                        //音乐圈页面
                        mviewpager.setCurrentItem(2);
                        break;
                    case R.id.setting:
                        //设置页面
                        mviewpager.setCurrentItem(3);
                        break;

                }


            }
        });


    }

    private class MyPageAdapter extends PagerAdapter {


        @Override
        public int getCount() {

            return pagers.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            //根据条目的位置获取相对应的页面
            View rootView = pagers.get(position).getRootView();
            container.addView(rootView);

            return rootView;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            // super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }


}
