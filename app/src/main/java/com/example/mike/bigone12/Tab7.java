package com.example.mike.bigone12;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mike on 9/1/2016.
 */
public class Tab7 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab7, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.img7);
        String photoPath = Environment.getExternalStorageDirectory() + "/Download/image7.jpg";
        Bitmap bitmap1 = BitmapFactory.decodeFile(photoPath);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 8;
        final Bitmap b = BitmapFactory.decodeFile(photoPath, options);

        imageView.setImageBitmap(b);
        DataBaseHelper db = new DataBaseHelper(getActivity());
        DbResponse response = db.getDataforTab7();
        TextView textView = (TextView)v.findViewById(R.id.txt9);
        textView.setText(response.name+" - "+response.place);



        return v;


    }
}