package xzp.fsh.org.mytheme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    WelActivity.this.startActivity(new Intent(WelActivity.this,MainActivity.class));
                }catch (Exception e){

                }

            }
        }).start();
    }
}
