package rafa.com.udacity.quizzz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Toast Variable

    int check=0;


    // 1st question Variables

    RadioButton question1Answer1;
    RadioButton question1Answer2;
    RadioButton question1Answer3;
    RadioGroup radioGroupQuestion1;
    TextView solution1;
    Button checkButton;
    Button checkButton2;

    // 2nd question Variables

    TextView solution2;
    EditText question2Answer;

    //3rd question Variables

    CheckBox Answer3Option1;
    CheckBox Answer3Option2;
    CheckBox Answer3Option3;
    TextView solution3;

    // 4th question Variables

    RadioButton question4Answer1;
    RadioButton question4Answer2;
    RadioButton question4Answer3;
    RadioGroup radioGroupQuestion4;
    TextView solution4;

    // 5th question variables

    TextView solution5;
    EditText question5Answer;

    // 6th Question variables

    CheckBox Answer6Option1;
    CheckBox Answer6Option2;
    CheckBox Answer6Option3;
    TextView solution6;

    // No declaramos el button porque vamos a usar el mismo método para todas las preguntas

    //Question's Answer

    String answerQuestion1; // Question 1
    String answerQuestion2; // Question 2
    String answerQuestion3; // Question 3
    String answerQuestion4; // Question 4
    String answerQuestion5; // Question 5
    String answerQuestion6; // Question 6


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toast

        checkButton2 = (Button) findViewById(R.id.CheckAnswer);

        // 1st Radio button elements declaration

        question1Answer1 = (RadioButton) findViewById(R.id.radioButton);
        question1Answer2 = (RadioButton) findViewById(R.id.radioButton2);
        question1Answer3 = (RadioButton) findViewById(R.id.radioButton3);
        radioGroupQuestion1 = (RadioGroup) findViewById(R.id.radioGroupQuestion1);
        solution1 = (TextView) findViewById(R.id.wheelSolution);
        checkButton = (Button) findViewById(R.id.CheckAnswer);


        //2nd EditText  elements declaration

        question2Answer = (EditText) findViewById(R.id.editTextQuestion1);
        solution2 = (TextView) findViewById(R.id.motorbikeSolution);

        //3rd Checkox declaration

        Answer3Option1 = (CheckBox) findViewById(R.id.checkBox);
        Answer3Option2 = (CheckBox) findViewById(R.id.checkBox2);
        Answer3Option3 = (CheckBox) findViewById(R.id.checkBox3);
        solution3 = (TextView) findViewById(R.id.wheelSolution2);


        // 4th Radio button elements declaration

        question4Answer1 = (RadioButton) findViewById(R.id.radioButton4);
        question4Answer2 = (RadioButton) findViewById(R.id.radioButton5);
        question4Answer3 = (RadioButton) findViewById(R.id.radioButton6);
        radioGroupQuestion4 = (RadioGroup) findViewById(R.id.radioGroupQuestion4);
        solution4 = (TextView) findViewById(R.id.firstCarSolution);

        // 5th question Variables

        solution5 = (TextView) findViewById(R.id.pedalSolution);
        question5Answer = (EditText) findViewById(R.id.checkedTextView2);

        // 6th Variables

        Answer6Option1 = (CheckBox) findViewById(R.id.checkBox4);
        Answer6Option2 = (CheckBox) findViewById(R.id.checkBox5);
        Answer6Option3 = (CheckBox) findViewById(R.id.checkBox6);
        solution6 = (TextView) findViewById(R.id.fuelSolution);


// Question replied by Radio Button (1&4) Answer needs to set with setOnCheckedChangeListener

        radioGroupQuestion1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton Check = (RadioButton) group.findViewById(checkedId);

                switch (Check.getId()) {
                    case R.id.radioButton:answerQuestion1 = "That's correct¡¡¡";break;
                    case R.id.radioButton2:answerQuestion1 = "Incorrect answer, correct answer is A"; break;
                    case R.id.radioButton3:answerQuestion1 = "Incorrect answer, correct answer is A"; break;}}});

        radioGroupQuestion4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton Check = (RadioButton) group.findViewById(checkedId);

                switch (Check.getId()) {
                    case R.id.radioButton4: answerQuestion4 = "Incorrect answer, correct answer is B"; break;
                    case R.id.radioButton5: answerQuestion4 = "That's correct¡¡¡"; break;
                    case R.id.radioButton6: answerQuestion4 = "Incorrect answer, correct answer is B"; break;  }}});




        //Button is used for  all questions

        checkButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mi primer Toast", Toast.LENGTH_LONG).show();
            }});


        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Radio button questions  OK


                solution1.setText(answerQuestion1);
                if (answerQuestion1 != null && answerQuestion1.equals("That's correct¡¡¡")) {solution1.setTextColor(Color.GREEN);check=check+1;}
                else {solution1.setTextColor(Color.RED);}

                solution4.setText(answerQuestion4);
                if (answerQuestion4 != null && answerQuestion4.equals("That's correct¡¡¡")) {solution4.setTextColor(Color.GREEN); check= check+1;}
                else { solution4.setTextColor(Color.RED);}



                //  Check Question  OK

                if(Answer3Option1.isChecked() & Answer3Option2.isChecked()& Answer3Option3.isChecked())
                {answerQuestion3=" Please Check just two options";solution3.setTextColor(Color.RED);}else if
                (!Answer3Option1.isChecked()&!Answer3Option2.isChecked()&!Answer3Option3.isChecked())
                {answerQuestion3=" Please Check at least two options";solution3.setTextColor(Color.RED);}else if(
                Answer3Option2.isChecked() & Answer3Option3.isChecked()){answerQuestion3 = "That's correct¡¡¡";}
                else {answerQuestion3 = "Incorrect answer, correct answer is B and C";}

                solution3.setText(answerQuestion3);
                if (answerQuestion3.equals("That's correct¡¡¡"))
                {solution3.setTextColor(Color.GREEN);check= check+1;} else
                {solution3.setTextColor(Color.RED);}


                if(Answer6Option1.isChecked() & Answer6Option2.isChecked()& Answer6Option3.isChecked())
                {answerQuestion6=" Please Check just two options"; solution6.setTextColor(Color.RED);}else if
                        (!Answer6Option1.isChecked()&!Answer6Option2.isChecked()&!Answer6Option3.isChecked())
                {answerQuestion6=" Please Check at least two options";solution6.setTextColor(Color.RED);}else if(
                 Answer6Option1.isChecked() & Answer6Option2.isChecked()) { answerQuestion6 = "That's correct¡¡¡";}
                else {answerQuestion6 = "Incorrect answer, correct answer is A and B";}


                solution6.setText(answerQuestion6);
                if (answerQuestion6.equals("That's correct¡¡¡"))
                {solution6.setTextColor(Color.GREEN);check= check+1;}
                else {solution6.setTextColor(Color.RED);}


            // Edit Text


                solution2.setText(getAnswerQuestion2());
                if (solution2.getText().equals("That's correct¡¡¡")){check=check+1;}
                if (solution2.getText().equals("That's correct¡¡¡")){solution2.setTextColor(Color.GREEN);} else {solution2.setTextColor(Color.RED);}


                solution5.setText(getAnswerQuestion5());
                if (solution5.getText().equals("That's correct¡¡¡")){check=check+1;}
                if (solution5.getText().equals("That's correct¡¡¡")){solution5.setTextColor(Color.GREEN);} else {solution5.setTextColor(Color.RED);}

                //Toast

                Toast.makeText(getApplicationContext(), "Right Answers:" + check + " Wrong Answers: "+ (6-check) , Toast.LENGTH_LONG).show();
                check=0;}});}




    // Question replied by Input (2&5)

    public String getAnswerQuestion2() {

        answerQuestion2 = question2Answer.getText().toString();

        if (answerQuestion2.equals("")){return "";}
        else {  if (answerQuestion2.toLowerCase().equals("motor"))
        {return "That's correct¡¡¡"; }

        else {return "Incorrect, correct answer was Motor";   }}}



    public String getAnswerQuestion5() {

         answerQuestion5 = question5Answer.getText().toString();

        if(answerQuestion5.equals("")) {return "This field musn't be empty";}
        else if (answerQuestion5.toLowerCase().equals("throttle"))
        {return "That's correct¡¡¡";}
        else {return "Incorrect, correct answer was Throttle"; }


    }}





