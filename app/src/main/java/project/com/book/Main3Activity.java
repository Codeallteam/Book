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
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private  static ListView listView;
    private  String[] arry = {"Variables\n","Java's primitive types\n","Type casting\n","Increment and decrement\n","Precedence\n","String concatenation\n","Variable scope\n" ,"Class constants\n","Passing parameters\n","Return\n","Java's Math class\n",
    "Returning a value\n","Strings\n","String methods\n","String test methods\n","The equals method\n","Type char\n","char vs. String\n","if/else\n","Relational expressions\n","Logical operators: &&, ||, !\n","Type boolean\n","if/else Structures\n","while loops\n","do/while loops\n","The Random class\n","break\n","Arrays\n","Array declaration\n","Accessing elements\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        filter();
        cal();

    }

void filter(){
    EditText editText= (EditText) findViewById(R.id.editText);
    editText.addTextChangedListener(new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            (Main3Activity.this).adapter.getFilter().filter(charSequence);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    });
}


    public  void cal(){
        listView = (ListView) findViewById(R.id.two2);

         adapter = new ArrayAdapter  <String>(this,R.layout.topic_list,arry);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




                if(i==0){

                    Intent s= new Intent(Main3Activity.this,Show3.class);

                    String ss="Variables\n\n\n" +
                            "● variable: A piece of the computer's memory that is given a\n" +
                            "name and type, and can store a value.\n" +
                            "● A variable can be declared/initialized in one statement.\n" +
                            "● Syntax:\n" +
                            "type name = value;\n" +
                            "– double myGPA = 3.95;\n" +
                            "– int x = (11 % 3) + 12;";

                    s.putExtra("take",ss);
                    startActivity(s);




                }

                if(i==1){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Java's primitive types\n\n\n" +
                            "\uF097 primitive types: 8 simple types for numbers, text, etc.\n" +
                            "\uF097 Java also has object types, which we'll talk about later\n" +
                            "Name Description Examples\n" +
                            "\uF097 int integers 42, -3, 0, 926394\n" +
                            "\uF097 double real numbers 3.1, -0.25, 9.4e3\n" +
                            "\uF097 char single text characters 'a', 'X', '?', '\\n'\n" +
                            "\uF097 boolean logical values true, false\n" +
                            "• Why does Java distinguish integers vs. real numbers?";s.putExtra("take",ss);startActivity(s);}


                if(i==2){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Type casting\n\n\n" +
                        "● type cast: A conversion from one type to another.\n" +
                        "– To promote an int into a double to get exact division from /\n" +
                        "– To truncate a double from a real number to an integer\n" +
                        "● Syntax:\n" +
                        "(type) expression\n" +
                        "Examples:\n" +
                        "double result = (double) 19 / 5; // 3.8\n" +
                        "int result2 = (int) result; // 3\n" +
                        "int x = (int) Math.pow(10, 3); // 1000";s.putExtra("take",ss);startActivity(s);}

                if(i==3){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Increment and decrement\n\n\n" +
                        "shortcuts to increase or decrease a variable's value by 1\n" +
                        "Shorthand Equivalent longer version\n" +
                        "variable++; variable = variable + 1;\n" +
                        "variable--; variable = variable - 1;\n" +
                        "int x = 2;\n" +
                        "x++; // x = x + 1;\n" +
                        "// x now stores 3\n" +
                        "double gpa = 2.5;\n" +
                        "gpa--; // gpa = gpa - 1;\n" +
                        "// gpa now stores 1.5";s.putExtra("take",ss);startActivity(s);}

                if(i==4){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Java's primitive types\n\n\n" +
                        "\uF097 primitive types: 8 simple types for numbers, text, etc.\n" +
                        "\uF097 Java also has object types, which we'll talk about later\n" +
                        "Name Description Examples\n" +
                        "\uF097 int integers 42, -3, 0, 926394\n" +
                        "\uF097 double real numbers 3.1, -0.25, 9.4e3\n" +
                        "\uF097 char single text characters 'a', 'X', '?', '\\n'\n" +
                        "\uF097 boolean logical values true, false\n" +
                        "• Why does Java distinguish integers vs. real numbers?";s.putExtra("take",ss);startActivity(s);}

                if(i==5){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Precedence\n\n\n" +
                        "● precedence: Order in which operators are evaluated.\n" +
                        "– Generally operators evaluate left-to-right.\n" +
                        "1 - 2 - 3 is (1 - 2) - 3 which is -4\n" +
                        "– But */% have a higher level of precedence than +-\n" +
                        "1 + 3 * 4 is 13\n" +
                        "6 + 8 / 2 * 3\n" +
                        "6 + 4 * 3\n" +
                        "6 + 12 is 18\n" +
                        "– Parentheses can force a certain order of evaluation:\n" +
                        "(1 + 3) * 4 is 16\n" +
                        "– Spacing does not affect order of evaluation\n" +
                        "1+3 * 4-2 is 11";s.putExtra("take",ss);startActivity(s);}

                if(i==6){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="String concatenation\n\n\n" +
                        "\uF097 string concatenation: Using + between a string and another value\n" +
                        "to make a longer string.\n" +
                        "\"hello\" + 42 is \"hello42\"\n" +
                        "1 + \"abc\" + 2 is \"1abc2\"\n" +
                        "\"abc\" + 1 + 2 is \"abc12\"\n" +
                        "1 + 2 + \"abc\" is \"3abc\"\n" +
                        "\"abc\" + 9 * 3 is \"abc27\"\n" +
                        "\"1\" + 1 is \"11\"\n" +
                        "4 - 1 + \"abc\" is \"3abc\"\n" +
                        "\uF097 Use + to print a string and an expression's value together.\n" +
                        "\uF097 System.out.println(\"Grade: \" + (95.1 + 71.9) / 2);\n" +
                        "• Output: Grade: 83.5";s.putExtra("take",ss);startActivity(s);}

                if(i==7){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Variable scope\n\n\n" +
                        "● scope: The part of a program where a variable exists.\n" +
                        "– From its declaration to the end of the { } braces\n" +
                        "● A variable declared in a for loop exists only in that loop.\n" +
                        "● A variable declared in a method exists only in that method.\n" +
                        "public static void example() {\n" +
                        "int x = 3;\n" +
                        "for (int i = 1; i <= 10; i++) {\n" +
                        "System.out.println(x);\n" +
                        "}\n" +
                        "// i no longer exists here\n" +
                        "} // x ceases to exist here";s.putExtra("take",ss);startActivity(s);}

                if(i==8){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Class constants\n\n\n" +
                        "● class constant: A value visible to the whole program.\n" +
                        "– value can only be set at declaration\n" +
                        "– value can't be changed while the program is running\n" +
                        "● Syntax:\n" +
                        "public static final type name = value;\n" +
                        "– name is usually in ALL_UPPER_CASE\n" +
                        "– Examples:\n" +
                        "public static final int DAYS_IN_WEEK = 7;\n" +
                        "public static final double INTEREST_RATE = 3.5;\n" +
                        "public static final int SSN = 658234569;";s.putExtra("take",ss);startActivity(s);}

                if(i==9){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Passing parameters\n\n\n" +
                        "● Declaration:\n" +
                        "public void name (type name, ..., type name) {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "● Call:\n" +
                        "methodName (value, value, ..., value);\n" +
                        "● Example:\n" +
                        "public static void main(String[] args) {\n" +
                        "sayPassword(42); // The password is: 42\n" +
                        "sayPassword(12345); // The password is: 12345\n" +
                        "}\n" +
                        "public static void sayPassword(int code) {\n" +
                        "System.out.println(\"The password is: \" + code);\n" +
                        "}";s.putExtra("take",ss);startActivity(s);}

                if(i==10){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Return\n\n\n" +
                        "● return: To send out a value as the result of a method.\n" +
                        "– The opposite of a parameter:\n" +
                        "● Parameters send information in from the caller to the method.\n" +
                        "● Return values send information out from a method to its caller.\n" +
                        "main\n" +
                        "-42 Math.abs(42)\n" +
                        "Math.round(2.71)";s.putExtra("take",ss);startActivity(s);}

                if(i==11){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Java's Math class\n\n\n" +
                        "Method name Description\n" +
                        "Math.abs(value) absolute value\n" +
                        "Math.round(value) nearest whole number\n" +
                        "Math.ceil(value) rounds up\n" +
                        "Math.floor(value) rounds down\n" +
                        "Math.log10(value) logarithm, base 10\n" +
                        "Math.max(value1, value2) larger of two values\n" +
                        "Math.min(value1, value2) smaller of two values\n" +
                        "Math.pow(base, exp) base to the exp power\n" +
                        "Math.sqrt(value) square root\n" +
                        "Math.sin(value)\n" +
                        "Math.cos(value)\n" +
                        "Math.tan(value)\n" +
                        "sine/cosine/tangent of\n" +
                        "an angle in radians\n" +
                        "Math.toDegrees(value)\n" +
                        "Math.toRadians(value)\n" +
                        "convert degrees to\n" +
                        "radians and back\n" +
                        "Math.random() random double between 0 and 1";s.putExtra("take",ss);startActivity(s);}

                if(i==12){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Returning a value\n\n\n" +
                        "public type name(parameters) {\n" +
                        "statements;\n" +
                        "...\n" +
                        "return expression;\n" +
                        "}\n" +
                        "● Example:\n" +
                        "// Returns the slope of the line between the given points.\n" +
                        "public double slope(int x1, int y1, int x2, int y2) {\n" +
                        "double dy = y2 - y1;\n" +
                        "double dx = x2 - x1;\n" +
                        "return dy / dx;\n" +
                        "}";s.putExtra("take",ss);startActivity(s);}

                if(i==13){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Strings\n\n\n" +
                        "\uF097 string: An object storing a sequence of text characters.\n" +
                        "String name = \"text\";\n" +
                        "String name = expression;\n" +
                        "\uF097 Characters of a string are numbered with 0-based indexes:\n" +
                        "String name = \"P. Diddy\";\n" +
                        "\uF097 The first character's index is always 0\n" +
                        "\uF097 The last character's index is 1 less than the string's length\n" +
                        "\uF097 The individual characters are values of type char";s.putExtra("take",ss);startActivity(s);}

                if(i==14){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="String methods\n\n\n" +
                        "● These methods are called using the dot notation:\n" +
                        "String gangsta = \"Dr. Dre\";\n" +
                        "System.out.println(gangsta.length()); // 7\n" +
                        "Method name Description\n" +
                        "indexOf(str) index where the start of the given string appears in this\n" +
                        "string (-1 if it is not there)\n" +
                        "length() number of characters in this string\n" +
                        "substring(index1, index2)\n" +
                        "or\n" +
                        "substring(index1)\n" +
                        "the characters in this string from index1 (inclusive) to\n" +
                        "index2 (exclusive);\n" +
                        "if index2 omitted, grabs till end of string\n" +
                        "toLowerCase() a new string with all lowercase letters\n" +
                        "toUpperCase() a new string with all uppercase letters";s.putExtra("take",ss);startActivity(s);}

                if(i==15){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="String test methods\n\n\n" +
                        "String name = console.next();\n" +
                        "if (name.startsWith(\"Dr.\")) {\n" +
                        "System.out.println(\"Are you single?\");\n" +
                        "} else if (name.equalsIgnoreCase(\"LUMBERG\")) {\n" +
                        "System.out.println(\"I need your TPS reports.\");\n" +
                        "}\n" +
                        "Method Description\n" +
                        "equals(str) whether two strings contain the same characters\n" +
                        "equalsIgnoreCase(str) whether two strings contain the same characters, ignoring upper vs.\n" +
                        "lower case\n" +
                        "startsWith(str) whether one contains other's characters at start\n" +
                        "endsWith(str) whether one contains other's characters at end\n" +
                        "contains(str) whether the given string is found within this one";s.putExtra("take",ss);startActivity(s);}

                if(i==16){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="The equals method\n\n\n" +
                        "● Objects are compared using a method named equals.\n" +
                        "Scanner console = new Scanner(System.in);\n" +
                        "System.out.print(\"What is your name? \");\n" +
                        "String name = console.next();\n" +
                        "if (name.equals(\"Barney\")) {\n" +
                        "System.out.println(\"I love you, you love me,\");\n" +
                        "System.out.println(\"We're a happy family!\");\n" +
                        "}\n" +
                        "– Technically this is a method that returns a value of type boolean,\n" +
                        "the type used in logical tests.";s.putExtra("take",ss);startActivity(s);}


                if(i==17){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Type char\n\n\n" +
                        "● char : A primitive type representing single characters.\n" +
                        "– Each character inside a String is stored as a char value.\n" +
                        "– Literal char values are surrounded with apostrophe\n" +
                        "(single-quote) marks, such as 'a' or '4' or '\\n' or '\\''\n" +
                        "– It is legal to have variables, parameters, returns of type char\n" +
                        "char letter = 'S';\n" +
                        "System.out.println(letter); // S\n" +
                        "● char values can be concatenated with strings.\n" +
                        "char initial = 'P';\n" +
                        "System.out.println(initial + \" Diddy\"); // P\n" +
                        "Diddy";s.putExtra("take",ss);startActivity(s);}
                if(i==18){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="char vs. String\n\n\n" +
                        "\uF097 \"h\" is a String\n" +
                        "'h' is a char (the two behave differently)\n" +
                        "\uF097 String is an object; it contains methods\n" +
                        "String s = \"h\";\n" +
                        "s = s.toUpperCase(); // 'H'\n" +
                        "int len = s.length(); // 1\n" +
                        "char first = s.charAt(0); // 'H'\n" +
                        "\uF097 char is primitive; you can't call methods on it\n" +
                        "char c = 'h';\n" +
                        "c = c.toUpperCase(); // ERROR: \"cannot be dereferenced\"\n" +
                        "\uF097 What is s + 1 ? What is c + 1 ?\n" +
                        "\uF097 What is s + s ? What is c + c ?";s.putExtra("take",ss);startActivity(s);}
                if(i==19){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="if/else\n\n\n" +
                        "Executes one block if a test is true, another if false\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "} else {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "● Example:\n" +
                        "double gpa = console.nextDouble();\n" +
                        "if (gpa >= 2.0) {\n" +
                        "System.out.println(\"Welcome to Mars University!\");\n" +
                        "} else {\n" +
                        "System.out.println(\"Application denied.\");\n" +
                        "}";s.putExtra("take",ss);startActivity(s);}
                if(i==20){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Relational expressions\n\n\n" +
                        "● A test in an if is the same as in a for loop.\n" +
                        "for (int i = 1; i <= 10; i++) { ...\n" +
                        "if (i <= 10) { ...\n" +
                        "– These are boolean expressions.\n" +
                        "● Tests use relational operators:\n" +
                        "Operator Meaning Example Value\n" +
                        "== equals 1 + 1 == 2 true\n" +
                        "!= does not equal 3.2 != 2.5 true\n" +
                        "< less than 10 < 5 false\n" +
                        "> greater than 10 > 5 true\n" +
                        "<= less than or equal to 126 <= 100 false\n" +
                        ">= greater than or equal to 5.0 >= 5.0 true";s.putExtra("take",ss);startActivity(s);}
                if(i==21){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Logical operators: &&, ||, !\n\n\n" +
                        "● Conditions can be combined using logical operators:\n" +
                        "● \"Truth tables\" for each, used with logical values p and q:\n" +
                        "Operator Description Example Result\n" +
                        "&& and (2 == 3) && (-1 < 5) false\n" +
                        "|| or (2 == 3) || (-1 < 5) true\n" +
                        "! not !(2 == 3) true\n" +
                        "p q p && q p || q\n" +
                        "true true true true\n" +
                        "true false false true\n" +
                        "false true false true\n" +
                        "false false false false\n" +
                        "p !p\n" +
                        "true false\n" +
                        "false true";s.putExtra("take",ss);startActivity(s);}
                if(i==22){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Type boolean\n\n\n" +
                        "● boolean: A logical type whose values are true and false.\n" +
                        "– A test in an if, for, or while is a boolean expression.\n" +
                        "– You can create boolean variables, pass boolean parameters, return\n" +
                        "boolean values from methods, ...\n" +
                        "boolean minor = (age < 21);\n" +
                        "boolean expensive = iPhonePrice > 200.00;\n" +
                        "boolean iLoveCS = true;\n" +
                        "if (minor) {\n" +
                        "System.out.println(\"Can't purchase alcohol!\");\n" +
                        "}i\n" +
                        "f (iLoveCS || !expensive) {\n" +
                        "System.out.println(\"Buying an iPhone\");\n" +
                        "}";s.putExtra("take",ss);startActivity(s);}
                if(i==23){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="if/else Structures\n\n\n" +
                        "\uF097 Exactly 1 path: (mutually exclusive)\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "} else if (test) {\n" +
                        "statement(s);\n" +
                        "} else {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "\uF097 0 or 1 path:\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "} else if (test) {\n" +
                        "statement(s);\n" +
                        "} else if (test) {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "\uF097 0, 1, or many paths: (independent tests, not exclusive)\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "if (test) {\n" +
                        "statement(s);\n" +
                        "}";s.putExtra("take",ss);startActivity(s);}
                if(i==24){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="while loops\n\n\n" +
                        "● while loop: Repeatedly executes its\n" +
                        "body as long as a logical test is true.\n" +
                        "while (test) {\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "● Example:\n" +
                        "int num = 1; // initialization\n" +
                        "while (num <= 200) { // test\n" +
                        "System.out.print(num + \" \");\n" +
                        "num = num * 2; // update\n" +
                        "}\n" +
                        "– OUTPUT:\n" +
                        "1 2 4 8 16 32 64 128";s.putExtra("take",ss);startActivity(s);}
                if(i==25){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="do/while loops\n\n\n" +
                        "● do/while loop: Executes statements repeatedly while a condition is true,\n" +
                        "testing it at the end of each repetition.\n" +
                        "do {\n" +
                        "statement(s);\n" +
                        "} while (test);\n" +
                        "\uF097 Example:\n" +
                        "// prompt until the user gets the right password\n" +
                        "String phrase;\n" +
                        "do {\n" +
                        "System.out.print(\"Password: \");\n" +
                        "phrase = console.next();\n" +
                        "} while (!phrase.equals(\"abracadabra\"));";s.putExtra("take",ss);startActivity(s);}
                if(i==26){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="The Random class\n\n\n" +
                        "● A Random object generates pseudo-random* numbers.\n" +
                        "– Class Random is found in the java.util package.\n" +
                        "import java.util.*;\n" +
                        "– Example:\n" +
                        "Random rand = new Random();\n" +
                        "int randomNumber = rand.nextInt(10); // 0-9\n" +
                        "Method name Description\n" +
                        "nextInt() returns a random integer\n" +
                        "nextInt(max) returns a random integer in the range [0, max)\n" +
                        "in other words, 0 to max-1 inclusive\n" +
                        "nextDouble() returns a random real number in the range [0.0, 1.0)";s.putExtra("take",ss);startActivity(s);}
                if(i==27){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="break\n\n\n" +
                        "● break statement: Immediately exits a loop.\n" +
                        "– Can be used to write a loop whose test is in the middle.\n" +
                        "– Such loops are often called \"forever\" loops because their header's\n" +
                        "boolean test is often changed to a trivial true.\n" +
                        "while (true) {\n" +
                        "statement(s);\n" +
                        "if (test) {\n" +
                        "break;\n" +
                        "}\n" +
                        "statement(s);\n" +
                        "}\n" +
                        "– Some programmers consider break to be bad style.";s.putExtra("take",ss);startActivity(s);}
                if(i==28){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Arrays\n\n\n" +
                        "● array: object that stores many values of the same type.\n" +
                        "– element: One value in an array.\n" +
                        "– index: A 0-based integer to access an element from an array.\n" +
                        "index 0 1 2 3 4 5 6 7 8 9\n" +
                        "value 12 49 -2 26 5 17 -6 84 72 3\n" +
                        "element 0 element 4 element 9";s.putExtra("take",ss);startActivity(s);}
                if(i==29){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Array declaration\n\n\n" +
                        "type[] name = new type[length];\n" +
                        "\uF097 Example:\n" +
                        "int[] numbers = new int[10];\n" +
                        "index 0 1 2 3 4 5 6 7 8 9\n" +
                        "value 0 0 0 0 0 0 0 0 0 0";s.putExtra("take",ss);startActivity(s);}
                if(i==30){Intent s= new Intent(Main3Activity.this,Show3.class);String ss="Accessing elements\n\n\n" +
                        "name[index] // access\n" +
                        "name[index] = value; // modify\n" +
                        "– Example:\n" +
                        "numbers[0] = 27;\n" +
                        "numbers[3] = -6;\n" +
                        "System.out.println(numbers[0]);\n" +
                        "if (numbers[3] < 0) {\n" +
                        "System.out.println(\"Element 3 is negative.\");\n" +
                        "}\n" +
                        "0 0 index 0 1 2 3 4 5 6 7 8 9\n" +
                        "value 27 0 0 -6 0 0 0 0 0 0";s.putExtra("take",ss);startActivity(s);}



            }
        });


    }


}
