package varsha.assignmetntwo;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AssignmentTwo extends AppCompatActivity {


    Button submit_button;
    TextInputEditText input_edittext_name, input_edittext_phone, input_edittext_address, input_edittext_city, input_edittext_zip, input_edittext_email, input_edittext_dob;
    TextInputLayout input_layout_name, input_layout_phone, input_layout_area, input_layout_address, input_layout_city, input_layout_state, input_layout_zip, input_layout_email, input_layout_dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignmenttwo);

        init();


        String[] COUNTRIES = new String[]{"Item 1", "Item 2", "Item 3", "Item 4"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        getApplicationContext(),
                        R.layout.dropdown_menu,
                        COUNTRIES);

        Spinner editTextFilledExposedDropdown =
                findViewById(R.id.select_area);
        editTextFilledExposedDropdown.setAdapter(adapter);


        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input_edittext_name.getText().toString().equals("")) {
                    input_layout_name.setError("Please enter your name");
                } else {
                    input_layout_name.setError(null);
                }

                if (input_edittext_phone.getText().toString().equals("")) {
                    input_layout_phone.setError("Please enter your phone number");
                } else {
                    input_layout_phone.setError(null);
                }
//
//                if (input_edittext_phone.getText().toString().equals("")) {
//                    input_layout_phone.setError("Please enter your phone number");
//                } else {
//                    input_layout_phone.setError(null);
//                }


                if (input_edittext_address.getText().toString().equals("")) {
                    input_layout_address.setError("Please enter your address");
                } else {
                    input_layout_address.setError(null);
                }


                if (input_edittext_city.getText().toString().equals("")) {
                    input_layout_city.setError("Please enter your city");
                } else {
                    input_layout_city.setError(null);
                }

//                if (input_edittext_phone.getText().toString().equals("")) {
//                    input_layout_phone.setError("Please enter your phone number");
//                } else {
//                    input_layout_phone.setError(null);
//                }

                if (input_edittext_zip.getText().toString().equals("")) {
                    input_layout_zip.setError("Please enter your zip");
                } else {
                    input_layout_zip.setError(null);
                }

                if (input_edittext_email.getText().toString().equals("")) {
                    input_layout_email.setError("Please enter your email id");
                } else {
                    input_layout_email.setError(null);
                }

                if (input_edittext_dob.getText().toString().equals("")) {
                    input_layout_dob.setError("Please enter your birthday");
                } else {
                    input_layout_dob.setError(null);
                }

            }
        });


    }

    public void init() {
        submit_button = findViewById(R.id.submit_button);

        input_edittext_name = findViewById(R.id.input_edittext_name);
        input_edittext_phone = findViewById(R.id.input_edittext_phone);
        input_edittext_address = findViewById(R.id.input_edittext_address);
        input_edittext_city = findViewById(R.id.input_edittext_city);
        input_edittext_zip = findViewById(R.id.input_edittext_zip);
        input_edittext_email = findViewById(R.id.input_edittext_email);
        input_edittext_dob = findViewById(R.id.input_edittext_dob);

        input_layout_name = findViewById(R.id.input_layout_name);
        input_layout_phone = findViewById(R.id.input_layout_phone);
        input_layout_area = findViewById(R.id.input_layout_area);
        input_layout_address = findViewById(R.id.input_layout_address);
        input_layout_city = findViewById(R.id.input_layout_city);
        input_layout_state = findViewById(R.id.input_layout_state);
        input_layout_zip = findViewById(R.id.input_layout_zip);
        input_layout_email = findViewById(R.id.input_layout_email);
        input_layout_dob = findViewById(R.id.input_layout_dob);

    }
}