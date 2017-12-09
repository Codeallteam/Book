package project.com.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class OnlineSearch extends AppCompatActivity {
WebView w;


 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_search);



        Button b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

EditText s=(EditText) findViewById(R.id.editText3);


                w=(WebView) findViewById(R.id.websearch);
                w.getSettings().setLoadsImagesAutomatically(true);
                String hold="https://www.vocabulary.com/dictionary/"+s.getText().toString();
                w.loadUrl(hold);

            }
        });


    }



}
