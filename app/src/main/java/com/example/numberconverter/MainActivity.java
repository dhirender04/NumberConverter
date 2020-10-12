package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {
//    private EditText enterNumber;
//    private Button convert;
//    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        enterNumber=findViewById(R.id.enterNumber);
//        txtView=findViewById(R.id.txtView);
//        convert=findViewById(R.id.btnConvert);

//        convert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int n1=Integer.parseInt(String.valueOf(enterNumber.getText()));
//                String word=convertNumber(n1);
//                txtView.setText(word);
//
//            }
//        });


    }
//    String fun(int n){
//        String str="";
//        String[] units={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
//        "Ten","Eleven","Twelve","Thirteen","Fourteen",
//                "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
//
//        String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
//
//        //Code for Converting Numbers to Words//
//
//        if(n<20) {
//            str = units[n];
//        }
//            else if(n>=20 && n<100 ){
//                str=tens[n/10]+units[n%10];
//            }
//
//        return str;
//    }
//    String convertNumber(int num){
//        String str1="";
//        if(num<100){
//            str1=fun(num);
//        }
//        return str1;
//    }
}