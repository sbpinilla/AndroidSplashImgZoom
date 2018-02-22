package co.com.spm.splashimg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appus.splash.Splash;

public class SplashIMG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_img);

        Splash.Builder splash = new Splash.Builder(this,null);
        splash.setBackgroundColor(getResources().getColor(R.color.blackColor));
        //splash.setBackgroundImage(getResources().getDrawable(R.drawable.img_github));

        splash.setSplashImage(getResources().getDrawable(R.drawable.img_github));
        splash.perform();

    }
}
