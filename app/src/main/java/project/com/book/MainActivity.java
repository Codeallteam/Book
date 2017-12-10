package project.com.book;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
@Override
public  boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main,menu);
return true;
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        if(id==R.id.setting){
            Intent intent= new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(intent);

 //Calling Intend
        }

        if(id==R.id.websearchtag){
            Intent intent= new Intent(MainActivity.this,OnlineSearch.class);
            startActivity(intent);
        }

        if(id==R.id.paint){
            Intent intent= new Intent(MainActivity.this,Touchpaid.class);
            startActivity(intent);
        }


        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Topics.class);
                startActivity(i);


            }
        });

















        Button button8= (Button) findViewById(R.id.About);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intents=new Intent(MainActivity.this,About.class);
                startActivity(intents);

            }
        });






        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });






        Button button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intents=new Intent(MainActivity.this,TestingPage.class);
                startActivity(intents);

            }
        });



    }




}
