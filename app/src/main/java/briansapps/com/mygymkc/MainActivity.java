package briansapps.com.mygymkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




import briansapps.com.mygymkc.R;
import briansapps.com.mygymkc.Splash;

/*

Build a Gym KC App that tracks your progress woith each visit
Include MongoDB for storage
Create six buttons that each go to their page
Create a splash page at opening with a Mike Tyson pic
No log in/no PW
splash->six exercises + Progress bar at the top t->six exercises--->unique page and enter the data and save and go back to eight exercises


 */

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSplash();
            }
        });
    }

    public void openSplash(){

        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);
    }




}

