
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

public class Main7Activity extends AppCompatActivity {


    private static ListView listView;
   public   ArrayAdapter<String> adapter;
    private  static  String[] Topicsx= {"Action Bar (link)\n", "Support for action bar\n", "ActionBarActivity\n", "Menu bar XML data\n", "onOptionsItemSelected\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        call();
        filter();
    }






    void filter(){
        EditText editText= (EditText) findViewById(R.id.filter);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (Main7Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }








    public void call(){

        listView = (ListView) findViewById(R.id.seven7);
         adapter= new ArrayAdapter<String>(Main7Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        if(i==0){

            Intent intent = new Intent(Main7Activity.this,Show7.class);
            String n1="Action Bar (link)\n\n\n" +
                    "● action bar: top-level menu of app functions\n" +
                    "– replaces older \"Menu\" button\n" +
                    "(which is now discouraged in Android 3+)\n" +
                    "– identifies current activity/app to user\n" +
                    "– make common actions prominent and available\n" +
                    "– make less common actions available through a drop-down menu";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==1){

            Intent intent = new Intent(Main7Activity.this,Show7.class);
            String n1="Support for action bar\n\n\n" +
                    "● make activity class extend ActionBarActivity\n" +
                    "– write methods: onCreateOptionsMenu,\n" +
                    "onOptionsItemSelected\n" +
                    "● declare the menu items in res/menu/menu_activity.xml\n" +
                    "– decide which items have icons, which have text,\n" +
                    "which should appear in main menu, which in \"overflow\" submenu\n" +
                    "– need to place icon image files in res/drawable folder\n" +
                    "● handle events\n" +
                    "– write code in onOptionsItemSelected to check what option was clicked\n" +
                    "and respond accordingly";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==2){

            Intent intent = new Intent(Main7Activity.this,Show7.class);
            String n1="ActionBarActivity\n\n\n" +
                    "public class MainActivity extends ActionBarActivity {\n" +
                    "...\n" +
                    "@Override\n" +
                    "public boolean onCreateOptionsMenu(Menu menu) {\n" +
                    "MenuInflater inflater = getMenuInflater(); // reads XML\n" +
                    "inflater.inflate(R.menu.menu_main, menu); // to create\n" +
                    "return super.onCreateOptionsMenu(menu); // the menu\n" +
                    "}\n" +
                    "@Override\n" +
                    "public boolean onOptionsItemSelected(MenuItem item) {\n" +
                    "// TODO: handle clicks on the menu items\n" +
                    "return super.onOptionsItemSelected(item);\n" +
                    "}\n" +
                    "}";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==3){

            Intent intent = new Intent(Main7Activity.this,Show7.class);
            String n1="Menu bar XML data\n\n\n" +
                    "<menu\n" +
                    "xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "tools:context=\".MainActivity\">\n" +
                    "<item android:id=\"@+id/action_send\" android:title=\"Send\"\n" +
                    "android:icon=\"@drawable/iconsend\"\n" +
                    "app:showAsAction=\"always\" />\n" +
                    "<item android:id=\"@+id/action_archive\" android:title=\"Archive\"\n" +
                    "android:icon=\"@drawable/iconarchive\"\n" +
                    "app:showAsAction=\"always\" />\n" +
                    "<item android:id=\"@+id/action_open\" android:title=\"Open\"\n" +
                    "android:icon=\"@drawable/iconopen\" />\n" +
                    "</menu>\n" +
                    "● showAsAction can be always, never, ifRoom, withText, ...";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==4){

            Intent intent = new Intent(Main7Activity.this,Show7.class);
            String n1="onOptionsItemSelected\n\n\n" +
                    "public class MainActivity extends ActionBarActivity {\n" +
                    "...\n" +
                    "/* Handles presses on the action bar items. */\n" +
                    "@Override\n" +
                    "public boolean onOptionsItemSelected(MenuItem item) {\n" +
                    "if (item.getItemId() == R.id.action_send) {\n" +
                    "// do something;\n" +
                    "} else if (item.getItemId() == R.id.action_archive) {\n" +
                    "// do something;\n" +
                    "} else if (item.getItemId() == R.id.action_open) {\n" +
                    "// do something;\n" +
                    "}\n" +
                    "return super.onOptionsItemSelected(item);\n" +
                    "}\n" +
                    "}";
            intent.putExtra("take",n1);
            startActivity(intent);}
        }
});

    }


}
