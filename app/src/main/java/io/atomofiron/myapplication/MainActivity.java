package io.atomofiron.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.activity_btn_kek);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { onButtonKekClick(v); }
        });
    }

    private void onButtonKekClick(View v) {
    }
}
