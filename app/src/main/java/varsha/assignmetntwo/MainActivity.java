package varsha.assignmetntwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttons, textViews, animations, layout, assignmenttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = findViewById(R.id.buttons);
        textViews = findViewById(R.id.textView);
        animations = findViewById(R.id.animations);
        layout = findViewById(R.id.layout);
        assignmenttwo = findViewById(R.id.assignmenttwo);


        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbutton = new Intent(MainActivity.this, ActivityButtons.class);
                startActivity(intentbutton);
            }
        });

        textViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbutton = new Intent(MainActivity.this, ActivityTextViews.class);
                startActivity(intentbutton);
            }
        });

        animations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentanimation = new Intent(MainActivity.this, ActivityAnimations.class);
                startActivity(intentanimation);

            }
        });

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout = new Intent(MainActivity.this, ActivityLayout.class);
                startActivity(intentlayout);
            }
        });

        assignmenttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentassigntwo = new Intent(MainActivity.this, AssignmentTwo.class);
                startActivity(intentassigntwo);
            }
        });
    }
}
