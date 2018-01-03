package com.example.android.mytourguide;



public class Places {

    //Private states

    private int mPlaceName;
    private int mPlaceDescription;
    private int mImageResourceId;

    //constructor

    public Places(int placeName, int placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    //get methods

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
