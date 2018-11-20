package com.example.gerrybuenafe.angeles_buenafe_115;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class quizPage extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView,mTextView,mTitle,mQuestNum;
    private ImageView mImageView;
    private RadioButton mChoice1, mChoice2, mChoice3;
    private Button mSubmit,mNext,mButton;
    private Dialog mDialog;
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton;
    private String mAnswer;
    int mQuestionNumber , mQuestionIncrement=1, inc=0;
    Toolbar mToolbar;
    ArrayList<Integer> list = new ArrayList<Integer>(20);
    Random rand = new Random();
    String sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);
        mDialog = new Dialog(this);
        mQuestionView = findViewById(R.id.question);
        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice3 = findViewById(R.id.choice3);
        mRadioGroup = findViewById(R.id.radioGrp);
        mSubmit = findViewById(R.id.submit);
        mNext = findViewById(R.id.next);
        mQuestNum = findViewById(R.id.questNum);
        mButton = findViewById(R.id.ok);
        mToolbar = findViewById(R.id.toolB);
        mTitle = mToolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(mToolbar);
        mTitle.setText("TEST YOUR KNOWLEDGE");

        for(int i = 0;i < 20; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        updateQuestion();

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = mRadioGroup.getCheckedRadioButtonId();
                mRadioButton = findViewById(radioId);
                final String ans = mRadioButton.getText().toString();
                showDialogBox(ans, mAnswer);
            }
        });

        mNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int a = 0;
                if(inc == 19){
                    mNext.setText("Go Back to Home");
                    mNext.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(quizPage.this, categoryPage.class);
                            startActivity(i);
                        }
                    });
                }else{
                    inc++;
                    mQuestionIncrement++;
                    updateQuestion();
                }

            }
        });


    }

    public void showDialogBox(String ans, String correctAns){
        mDialog.setContentView(R.layout.custom_dialog);

        mButton = mDialog.findViewById(R.id.ok);
        mTextView = mDialog.findViewById(R.id.yourAns);
        mTextView.setText("Your Answer: " + ans);
        mTextView = mDialog.findViewById(R.id.correctAns);
        mTextView.setText("Correct Answer : " + correctAns);
        mImageView = mDialog.findViewById(R.id.checkWrong);

        if(correctAns.equalsIgnoreCase(ans)){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.check));
        }else {
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.ex));
        }
        mImageView = mDialog.findViewById(R.id.close);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

    }

    private void updateQuestion(){
        mQuestionNumber = list.get(inc);
        mQuestNum.setText(""+mQuestionIncrement);
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


}