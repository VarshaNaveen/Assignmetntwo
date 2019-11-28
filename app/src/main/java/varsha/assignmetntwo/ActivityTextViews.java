package varsha.assignmetntwo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ActivityTextViews extends AppCompatActivity {

    TextInputEditText charcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);

        charcount = findViewById(R.id.edittext_char_count);
        charcount.setText("Charcter Count : "+charcount.getText().length());

    }
}
