package io.atomofiron.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView label;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.activity_tv_label);
        button = findViewById(R.id.activity_btn_kek);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { onButtonKekClick(v); }
        });
    }

    private void onButtonKekClick(View v) {
        I.log(this, "kek");
        label.setText(getString(R.string.label_btn_clicked));
    }
}
