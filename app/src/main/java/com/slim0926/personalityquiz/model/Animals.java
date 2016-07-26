package com.slim0926.personalityquiz.model;

public class Animals {

    private String[] mAnimals;

    public Animals() {
        mAnimals = new String[10];

        mAnimals[0] = "dolphin";
        mAnimals[1] = "elephant";
        mAnimals[2] = "monkey";
        mAnimals[3] = "red panda";
        mAnimals[4] = "tiger";
        mAnimals[5] = "bear";
        mAnimals[6] = "snake";
        mAnimals[7] = "dog";
        mAnimals[8] = "owl";
        mAnimals[9] = "peacock";
    }

    public String[] getAnimals() {
        return mAnimals;
    }

    public String getAnimal(int i) {
        return mAnimals[i];
    }
}
