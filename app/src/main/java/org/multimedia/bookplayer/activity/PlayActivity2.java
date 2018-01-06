package org.multimedia.bookplayer.activity;


import android.os.Bundle;
import android.view.View;
import android.view.Window;

import org.multimedia.bookplayer.R;

public class PlayActivity2 extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onPublish(int progress) {

    }

    @Override
    public void onChange(int position) {

    }
}
