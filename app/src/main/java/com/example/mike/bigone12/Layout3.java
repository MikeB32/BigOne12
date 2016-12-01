package com.example.mike.bigone12;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import android.widget.ImageView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Layout3 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imageView8,imageView9,imageView10,imageView11,imageView12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);

        tabLayout = (TabLayout) findViewById(R.id.tablayout3);
        tabLayout.addTab(tabLayout.newTab().setText("Tab8"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab9"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab10"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab11"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab12"));



        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);


        viewPager = (ViewPager) findViewById(R.id.viewpager3);
        Pager3 adapter = new Pager3(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
        viewPager.getCurrentItem();
        viewPager.setOffscreenPageLimit(5);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab3);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = tabLayout.getSelectedTabPosition();
                switch (position) {

                    case 0:
                        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName = "image8" + ".jpg";
                        File imageFile = new File(file, pictureName);
                        Uri pictureUri = Uri.fromFile(imageFile);
                        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        i.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri);
                        startActivityForResult(i, 0);

                        break;

                    case 1:
                        File file2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName2 = "image9" + ".jpg";
                        File imageFile2 = new File(file2, pictureName2);
                        Uri pictureUri2 = Uri.fromFile(imageFile2);
                        Intent ii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        ii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri2);
                        startActivityForResult(ii, 1);
                        break;

                    case 2:
                        File file3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName3 = "image10" + ".jpg";
                        File imageFile3 = new File(file3, pictureName3);
                        Uri pictureUri3 = Uri.fromFile(imageFile3);
                        Intent iii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri3);
                        startActivityForResult(iii, 2);
                        break;

                    case 3:
                        File file4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName4 = "image11" + ".jpg";
                        File imageFile4 = new File(file4, pictureName4);
                        Uri pictureUri4 = Uri.fromFile(imageFile4);
                        Intent iiii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iiii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri4);
                        startActivityForResult(iiii, 3);
                        break;

                    case 4:
                        File file5 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName5 = "image12" + ".jpg";
                        File imageFile5 = new File(file5, pictureName5);
                        Uri pictureUri5 = Uri.fromFile(imageFile5);
                        Intent iiiii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iiiii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri5);
                        startActivityForResult(iiiii, 4);
                        break;
                }
            }
        });

    }

 /*   public String getPictureName() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = sdf.format(new Date());
        return "image" + timestamp + ".jpg";
    } */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        imageView8 = (ImageView) findViewById(R.id.img8);
        imageView9 = (ImageView)findViewById(R.id.img9);
        imageView10 = (ImageView) findViewById(R.id.img10);
        imageView11= (ImageView) findViewById(R.id.img11);
        imageView12= (ImageView) findViewById(R.id.img12);


        if (requestCode == 0 && resultCode == RESULT_OK) {
            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image8.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap1 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b = BitmapFactory.decodeFile(photoPath, options);
            imageView8.setImageBitmap(b);
            imageView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView8.buildDrawingCache();
                    Bitmap image = imageView8.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout3.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",8);

                    o.putExtras(extras);
                    startActivity(o);

                }
            });
        }else if (requestCode == 1 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image9.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap2 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b2 = BitmapFactory.decodeFile(photoPath, options);
            imageView9.setImageBitmap(b2);
            imageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView9.buildDrawingCache();
                    Bitmap image = imageView9.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout3.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",9);

                    o.putExtras(extras);
                    startActivity(o);

                }
            });


        }else if (requestCode == 2 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image10.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap3 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b3 = BitmapFactory.decodeFile(photoPath, options);
            imageView10.setImageBitmap(b3);
            imageView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView10.buildDrawingCache();
                    Bitmap image = imageView10.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout3.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",10);

                    o.putExtras(extras);
                    startActivity(o);

                }
            });
        }
        else if (requestCode == 3 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image11.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap4 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b4 = BitmapFactory.decodeFile(photoPath, options);
            imageView11.setImageBitmap(b4);
            imageView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView11.buildDrawingCache();
                    Bitmap image = imageView11.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout3.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",11);

                    o.putExtras(extras);
                    startActivity(o);

                }
            });
        }   else if (requestCode == 4 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image12.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap4 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b4 = BitmapFactory.decodeFile(photoPath, options);
            imageView12.setImageBitmap(b4);
            imageView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView12.buildDrawingCache();
                    Bitmap image = imageView12.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout3.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",12);

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

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
