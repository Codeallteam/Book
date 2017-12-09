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

public class Main6Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private static ListView listView;
    private  static  String[] Topicsx= {"Button (link)\n","ImageButton\n","ImageView\n","EditText (link)\n","CheckBox (link)\n","RadioButton (link)\n","RadioGroup example\n","Reusing onClick handler\n","Spinner (link)\n"
            ,"String resources\n","Spinner example\n","Spinner event example\n","TMNT app exercise\n","ScrollView\n","List (link)\n"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
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

                (Main6Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }








    public void call(){

        listView = (ListView) findViewById(R.id.five5);
         adapter= new ArrayAdapter<String>(Main6Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="Button (link)\n\n\n" +
                    "A clickable widget with a text label\n" +
                    "● key attributes:\n" +
                    "● represented by Button class in Java code\n" +
                    "Button b = (Button) findViewById(R.id.theID);\n" +
                    "...\n" +
                    "android:clickable=\"bool\" set to false to disable the button\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:onClick=\"function\" function to call in activity when clicked\n" +
                    "(must be public, void, and take a View arg)\n" +
                    "android:text=\"text\" text to put in the button";
            intent.putExtra("take",n1);
            startActivity(intent);}

        if(i==1){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="ImageButton\n\n\n" +
                    "A clickable widget with an image label\n" +
                    "● key attributes:\n" +
                    "● to set up an image resource:\n" +
                    "– put image file in project folder app/src/main/res/drawable\n" +
                    "– use @drawable/foo to refer to foo.png\n" +
                    "● use simple file names with only letters and numbers\n" +
                    "android:clickable=\"bool\" set to false to disable the button\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:onClick=\"function\" function to call in activity when clicked\n" +
                    "(must be public, void, and take a View arg)\n" +
                    "android:src=\"@drawable/img\" image to put in the button\n" +
                    "(must correspond to an image resource)";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==2){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="ImageView\n\n\n" +
                    "Displays an image without being clickable\n" +
                    "● key attributes:\n" +
                    "● to change the visible image, in Java code:\n" +
                    "– get the ImageView using findViewById\n" +
                    "– call its setImageResource method and pass R.drawable.filename\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:src=\"@drawable/img\" image to put in the screen\n" +
                    "(must correspond to an image resource)";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==3){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="EditText (link)\n\n\n" +
                    "An editable text input box\n" +
                    "● key attributes:\n" +
                    "– others: capitalize, digits, fontFamily, letterSpacing,\n" +
                    "lineSpacingExtra, minLines, numeric, password,\n" +
                    "phoneNumber, singleLine, textAllCaps, textColor, typeface\n" +
                    "android:hint=\"text\" gray text to show before user starts to type\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:inputType=\"type\" what kind of input is being typed;\n" +
                    "number,phone,date,time,...\n" +
                    "android:lines=\"int\" number of visible lines (rows) of input\n" +
                    "android:maxLines=\"int\" max lines to allow user to type in the box\n" +
                    "android:text=\"text\" initial text to put in box (default empty)\n" +
                    "android:textSize=\"size\" size of font to use (e.g. \"20dp\")";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==4){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="CheckBox (link)\n\n\n" +
                    "An individual toggleable on/off switch\n" +
                    "● key attributes:\n" +
                    "● In Java code:\n" +
                    "CheckBox cb = (CheckBox) findViewById(R.id.theID);\n" +
                    "cb.toggle();\n" +
                    "cb.setChecked(true);\n" +
                    "cb.performClick();\n" +
                    "android:checked=\"bool\" set to true to make it initially checked\n" +
                    "android:clickable=\"bool\" set to false to disable the checkbox\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:onClick=\"function\" function to call in activity when clicked\n" +
                    "(must be public, void, and take a View arg)\n" +
                    "android:text=\"text\" text to put next to the checkbox";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==5){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="RadioButton (link)\n\n\n" +
                    "A toggleable on/off switch; part of a group\n" +
                    "● key attributes:\n" +
                    "● need to be nested inside a RadioGroup tag in XML\n" +
                    "so that only one can be selected at a time\n" +
                    "android:checked=\"bool\" set to true to make it initially checked\n" +
                    "android:clickable=\"bool\" set to false to disable the button\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:onClick=\"function\" function to call in activity when clicked\n" +
                    "(must be public, void, and take a View arg)\n" +
                    "android:text=\"text\" text to put next to the button";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==6){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="RadioGroup example\n\n\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\"\n" +
                    "android:gravity=\"center|top\">\n" +
                    "<RadioGroup ...\n" +
                    "android:orientation=\"horizontal\">\n" +
                    "<RadioButton ... android:id=\"@+id/lions\"\n" +
                    "android:text=\"Lions\"\n" +
                    "android:onClick=\"radioClick\" />\n" +
                    "<RadioButton ... android:id=\"@+id/tigers\"\n" +
                    "android:text=\"Tigers\"\n" +
                    "android:checked=\"true\"\n" +
                    "android:onClick=\"radioClick\" />\n" +
                    "<RadioButton ... android:id=\"@+id/bears\"\n" +
                    "android:text=\"Bears, oh my!\"\n" +
                    "android:onClick=\"radioClick\" />\n" +
                    "</RadioGroup>\n" +
                    "</LinearLayout>";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==7){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="Reusing onClick handler\n\n\n" +
                    "// in MainActivity.java\n" +
                    "public class MainActivity extends Activity {\n" +
                    "public void radioClick(View view) {\n" +
                    "// check which radio button was clicked\n" +
                    "if (view.getId() == R.id.lions) {\n" +
                    "// ...\n" +
                    "} else if (view.getId() == R.id.tigers) {\n" +
                    "// ...\n" +
                    "} else {\n" +
                    "// bears ...\n" +
                    "}\n" +
                    "}";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==8){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="Spinner (link)\n\n\n" +
                    "A drop-down menu of selectable choices\n" +
                    "● key attributes:\n" +
                    "● also need to handle events in Java code (see later)\n" +
                    "– must get the Spinner object using findViewById\n" +
                    "– then call its setOnItemSelectedListener method (see example)\n" +
                    "android:clickable=\"bool\" set to false to disable the spinner\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:entries=\"@array/array\" set of options to appear in spinner\n" +
                    "(must match an array in strings.xml)\n" +
                    "android:prompt=\"@string/text\" title text when dialog of choices pops up";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==9){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="String resources\n\n\n" +
                    "● Declare constant strings and arrays in res/values/strings.xml:\n" +
                    "<resources>\n" +
                    "<string name=\"name\">value</string>\n" +
                    "<string name=\"name\">value</string>\n" +
                    "<string-array name=\"arrayname\">\n" +
                    "<item>value</item>\n" +
                    "<item>value</item>\n" +
                    "<item>value</item> <!-- must escape ' as \\' in values -->\n" +
                    "...\n" +
                    "<item>value</item>\n" +
                    "</string-array>\n" +
                    "</resources>\n" +
                    "● Refer to them in Java code:\n" +
                    "– as a resource: R.string.name, R.array.name\n" +
                    "– as a string or array: getResources().getString(R.string.name),\n" +
                    "getResources().getStringArray(R.array.name)";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==10){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="Spinner example\n\n\n" +
                    "<LinearLayout ...>\n" +
                    "<Spinner ... android:id=\"@+id/tmnt\"\n" +
                    "android:entries=\"@array/turtles\"\n" +
                    "android:prompt=\"@string/choose_turtle\" />\n" +
                    "<TextView ... android:id=\"@+id/result\" />\n" +
                    "</LinearLayout>\n" +
                    "● in res/values/strings.xml:\n" +
                    "<resources>\n" +
                    "<string name=\"choose_turtle\">Choose a turtle:</string>\n" +
                    "<string-array name=\"turtles\">\n" +
                    "<item>Leonardo</item>\n" +
                    "<item>Michelangelo</item>\n" +
                    "<item>Donatello</item>\n" +
                    "<item>Raphael</item>\n" +
                    "</string-array>\n" +
                    "</resources>";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==11){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="Spinner event example\n\n\n" +
                    "// in MainActivity.java\n" +
                    "public class MainActivity extends Activity {\n" +
                    "...\n" +
                    "@Override\n" +
                    "protected void onCreate(Bundle savedInstanceState) {\n" +
                    "super.onCreate(savedInstanceState);\n" +
                    "setContentView(R.layout.activity_main);\n" +
                    "Spinner spin = (Spinner) findViewById(R.id.tmnt);\n" +
                    "spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n" +
                    "public void onItemSelected(AdapterView<?> spin, View v, int i, long id) {\n" +
                    "TextView result = (TextView) findViewById(R.id.turtle_result);\n" +
                    "result.setText(\"You chose \" + spin.getSelectedItem());\n" +
                    "}\n" +
                    "public void onNothingSelected(AdapterView<?> parent) {} // empty\n" +
                    "});\n" +
                    "}\n" +
                    "}";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==12){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="TMNT app exercise\n\n\n" +
                    "● Write an app to select TMNT characters from a spinner.\n" +
                    "– When a character is selected, an image about\n" +
                    "that character and other information\n" +
                    "is presented to the user.\n" +
                    "– Assume that relevant image files are\n" +
                    "already available for each character.";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==13){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="ScrollView\n\n\n" +
                    "A container with scrollbars around\n" +
                    "another widget or container\n" +
                    "<LinearLayout ...>\n" +
                    "...\n" +
                    "<ScrollView\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\">\n" +
                    "<TextView ... android:id=\"@+id/turtle_info\" />\n" +
                    "</ScrollView>\n" +
                    "</LinearLayout>";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==14){

            Intent intent = new Intent(Main6Activity.this,Show6.class);
            String n1="List (link)\n\n\n" +
                    "A visible menu of selectable choices\n" +
                    "● lists are more complicated,\n" +
                    "so we'll cover them later ...";
            intent.putExtra("take",n1);
            startActivity(intent);}

    }
});




    }
}
