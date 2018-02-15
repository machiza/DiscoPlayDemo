package mz.co.hossiman.discoplaydemo;

import android.content.Intent;
import android.support.design.widget.NavigationView;
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
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class VisitActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private ActionBarDrawerToggle mToggle;
    private Animation lesttoright, righttoleft;
    private View header;
    private NavigationView navigationView;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);

        mAuth = FirebaseAuth.getInstance();


        initVar();
        setHeaderNavigationView();

    }

    @Override
    protected void onStart() {
        super.onStart();


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

    public void initVar() {
        mDrawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToolbar = (Toolbar) findViewById(R.id.toobarVisit);
        navigationView = (NavigationView) findViewById(R.id.navigationViewId);
        header = navigationView.getHeaderView(0);

        mToggle = new ActionBarDrawerToggle(this,mDrawer, mToolbar, R.string.open, R.string.close);
        mDrawer.addDrawerListener(mToggle);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToggle.syncState();
    }

    public void setHeaderNavigationView() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        ImageView fotoUsuario = (ImageView) header.findViewById(R.id.ivUsuarioFoto);
        TextView nomeUsuario = (TextView) header.findViewById(R.id.txtUsuarioNome);
        TextView emailUsuario = (TextView) header.findViewById(R.id.txtUsuarioEmail);

        if (currentUser == null) {
            fotoUsuario.setImageResource(R.drawable.default_profile);
            nomeUsuario.setText("Utilizador convidado");
            emailUsuario.setText("Entre ou registe-se");
        }

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
