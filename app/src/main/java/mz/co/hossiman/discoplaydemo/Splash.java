package mz.co.hossiman.discoplaydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    private ImageView splashLogo;
    private ProgressBar splashProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashLogo = (ImageView) findViewById(R.id.splashLogo);
        splashProgress = (ProgressBar) findViewById(R.id.splashProgress);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransation);

        splashLogo.setAnimation(myanim);
        splashProgress.setAnimation(myanim);

        final Intent i = new Intent(this, VisitActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                    finish();
                }
            }
        };
        timer.start();
    }
}
