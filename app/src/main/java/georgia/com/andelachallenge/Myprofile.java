package georgia.com.andelachallenge;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikhaellopez.circularimageview.CircularImageView;

import static georgia.com.andelachallenge.R.id.*;

public class Myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);

     /* //  CircularImageView circularImageView = findViewById(R.id.circularImageView);
// Set Circle color for transparent image
        circularImageView.setCircleColor(Color.WHITE);
// Set Border
        circularImageView.setBorderColor(Color.RED);
        circularImageView.setBorderWidth(10);
// Add Shadow with default param
        circularImageView.setShadowEnable(true);
// or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);
        //circularImageView.setBackgroundColor(Color.RED);
        circularImageView.setShadowGravity(CircularImageView.ShadowGravity.CENTER);*/
    }
}
