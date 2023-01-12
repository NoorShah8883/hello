package com.Roshiappstudio.batterrycharging.Avtivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.Roshiappstudio.batterrycharging.R;

import java.util.ArrayList;

public class selectBackgroundWalpaper extends AppCompatActivity {
ImageView wallpaper1,wallpaper2,wallpaper3,wallpaper4,wallpaper5,wallpaper6,wallpaper7,
        wallpaper11,wallpaper8,wallpaper9,wallpaper10,wallpaper12,wallpaper13,wallpaper14,
        wallpaper15,wallpaper16,wallpaper17,wallpaper18,wallpaper19,wallpaper20,wallpaper21;
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private NativeAd nativeAds;
    ArrayList<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_background_walpaper);
        getSupportActionBar().setTitle("Wallpapers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        refreshAd();
//
//        RecyclerView recyclerView=findViewById(R.id.recyclerView);
//        items=new ArrayList<>();
//        items=(ArrayList<ItemList>)(Object) DataRepo.getGetdata();
//        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
//        recyclerView.setAdapter(new mainAdapter(this,items));
        wallpaper1=findViewById(R.id.wallloti1);
        wallpaper2=findViewById(R.id.wall2);
        wallpaper3=findViewById(R.id.wall3);
        wallpaper4=findViewById(R.id.wall4);
        wallpaper5=findViewById(R.id.wall5);
        wallpaper6=findViewById(R.id.wall6);
        wallpaper7=findViewById(R.id.wall7);
        wallpaper8=findViewById(R.id.wall8);
        wallpaper9=findViewById(R.id.wall9);
        wallpaper10=findViewById(R.id.wall10);
        wallpaper11=findViewById(R.id.wall11);
        wallpaper12=findViewById(R.id.wall12);
        wallpaper13=findViewById(R.id.wall13);
        wallpaper14=findViewById(R.id.wall14);
        wallpaper15=findViewById(R.id.wall15);
        wallpaper16=findViewById(R.id.wall16);
        wallpaper17=findViewById(R.id.wall17);
        wallpaper18=findViewById(R.id.wall18);
        wallpaper19=findViewById(R.id.wall19);
        wallpaper20=findViewById(R.id.wall20);
        wallpaper21=findViewById(R.id.wall21);
    }

    public void settowalpaper(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper19);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void settomobile(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper18);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void settwo(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper17);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }

    }

    public void setbackground4(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper16);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground5(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper15);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }

    }

    public void setbackground6(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper1);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground7(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper2);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground8(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper3);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground9(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper4);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground10(View view) {

        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper5);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground11(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper6);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }

    }

    public void setbackground12(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper7);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground13(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper8);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground14(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper9);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground15(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper10);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground16(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper11);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground17(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper12);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }

    }

    public void setbackground18(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper13);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground19(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper14);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground20(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper15);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void setbackground21(View view) {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper27);
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
        }
    }


    private void populateNativeAdView(NativeAd nativeAd, NativeAdView adView) {
        // Set the media view.
        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));

        // Set other ad assets.
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        // The headline and mediaContent are guaranteed to be in every NativeAd.
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        // These assets aren't guaranteed to be in every NativeAd, so it's important to
        // check before trying to display them.
        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            adView.getPriceView().setVisibility(View.INVISIBLE);
        } else {
            adView.getPriceView().setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }

        if (nativeAd.getStore() == null) {
            adView.getStoreView().setVisibility(View.INVISIBLE);
        } else {
            adView.getStoreView().setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView())
                    .setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        // This method tells the Google Mobile Ads SDK that you have finished populating your
        // native ad view with this native ad.
        adView.setNativeAd(nativeAd);

    }


    private void refreshAd() {


        AdLoader.Builder builder = new AdLoader.Builder(this, getResources().getString(R.string.native_ad));

        builder.forNativeAd(
                new NativeAd.OnNativeAdLoadedListener() {
                    // OnLoadedListener implementation.
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        // If this callback occurs after the activity is destroyed, you must call
                        // destroy and return or you may get a memory leak.
                        boolean isDestroyed = false;
                        //  refresh.setEnabled(true);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            isDestroyed = isDestroyed();
                        }
                        if (isDestroyed || isFinishing() || isChangingConfigurations()) {
                            nativeAd.destroy();
                            return;
                        }
                        // You must call destroy on old ads when you are done with them,
                        // otherwise you will have a memory leak.
                        if (nativeAds != null) {
                            nativeAd.destroy();
                        }
                        nativeAds = nativeAd;
                        FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder);
                        NativeAdView adView =
                                (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                        populateNativeAdView(nativeAd, adView);
                        frameLayout.removeAllViews();
                        frameLayout.addView(adView);
                    }
                });


        AdLoader adLoader =
                builder
                        .withAdListener(
                                new AdListener() {
                                    @Override
                                    public void onAdFailedToLoad(LoadAdError loadAdError) {

                                        String error =
                                                String.format(
                                                        "domain: %s, code: %d, message: %s",
                                                        loadAdError.getDomain(),
                                                        loadAdError.getCode(),
                                                        loadAdError.getMessage());
                          /*              Toast.makeText(
                                                MainActivity.this,
                                                "Failed to load native ad with error " + error,
                                                Toast.LENGTH_SHORT)
                                                .show();*/
                                    }
                                })
                        .build();

        adLoader.loadAd(new AdRequest.Builder().build());


    }

    @Override
    protected void onDestroy() {
        if (nativeAds != null) {
            nativeAds.destroy();
        }
        super.onDestroy();
    }
}