package com.Roshiappstudio.batterrycharging.Avtivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
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
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.Roshiappstudio.batterrycharging.R;

public class animationBubble extends AppCompatActivity {
    SharedPreferences mPref;
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private NativeAd nativeAds;
    LottieAnimationView lottieone,lottieone2,lottieone3,lottieone4,lottieone5,lottieone6,lottieone7,
            lottieone8,lottieone9,lottieone10,lottieone11,lottieone12,lottieone13,lottieone14,lottieone15
            ,lottieone16,lottieone17,lottieone18,lottieone19,lottieone20,lottieone21,lottieone22,lottieone23,lottieone24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_bubble);
        getSupportActionBar().setTitle("Bubble Animation");
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
        lottieone= findViewById(R.id.bubblloti1);
        lottieone2= findViewById(R.id.bubbleloti2);
        lottieone3= findViewById(R.id.bubblloti3);
        lottieone4= findViewById(R.id.bubblloti4);
        lottieone5= findViewById(R.id.bubblloti5);
        lottieone6= findViewById(R.id.bubbleloti6);
        lottieone7= findViewById(R.id.bubbleloti7);
        lottieone8= findViewById(R.id.bubbleloti8);
        lottieone9= findViewById(R.id.bubbleloti9);
        lottieone10= findViewById(R.id.bubbleloti10);
        lottieone11= findViewById(R.id.bubbleloti11);
        lottieone12= findViewById(R.id.bubbleloti12);
        lottieone13= findViewById(R.id.bubbleloti13);
        lottieone14= findViewById(R.id.bubbleloti14);
        lottieone15= findViewById(R.id.bubbleloti15);
        lottieone16= findViewById(R.id.bubbleloti16);
        lottieone17= findViewById(R.id.bubbleloti17);
        lottieone18= findViewById(R.id.bubbleloti18);
        lottieone19= findViewById(R.id.bubbleloti19);
        lottieone20= findViewById(R.id.bubbleloti20);
        lottieone21= findViewById(R.id.bubbleloti21);
        lottieone22= findViewById(R.id.bubbleloti22);
        lottieone23= findViewById(R.id.bubbleloti23);
        lottieone24= findViewById(R.id.bubbleloti24);

        lottieone.playAnimation();lottieone.setRepeatCount(1000);lottieone.getRepeatCount();
        lottieone2.playAnimation();lottieone2.setRepeatCount(1000);lottieone2.getRepeatCount();
        //lottieone3.startAnimation(fade_in);
        lottieone3.playAnimation();lottieone3.setRepeatCount(1000);lottieone3.getRepeatCount();
        lottieone4.playAnimation();lottieone4.setRepeatCount(1000);lottieone4.getRepeatCount();
        lottieone5.playAnimation();lottieone5.setRepeatCount(1000);lottieone5.getRepeatCount();
        lottieone6.playAnimation();lottieone6.setRepeatCount(1000);lottieone6.getRepeatCount();
        lottieone7.playAnimation();lottieone7.setRepeatCount(1000);lottieone7.getRepeatCount();
        lottieone8.playAnimation();lottieone8.setRepeatCount(1000);lottieone8.getRepeatCount();
        lottieone9.playAnimation();lottieone9.setRepeatCount(1000);lottieone9.getRepeatCount();
        lottieone10.playAnimation();lottieone10.setRepeatCount(1000);lottieone10.getRepeatCount();
        lottieone11.playAnimation();lottieone11.setRepeatCount(1000);lottieone11.getRepeatCount();
        lottieone12.playAnimation();lottieone12.setRepeatCount(1000);lottieone12.getRepeatCount();
        lottieone13.playAnimation();lottieone13.setRepeatCount(1000);lottieone13.getRepeatCount();
        lottieone14.playAnimation();lottieone14.setRepeatCount(1000);lottieone14.getRepeatCount();
        lottieone15.playAnimation();lottieone15.setRepeatCount(1000);lottieone15.getRepeatCount();
        lottieone16.playAnimation();lottieone16.setRepeatCount(1000);lottieone16.getRepeatCount();
        lottieone17.playAnimation();lottieone17.setRepeatCount(1000);lottieone17.getRepeatCount();
        lottieone18.playAnimation();lottieone18.setRepeatCount(1000);lottieone18.getRepeatCount();
        lottieone19.playAnimation();lottieone19.setRepeatCount(1000);lottieone19.getRepeatCount();
        lottieone20.playAnimation();lottieone20.setRepeatCount(1000);lottieone20.getRepeatCount();
        lottieone21.playAnimation();lottieone21.setRepeatCount(1000);lottieone21.getRepeatCount();
        lottieone22.playAnimation();lottieone22.setRepeatCount(1000);lottieone22.getRepeatCount();
        lottieone23.playAnimation();lottieone23.setRepeatCount(1000);lottieone23.getRepeatCount();
        lottieone24.playAnimation();lottieone24.setRepeatCount(1000);lottieone24.getRepeatCount();

        mPref=new SharedPreferences(this);
//        mPref.setlottie1(lottieone);
        lottieone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                mPref.setbubbllottie1(lottieone);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b1",mPref.getbubbllottie1());
                startService(intent);

//                startService(new Intent(animationBubble.this, FloatingViewService.class));
//                Intent intent=new Intent(animationBubble.this,playAnimation.class);
//                intent.putExtra("key_anim",R.raw.bubble1);
//                startActivity(intent);
   }
        });
        lottieone2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie2(lottieone2);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b2",mPref.getbubbllottie2());
                startService(intent);


            }
        });
       lottieone3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie3(lottieone3);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b3",mPref.getbubbllottie3());
                startService(intent);


            }
        });
       lottieone4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mPref.setbubbllottie4(lottieone4);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b4",mPref.getbubbllottie4());
                startService(intent);
            }
        });
       lottieone5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

//                Intent intent=new Intent(animationBubble.this,playAnimation.class);
//                intent.putExtra("key_anim",R.raw.five);
//                startActivity(intent);

                mPref.setbubbllottie5(lottieone5);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b5",mPref.getbubbllottie5());
                startService(intent);


            }
        });

       lottieone6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie6(lottieone6);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b6",mPref.getbubbllottie6());
                startService(intent);



            }
        });
       lottieone7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie7(lottieone7);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b7",mPref.getbubbllottie7());
                startService(intent);


            }
        });
       lottieone8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie8(lottieone8);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b8",mPref.getbubbllottie8());
                startService(intent);


            }
        });
       lottieone9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie9(lottieone9);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b9",mPref.getbubbllottie9());
                startService(intent);


            }
        });
       lottieone10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie10(lottieone10);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b10",mPref.getbubbllottie10());
                startService(intent);


            }
        });
       lottieone11.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mPref.setbubbllottie11(lottieone11);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b11",mPref.getbubbllottie11());
                startService(intent);


            }
        });
       lottieone12.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie12(lottieone12);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b12",mPref.getbubbllottie12());
                startService(intent);


            }
        });
       lottieone13.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                mPref.setbubbllottie13(lottieone13);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b13",mPref.getbubbllottie13());
                startService(intent);


            }
        });
       lottieone14.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie14(lottieone14);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b14",mPref.getbubbllottie14());
                startService(intent);

            }
        });
       lottieone15.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie15(lottieone15);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b15",mPref.getbubbllottie15());
                startService(intent);



            }
        });

       lottieone16.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie16(lottieone16);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b16",mPref.getbubbllottie16());
                startService(intent);


            }
        });
       lottieone17.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie17(lottieone17);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b17",mPref.getbubbllottie17());
                startService(intent);

            }
        });
       lottieone18.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie18(lottieone18);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b18",mPref.getbubbllottie18());
                startService(intent);
 }
        });

       lottieone19.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie19(lottieone19);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b19",mPref.getbubbllottie19());
                startService(intent);


            }
        });
       lottieone20.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mPref.setbubbllottie20(lottieone20);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b20",mPref.getbubbllottie20());
                startService(intent);


            }
        });

       lottieone21.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie21(lottieone21);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b21",mPref.getbubbllottie21());
                startService(intent);



            }
        });
       lottieone22.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie22(lottieone22);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b22",mPref.getbubbllottie22());
                startService(intent);


            }
        });

       lottieone23.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mPref.setbubbllottie23(lottieone23);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b23",mPref.getbubbllottie23());
                startService(intent);


            }
        });
       lottieone24.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mPref.setbubbllottie24(lottieone24);
                Intent intent=new Intent(getApplicationContext(),FloatingViewService.class);
                intent.putExtra("b24",mPref.getbubbllottie24());
                startService(intent);


            }
        });
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