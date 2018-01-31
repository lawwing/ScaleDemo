package cn.lawwing.scaledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ScaleTextView scaleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scaleTextView = (ScaleTextView) findViewById(R.id.scaleTextView);
        scaleTextView.setIsCanTouch(true);
    }
}
