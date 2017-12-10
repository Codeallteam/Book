package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Show3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show3);

        Intent i =  getIntent();
        String value = i.getStringExtra("take");

        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(value);


    }


}
