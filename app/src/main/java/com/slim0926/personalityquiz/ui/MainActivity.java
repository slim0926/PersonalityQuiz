package com.slim0926.personalityquiz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.slim0926.personalityquiz.R;
import com.slim0926.personalityquiz.model.Answers;
import com.slim0926.personalityquiz.model.Statements;

public class MainActivity extends AppCompatActivity {

    private TextView[] mStatementViews = new TextView[8];
    private Spinner[] mSpinners = new Spinner[8];
    private Button mSubmit;

    private String[] mUserAnswers;
    private Answers mAnswerArray;
    private Statements mStatements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStatements = new Statements();
        for (int i=0; i<mStatementViews.length; i++) {
            String tvID = "state" + (i+1);
            int intTvID = getResources().getIdentifier(tvID, "id", getPackageName());

            mStatementViews[i] = (TextView) findViewById(intTvID);

            mStatementViews[i].setText(mStatements.getStatement(i));
        }



        ArrayAdapter<String> adapter;
        mAnswerArray = new Answers();

        for (int i = 0; i<mSpinners.length; i++) {
            String spID = "spinner" + (i+1);
            int intSpID = getResources().getIdentifier(spID, "id", getPackageName());

            mSpinners[i] = (Spinner) findViewById(intSpID);
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mAnswerArray.getAnswers());
            mSpinners[i].setAdapter(adapter);
        }

        mUserAnswers = new String[8];

        mSubmit = (Button) findViewById(R.id.submitButton);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i< mUserAnswers.length; i++) {
                    mUserAnswers[i] = String.valueOf(mSpinners[i].getSelectedItem());
                }

                showMatch();
            }
        });

    }

    private void showMatch() {
        Intent intent = new Intent(this, MatchActivity.class);
        intent.putExtra(getString(R.string.key_user_answers), mUserAnswers);
        startActivity(intent);
    }
}
