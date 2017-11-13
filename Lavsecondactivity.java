package com.example.ashwin.lavexplicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Ashwin on 8/30/2017.
 */

public class Lavsecondactivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        b1=(Button)findViewById(R.id.butt);
        b1.setText("Bla Bla Bla");
    }

}
