package com.example.android.miwok2;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private int mMedia;
    private MediaPlayer mediaPlayer;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> word, int ColorResourceId) {
        super(context, 0, word);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokText = (TextView)listItemView.findViewById(R.id.tvMiwokText);
        TextView defaultText = (TextView)listItemView.findViewById(R.id.tvDefaultText);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.icon);

        miwokText.setText(currentWord.getmMiwokTranslation());
        defaultText.setText(currentWord.getmDefaultTranslation());
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }
}
