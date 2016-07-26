package com.slim0926.personalityquiz.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Match {
    private List<String> mPossibleAnimals;
    private List<String> mMatches;
    private String[] mUserAnswers;

    private Animals mAnimals = new Animals();
    private Answers mAnswers = new Answers();

    public Match(String[] userAnswers) {
        mPossibleAnimals = new ArrayList<>();
        mMatches = new ArrayList<>();

        mUserAnswers = userAnswers;
    }

    public void matchAnswersToAnimals() {


        for (int i=0; i<mUserAnswers.length; i++) {
            switch (i) {
                case 0:
                    if (mUserAnswers[0].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));

                    } else if (mUserAnswers[0].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    } else if (mUserAnswers[0].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(6));
                        mPossibleAnimals.add(mAnimals.getAnimal(8));
                    }

                    break;
                case 1:
                    if (mUserAnswers[1].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));
                        mPossibleAnimals.add(mAnimals.getAnimal(5));

                    } else if (mUserAnswers[1].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));

                    } else if (mUserAnswers[1].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));
                        mPossibleAnimals.add(mAnimals.getAnimal(8));

                    } else if (mUserAnswers[1].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    } else if (mUserAnswers[1].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(6));

                    }
                    break;
                case 2:
                    if (mUserAnswers[2].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));

                    } else if (mUserAnswers[2].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    } else if (mUserAnswers[2].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));

                    } else if (mUserAnswers[2].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(8));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));

                    } else if (mUserAnswers[2].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(6));

                    }
                    break;
                case 3:
                    if (mUserAnswers[3].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));
                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(6));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));
                        mPossibleAnimals.add(mAnimals.getAnimal(8));

                    } else if (mUserAnswers[3].equals(mAnswers.getAnswer(2))) {


                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(3));

                    } else if (mUserAnswers[3].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    }
                    break;
                case 4:
                    if (mUserAnswers[4].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(1));
                        mPossibleAnimals.add(mAnimals.getAnimal(8));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));

                    } else if (mUserAnswers[4].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    } else if (mUserAnswers[4].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(4));

                    } else if (mUserAnswers[4].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(2));

                    } else if (mUserAnswers[4].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(6));

                    }
                    break;
                case 5:
                    if (mUserAnswers[5].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(8));

                    } else if (mUserAnswers[5].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(7));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));

                    } else if (mUserAnswers[5].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(6));
                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    } else if (mUserAnswers[5].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(2));
                        mPossibleAnimals.add(mAnimals.getAnimal(5));

                    } else if (mUserAnswers[5].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(4));

                    }
                    break;
                case 6:
                    if (mUserAnswers[6].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(8));

                    } else if (mUserAnswers[6].equals(mAnswers.getAnswer(1))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(6));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));

                    } else if (mUserAnswers[6].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(0));

                    } else if (mUserAnswers[6].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(9));
                        mPossibleAnimals.add(mAnimals.getAnimal(3));

                    } else if (mUserAnswers[6].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(7));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));

                    }
                    break;
                case 7:
                    if (mUserAnswers[7].equals(mAnswers.getAnswer(0))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(8));

                    } else if (mUserAnswers[7].equals(mAnswers.getAnswer(2))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(3));
                        mPossibleAnimals.add(mAnimals.getAnimal(7));

                    } else if (mUserAnswers[7].equals(mAnswers.getAnswer(3))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(6));
                        mPossibleAnimals.add(mAnimals.getAnimal(1));

                    }else if (mUserAnswers[7].equals(mAnswers.getAnswer(4))) {

                        mPossibleAnimals.add(mAnimals.getAnimal(5));
                        mPossibleAnimals.add(mAnimals.getAnimal(4));
                        mPossibleAnimals.add(mAnimals.getAnimal(0));
                        mPossibleAnimals.add(mAnimals.getAnimal(2));
                        mPossibleAnimals.add(mAnimals.getAnimal(9));

                    }
                    break;
            }
        }

        findAnimalMatch();
    }

    private void findAnimalMatch() {
        HashMap<String, Integer> mapAnimalCounts = new HashMap<>();

        for (String animal : mPossibleAnimals) {
            if (!mapAnimalCounts.containsKey(animal)) {
                mapAnimalCounts.put(animal, 1);
            } else {
                Integer valueCount = mapAnimalCounts.get(animal);
                valueCount++;
                mapAnimalCounts.put(animal, valueCount);
            }
        }


        int maxValue = Collections.max(mapAnimalCounts.values());

        for (Map.Entry<String, Integer> entry : mapAnimalCounts.entrySet()) {
            if (entry.getValue() == maxValue) {
                mMatches.add(entry.getKey());
            }
        }

    }

    public List<String> getMatches() {
        return mMatches;
    }

}
