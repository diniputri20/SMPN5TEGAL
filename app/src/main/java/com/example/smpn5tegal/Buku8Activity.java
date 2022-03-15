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
        goTourl("https://drive.google.com/file/d/1U-MMg75uBOYIOmRc77Bepxr9riIrwXz1/view?usp=sharing");

    }

    public void ips8(View view) {
        goTourl("https://drive.google.com/file/d/1VdtC2d8igkOYX1IAC8dteOyvWJyZoxtL/view?usp=sharing");

    }

    public void pai8(View view) {
        goTourl("https://drive.google.com/file/d/1VtvtHEMD9N0t_rg40CaB_wnC1ZyBBPl3/view?usp=sharing");

    }

    public void pjok8(View view) {
        goTourl("https://drive.google.com/file/d/1UI6h7y3c1ISx1wg32siJARstFtEoYSLr/view?usp=sharing");

    }

    public void pkn8(View view) {
        goTourl("https://drive.google.com/file/d/1WiuFjy6XwtWfPUKcWdNAn-WEGPW0dC7R/view?usp=sharing");

    }

    public void prakarya8(View view) {
        goTourl("https://drive.google.com/file/d/1Vlq9oo8qaQkNzACCgUNcmKfJRxm-oWrA/view?usp=sharing");

    }

    public void sby8(View view) {
        goTourl("https://drive.google.com/file/d/1U-MMg75uBOYIOmRc77Bepxr9riIrwXz1/view?usp=sharing");

    }

    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent LauncherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LauncherBrowser);
    }
}