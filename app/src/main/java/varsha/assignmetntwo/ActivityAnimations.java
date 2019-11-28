package varsha.assignmetntwo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityAnimations extends AppCompatActivity {


    Button fadeout,rotate,blink,zoomout;
    Animation animFadeOut,animBlink,animZoomOut,animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        fadeout = findViewById(R.id.fadeout);
        rotate = findViewById(R.id.rorate);
        blink = findViewById(R.id.blink);
        zoomout = findViewById(R.id.zoomout);


        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        // fade out
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeout.setVisibility(View.VISIBLE);
                fadeout.startAnimation(animFadeOut);
            }
        });

        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        // blink
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blink.setVisibility(View.VISIBLE);
                blink.startAnimation(animBlink);
            }
        });

        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_out);
        // Zoom Out
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomout.setVisibility(View.VISIBLE);
                zoomout.startAnimation(animZoomOut);
            }
        });

        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);

        // Rotate
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotate.startAnimation(animRotate);
            }
        });


    }


}
