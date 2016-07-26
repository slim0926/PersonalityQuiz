package com.slim0926.personalityquiz.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.support.percent.PercentLayoutHelper;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.slim0926.personalityquiz.R;
import com.slim0926.personalityquiz.model.AnimalImage;
import com.slim0926.personalityquiz.model.Animals;
import com.slim0926.personalityquiz.model.Match;

import java.util.List;

public class MatchActivity extends AppCompatActivity {

    private String[] mUserAnswers;
    private List<String> mUserMatch;
    private AnimalImage mAnimalImage;
    private Animals mAnimals;

    private ImageView mImageView;
    private TextView mSpeechView;
    private EditText mInputText;
    private Button mInputButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        Intent intent = getIntent();
        mUserAnswers = intent.getStringArrayExtra(getString(R.string.key_user_answers));

        Match match = new Match(mUserAnswers);
        match.matchAnswersToAnimals();
        mUserMatch = match.getMatches();

        if (mUserMatch.get(0) == null) {
            mUserMatch.add(0, "unicorn");
        }

        mAnimals = new Animals();

        mImageView = (ImageView) findViewById(R.id.animalImageView);
        mAnimalImage = new AnimalImage();

        mSpeechView = (TextView) findViewById(R.id.speechTextView);
        mInputText = (EditText) findViewById(R.id.inputEditText);
        mInputButton = (Button) findViewById(R.id.inputButton);

        showToast();

        mSpeechView.setVisibility(View.INVISIBLE);
        int imageID = mAnimalImage.getImageID(mUserMatch.get(0));
        Drawable drawable = getResources().getDrawable(imageID);
        mImageView.setImageDrawable(drawable);

        onInputButtonClicked();

    }

    private void onInputButtonClicked() {
        mInputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(mInputText.getText());

                if (!text.equals("")) {

                    if (mUserMatch.get(0).equals(mAnimals.getAnimal(0))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(65, 10, 0);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(1))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(36, 15, 40);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(2))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleupleft);
                        setSpeechViewMargins(7, 18, 64);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(3))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(65, 30, 0);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(4))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(70, 27, 0);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(5))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleupleft);
                        setSpeechViewMargins(20, 10, 55);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(6))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleupleft);
                        setSpeechViewMargins(0, 0, 70);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(7))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(65, 10, 0);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(8))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
                        setSpeechViewMargins(60, 0, 0);
                    } else if (mUserMatch.get(0).equals(mAnimals.getAnimal(9))) {
                        mSpeechView.setBackgroundResource(R.drawable.speechbubbleupleft);
                        setSpeechViewMargins(22, 25, 50);

                    }

                    mSpeechView.setText(text);
                    mSpeechView.setVisibility(View.VISIBLE);
                } else {
                    mSpeechView.setVisibility(View.INVISIBLE);
                    Toast.makeText(MatchActivity.this, "You did not enter anything. \nPlease try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setSpeechViewMargins(int left, int top, int right) {
        PercentRelativeLayout.LayoutParams layoutParams = (PercentRelativeLayout.LayoutParams) mSpeechView.getLayoutParams();
        PercentLayoutHelper.PercentLayoutInfo percentLayoutInfo = layoutParams.getPercentLayoutInfo();
        percentLayoutInfo.leftMarginPercent = left * 0.01f;
        percentLayoutInfo.topMarginPercent = top * 0.01f;
        percentLayoutInfo.rightMarginPercent = right * 0.01f;
        mSpeechView.setLayoutParams(layoutParams);
        mSpeechView.requestLayout();
    }

    private void setSpeechViewBG(String text, int textLength) {
        if (text.length() < textLength) {
            mSpeechView.setBackgroundResource(R.drawable.speechbubbleleft);
        } else {
            mSpeechView.setBackgroundResource(R.drawable.speechbubble);
        }
    }

    private void setSpeechViewUpBG(String text, int textLength) {
        if (text.length() < textLength) {
            mSpeechView.setBackgroundResource(R.drawable.speechbubbleupleft);
        } else {
            mSpeechView.setBackgroundResource(R.drawable.speechbubbleup);
        }
    }

    private void showToast() {
        if (mUserMatch.size() == 1) {
            Toast.makeText(MatchActivity.this,
                    "Great! You are a(n) " + mUserMatch.get(0) + "!",
                    Toast.LENGTH_SHORT).show();



        } else {
            Toast.makeText(MatchActivity.this,
                    "You must have multiple personality disorder! You matched more than one animal. "
                            +  "They include a(n) " + mUserMatch.get(0) + " and a(n) " + mUserMatch.get(1),
                    Toast.LENGTH_SHORT).show();
        }
    }

}
