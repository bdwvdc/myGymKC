package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class legCrunch extends AppCompatActivity {

    public Button legcrunchback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_crunch);

        legcrunchback = findViewById(R.id.legcrunchback);
        legcrunchback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash();
            }

        });

    }

    public void Splash() {

        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);
    }
}
