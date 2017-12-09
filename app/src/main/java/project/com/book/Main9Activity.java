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

public class Main9Activity extends AppCompatActivity {


    private static ListView listView;

public     ArrayAdapter<String> adapter;
    private  static  String[] Topicsx= {"ListView (link)\n", "Static lists\n", "Dynamic lists\n", "List adapters\n", "List adapter example\n"
            ,"Handling list events\n", "Attaching event listener in Java\n" ,"List events\n" ,"List event listener example\n" ,"Custom list layouts\n" ,"Custom list layout XML\n" ,"Custom list layout Java\n"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

filter();    call();}

    void filter(){
        EditText editText= (EditText) findViewById(R.id.filter);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (Main9Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }




    public void call(){

        listView = (ListView) findViewById(R.id.nine9);
         adapter= new ArrayAdapter<String>(Main9Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if(i==0){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="             ListView (link)\n\n\n" +
                    "An ordered collection of selectable choices\n" +
                    "● key attributes in XML:\n" +
                    "android:clickable=\"bool\" set to false to disable the list\n" +
                    "android:id=\"@+id/theID\" unique ID for use in Java code\n" +
                    "android:entries=\"@array/array\" set of options to appear in the list\n" +
                    "(must match an array in strings.xml)       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==1){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="                Static lists\n\n\n" +
                    "● static list: Content is fixed and known before the app runs.\n" +
                    "– Declare the list elements in the strings.xml resource file.\n" +
                    "<!-- res/values/strings.xml -->\n" +
                    "<resources>\n" +
                    "<string-array name=\"oses\">\n" +
                    "<item>Android</item>\n" +
                    "<item>iPhone</item>\n" +
                    "...\n" +
                    "<item>Max OS X</item>\n" +
                    "</string-array>\n" +
                    "</resources>\n" +
                    "<!-- res/layout/activity_main.xml -->\n" +
                    "<ListView ... android:id=\"@+id/mylist\"\n" +
                    "android:entries=\"@array/oses\" />    ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==2){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="           Dynamic lists\n\n\n" +
                    "● dynamic list: Content is read or generated as the program runs.\n" +
                    "– Comes from a data file, or from the internet, etc.\n" +
                    "– Must be set in the Java code.\n" +
                    "– Suppose we have the following file and want to make a list from it:\n" +
                    "// res/raw/oses.txt\n" +
                    "Android\n" +
                    "iPhone\n" +
                    "...\n" +
                    "Max OS X         ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==3){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="          List adapters\n\n\n" +
                    "● adapter: Helps turn list data into list view items.\n" +
                    "– common adapters: ArrayAdapter, CursorAdapter\n" +
                    "● Syntax for creating an adapter:\n" +
                    "ArrayAdapter<String> name =\n" +
                    "new ArrayAdapter<String>(activity, layout, array);\n" +
                    "● the activity is usually this\n" +
                    "● the default layout for lists is android.R.layout.simple_list_item_1\n" +
                    "● get the array by reading your file or data source of choice\n" +
                    "(it can be an array like String[], or a list like ArrayList<String>)\n" +
                    "– Once you have an adapter, you can attach it to your list by calling the\n" +
                    "setAdapter method of the ListView object in the Java code.          ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==4){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="        List adapter example\n\n\n" +
                    "ArrayList<String> myArray = ...; // load data from file\n" +
                    "ArrayAdapter<String> adapter =\n" +
                    "new ArrayAdapter<String>(\n" +
                    "this,\n" +
                    "android.R.layout.simple_list_item_1,\n" +
                    "myArray);\n" +
                    "ListView list = (ListView) findViewById(R.id.mylist);\n" +
                    "list.setAdapter(myAdapter);            ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==5){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="        Handling list events\n\n\n" +
                    "● Unfortunately lists don't use a simple onClick event.\n" +
                    "– Several fancier GUI widgets use other kinds of events.\n" +
                    "– The event listeners must be attached in the Java code,\n" +
                    "not in the XML.\n" +
                    "– Understanding how to attach these event listeners requires\n" +
                    "the use of Java anonymous inner classes.\n" +
                    "● anonymous inner class: A shorthand syntax\n" +
                    "for declaring a small class without giving\n" +
                    "it an explicit name.\n" +
                    "– The class can be made to extend a given\n" +
                    "super class or implement a given interface.\n" +
                    "– Typically the class is declared and a single\n" +
                    "object of it is constructed and used all at once.            ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==6){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="         Attaching event listener in Java\n\n\n" +
                    "<!-- activity_main.xml -->\n" +
                    "<Button ... android:onClick=\"mybuttonOnClick\" />\n" +
                    "<Button ... android:id=\"@+id/mybutton\" />\n" +
                    "// MainActivity.java\n" +
                    "public void mybuttonOnClick() { ... }\n" +
                    "Button button = (Button) findViewById(R.id.mybutton);\n" +
                    "button.setOnClickListener(new View.OnClickListener() {\n" +
                    "public void onClick(View v) {\n" +
                    "// code to run when the button gets clicked\n" +
                    "}\n" +
                    "});\n" +
                    "// this was the required style for event listeners\n" +
                    "// in older versions of Android :-/           ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==7){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="          List events\n\n\n" +
                    "● List views respond to the following events:\n" +
                    "– setOnItemClickListener(AdapterView.OnItemClickListener)\n" +
                    "Listener for when an item in the list has been clicked.\n" +
                    "– setOnItemLongClickListener(AdapterView.OnItemLongClickListener)\n" +
                    "Listener for when an item in the list has been clicked and held.\n" +
                    "– setOnItemSelectedListener(AdapterView.OnItemSelectedListener)\n" +
                    "Listener for when an item in the list\n" +
                    "has been selected.\n" +
                    "● Others:\n" +
                    "– onDrag, onFocusChanged, onHover,\n" +
                    "onKey, onScroll, onTouch, ...          ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==8){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="         List event listener example\n\n\n" +
                    "ListView list = (ListView) findViewById(R.id.id);\n" +
                    "list.setOnItemClickListener(\n" +
                    "new AdapterView.OnItemClickListener() {\n" +
                    "@Override\n" +
                    "public void onItemClick(AdapterView<?> list,\n" +
                    "View row,\n" +
                    "int index,\n" +
                    "long rowID) {\n" +
                    "// code to run when user clicks that item\n" +
                    "...\n" +
                    "}\n" +
                    "}\n" +
                    ");           ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==9){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="         Custom list layouts\n\n\n" +
                    "● If you want your list to look different than the default\n" +
                    "appearance (of just a text string for each line), you must:\n" +
                    "– Write a short layout XML file describing the layout for each row.\n" +
                    "– Write a subclass of ArrayAdapter that overrides the getView\n" +
                    "method to describe what view must be returned for each row.           ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==10){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="         Custom list layout XML\n\n\n" +
                    "<!-- res/layout/mylistlayout.xml -->\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout ... android:orientation=\"horizontal\">\n" +
                    "<ImageView ... android:id=\"@+id/list_row_image\"\n" +
                    "android:layout_width=\"100dp\"\n" +
                    "android:layout_height=\"100dp\"\n" +
                    "android:src=\"@drawable/smiley\" />\n" +
                    "<TextView ... android:id=\"@+id/list_row_text\"\n" +
                    "android:textStyle=\"bold\"\n" +
                    "android:textSize=\"22dp\"\n" +
                    "android:text=\"\"\n" +
                    "android:background=\"#336699\" />\n" +
                    "</LinearLayout>           ";
            intent.putExtra("take",n1);
            startActivity(intent);}        if(i==11){

            Intent intent = new Intent(Main9Activity.this,Show9.class);
            String n1="       Custom list layout Java\n\n\n" +
                    "// MyAdapter.java\n" +
                    "public class MyAdapter extends ArrayAdapter<String> {\n" +
                    "private int layoutResourceId;\n" +
                    "private List<String> data;\n" +
                    "public MyAdapter(Context context, int layoutId, List<String> list) {\n" +
                    "super(context, layoutResourceId, data);\n" +
                    "layoutResourceId = layoutId;\n" +
                    "data = list;\n" +
                    "}\n" +
                    "@Override\n" +
                    "public View getView(int index, View row, ViewGroup parent) {\n" +
                    "row = getLayoutInflater().inflate(layoutResourceId, parent, false);\n" +
                    "TextView text = (TextView) row.findViewById(R.id.list_row_text);\n" +
                    "text.setText(data.get(index));\n" +
                    "return row;\n" +
                    "}\n" +
                    "}             ";
            intent.putExtra("take",n1);
            startActivity(intent);}
    }
});
    }

}
