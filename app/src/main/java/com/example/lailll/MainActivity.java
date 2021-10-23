package com.example.lailll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.HttpCookie;

public class MainActivity<AppCompatActivity> extends AppCompatActivity {

    Button btnpanggil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpanggil = findViewByid(R.id.btn_panggil);

        btnpanggil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nomor="082324822892";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                String schome, fragment;
                memanggil.setData(Uri.fromParts( schome; "tel: ", nomor, fragment: null));
                startActivity(memanggil);
            }
        });
    }

    private void setContentView(int activity_main) {
    }

    private void startActivity(Intent memanggil) {
    }

    private Button findViewByid(int btn_panggil) {
    }

    public void cobabrowser(View view){
        String url="https://maps.app.goo.gl/V9dG6osQLAoHAmf79";
        Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
        HttpCookie uri = null;
        bukaBrowser.setData((Uri) uri.parse(url));
        startActivity(bukaBrowser);

    }
    
    public void email(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        String emailUri = "111202012653@MHS.DINUS.AC.ID";
        emailIntent.setType("message/rfc882");
        Intent chooser=Intent.createChooser(emailIntent,"send Email");
        startActivity(chooser);
                
    }
    
}