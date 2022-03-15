package com.example.smpn5tegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku9);
    }

    public void mtk9(View view) {
        goTourl("https://drive.google.com/file/d/1WFP_KccRUPb3CyKmwzvb9f-AAgwM45Wu/view?usp=sharing");
    }

    public void bin9(View view) {
        goTourl("https://drive.google.com/file/d/1Vv6yHaVZJRKk8hXtds1UER6s3xvRsDa2/view?usp=sharing");
    }

    public void bing9(View view) {
        goTourl("https://drive.google.com/file/d/1W2a1N9C-TdEJn7JWZenO9rDLZwkuEPir/view?usp=sharing");
    }

    public void ipa9(View view) {
        goTourl("https://drive.google.com/file/d/1W5l5DT3coLDPr8EpLCb0AmogF3fztWjB/view?usp=sharing");
    }

    public void ips9(View view) {
        goTourl("https://drive.google.com/file/d/1WlvCUen0MMEGq8lrxVucwOkntDJwYtPB/view?usp=sharing");
    }

    public void pai9(View view) {
        goTourl("https://drive.google.com/file/d/1WIH4l0vlpgcjV20f-CJrMkc33T5tP7WY/view?usp=sharing");
    }

    public void pjok9(View view) {
        goTourl("https://drive.google.com/file/d/1WR34GStdgTftGtMKH6nFR-dnzkwNMKNd/view?usp=sharing");
    }

    public void pkn9(View view) {
        goTourl("https://drive.google.com/file/d/1WZ7IbXuuBZzG0pO6qnf_vnDWC-D5qGU_/view?usp=sharing");
    }

    public void prakarya9(View view) {
        goTourl("https://drive.google.com/file/d/1WZ8ZK5q72ypgyZe5PiW5Y0ClEmDdchtc/view?usp=sharing");
    }

    public void sby9(View view) {
        goTourl("https://drive.google.com/file/d/1Wa1O_jc7H7ldkFhEv-rjQApn33T16dC7/view?usp=sharing");
    }

    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent LauncherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LauncherBrowser);
    }
}