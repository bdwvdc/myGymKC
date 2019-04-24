package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {


    private Button exit;
    private Button dashboard;
    private Button benchPress;
    private Button overheadPress;
    private Button deadLift;
    private Button crunch;
    private Button legCrunch;
    private Button smithSquat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }

        });

        dashboard = findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboard();
            }

        });

        benchPress = findViewById(R.id.benchPress);
        benchPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                benchpress();
            }

        });

        overheadPress = findViewById(R.id.overheadPress);
        overheadPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overheadpress();
            }

        });

        deadLift = findViewById(R.id.deadLift);
        deadLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deadlift();
            }

        });

        crunch = findViewById(R.id.crunch);
        crunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Crunch();
            }

        });

        legCrunch = findViewById(R.id.legCrunch);
        legCrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legcrunch();
            }

        });

        smithSquat = findViewById(R.id.smithSquat);
        smithSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smithsquat();
            }

        });

    }
    public void exit() {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void dashboard() {

        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
    public void benchpress() {

        Intent intent = new Intent(this, benchPress.class);
        startActivity(intent);
    }

    public void overheadpress() {

        Intent intent = new Intent(this, overheadPress.class);
        startActivity(intent);
    }

    public void deadlift() {

        Intent intent = new Intent(this, deadLift.class);
        startActivity(intent);
    }

    public void Crunch() {

        Intent intent = new Intent(this, crunch.class);
        startActivity(intent);
    }

    public void legcrunch() {

        Intent intent = new Intent(this, legCrunch.class);
        startActivity(intent);
    }

    public void smithsquat() {

        Intent intent = new Intent(this, smithSquat.class);
        startActivity(intent);
    }



}
