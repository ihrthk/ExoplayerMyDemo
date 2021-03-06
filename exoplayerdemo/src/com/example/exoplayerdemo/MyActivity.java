package com.example.exoplayerdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {

    private TextView go;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
    }

    private void initView() {
        go = (TextView) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = Environment.getExternalStorageDirectory() + "/video.mp4";
//                String url = "http://mvvideo2.meitudata.com/5450886dddd8e2048.mp4";

                Intent to = new Intent(MyActivity.this, SimplePlayerActivity.class);
                to.setData(Uri.parse(url));
                startActivity(to);

            }
        });
    }


}
