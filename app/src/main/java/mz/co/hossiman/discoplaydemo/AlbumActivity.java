package mz.co.hossiman.discoplaydemo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mz.co.hossiman.discoplaydemo.fragmentAlbum.FragmentHiphop;
import mz.co.hossiman.discoplaydemo.fragmentAlbum.FragmentJazz;
import mz.co.hossiman.discoplaydemo.fragmentAlbum.FragmentMarrabenta;
import mz.co.hossiman.discoplaydemo.fragmentAlbum.FragmentPandza;
import mz.co.hossiman.discoplaydemo.fragmentAlbum.FragmentRock;

public class AlbumActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        tabLayout = (TabLayout) findViewById(R.id.tabLayoutId);
        viewPager = (ViewPager) findViewById(R.id.viewPagerId);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragment Here
        adapter.addFragment(new FragmentHiphop(), "HipHop");
        adapter.addFragment(new FragmentMarrabenta(), "Marrabenta");
        adapter.addFragment(new FragmentJazz(), "Jazz");
        adapter.addFragment(new FragmentRock(), "Rock");
        adapter.addFragment(new FragmentPandza(), "Pandza");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void btnBackOnClick(View view) {
        Intent intent = new Intent(AlbumActivity.this, VisitActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
}
