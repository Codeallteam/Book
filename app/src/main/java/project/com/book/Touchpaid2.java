package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class Touchpaid2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_touchpaid2);

            Intent int0=getIntent();
            String holder=int0.getStringExtra("take");
            TextView t = (TextView) findViewById(R.id.textView);
            t.setText(holder);


            Button button= (Button) findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText textView= (EditText) findViewById(R.id.editText);




                    String text= textView.getText().toString();

                    Intent intent = getIntent();
                    intent.putExtra("name", text);
                    setResult(RESULT_OK, intent);
                    finish();





                }
            });


        }
    }
