package project.com.book;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.security.PrivateKey;
import java.security.PublicKey;



    public class Touchpaid extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new ToucheventView(this, null));


        }




        public  static class ToucheventView extends View {

            int i=1;
            int s=1;
            private Paint point= new Paint();
            private Path path= new Path();
            private static int stylecount=1;
            private static int v=5;
            private    static int code=1;
            private    static int color= Color.BLUE;
            private    static int bcolor=Color.WHITE;


            private static Paint.Style Style=Paint.Style.STROKE;







            public ToucheventView(Context context , AttributeSet attributeSet) {


                super(context,attributeSet);
                point.setAntiAlias(true);
                point.setColor(color);

                point.setStyle(Style);
                point.setStrokeJoin(Paint.Join.BEVEL);
// Intent in= getIntent();
                //i = in.getIntExtra("name",1);

                point.setStrokeWidth(v);

                //      point.clearShadowLayer();
                //String s="Color.BLACK";

                this.setBackgroundColor(bcolor);

            }




            @Override
            protected void onDraw(Canvas canvas){


                canvas.drawPath(path,point);
            }




            @Override
            public boolean onTouchEvent(MotionEvent event){

                float x=event.getX();
                float y= event.getY();
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        path.moveTo(x,y);
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        path.lineTo(x,y);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;

                    default:
                        return false;



                }


                invalidate();
                return true;}

        }





        @Override
        public  boolean onCreateOptionsMenu(Menu menu){

            getMenuInflater().inflate(R.menu.main2,menu);
            return true;

        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){

            int id = item.getItemId();
            if(id==R.id.setcolor){



                Intent intent= new Intent(Touchpaid.this,Touchpaid2.class);
                //intent.putExtra("take","Set Brush Color");
                //startActivityForResult(intent,3);
startActivity(intent);


            }




            if(id==R.id.Setbackcolor){


                Intent intent= new Intent(Touchpaid.this,Touchpaid2.class);
                intent.putExtra("take","Set BackGround Color");
                startActivityForResult(intent, 4);



            }if(id==R.id.SetWidth){
                Intent intent= new Intent(Touchpaid.this,Touchpaid2.class);
                intent.putExtra("take","Set Width");
                startActivityForResult(intent, 1);

            }if(id==R.id.setstyle){

                Intent intent= new Intent(Touchpaid.this,Touchpaid2.class);
                intent.putExtra("take","Set Brush Style 1 or 2 or 3");
                startActivityForResult(intent, 2);



            }
            if(id==R.id.clearscreen){

                recreate();

            }




            return  true;
        }



        @Override
        protected void onActivityResult(int requestCode,
                                        int resultCode, Intent intent) {
            super.onActivityResult(requestCode, resultCode, intent);
            if (requestCode == 1) {

                String s = intent.getStringExtra("name");
                int num1=Integer.parseInt(s);
                ToucheventView.v=num1;

                this.recreate();
            }



            if (requestCode == 3) {

                String s = intent.getStringExtra("name");


                if(s.equalsIgnoreCase("blue")){

                    ToucheventView.color=Color.BLUE;
                    this.recreate();}

                if(s.equalsIgnoreCase("yellow")){
                    ToucheventView.color=Color.YELLOW;
                    this.recreate();}else
                if(s.equalsIgnoreCase("white")){
                    ToucheventView.color=Color.WHITE;
                    this.recreate();}else
                if(s.equalsIgnoreCase("black")){

                    ToucheventView.color=Color.BLACK;
                    this.recreate();}else if(s.equalsIgnoreCase("red")){
                    ToucheventView.color=Color.RED;
                    this.recreate();}else
                if(s.equalsIgnoreCase("gray")){

                    ToucheventView.color=Color.GRAY;
                    this.recreate();}else

                if(s.equalsIgnoreCase("green")){

                    ToucheventView.color=Color.GREEN;
                    this.recreate();

                }





            }



            if (requestCode == 4) {

                String s = intent.getStringExtra("name");


                if(s.equalsIgnoreCase("blue")){

                    ToucheventView.bcolor=Color.BLUE;
                    this.recreate();}

                if(s.equalsIgnoreCase("yellow")){
                    ToucheventView.bcolor=Color.YELLOW;
                    this.recreate();}else
                if(s.equalsIgnoreCase("white")){
                    ToucheventView.bcolor=Color.WHITE;
                    this.recreate();}else
                if(s.equalsIgnoreCase("black")){

                    ToucheventView.bcolor=Color.BLACK;
                    this.recreate();}else if(s.equalsIgnoreCase("red")){
                    ToucheventView.bcolor=Color.RED;
                    this.recreate();}else
                if(s.equalsIgnoreCase("gray")){

                    ToucheventView.bcolor=Color.GRAY;
                    this.recreate();}else

                if(s.equalsIgnoreCase("green")){

                    ToucheventView.color=Color.GREEN;
                    this.recreate();

                }





            }














            if (requestCode == 2) {

                String s = intent.getStringExtra("name");
                int num1=Integer.parseInt(s);
                ToucheventView.stylecount=num1;


                if(ToucheventView.stylecount==1){

                    ToucheventView.Style=Paint.Style.STROKE;
                    this.recreate();
                }

                if(ToucheventView.stylecount==2){

                    ToucheventView.Style=Paint.Style.FILL;
                    this.recreate();
                }
                if(ToucheventView.stylecount==3){

                    ToucheventView.Style=Paint.Style.FILL_AND_STROKE;
                    this.recreate();
                }

            }

        }}
