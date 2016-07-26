package com.slim0926.personalityquiz.model;

/**
 * Created by sue on 7/21/16.
 */

public class Statements {
    private String[] mStatements;

    public Questions() {
        mStatements[0] = "I am very social.";
        mStatements[1] = "I am very confident.";
        mStatements[2] = "I am very emotional";
        mStatements[3] = "I am very intelligent";
        mStatements[4] = "I am very loyal";
        mStatements[5] = "I am very peace-loving.";
        mStatements[6] = "I am very patient.";
        mStatements[7] = "I am very humble";
    }

    public String[] getQuestions() {
        return mStatements;
    }

    public String getQuestion(int i) {
        return mStatements[i];
    }
}
