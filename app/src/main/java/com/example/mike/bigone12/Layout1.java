package com.example.mike.bigone12;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Layout1 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imageView1, imageView2, imageView3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);


        tabLayout = (TabLayout) findViewById(R.id.tablayout1);
        tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab3"));


        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);


        viewPager = (ViewPager) findViewById(R.id.viewpager1);
        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
        viewPager.getCurrentItem();
        viewPager.setOffscreenPageLimit(3);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int position = tabLayout.getSelectedTabPosition();
                switch (position) {

                    case 0:
                        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName = "image1" + ".jpg";
                        //  imageName(pictureName);
                        File imageFile = new File(file, pictureName);
                        Uri pictureUri = Uri.fromFile(imageFile);

                        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        i.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri);
                        startActivityForResult(i, 0);

                        break;

                    case 1:
                        File file2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName2 = "image2" + ".jpg";
                        File imageFile2 = new File(file2, pictureName2);
                        Uri pictureUri2 = Uri.fromFile(imageFile2);
                        Intent ii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        ii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri2);
                        startActivityForResult(ii, 1);
                        break;

                    case 2:
                        File file3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName3 = "image3" + ".jpg";
                        File imageFile3 = new File(file3, pictureName3);
                        Uri pictureUri3 = Uri.fromFile(imageFile3);
                        Intent iii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri3);
                        startActivityForResult(iii, 2);
                        break;
                }
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);
        imageView3 = (ImageView) findViewById(R.id.img3);


        if (requestCode == 0 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image1.jpg";
            galleryAddPic(photoPath);
            Bitmap bitmap1 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b = BitmapFactory.decodeFile(photoPath, options);

            imageView1.setImageBitmap(b);
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView1.buildDrawingCache();
                    Bitmap image = imageView1.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout1.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",1);
                    o.putExtras(extras);

                    startActivity(o);

                }
            });


        } else if (requestCode == 1 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image2.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap2 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b2 = BitmapFactory.decodeFile(photoPath, options);
            imageView2.setImageBitmap(b2);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView2.buildDrawingCache();
                    Bitmap image = imageView2.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout1.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",2);
                    o.putExtras(extras);
                    startActivity(o);

                }
            });


        } else if (requestCode == 2 && resultCode == RESULT_OK) {


            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image3.jpg";
            galleryAddPic(photoPath);
            Bitmap bitmap3 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b3 = BitmapFactory.decodeFile(photoPath, options);
            imageView3.setImageBitmap(b3);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView3.buildDrawingCache();
                    Bitmap image = imageView3.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout1.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",3);
                    o.putExtras(extras);
                    startActivity(o);

                }
            });


        }

    }





    private void galleryAddPic(String photoPath) {
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File f = new File(photoPath);
        Uri contentUri = Uri.fromFile(f);
        mediaScanIntent.setData(contentUri);
        this.sendBroadcast(mediaScanIntent);
    }





    @Override
    public void onTabSelected(TabLayout.Tab tab) {


        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }
}