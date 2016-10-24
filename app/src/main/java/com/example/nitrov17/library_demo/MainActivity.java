package com.example.nitrov17.library_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.q42.android.scrollingimageview.ScrollingImageView;
import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollingImageView scrollingImageView =(ScrollingImageView) findViewById(R.id.scrolling_background);
        RippleBackground rippleBackground =(RippleBackground) findViewById(R.id.rb);
        //ImageView imageView = (ImageView) findViewById(R.id.image);
        ScrollingImageView scrollingImageView2 =(ScrollingImageView) findViewById(R.id.scrolling_foreground);
        scrollingImageView.start();
        scrollingImageView2.start();
        rippleBackground.startRippleAnimation();
    }
}
