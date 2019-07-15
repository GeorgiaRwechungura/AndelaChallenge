package georgia.com.andelachallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void aboutAlc(View view) {

        Intent intent=new Intent(getApplicationContext(),AboutAlc.class);
        startActivity(intent);
    }

    public void myProfile(View view) {
        Intent intent=new Intent(getApplicationContext(),Myprofile.class);
        startActivity(intent);
    }
}
