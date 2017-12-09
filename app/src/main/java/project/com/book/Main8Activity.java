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

public class Main8Activity extends AppCompatActivity {

        private static ListView listView;
    public ArrayAdapter<String> adapter;

    private  static  String[] Topicsx= {"Situational layouts\n", "Situation-specific folders\n", "Portrait vs landscape layout\n", "Problem: redundant layouts\n", "Fragments (link)\n"
    ,"Creating a fragment\n", "Using fragments in activity XML\n" ,"Fragment life cycle\n" ,"Another fragment lifecycle view\n" ,"Fragment template\n" ,"Fragment vs. activity\n" ,"Fragment onClick listener\n" ,"Activity that accepts parameters\n" ,"Fragment that accepts parameters\n" ,"Communication between fragments\n" ,"Fragment subclasses\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
filter();
    call();}






    void filter(){
        EditText editText= (EditText) findViewById(R.id.filter);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (Main8Activity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }



    public void call(){

        listView = (ListView) findViewById(R.id.eight8);
         adapter= new ArrayAdapter<String>(Main8Activity.this,R.layout.topic_list,Topicsx);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Situational layouts\n\n\n" +
                            "● Your app can use different layout in different situations:\n" +
                            "– different device type (tablet vs phone vs watch)\n" +
                            "– different screen size\n" +
                            "– different orientation (portrait vs. landscape)\n" +
                            "– different country or locale (language, etc.)   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}

                if(i==1){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Situation-specific folders\n\n\n" +
                            "● Your app will look for resource folder names with suffixes:\n" +
                            "– screen density (e.g. drawable-hdpi) (link)\n" +
                            "● xhdpi: 2.0 (twice as many pixels/dots per inch)\n" +
                            "● hdpi: 1.5\n" +
                            "● mdpi: 1.0 (baseline)\n" +
                            "● ldpi: 0.75\n" +
                            "– screen size (e.g. layout-large) (link)\n" +
                            "● small, normal, large, xlarge\n" +
                            "– orientation (e.g. layout-land)\n" +
                            "● portrait (), land (landscape)   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==2){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Portrait vs landscape layout\n\n\n" +
                            "● To create a different layout in landscape mode:\n" +
                            "– create a folder in your project called res/layout-land\n" +
                            "– place another copy of your activity's layout XML file there\n" +
                            "– modify it as needed to represent the differences   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==3){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="   Problem: redundant layouts\n\n\n" +
                            "● With situational layout you begin to encounter redundancy.\n" +
                            "– The layout in one case (e.g. portrait or medium) is very similar to the\n" +
                            "layout in another case (e.g. landscape or large).\n" +
                            "– You don't want to represent the same XML or Java code multiple times\n" +
                            "in multiple places.\n" +
                            "● You sometimes want your code to behave situationally.\n" +
                            "– In portrait mode, clicking a button should launch a new activity.\n" +
                            "– In landscape mode, clicking a button should launch a new view.    ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==4){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Fragments (link)\n\n\n" +
                            "● fragment: A reusable segment of Android UI\n" +
                            "that can appear in an activity.\n" +
                            "– can help handle different devices and screen sizes\n" +
                            "– can reuse a common fragment across multiple activities\n" +
                            "– first added in Android 3.0 (usable in older versions if necessary)   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==5){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="  Creating a fragment\n\n\n" +
                            "● In Android Studio, right-click app, click:\n" +
                            "New → Fragment → Fragment (blank)\n" +
                            "– un-check boxes about \"Include __ methods\"\n" +
                            "– now create layout XML and Java event code as in an Activity     ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==6){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Using fragments in activity XML\n\n\n" +
                            "● Activity layout XML can include fragments.\n" +
                            "<!-- activity_name.xml -->\n" +
                            "<LinearLayout ...>\n" +
                            "<fragment ...\n" +
                            "android:id=\"@+id/id1\"\n" +
                            "android:name=\"ClassName1\"\n" +
                            "tools:layout=\"@layout/name1\" />\n" +
                            "<fragment ...\n" +
                            "android:id=\"@+id/id2\"\n" +
                            "android:name=\"ClassName2\"\n" +
                            "tools:layout=\"@layout/name2\" />\n" +
                            "</LinearLayout>   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==7){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Fragment life cycle\n\n\n" +
                            "● Fragments have a similar life cycle\n" +
                            "and events as activities.\n" +
                            "● Important methods:\n" +
                            "– onAttach to glue fragment to its\n" +
                            "surrounding activity\n" +
                            "– onCreate when fragment is loading\n" +
                            "– onCreateView method that must\n" +
                            "return fragment's root UI view\n" +
                            "– onActivityCreated method that\n" +
                            "indicates the enclosing activity is ready\n" +
                            "– onPause when fragment\n" +
                            "is being left/exited\n" +
                            "– onDetach just as fragment\n" +
                            "is being deleted   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==8){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Another fragment lifecycle view   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==9){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="    Fragment template\n\n\n" +
                            "public class Name extends Fragment {\n" +
                            "@Override\n" +
                            "public View onCreateView(LayoutInflater inflater,\n" +
                            "ViewGroup vg, Bundle bundle) {\n" +
                            "// load the GUI layout from the XML\n" +
                            "return inflater.inflate(R.layout.id, vg, false);\n" +
                            "}\n" +
                            "public void onActivityCreated(Bundle savedState) {\n" +
                            "super.onActivityCreated(savedState);\n" +
                            "// ... any other GUI initialization needed\n" +
                            "}\n" +
                            "// any other code (e.g. event-handling)\n" +
                            "}   ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==10){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="  Fragment vs. activity\n\n\n" +
                            "● Fragment code is similar to activity code, with a few changes:\n" +
                            "– Many activity methods aren't present in the fragment, but you can call\n" +
                            "getActivity to access the activity the fragment is inside of.\n" +
                            "Button b = (Button) findViewById(R.id.but);\n" +
                            "Button b = (Button) getActivity().findViewById(R.id.but);\n" +
                            "– Sometimes also use getView to refer to the activity's layout\n" +
                            "– Event handlers cannot be attached in the XML any more. :-(\n" +
                            "● Must be attached in Java code instead.\n" +
                            "– Passing information to a fragment (via Intents/Bundles) is trickier.\n" +
                            "● The fragment must ask its enclosing activity for the information.\n" +
                            "– Fragment initialization code must be mindful of order of execution.\n" +
                            "● Does it depend on the surrounding activity being loaded? Etc.\n" +
                            "● Typically move onCreate code to onActivityCreated.     ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==11){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="   Fragment onClick listener\n\n\n" +
                            "● Activity:\n" +
                            "<Button android:id=\"@+id/b1\"\n" +
                            "android:onClick=\"onClickB1\" ... />\n" +
                            "● Fragment:\n" +
                            "<Button android:id=\"@+id/b1\" ... />\n" +
                            "// in fragment's Java file\n" +
                            "Button b = (Button) getActivity().findViewById(r.id.b1);\n" +
                            "b.setOnClickListener(new View.OnClickListener() {\n" +
                            "@Override public void onClick(View view) {\n" +
                            "// whatever code would have been in onClickB1\n" +
                            "}\n" +
                            "});    ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==12){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="   Activity that accepts parameters\n\n\n" +
                            "public class Name extends Activity {\n" +
                            "@Override\n" +
                            "protected void onCreate(Bundle savedInstanceState) {\n" +
                            "super.onCreate(savedInstanceState);\n" +
                            "setContentView(R.layout.name);\n" +
                            "// extract parameters passed to activity from intent\n" +
                            "Intent intent = getIntent();\n" +
                            "int name1 = intent.getIntExtra(\"id1\", default);\n" +
                            "String name2 = intent.getStringExtra(\"id2\", \"default\");\n" +
                            "// use parameters to set up the initial state\n" +
                            "...\n" +
                            "}\n" +
                            "...\n" +
                            "}    ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==13){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="  Fragment that accepts parameters\n\n\n" +
                            "public class Name extends Fragment {\n" +
                            "@Override\n" +
                            "public View onCreateView(LayoutInflater inflater,\n" +
                            "ViewGroup container, Bundle savedInstanceState) {\n" +
                            "return inflater.inflate(R.layout.name, container, false);\n" +
                            "}\n" +
                            "@Override\n" +
                            "public void onActivityCreated(Bundle savedState) {\n" +
                            "super.onActivityCreated(savedState);\n" +
                            "// extract parameters passed to activity from intent\n" +
                            "Intent intent = getActivity().getIntent();\n" +
                            "int name1 = intent.getIntExtra(\"id1\", default);\n" +
                            "String name2 = intent.getStringExtra(\"id2\", \"default\");\n" +
                            "// use parameters to set up the initial state\n" +
                            "...\n" +
                            "}     ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==14){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="  Communication between fragments\n\n\n" +
                            "● One activity might contain multiple fragments.\n" +
                            "● The fragments may want to talk to each other.\n" +
                            "– Use activity's getFragmentManager method.\n" +
                            "– its findFragmentById method can\n" +
                            "access any fragment that has an id.\n" +
                            "Activity act = getActivity();\n" +
                            "if (act.getResources().getConfiguration().orientation ==\n" +
                            "Configuration.ORIENTATION_LANDSCAPE) {\n" +
                            "// update other fragment within this same activity\n" +
                            "FragmentClass fragment = (FragmentClass)\n" +
                            "act.getFragmentManager().findFragmentById(R.id.id);\n" +
                            "fragment.methodName(parameters);\n" +
                            "}     ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}
                if(i==15){

                    Intent intent = new Intent(Main8Activity.this,Show8.class);
                    String n1="   Fragment subclasses\n\n\n" +
                            "● DialogFragment - a fragment meant to\n" +
                            "be shown as a dialog box that pops up\n" +
                            "on top of the current activity.\n" +
                            "● ListFragment - a fragment that shows\n" +
                            "a list of items as its main content.\n" +
                            "● PreferenceFragment - a fragment\n" +
                            "whose main content is meant to allow\n" +
                            "the user to change settings for the app.    ";
                    intent.putExtra("take",n1);
                    startActivity(intent);}

            }
        });

    }
}
