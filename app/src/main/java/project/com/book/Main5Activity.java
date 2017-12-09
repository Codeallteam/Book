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

public class Main5Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private static ListView listView;
    private  static  String[] Topicsx= {"Sizing and Positioning\n","ViewGroup as layout\n","XML, in brief\n","Changing layouts\n","LinearLayout (link)\n","LinearLayout example 1\n","LinearLayout example 2\n","Gravity\n","Weight\n"
            ,"Widget box model\n","Sizing an individual widget\n","Padding\n","Margin\n","GridLayout\n","GridLayout example 1\n","GridLayout example 2\n","GridLayout example 3\n","Nested layout\n","Nested layout templat\n","Nested layout exercise\n","Nested layout solution\n","RelativeLayout (link)\n","Relative anchor points\n","RelativeLayout example 1\n","FrameLayout (link)\n"};


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


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

                (Main5Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }










    public void call(){

        listView = (ListView) findViewById(R.id.fore4);
 adapter= new ArrayAdapter<String>(Main5Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if(i==0){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="     Sizing and Positioning\n\n\n" +
                    "How does the programmer specify where each component\n" +
                    "appears, how big each component should be, etc.?\n" +
                    "● Absolute positioning (C++, C#, others):\n" +
                    "– Programmer specifies exact pixel coordinates of every component.\n" +
                    "– \"Put this button at (x=15, y=75) and make it 70x31 px in size.\"\n" +
                    "● Layout managers (Java, Android):\n" +
                    "– Objects that decide where to position each component based on some\n" +
                    "general rules or criteria.\n" +
                    "● \"Put these four buttons into a 2x2 grid and put these text boxes in a horizontal\n" +
                    "flow in the south part of the app.\"\n" +
                    "– More flexible and general; works better with a variety of devices.     ";
            intent.putExtra("take",n1);
            startActivity(intent);}



        if(i==1){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   ViewGroup as layout\n\n\n" +
                    "● ViewGroup superclass represents containers of widgets/views\n" +
                    "– layouts are described in XML and mirrored in Java code\n" +
                    "– Android provides several pre-existing layout managers;\n" +
                    "you can define your own custom layouts if needed\n" +
                    "– layouts can be nested to achieve combinations of features\n" +
                    "● in the Java code and XML:\n" +
                    "– an Activity is a ViewGroup\n" +
                    "– various Layout classes are also ViewGroups\n" +
                    "– widgets can be added to a ViewGroup, which will then\n" +
                    "manage that widget's position/size behavior       ";
            intent.putExtra("take",n1);
            startActivity(intent);}

        if(i==2){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="      XML, in brief\n\n\n" +
                    "● XML : a language for describing hierarchical text data. *\n" +
                    "– Uses tags that consist of elements and attributes. Tags can be nested.\n" +
                    "– Some tags are opened and closed; others self-close.\n" +
                    "<element attr=\"value\" attr=\"value\"> ... </element>\n" +
                    "<element attr=\"value\" attr=\"value\" /> (self-closing)\n" +
                    "● Example: * XML is case-sensitive!\n" +
                    "<!-- this is a comment -->\n" +
                    "<course name=\"CS 193A\" quarter=\"15wi\">\n" +
                    "<instructor>Marty Stepp</instructor>\n" +
                    "<ta>none</ta>\n" +
                    "</course>    ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==3){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    Changing layouts\n\n\n" +
                    "● go to the Text view for your layout XML file\n" +
                    "● modify the opening/closing tags to the new layout type,\n" +
                    "e.g. LinearLayout\n" +
                    "● now go back to Design view and add widgets      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==4){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    LinearLayout (link)\n\n\n" +
                    "● lays out widgets/views in a single line\n" +
                    "● orientation of horizontal (default) or vertical\n" +
                    "● items do not wrap if they reach edge of screen!\n" +
                    "horizontal vertical      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==5){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   LinearLayout example 1\n\n\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"horizontal\"\n" +
                    "tools:context=\".MainActivity\">\n" +
                    "<Button ... android:text=\"Button 1\" />\n" +
                    "<Button ... android:text=\"Button 2 Hooray\" />\n" +
                    "<Button ... android:text=\"Button 3\" />\n" +
                    "<Button ... android:text=\"Button 4\n" +
                    "Very Long Text\" />\n" +
                    "</LinearLayout>\n" +
                    "● In our examples, we'll use ... when omitting boilerplate\n" +
                    "code that is auto-generated by Android Studio and not\n" +
                    "relevant to the specific example at hand.       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==6){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   LinearLayout example 2\n\n\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\"\n" +
                    "tools:context=\".MainActivity\">\n" +
                    "<Button ... android:text=\"Button 1\" />\n" +
                    "<Button ... android:text=\"Button 2\n" +
                    "Hooray\" />\n" +
                    "<Button ... android:text=\"Button 3\" />\n" +
                    "<Button ... android:text=\"Button 4\n" +
                    "Very Long Text\" />\n" +
                    "</LinearLayout>       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==7){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="     Gravity\n\n\n" +
                    "● gravity: alignment direction that widgets are pulled\n" +
                    "– top, bottom, left, right, center\n" +
                    "– combine multiple with |\n" +
                    "– set gravity on the layout to adjust all widgets;\n" +
                    "set layout_gravity on an individual widget\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\"\n" +
                    "android:gravity=\"center|right\">\n" +
                    "<Button ... android:text=\"Button 1\" />\n" +
                    "<Button ... android:text=\"Button 2 Hooray\" />\n" +
                    "<Button ... android:text=\"Button 3\" />\n" +
                    "<Button ... android:text=\"Button 4 Very Long Text\" />\n" +
                    "<Button ... android:text=\"Button 5\"\n" +
                    "android:layout_gravity=\"left\" />\n" +
                    "</LinearLayout>     ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==8){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   Weight\n\n\n" +
                    "● weight: gives elements relative sizes by integers\n" +
                    "– widget with weight K gets K/total fraction of total size\n" +
                    "– cooking analogy: \"2 parts flour, 1 part water, ...\"\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\">\n" +
                    "<Button ... android:text=\"B1\"\n" +
                    "android:layout_weight=\"1\" />\n" +
                    "<Button ... android:text=\"B2\"\n" +
                    "android:layout_weight=\"3\" />\n" +
                    "<Button ... android:text=\"B3\"\n" +
                    "android:layout_weight=\"1\" />\n" +
                    "</LinearLayout>       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==9){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   Widget box model\n\n\n" +
                    "● content: every widget or view has a certain size (width x height)\n" +
                    "for its content, the widget itself\n" +
                    "● padding: you can artificially increase the widget's size by\n" +
                    "applying padding in the widget just outside its content\n" +
                    "● border: outside the padding, a line around edge of widget\n" +
                    "● margin: separation from neighboring widgets on screen       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==10){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   Sizing an individual widget\n\n\n" +
                    "● width and height of a widget can be:\n" +
                    "– wrap_content : exactly large enough to fit the widget's content\n" +
                    "– match_parent : as wide or tall as 100% of the screen or layout\n" +
                    "– a specific fixed width such as 64dp (not usually recommended)\n" +
                    "● dp = device pixels; dip = device-independent pixels; sp = scaling pixels\n" +
                    "<Button ...\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\" />       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==11){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    Padding\n\n\n" +
                    "● padding: extra space inside widget\n" +
                    "– set padding to adjust all sides;\n" +
                    "paddingTop, Bottom, Left, Right for one side\n" +
                    "– usually set to specific values like 10dp\n" +
                    "(some widgets have a default value ~16dp)\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\">\n" +
                    "<Button ... android:text=\"Button 1\"\n" +
                    "android:padding=\"50dp\" />\n" +
                    "<Button ... android:text=\"Button 2 Hooray\" />\n" +
                    "<Button ... android:text=\"Button 3\"\n" +
                    "android:paddingLeft=\"30dp\"\n" +
                    "android:paddingBottom=\"40dp\" />\n" +
                    "</LinearLayout>      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==12){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    Margin\n\n\n" +
                    "● margin: extra space outside widget to separate it from others\n" +
                    "– set layout_margin to adjust all sides;\n" +
                    "layout_marginTop, Bottom, Left, Right\n" +
                    "– usually set to specific values like 10dp\n" +
                    "(set defaults in res/values/dimens.xml)\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\">\n" +
                    "<Button ... android:text=\"Button 1\"\n" +
                    "android:layout_margin=\"50dp\" />\n" +
                    "<Button ... android:text=\"Button 2 Hooray\" />\n" +
                    "<Button ... android:text=\"Button 3\"\n" +
                    "android:layout_marginLeft=\"30dp\"\n" +
                    "android:layout_marginTop=\"40dp\" />\n" +
                    "</LinearLayout>      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==13){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    GridLayout\n\n\n" +
                    "● lays out widgets/views in lines of rows and columns\n" +
                    "– orientation attribute defines row-major or column-major order\n" +
                    "– introduced in Android 4; replaces older TableLayout\n" +
                    "● by default, rows and columns are equal in size\n" +
                    "– each widget is placed into \"next\" available row/column index unless it is\n" +
                    "given an explicit layout_row and layout_column attribute\n" +
                    "– grid of 4 rows, 3 columns:      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==14){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    GridLayout example 1\n\n\n" +
                    "<GridLayout ...\n" +
                    "android:rowCount=\"2\"\n" +
                    "android:columnCount=\"3\"\n" +
                    "tools:context=\".MainActivity\">\n" +
                    "<Button ... android:text=\"Button 1\" />\n" +
                    "<Button ... android:text=\"Button Two\" />\n" +
                    "<Button ... android:text=\"Button 3\" />\n" +
                    "<Button ... android:text=\"Button Four\" />\n" +
                    "<Button ... android:text=\"Button 5\" />\n" +
                    "<Button ... android:text=\"Button Six\" />\n" +
                    "</GridLayout>      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==15){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="    GridLayout example 2\n\n\n" +
                    "<GridLayout ...\n" +
                    "android:rowCount=\"2\"\n" +
                    "android:columnCount=\"3\"\n" +
                    "android:orientation=\"vertical\">\n" +
                    "<Button ... android:text=\"Button 1\" />\n" +
                    "<Button ... android:text=\"Button Two\" />\n" +
                    "<Button ... android:text=\"Button 3\" />\n" +
                    "<Button ... android:text=\"Button Four\" />\n" +
                    "<Button ... android:text=\"Button 5\"\n" +
                    "android:layout_row=\"1\"\n" +
                    "android:layout_column=\"2\" />\n" +
                    "<Button ... android:text=\"Button Six\"\n" +
                    "android:layout_row=\"0\"\n" +
                    "android:layout_column=\"2\" />\n" +
                    "</RelativeLayout>      ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==16){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   GridLayout example 3\n\n\n" +
                    "<GridLayout ...\n" +
                    "android:rowCount=\"2\"\n" +
                    "android:columnCount=\"3\">\n" +
                    "<Button ... android:text=\"B1\" />\n" +
                    "<Button ... android:text=\"B2\" />\n" +
                    "<Button ... android:text=\"Button Number 3!\" />\n" +
                    "<Button ... android:text=\"B4\"\n" +
                    "android:layout_columnSpan=\"2\"\n" +
                    "android:layout_gravity=\"center\" />\n" +
                    "<Button ... android:text=\"B5\" />\n" +
                    "<Button ... android:text=\"B6\"\n" +
                    "android:layout_paddingTop=\"40dp\"\n" +
                    "android:layout_paddingBottom=\"40dp\" />\n" +
                    "<Button ... android:text=\"B7\" />\n" +
                    "<Button ... android:text=\"Button #8\"\n" +
                    "android:layout_gravity=\"right\" />\n" +
                    "</RelativeLayout>       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==17){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   Nested layout\n\n\n" +
                    "● to produce more complicated appearance, use a nested layout\n" +
                    "– (layouts inside layouts)\n" +
                    "● what layout(s) are used to create\n" +
                    "the appearance at right?\n" +
                    "– overall activity: __________\n" +
                    "– internal layouts: _________       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==18){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   Nested layout template\n\n\n" +
                    "<OuterLayoutType ...>\n" +
                    "<InnerLayoutType ...>\n" +
                    "<Widget ... />\n" +
                    "<Widget ... />\n" +
                    "</InnerLayoutType>\n" +
                    "<InnerLayoutType ...>\n" +
                    "<Widget ... />\n" +
                    "<Widget ... />\n" +
                    "</InnerLayoutType>\n" +
                    "<Widget ... />\n" +
                    "<Widget ... />\n" +
                    "</OuterLayoutType>       ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==19){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="     Nested layout exercise\n\n\n" +
                    "● Write the layout XML necessary to create the following app UI.\n" +
                    "– How many overall layouts are needed?\n" +
                    "– Which widgets go into which layouts?\n" +
                    "– ...     ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==20){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="      Nested layout solution\n\n\n" +
                    "<LinearLayout ...\n" +
                    "android:orientation=\"vertical\" android:gravity=\"center|top\">\n" +
                    "<Button ... android:text=\"B1\" />\n" +
                    "<LinearLayout ...\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:orientation=\"horizontal\"\n" +
                    "android:gravity=\"center|top\">\n" +
                    "<Button ... android:text=\"B2\" />\n" +
                    "<Button ... android:text=\"Button Number 3\" />\n" +
                    "<Button ... android:text=\"B4\" />\n" +
                    "</LinearLayout>\n" +
                    "<Button ... android:text=\"B5\" />\n" +
                    "<Button ... android:text=\"B6\" android:layout_gravity=\"left\" />\n" +
                    "<LinearLayout ...\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:orientation=\"horizontal\"\n" +
                    "android:gravity=\"center|top\">\n" +
                    "<Button ... android:text=\"B7\" />\n" +
                    "<Button ... android:text=\"Button Number 8\" />\n" +
                    "</LinearLayout>\n" +
                    "</LinearLayout>    ";
            intent.putExtra("take",n1);
            startActivity(intent);}


        if(i==21){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="  RelativeLayout (link)\n\n\n" +
                    "● each widget's position and size are relative to other views\n" +
                    "– relative to \"parent\" (the activity itself)\n" +
                    "– relative to other widgets/views\n" +
                    "– x-positions of reference: left, right, center\n" +
                    "– y-positions of reference: top, bottom, center\n" +
                    "● intended to reduce the need for nested layouts   ";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==22){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="      Relative anchor points\n\n\n" +
                    "● properties for x/y relative to another widget:\n" +
                    "– layout_below, above, toLeftOf, toRightOf\n" +
                    "● set these to the ID of another widget in the format \"@id/theID\"\n" +
                    "(obviously, the given widget must have an ID for this to work)\n" +
                    "● properties for x/y relative to layout container (the activity):\n" +
                    "– layout_alignParentTop, Bottom, Left, Right\n" +
                    "● set these flags to a boolean value of \"true\" to enable them\n" +
                    "– layout_centerHorizontal, Vertical, InParent\n" +
                    "● set these flags to \"true\" to center the control within its parent in a dimension   ";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==23){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="   RelativeLayout example 1\n\n\n" +
                    "<RelativeLayout ... >\n" +
                    "<Button ... android:id=\"@+id/b1\" android:text=\"B1\"\n" +
                    "android:layout_alignParentTop=\"true\"\n" +
                    "android:layout_centerHorizontal=\"true\" />\n" +
                    "<Button ... android:id=\"@+id/b2\" android:text=\"B2\"\n" +
                    "android:layout_alignParentLeft=\"true\"\n" +
                    "android:layout_below=\"@+id/b1\" />\n" +
                    "<Button ... android:id=\"@+id/b3\" android:text=\"B3\"\n" +
                    "android:layout_centerHorizontal=\"true\"\n" +
                    "android:layout_below=\"@+id/b2\" />\n" +
                    "<Button ... android:id=\"@+id/b4\" android:text=\"B4\"\n" +
                    "android:layout_alignParentRight=\"true\"\n" +
                    "android:layout_below=\"@+id/b2\" />\n" +
                    "<TextView ... android:id=\"@+id/tv1\"\n" +
                    "android:text=\"I'm a TextView!\"\n" +
                    "android:layout_centerInParent=\"true\" />\n" +
                    "<Button ... android:id=\"@+id/b5\" android:text=\"B5\"\n" +
                    "android:padding=\"50dp\"\n" +
                    "android:layout_centerHorizontal=\"true\"\n" +
                    "android:layout_alignParentBottom=\"true\"\n" +
                    "android:layout_marginBottom=\"50dp\" />\n" +
                    "</RelativeLayout>   ";
            intent.putExtra("take",n1);
            startActivity(intent);}
        if(i==24){

            Intent intent = new Intent(Main5Activity.this,Show5.class);
            String n1="     FrameLayout (link)\n\n\n" +
                    "● meant to hold only a single widget inside,\n" +
                    "which occupies the entirety of the activity\n" +
                    "– most commonly used with layout fragments (seen later)\n" +
                    "– less useful for more complex layouts\n" +
                    "(can put in multiple items and move them to \"front\" in Z-order)\n" +
                    "<FrameLayout ... >\n" +
                    "<ImageView\n" +
                    "android:src=\"@drawable/jellybean\"\n" +
                    "... />\n" +
                    "</FrameLayout>   ";
            intent.putExtra("take",n1);
            startActivity(intent);}







    }


});

    }

}
