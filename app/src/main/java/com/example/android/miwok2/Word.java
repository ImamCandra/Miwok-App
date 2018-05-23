package com.example.android.miwok2;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mMediaPlayer;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mMediaPlayer) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mMediaPlayer = mMediaPlayer;
    }



    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mMediaPlayer) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mMediaPlayer = mMediaPlayer;
    }

    public int getmMediaPlayer() {
        return mMediaPlayer;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
