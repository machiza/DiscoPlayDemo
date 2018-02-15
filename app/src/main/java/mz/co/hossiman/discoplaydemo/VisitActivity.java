package mz.co.hossiman.discoplaydemo;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class VisitActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private ActionBarDrawerToggle mToggle;
    private Animation lesttoright, righttoleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);

        mDrawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToolbar = (Toolbar) findViewById(R.id.toobarVisit);
        mToggle = new ActionBarDrawerToggle(this,mDrawer, mToolbar, R.string.open, R.string.close);
        mDrawer.addDrawerListener(mToggle);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToggle.syncState();

        lesttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        righttoleft = AnimationUtils.loadAnimation(this, R.anim.righttoleft);

//        if (OurData.velho == 0) {
//            mDrawer.setAnimation(lesttoright);
//            OurData.velho += 1;
//        } else {
//            mDrawer.setAnimation(righttoleft);
//        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    public void btnMusicOnClick(View view) {
        Intent intent = new Intent(VisitActivity.this, MusicActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

    public void btnAlbumOnClick(View view) {
        Intent intent = new Intent(VisitActivity.this, AlbumActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

    public void btnTopOnClick(View view) {
        Intent intent = new Intent(VisitActivity.this, TopActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
}
