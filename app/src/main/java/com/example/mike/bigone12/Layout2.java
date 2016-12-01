package com.example.mike.bigone12;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

public class Layout2 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imageView4,imageView5,imageView6,imageView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        tabLayout = (TabLayout) findViewById(R.id.tablayout2);
        tabLayout.addTab(tabLayout.newTab().setText("Tab4"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab5"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab6"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab7"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.viewpager2);
        Pager2 adapter = new Pager2(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
        viewPager.getCurrentItem();
        viewPager.setOffscreenPageLimit(4);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = tabLayout.getSelectedTabPosition();
                switch (position) {

                    case 0:
                        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName = "image4" + ".jpg";
                        File imageFile = new File(file, pictureName);
                        Uri pictureUri = Uri.fromFile(imageFile);
                        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        i.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri);
                        startActivityForResult(i, 0);

                        break;

                    case 1:
                        File file2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName2 = "image5" + ".jpg";
                        File imageFile2 = new File(file2, pictureName2);
                        Uri pictureUri2 = Uri.fromFile(imageFile2);
                        Intent ii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        ii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri2);
                        startActivityForResult(ii, 1);
                        break;

                    case 2:
                        File file3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName3 = "image6" + ".jpg";
                        File imageFile3 = new File(file3, pictureName3);
                        Uri pictureUri3 = Uri.fromFile(imageFile3);
                        Intent iii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri3);
                        startActivityForResult(iii, 2);
                        break;

                    case 3:
                        File file4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        String pictureName4 = "image7" + ".jpg";
                        File imageFile4 = new File(file4, pictureName4);
                        Uri pictureUri4 = Uri.fromFile(imageFile4);
                        Intent iiii = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        iiii.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri4);
                        startActivityForResult(iiii, 3);
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

        imageView4 = (ImageView) findViewById(R.id.img4);
        imageView5 = (ImageView)findViewById(R.id.img5);
        imageView6 = (ImageView) findViewById(R.id.img6);
        imageView7 = (ImageView) findViewById(R.id.img7);

        if (requestCode == 0 && resultCode == RESULT_OK) {
            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image4.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap1 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b = BitmapFactory.decodeFile(photoPath, options);
            imageView4.setImageBitmap(b);
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView4.buildDrawingCache();
                    Bitmap image = imageView4.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout2.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",4);

                    o.putExtras(extras);
                    startActivity(o);

                }
            });
        }else if (requestCode == 1 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image5.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap2 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b2 = BitmapFactory.decodeFile(photoPath, options);
            imageView5.setImageBitmap(b2);
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView5.buildDrawingCache();
                    Bitmap image = imageView5.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout2.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",5);

                    o.putExtras(extras);

                    startActivity(o);

                }
            });

        }else if (requestCode == 2 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image6.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap3 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b3 = BitmapFactory.decodeFile(photoPath, options);
            imageView6.setImageBitmap(b3);
            imageView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView6.buildDrawingCache();
                    Bitmap image = imageView6.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout2.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",6);

                    o.putExtras(extras);

                    startActivity(o);

                }
            });
        }
        else if (requestCode == 3 && resultCode == RESULT_OK) {

            String photoPath = Environment.getExternalStorageDirectory() + "/Download/image7.jpg";
            galleryAddPic(photoPath);

            Bitmap bitmap4 = BitmapFactory.decodeFile(photoPath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap b4 = BitmapFactory.decodeFile(photoPath, options);
            imageView7.setImageBitmap(b4);
            imageView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView7.buildDrawingCache();
                    Bitmap image = imageView7.getDrawingCache();

                    Bundle extras = new Bundle();
                    Intent o = new Intent(Layout2.this, Information.class);
                    extras.putParcelable("Bitmap", image);
                    extras.putInt("flag",7);

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
