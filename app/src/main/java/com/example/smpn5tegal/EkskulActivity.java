package com.example.smpn5tegal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.ekstrakulikuler,
            R.drawable.ekstrakulikuler,
            R.drawable.ekstrakulikuler};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void pramuka(View view) {
        Intent intent = new Intent(EkskulActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void teater(View view) {
        Intent intent = new Intent(EkskulActivity.this, TeaterActivity.class);
        startActivity(intent);
    }

    public void voly(View view) {
        Intent intent = new Intent(EkskulActivity.this, VolyActivity.class);
        startActivity(intent);
    }

    public void pencaksilat(View view) {
        Intent intent = new Intent(EkskulActivity.this, PencaksilatActivity.class);
        startActivity(intent);
    }

    public void paskib(View view) {
        Intent intent = new Intent(EkskulActivity.this, PaskibActivity.class);
        startActivity(intent);
    }
}
