package music.play.cool;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import music.play.cool.fragment.HomeFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置添加Fragment
        setHomeFragMent();

    }

    private void setHomeFragMent() {

        HomeFragment homeFragment = new HomeFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_home, homeFragment, "Home")
                .commit();
    }
}
