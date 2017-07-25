package com.example.ts.criminals;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.AppCompatImageView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by TS on 12/07/2017.
 */

public class ImageZoomFragment extends AppCompatDialogFragment{
    private AppCompatImageView crimeSceneFullImage;
    public static final String IMAGE_PATH="The image path";

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bitmap bit= BitmapFactory.decodeFile(getArguments().getString(IMAGE_PATH));
        View v= LayoutInflater.from(getActivity()).inflate(R.layout.dialog_image_zoomer,null);
        crimeSceneFullImage= (AppCompatImageView) v.findViewById(R.id.dialog_image_view);
        crimeSceneFullImage.setImageBitmap(bit);
        return new AlertDialog.Builder(getActivity()).setView(v).create();


    }

    public static ImageZoomFragment newInstance(String path){
        Bundle args=new Bundle();
        args.putString(IMAGE_PATH,path);
        ImageZoomFragment image=new ImageZoomFragment();
        image.setArguments(args);
        return image;
    }
}
