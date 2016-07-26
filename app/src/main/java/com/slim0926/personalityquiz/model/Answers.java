package com.slim0926.personalityquiz.model;

public class Answers {
    private String[] mAnswers;

    public Answers() {
        mAnswers = new String[5];

        mAnswers[0] = "Strongly Agree";
        mAnswers[1] = "Agree";
        mAnswers[2] = "Neither Agree Nor Disagree";
        mAnswers[3] = "Disagree";
        mAnswers[4] = "Strongly Disagree";
    }

    public String[] getAnswers() {
        return mAnswers;
    }

    public String getAnswer(int i) {
        return mAnswers[i];
    }
}
