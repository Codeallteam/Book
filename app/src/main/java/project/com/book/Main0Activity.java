package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        Intent intent= getIntent();

        String s= intent.getStringExtra("take");
        TextView t  = (TextView) findViewById(R.id.textView4);
        t.setText(s);





    }
}
