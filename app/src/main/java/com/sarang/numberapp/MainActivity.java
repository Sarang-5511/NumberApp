package com.sarang.numberapp;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number {
        int number;

        public boolean Triangular() {
            int x = 1;
            int trianglenumber = 1;
            while (trianglenumber < number) {
                x++;
                trianglenumber = trianglenumber + x;

            }
            if (trianglenumber == number) {
                return true;
            } else {
                return false;
            }
        }

        public boolean Square() {
            double sqrt = Math.sqrt(number);
            if (((sqrt - Math.floor(sqrt)) == 0)) {
                return true;
            } else {
                return false;
            }
        }

    }
    public void Check(View view){
            EditText num1=(EditText) findViewById(R.id.editTextNumberDecimal);
            Number n1=new Number();
            n1.number=Integer.parseInt(num1.getText().toString());
            String msg="";
            if(n1.Square() && n1.Triangular()){
                msg="It is a triangular and sqaure number";
            }
       else if (n1.Square() ){
            msg="It is a  sqaure number";
        }
       else if (n1.Triangular() ){
            msg="It is a triangular number";
        }
       else{
           msg="It is neither triangular nor square";
            }
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            System.out.println(n1.Triangular());
            System.out.println(n1.Square());
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }
