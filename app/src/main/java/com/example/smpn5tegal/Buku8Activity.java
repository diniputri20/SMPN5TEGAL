package com.example.smpn5tegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku8);
    }

    public void mtk8(View view) {
        goTourl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    public void bin8(View view) {
        goTourl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");

    }

    public void bing8(View view) {
        goTourl("https://drive.google.com/file/d/17ohLAJooXRxPksCppQPFyVcmzS0v64xS/view?usp=drivesdk");

    }

    public void ipa8(View view) {
    }

    public void ips8(View view) {
    }

    public void pai8(View view) {
    }

    public void pjok8(View view) {
    }

    public void pkn8(View view) {
    }

    public void prakarya8(View view) {
    }

    public void sby8(View view) {
    }

    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent LauncherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LauncherBrowser);
    }
}