package project.com.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;
import java.lang.reflect.Array;

public class TestingPage extends AppCompatActivity {

    void radiomethod(){
        RadioGroup rt = (RadioGroup) findViewById(R.id.RadioGroup);
        rt.setOnCheckedChangeListener(  new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                RadioButton radioButton= (RadioButton) findViewById(i);


                if(radioButton.getId()==R.id.Saheans){

                    TextView t= (TextView) findViewById(R.id.checker);
                    t.setText("Q:2 is Correct");

                    counter_Answer++;


                }


            }
        });
    }
   TextView counter;
    TextView Question;
    EditText Answer;
    Button Click_Button;
public   int counter_Answer=0;
    int Question_counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_page);


        counter =(TextView) findViewById(R.id.Counter);
        Question =(TextView) findViewById(R.id.Question);
        Answer=(EditText) findViewById(R.id.Answer);
        Click_Button=(Button) findViewById(R.id.button8);
        radiomethod();

        final String[] Question_Arry={"Qno: 1 What Is Android ?","Qno: 2 What we call thes in Android Layouts Resources Manifest Views ?","Qno: 3 Android Run's On ?","Qno: 4 is Android is Open Source language ?","Qno: 5 Is this Book Was Helpful (Optional Question)?"};
        final String[] Answer_Arry={"programming language","android components","linux","yes","yes"};
///counter.setText(Question_Arry[Question_counter]);
Question.setText(Question_Arry[Question_counter]);
        //counter.setText(User_Answer+"----"+Answer_Arry[Question_counter]);

Button b= (Button) findViewById(R.id.button10);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });



        Click_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String User_Answer = Answer.getText().toString();

          try {


              if (User_Answer.contains(Answer_Arry[Question_counter])) {

                  Question_counter++;
                  counter_Answer++;
                  Question.setText(Question_Arry[Question_counter]);

                  Answer.setText("");
                  counter.setText("Right");
              } else {
                  counter.setText("Wrong");
              }
          }catch (Exception e){
//              counter.setText("Pass");
              Button playButton = (Button) findViewById(R.id.button9);
              playButton.setVisibility(View.VISIBLE);

              Toast.makeText(TestingPage.this,"Done",Toast.LENGTH_LONG);

              counter.setText("You Win :)");
          }

                if(counter_Answer==4){
                    Button playButton = (Button) findViewById(R.id.button9);
                    playButton.setVisibility(View.VISIBLE);



                }

            }


        });
        Button playButton = (Button) findViewById(R.id.button9);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri webpage = Uri.parse("https://wcs.smartdraw.com/certificate/img/certificate-1.jpg?bn=1510011100");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

               // Intent n = new Intent(TestingPage.this,Certificate.class);
                startActivity(webIntent);

            }
        });
    }}