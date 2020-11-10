package com.example.intelmplicitoamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_url =  null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_url = (EditText) findViewById(R.id.edt_url2);
    }

    public void enviarURL(View view) {

        String url = String.valueOf(edt_url.getText());
        Uri dirrecionweb = Uri.parse("geo:0,0?q=" +url);
        Intent intent = new Intent(Intent.ACTION_VIEW,dirrecionweb);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            //log.i();
        }
    }
}