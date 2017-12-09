package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private static ListView listView;
    private  static  String[] Topicsx= {"Apps, memory, and storage\n","Activity state\n","Activity lifecycle\n","Other diagrams\n","The onCreate method\n","The onPause method\n","The onResume method\n","The onStop method\n","onStart and onRestart\n"
    ,"The onDestroy method\n","Testing activity states (link)\n","Log methods\n"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        filter();
        call();
    }







    void filter(){
        EditText editText= (EditText) findViewById(R.id.filter);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (Main4Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }






    public void call(){

        listView = (ListView) findViewById(R.id.three3);
  adapter= new ArrayAdapter<String>(Main4Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Apps, memory, and storage\n\n\n" +
                            "● storage: Your device has apps and files installed\n" +
                            "and stored on its internal disk, SD card, etc.\n" +
                            "– Settings \uF067 Storage\n" +
                            "● memory: Some subset of apps might be\n" +
                            "currently loaded into the device's RAM and\n" +
                            "are either running or ready to be run.\n" +
                            "– When the user loads an app,\n" +
                            "it is loaded from storage into memory.\n" +
                            "– When the user exits an app, it might be\n" +
                            "cleared from memory, or might remain\n" +
                            "in memory so you can go back to it later.\n" +
                            "– See which apps are in memory:\n" +
                            "● Settings \uF067 Apps \uF067 Running";
                    intent.putExtra("take",n1);
                    startActivity(intent);}

                if(i==1){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Activity state\n\n\n" +
                            "● An activity can be thought of as being in one of several states:\n" +
                            "– starting: In process of loading up, but not fully loaded.\n" +
                            "– running: Done loading and now visible on the screen.\n" +
                            "– paused: Partially obscured or out of focus, but not shut down.\n" +
                            "– stopped: No longer active, but still in the device's active memory.\n" +
                            "– destroyed: Shut down and no longer currently loaded in memory.\n" +
                            "● Transitions between these states are represented by events that\n" +
                            "you can listen to in your activity code.\n" +
                            "– onCreate, onPause, onResume, onStop, onDestroy, ...";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==2){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Activity lifecycle";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==3){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Other diagrams";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==4){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="The onCreate method\n\n\n" +
                            "● In onCreate, you create and set up the activity\n" +
                            "object, load any static resources like images,\n" +
                            "layouts, set up menus etc.\n" +
                            "– after this, the Activity object exists\n" +
                            "– think of this as the \"constructor\" of the activity\n" +
                            "public class FooActivity extends Activity {\n" +
                            "...\n" +
                            "public void onCreate(Bundle savedInstanceState) {\n" +
                            "super.onCreate(savedInstanceState); // always call super\n" +
                            "setContentView(R.layout.activity_foo); // set up layout\n" +
                            "any other initialization code; // anything else you need\n" +
                            "}\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==5){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="The onPause method\n\n\n" +
                            "● When onPause is called, your activity is\n" +
                            "still partially visible.\n" +
                            "● May be temporary, or on way to termination.\n" +
                            "– Stop animations or other actions that consume CPU.\n" +
                            "– Commit unsaved changes (e.g. draft email).\n" +
                            "– Release system resources that affect battery life.\n" +
                            "public void onPause() {\n" +
                            "super.onPause(); // always call super\n" +
                            "if (myConnection != null) {\n" +
                            "myConnection.close(); // release resources\n" +
                            "myConnection = null;\n" +
                            "}\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==6){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="The onResume method\n\n\n" +
                            "● When onResume is called, your activity is\n" +
                            "coming out of the Paused state and\n" +
                            "into the Running state again.\n" +
                            "● Also called when activity is first created/loaded!\n" +
                            "– Initialize resources that you will release in onPause.\n" +
                            "– Start/resume animations or other ongoing actions\n" +
                            "that should only run when activity is visible on screen.\n" +
                            "public void onResume() {\n" +
                            "super.onPause(); // always call super\n" +
                            "if (myConnection == null) {\n" +
                            "myConnection = new ExampleConnect(); // init.resources\n" +
                            "myConnection.connect();\n" +
                            "}\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==7){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="The onStop method\n\n\n" +
                            "● When onStop is called, your activity\n" +
                            "is no longer visible on the screen:\n" +
                            "– User chose another app from Recent Apps window.\n" +
                            "– User starts a different activity in your app.\n" +
                            "– User receives a phone call while in your app.\n" +
                            "● Your app might still be running,\n" +
                            "but that activity is not.\n" +
                            "– onPause is always called before onStop.\n" +
                            "– onStop performs heavy-duty shutdown tasks like writing to a database.\n" +
                            "public void onStop() {\n" +
                            "super.onStop(); // always call super\n" +
                            "...\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==8){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="onStart and onRestart\n\n\n" +
                            "● onStart is called every time the activity begins.\n" +
                            "● onRestart is called when activity was stopped\n" +
                            "but is started again later (all but the first start).\n" +
                            "– Not as commonly used; favor onResume.\n" +
                            "– Re-open any resources that onStop closed.\n" +
                            "public void onStart() {\n" +
                            "super.onStart(); // always call super\n" +
                            "...\n" +
                            "}\n" +
                            "public void onRestart() {\n" +
                            "super.onRestart(); // always call super\n" +
                            "...\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==9){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="The onDestroy method\n\n\n" +
                            "● When onDestroy is called, your entire app is\n" +
                            "being shut down and unloaded from memory.\n" +
                            "– Unpredictable exactly when/if it will be called.\n" +
                            "– Can be called whenever the system wants to\n" +
                            "reclaim the memory used by your app.\n" +
                            "– Generally favor onPause or onStop because they\n" +
                            "are called in a predictable and timely manner.\n" +
                            "public void onDestroy() {\n" +
                            "super.onDestroy(); // always call super\n" +
                            "...\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==10){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Testing activity states (link)\n\n\n" +
                            "● Use the LogCat system for logging messages when your app\n" +
                            "changes states:\n" +
                            "– analogous to System.out.println debugging for Android apps\n" +
                            "– appears in the LogCat console in Android Studio\n" +
                            "public void onStart() {\n" +
                            "super.onStart();\n" +
                            "Log.v(\"testing\", \"onStart was called!\");\n" +
                            "}";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==11){

                    Intent intent = new Intent(Main4Activity.this,Show4.class);
                    String n1="Log methods\n\n\n" +
                            "● Each method can also accept an optional exception argument:\n" +
                            "try { someCode(); }\n" +
                            "catch (Exception ex) {\n" +
                            "Log.e(\"error4\", \"something went wrong\", ex);\n" +
                            "}\n" +
                            "Method Description\n" +
                            "Log.d(\"tag\", \"message\"); debug message (for debugging)\n" +
                            "Log.e(\"tag\", \"message\"); error message (fatal error)\n" +
                            "Log.i(\"tag\", \"message\"); info message (low-urgency FYI)\n" +
                            "Log.v(\"tag\", \"message\"); verbose message (rarely shown)\n" +
                            "Log.w(\"tag\", \"message\"); warning message (non-fatal error)\n" +
                            "Log.wtf(\"tag\", exception); log stack trace of an exception";
                    intent.putExtra("take",n1);
                    startActivity(intent);}


            }
        });

    }
}
