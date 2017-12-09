package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show7);



        Intent i =  getIntent();
        String value = i.getStringExtra("take");

        TextView t = (TextView) findViewById(R.id.textView7);
        t.setText(value);


    }
}
