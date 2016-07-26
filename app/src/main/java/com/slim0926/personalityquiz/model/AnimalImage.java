package com.slim0926.personalityquiz.model;

import java.util.HashMap;

import com.slim0926.personalityquiz.R;

public class AnimalImage {
    private HashMap<String, Integer> mMapAnimalImage;
    private Animals mAnimals = new Animals();

    public AnimalImage() {
        mMapAnimalImage = new HashMap<>();
        mMapAnimalImage.put(mAnimals.getAnimal(0), R.drawable.dolphin);
        mMapAnimalImage.put(mAnimals.getAnimal(1), R.drawable.elephant);
        mMapAnimalImage.put(mAnimals.getAnimal(2), R.drawable.monkey);
        mMapAnimalImage.put(mAnimals.getAnimal(3), R.drawable.redpanda);
        mMapAnimalImage.put(mAnimals.getAnimal(4), R.drawable.tiger);
        mMapAnimalImage.put(mAnimals.getAnimal(5), R.drawable.bear);
        mMapAnimalImage.put(mAnimals.getAnimal(6), R.drawable.snake);
        mMapAnimalImage.put(mAnimals.getAnimal(7), R.drawable.dog);
        mMapAnimalImage.put(mAnimals.getAnimal(8), R.drawable.owl);
        mMapAnimalImage.put(mAnimals.getAnimal(9), R.drawable.peacock);
    }

    public int getImageID(String animalName) {
        return mMapAnimalImage.get(animalName);
    }


}
