package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    private Button dashboard;
    private Button benchPress;
    private Button overheadPress;
    private Button deadLift;
    private Button crunch;
    private Button legCrunch;
    private Button smithSquat;
    private Button exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



    }

}
