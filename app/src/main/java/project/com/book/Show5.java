package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show5);
        Intent intent=getIntent();


        String string= intent.getStringExtra("take");
        TextView textView=(TextView) findViewById(R.id.textView10);
        textView.setText(string);



    }
}
