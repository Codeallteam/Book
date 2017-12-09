package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show8);



        Intent i =  getIntent();
        String value = i.getStringExtra("take");

        TextView t = (TextView) findViewById(R.id.textView8);
        t.setText(value);

    }
}
