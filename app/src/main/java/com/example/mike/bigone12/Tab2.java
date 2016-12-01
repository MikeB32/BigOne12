package com.example.mike.bigone12;

import android.content.Intent;
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
public class Tab2 extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab2, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.img2);
        String photoPath = Environment.getExternalStorageDirectory() + "/Download/image2.jpg";
        Bitmap bitmap1 = BitmapFactory.decodeFile(photoPath);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 8;
        final Bitmap b = BitmapFactory.decodeFile(photoPath, options);

       DataBaseHelper db = new DataBaseHelper(getActivity());
        DbResponse response = db.getDataforTab2();
        TextView textView = (TextView)v.findViewById(R.id.txt4);
        textView.setText(response.name+" - "+response.place);
        imageView.setImageBitmap(b);

        return v;


}





    }