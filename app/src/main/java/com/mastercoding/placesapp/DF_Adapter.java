package com.mastercoding.placesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DF_Adapter extends ArrayAdapter<DF_Data_Source> {

    private ArrayList<DF_Data_Source> data;
    Context context;

    public DF_Adapter(ArrayList<DF_Data_Source>data, Context context) {
        super(context, R.layout.fastfood_layout, data);
        this.data = data;
        this.context = context;
    }

    private static class ViewHolder {
        TextView txtRestaurantName;
        TextView txtRestaurantRating;
        ImageView ImgRestaurantImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DF_Data_Source dataModel = getItem(position);

        ViewHolder viewHolder;

        final View result;

        if ( convertView == null ) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.fastfood_layout, parent, false);

            viewHolder.txtRestaurantName = (TextView) convertView.findViewById(R.id.restaurantName);
            viewHolder.txtRestaurantRating = (TextView) convertView.findViewById(R.id.restaurantRating);
            viewHolder.ImgRestaurantImage = (ImageView) convertView.findViewById(R.id.restaurantImage);

            convertView.setTag(viewHolder);
            result = convertView;
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.txtRestaurantName.setText(dataModel.getRestaurantName());
        viewHolder.txtRestaurantRating.setText(dataModel.getRestaurantRating());
        viewHolder.ImgRestaurantImage.setImageResource(dataModel.getRestaurantImage());

        return convertView;

    }
}
