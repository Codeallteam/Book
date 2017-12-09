package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Topics extends AppCompatActivity {
    private static ListView listView;
    private  static  String[] Topicsx= {"Introduction To android\n","Java Review\n","Activity LifeCycle\n","Android Layouts\n","GUI Widgets\n","Android Intents\n","Action Bar\n","Android Fregment\n","Andorid ListView\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        ListView();
    }

    public void ListView(){

        listView = (ListView) findViewById(R.id.x);
        ArrayAdapter<String > adapter = new ArrayAdapter<String>(Topics.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0){

                    Intent sa = new Intent(Topics.this,Main0Activity.class);
sa.putExtra("take","Android is a mobile operating system developed by Google, based on the Linux kernel and designed primarily for touchscreen mobile devices such as smartphones and tablets. Wikipedia\n" +
        "Developer:\n Google; Open Handset Alliance\n" +
        "Platforms:\n 32- and 64-bit ARM, x86, x86-64, MIPS and MIPS64\n" +
        "Initial release date:\n September 23, 2008\n" +
        "License: Apache License 2.0; GNU GPL v2 for the Linux kernel modifications\n" +
        "Marketing target:\n Smartphones, tablet computers, Android TV, Android Auto and Android Wear\n" +
        "Written in: Java, C++");
                    startActivity(sa);



                }

                if(position==8){

                    Intent sa = new Intent(Topics.this,Main9Activity.class);
                    startActivity(sa);



                }

                if(position==7){

                    Intent sa = new Intent(Topics.this,Main8Activity.class);
                    startActivity(sa);



                }
                if(position==6){

                    Intent sa = new Intent(Topics.this,Main7Activity.class);
                    startActivity(sa);



                }
                if(position==5){

                    Intent sa = new Intent(Topics.this,Main2Activity.class);
                    startActivity(sa);



                }                if(position==1){

                    Intent sa = new Intent(Topics.this,Main3Activity.class);
                    startActivity(sa);



                }

                if(position==2){

                    Intent sa = new Intent(Topics.this,Main4Activity.class);
                    startActivity(sa);



                }


                if(position==3){

                    Intent sa = new Intent(Topics.this,Main5Activity.class);
                    startActivity(sa);



                }


                if(position==4){

                    Intent sa = new Intent(Topics.this,Main6Activity.class);
                    startActivity(sa);



                }

                //   String s = (String) listView.getItemAtPosition(position);
           //     Toast.makeText(Topics.this,"Position "+position+ "Value "+s,Toast.LENGTH_SHORT).show();

            }
        });}
}
