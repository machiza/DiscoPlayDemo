package mz.co.hossiman.discoplaydemo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mz.co.hossiman.discoplaydemo.fragmentMusic.FragmentHiphop;
import mz.co.hossiman.discoplaydemo.fragmentMusic.FragmentJazz;
import mz.co.hossiman.discoplaydemo.fragmentMusic.FragmentMarrabenta;
import mz.co.hossiman.discoplaydemo.fragmentMusic.FragmentPandza;
import mz.co.hossiman.discoplaydemo.fragmentMusic.FragmentRock;

public class MusicActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        mTabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        mViewPager = (ViewPager) findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentHiphop(), "HipHop");
        adapter.addFragment(new FragmentMarrabenta(), "Marrabenta");
        adapter.addFragment(new FragmentJazz(), "Jazz");
        adapter.addFragment(new FragmentRock(), "Rock");
        adapter.addFragment(new FragmentPandza(), "Pandza");

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }

    public void btnBackOnClick(View view) {
        Intent intent = new Intent(MusicActivity.this, VisitActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
}
