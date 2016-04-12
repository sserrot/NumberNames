package com.example.santiago.numbernames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText enter = (EditText) findViewById(R.id.enter);
    Button go = (Button) findViewById(R.id.button);
    EditText calc = (EditText) findViewById(R.id.calc);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int wordNumber = findWordNumber(enter.getText().toString());
                calc.setText(wordNumber);
            }
        });
    }

    public int findWordNumber(String s) {
        int wordNum = 0;
        HashMap letterNumValue = new HashMap(26);
        letterNumValue.put("a",1);
        letterNumValue.put("b",2);
        letterNumValue.put("c",3);
        letterNumValue.put("d",4);
        letterNumValue.put("e",5);
        letterNumValue.put("f",6);
        letterNumValue.put("g",7);
        letterNumValue.put("h",8);
        letterNumValue.put("i",9);
        letterNumValue.put("j",10);
        letterNumValue.put("k",11);
        letterNumValue.put("l",12);
        letterNumValue.put("m",13);
        letterNumValue.put("n",14);
        letterNumValue.put("o",15);
        letterNumValue.put("p",16);
        letterNumValue.put("q",17);
        letterNumValue.put("r",18);
        letterNumValue.put("s",19);
        letterNumValue.put("t",20);
        letterNumValue.put("u",21);
        letterNumValue.put("v",22);
        letterNumValue.put("w",23);
        letterNumValue.put("x",24);
        letterNumValue.put("y",25);
        letterNumValue.put("z",26);
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(i, (i + 1));
            wordNum = wordNum + (int) letterNumValue.get(s);
        }
        // take a string and find the "number" of each word. a=1 b=2 etc.
        // return int of the number
        return wordNum;
    }
    public void addWords()
    {
        // add the numbers together
    }
}
