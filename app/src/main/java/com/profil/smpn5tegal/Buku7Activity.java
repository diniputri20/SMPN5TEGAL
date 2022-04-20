package com.profil.smpn5tegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mtk7(View view) {
        goTourl("https://drive.google.com/file/d/1R5h8H9nmJU72m9WITVZmBLdqwdnie0eV/view?usp=sharing");
    }

    public void bi7(View view) {
        goTourl("https://drive.google.com/file/d/1QJi9YctnB1aac2WLgm7j-7jEA-vzfwDQ/view?usp=sharing");

    }

    public void big7(View view) {
        goTourl("https://drive.google.com/file/d/1QMN-DaOtw7rA5IzRLBCLsljKgvxc3hMs/view?usp=sharing");
    }

    public void ipa7(View view) {
        goTourl("https://drive.google.com/file/d/1QNjkCap3sIVcqhwax4sjU6tJJdrNNi4I/view?usp=sharing");
    }

    public void ips7(View view) {
        goTourl("https://drive.google.com/file/d/1QTT70ghMSve9x1N8VKC14BUzWfJJhcrR/view?usp=sharing");
    }

    public void pai7(View view) {
        goTourl("https://drive.google.com/file/d/1QbEAk6y-Veee89ga4J9AQyC1xJ-4fmfo/view?usp=sharing");
    }

    public void pjok7(View view) {
        goTourl("https://drive.google.com/file/d/1IH2zX5IZNIUUjL-xHT3eOS2HE8QJDipw/view?usp=sharing");
    }

    public void pkn7(View view) {
        goTourl("https://drive.google.com/file/d/1IHQihHJPuT2Wjv6whNvwtgcXDXX_pjMO/view?usp=sharing\"");
    }

    public void prakarya7(View view) {
        goTourl("https://drive.google.com/file/d/1Qi51Er20t455i5hlLUDs91e6r8L1OW3L/view?usp=sharing");
    }

    public void sby7(View view) {
        goTourl("https://drive.google.com/file/d/1QkM2zZghoT0BJUKLZF2Bc42hwqwiy3G0/view?usp=sharing");
    }

    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent LauncherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LauncherBrowser);
    }
}