package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class benchPress extends AppCompatActivity {

    public Button benchpressback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench_press);

        benchpressback = findViewById(R.id.benchpressback);
        benchpressback.setOnClickListener(new View.OnClickListener() {
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
