package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show9);

        Intent i =  getIntent();
        String value = i.getStringExtra("take");

        TextView t = (TextView) findViewById(R.id.textView9);
        t.setText(value);
    }
}
