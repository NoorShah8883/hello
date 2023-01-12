package com.Roshiappstudio.batterrycharging.Avtivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.Roshiappstudio.batterrycharging.R;

import java.io.IOException;

public class imageview extends AppCompatActivity {
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        img=findViewById(R.id.imggalery);

//        //ImageView imageview = (ImageView)findViewById(R.id.ImageShow);
//        Bitmap selectedphoto  =(Bitmap)this.getIntent().getParcelableExtra("data");
        Uri imageUri = getIntent().getData();
        img.setImageURI(imageUri);
//        img.setImageBitmap(selectedphoto);


    }

    public void setTowallpaper(View view) throws IOException {
        Uri imgUri = getIntent().getData();
        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imgUri);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        wallpaperManager.setBitmap(bitmap);


//      Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.id.imggalery);
//        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
//        try {
//            wallpaperManager.set;
////            wallpaperManager.setBitmap(bitmap);
//            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
//        }catch (Exception e){
//            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
//        }
    }
}