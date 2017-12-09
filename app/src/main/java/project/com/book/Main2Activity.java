package project.com.book;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private  static ListView listView;
    private  String[] arry = {"Multiple Activities\n","Adding an Activity\n","Activities in Manifest\n","Intents\n","Creating an Intent\n","Extracting extra data\n","Waiting for\n" ,"Sending back a result\n","Grabbing the result\n","Implicit Intent (link)\n","Activities and Action Bar\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        methodshow();
    filter();
    }



    void filter(){
        EditText editText= (EditText) findViewById(R.id.editText2);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (Main2Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }







    public  void methodshow(){


        listView = (ListView) findViewById(R.id.one1);
      adapter= new ArrayAdapter<String>(Main2Activity.this,R.layout.topic_list,arry );

listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {



                if(position==0){

                    Intent sa = new Intent(Main2Activity.this,ShowDataForIntroduction.class);
                    String introduction="Multiple Activities\n\n\n Many apps have multiple activities.\n" +
                            "– Example: In an address book app, the main activity is a list of contacts,\n" +
                            "and clicking on a contact goes to another activity for viewing details.\n" +
                            "– An activity A can launch another activity B in response to an event.\n" +
                            "– The activity A can pass data to B.\n" +
                            "– The second activity B can send data back to A when it is done.";

                    sa.putExtra("take",introduction);
                    startActivity(sa);



                }

                if(position==1){

                    Intent sa = new Intent(Main2Activity.this,ShowDataForIntroduction.class);
                    String introduction="Adding an Activity\n\n\n● in Android Studio, right click \"app\" at left: New -> Activity\n" +
                            "– creates a new .XML file in res/layouts\n" +
                            "– creates a new .java class in src/java\n" +
                            "– adds information to AndroidManifest.xml about the activity\n" +
                            "(without this information, the app will not allow the activity)";
                    sa.putExtra("take",introduction);
                    startActivity(sa);




                }

                if(position==2) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Activities in Manifest\n\n\n● Every activity has an entry in project's AndroidManifest.xml, added automatically by Android Studio:\n" +
                            "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                            "package=\"com.example.myusername.myapplication\" >\n" +
                            "<application android:allowBackup=\"true\"\n" +
                            "android:icon=\"@drawable/ic_launcher\"\n" +
                            "android:label=\"@string/app_name\"\n" +
                            "android:theme=\"@style/AppTheme\" >\n" +
                            "<activity android:name=\".MainActivity\"\n" +
                            "android:label=\"@string/app_name\" >\n" +
                            "<intent-filter>\n" +
                            "<action android:name=\"android.intent.action.MAIN\" />\n" +
                            "<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                            "</intent-filter>\n" +
                            "</activity>\n" +
                            "<activity android:name=\".SecondActivity\"\n" +
                            "android:label=\"@string/title_activity_second\"\n" +
                            "android:parentActivityName=\".SecondActivity\" >\n" +
                            "<meta-data android:name=\"android.support.PARENT_ACTIVITY\"\n" +
                            "android:value=\"com.example.myusername.myapplication.MainActivity\" />\n" +
                            "</activity>\n" +
                            "</application>\n" +
                            "</manifest>";
                    sa.putExtra("take", introduction);
                    startActivity(sa);
                }

                    if(position==3) {

                        Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                        String introduction = "Intents\n\n\n" +
                                "● intent: a bridge between activities;\n" +
                                "a way for one activity to invoke another\n" +
                                "– the activity can be in the same app or in a different app\n" +
                                "– can store extra data to pass as \"parameters\" to that activity\n" +
                                "– second activity can \"return\" information back to the caller if needed";
                        sa.putExtra("take", introduction);
                        startActivity(sa);


                    }


                if(position==4) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Creating an Intent\n\n\n" +
                            "● To launch another activity (usually in response to an event),\n" +
                            "create an Intent object and call startActivity with it:\n" +
                            "Intent intent = new Intent(this, ActivityName.class);\n" +
                            "startActivity(intent);\n" +
                            "● If you need to pass any parameters or data to the second\n" +
                            "activity, call putExtra on the intent.\n" +
                            "– It stores \"extra\" data as key/value pairs, not unlike a Map.\n" +
                            "Intent intent = new Intent(this, ActivityName.class);\n" +
                            "intent.putExtra(\"name\", value);\n" +
                            "intent.putExtra(\"name\", value);\n" +
                            "startActivity(intent);";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }


                if(position==5) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Extracting extra data\n\n\n" +
                            "● In the second activity that was invoked, you can grab any extra data\n" +
                            "that was passed to it by the calling act.\n" +
                            "– You can access the Intent that spawned you by calling getIntent.\n" +
                            "– The Intent has methods like getExtra, getIntExtra, getStringExtra,\n" +
                            "etc. to extract any data that was stored inside the intent.\n" +
                            "public class SecondActivity extends Activity {\n" +
                            "...\n" +
                            "public void onCreate(Bundle savedState) {\n" +
                            "super.onCreate(savedState);\n" +
                            "setContentView(R.layout.activity_second);\n" +
                            "Intent intent = getIntent();\n" +
                            "String extra = intent.getExtra(\"name\");\n" +
                            "...\n" +
                            "}\n" +
                            "}";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }

                if(position==6) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Waiting for a result\n\n\n" +
                            "● If calling activity wants to wait for a result from called activity:\n" +
                            "– Call startActivityForResult rather than startActivity.\n" +
                            "● startActivityForResult requires you to pass a unique ID number\n" +
                            "to represent the action being performed.\n" +
                            "● By convention, you declare a final int constant with a value of your choice.\n" +
                            "● The call to startActivityForResult will not wait; it will return immediately.\n" +
                            "– Write an onActivityResult method that will be called\n" +
                            "when the second activity is done.\n" +
                            "● Check for your unique ID as was passed to startActivityForResult.\n" +
                            "● If you see your unique ID, you can ask the intent for any extra data.\n" +
                            "– Modify the called activity to send a result back.\n" +
                            "● Use its setResult and finish methods to end the called activity.";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }


                if(position==7) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Sending back a result\n\n\n" +
                            "● In the second activity that was invoked, send data back:\n" +
                            "– Need to create an Intent to go back.\n" +
                            "– Store any extra data in that intent; call setResult and finish.\n" +
                            "public class SecondActivity extends Activity {\n" +
                            "...\n" +
                            "public void myOnClick(View view) {\n" +
                            "Intent intent = new Intent();\n" +
                            "intent.putExtra(\"name\", value);\n" +
                            "setResult(RESULT_OK, intent);\n" +
                            "finish(); // calls onDestroy\n" +
                            "}\n" +
                            "}";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }


                if(position==8) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Grabbing the result\n\n\n" +
                            "public class FirstActivity extends Activity {\n" +
                            "private static final int REQ_CODE = 123; // MUST be 0-65535\n" +
                            "public void myOnClick(View view) {\n" +
                            "Intent intent = getIntent(this, SecondActivity.class);\n" +
                            "startActivityForResult(intent, REQ_CODE);\n" +
                            "}\n" +
                            "protected void onActivityResult(int requestCode,\n" +
                            "int resultCode, Intent intent) {\n" +
                            "super.onActivityResult(requestCode, resultCode, intent);\n" +
                            "if (requestCode == REQ_CODE) {\n" +
                            "// came back from SecondActivity\n" +
                            "String data = intent.getStringExtra(\"name\");\n" +
                            "Toast.makeText(this, \"Got back: \" + data,\n" +
                            "Toast.LENGTH_SHORT).show();\n" +
                            "}\n" +
                            "}\n" +
                            "}";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }



                if(position==9) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Implicit Intent (link)\n\n\n" +
                            "● implicit intent: One that launches another app, without naming\n" +
                            "that specific app, to handle a given type of request or action.\n" +
                            "– examples: invoke default browser; load music player to play a song\n" +
                            "// make a phone call\n" +
                            "Uri number = Uri.parse(\"tel:5551234\");\n" +
                            "Intent callIntent = new Intent(Intent.ACTION_DIAL, number);\n" +
                            "// go to a web page in the default browser\n" +
                            "Uri webpage = Uri.parse(\"http://www.stanford.edu/\");\n" +
                            "Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);\n" +
                            "// open a map pointing at a given latitude/longitude (z=zoom)\n" +
                            "Uri location = Uri.parse(\"geo:37.422219,-122.08364?z=14\");\n" +
                            "Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }



                if(position==10) {

                    Intent sa = new Intent(Main2Activity.this, ShowDataForIntroduction.class);
                    String introduction = "Activities and Action Bar\n\n\n" +
                            "● action bar: A top-level menu of actions in an activity.\n" +
                            "– replaces older \"menu\" button in past versions of Android\n" +
                            "– identifies current activity/app to user\n" +
                            "– make common actions prominent and available\n" +
                            "– make less common actions available through a drop-down menu\n" +
                            "● If your activity is specified to have a \"parent\" activity on creation\n" +
                            "and in AndroidManifest.xml, you will have a \"back\" button to\n" +
                            "return to the calling activity.";
                    sa.putExtra("take", introduction);
                    startActivity(sa);


                }





            }


        });

    }

}

