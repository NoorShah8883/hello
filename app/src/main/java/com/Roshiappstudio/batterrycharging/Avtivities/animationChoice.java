package com.Roshiappstudio.batterrycharging.Avtivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.Roshiappstudio.batterrycharging.R;

public class animationChoice extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private NativeAd nativeAds;
    String picturePath;
    int scale;
    WallpaperManager wallpaperManager;
    private static final int PICK_IMAGE = 1;

    LottieAnimationView lottieone15, bubble15;
    Animation blink, move;
    ImageView img1, img2;
    TextView txt1, txt2, txt3, txt4;
    Bitmap bitmap;
    String path;
    Image image;
    boolean imgCapFlag;
    boolean taken;
   ImageView imageView1;
   int img;

    private static final int IMAGE_PICK_CODE=1000;
    private static final int PERMISSION_CODE=1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_choice);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        refreshAd();
        setAdsload();



//        View view= inflater.inflate(R.layout.fragment_default_animation, container, false);
        lottieone15 = findViewById(R.id.defaultloti15);
        bubble15 = findViewById(R.id.bubbl15);
        bubble15.playAnimation();
        bubble15.setRepeatCount(1000);
        bubble15.getRepeatCount();
        lottieone15.playAnimation();
        lottieone15.setRepeatCount(1000);
        lottieone15.getRepeatCount();

        txt1 = findViewById(R.id.t1);
        txt2 = findViewById(R.id.t2);
        txt3 = findViewById(R.id.t3);
        txt4 = findViewById(R.id.t4);
        img1 = findViewById(R.id.image3);
        img2 = findViewById(R.id.image4);
//
//        blink=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
//        img1.startAnimation(blink);
//        img2.startAnimation(blink);
//        txt1.startAnimation(blink);
//        txt2.startAnimation(blink);
//        txt3.startAnimation(blink);
//        txt4.startAnimation(blink);
//        move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
//        img1.startAnimation(move);
//        img2.startAnimation(move);
//        txt1.startAnimation(move);
//        txt2.startAnimation(move);
//        txt3.startAnimation(move);
//        txt4.startAnimation(move);


    }

    public void gotoDefaultActivity(View view) {
//        lottieone15.pauseAnimation();
//        Intent intent = new Intent(this, animationDefault.class);
//        startActivity(intent);

        if (mInterstitialAd != null) {

            mInterstitialAd.show(this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    startActivity(new Intent(animationChoice.this, animationDefault.class));
                    mInterstitialAd = null;
                    setAdsload();

                }
            });
        } else {
            startActivity(new Intent(animationChoice.this,animationDefault.class));
        }
    }

    public void gotoBubbleAnimation(View view) {
//        Intent intent = new Intent(this, animationBubble.class);
//        startActivity(intent);

        if (mInterstitialAd != null) {

            mInterstitialAd.show(this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    startActivity(new Intent(animationChoice.this, animationBubble.class));
                    mInterstitialAd = null;
                    setAdsload();

                }
            });
        } else {
            startActivity(new Intent(animationChoice.this,animationBubble.class));
        }
    }


    public void SelectFromGerlley(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, IMAGE_PICK_CODE);


//        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
//            if (checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
//                    == PackageManager.PERMISSION_DENIED){
//                String[] permissions={Manifest.permission.READ_EXTERNAL_STORAGE};
//                requestPermissions(permissions,PERMISSION_CODE);
//            }else {
//                pickImageFromGallery();
//            }
//        }else {
//            pickImageFromGallery();
//        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Bitmap selectedphoto = null;

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == IMAGE_PICK_CODE && resultCode == RESULT_OK && null != data) {

            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};
            Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String filePath = cursor.getString(columnIndex);
            selectedphoto = BitmapFactory.decodeFile(filePath);
            cursor.close();
            Intent intent = new Intent(animationChoice.this, imageview.class);
            //intent.putExtra("data", selectedphoto);
            intent.setData(selectedImage);
            startActivity(intent);
        }}


        public void gotoWallpaperBackground (View view){
//            Intent intent = new Intent(this, selectBackgroundWalpaper.class);
//            startActivity(intent);

            if (mInterstitialAd != null) {

                mInterstitialAd.show(this);
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        startActivity(new Intent(animationChoice.this, selectBackgroundWalpaper.class));
                        mInterstitialAd = null;
                        setAdsload();

                    }
                });
            } else {
                startActivity(new Intent(animationChoice.this,selectBackgroundWalpaper.class));
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
    public void setAdsload() {

        AdRequest adRequest = new AdRequest.Builder().build();

        com.google.android.gms.ads.interstitial.InterstitialAd.load(this, getResources().getString(R.string.InterstitalAdID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }
        });}
    }
