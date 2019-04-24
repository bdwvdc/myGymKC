package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class smithSquat extends AppCompatActivity {

    public Button smithsquatback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smith_squat);

        smithsquatback = findViewById(R.id.smithsquatback);
        smithsquatback.setOnClickListener(new View.OnClickListener() {
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
