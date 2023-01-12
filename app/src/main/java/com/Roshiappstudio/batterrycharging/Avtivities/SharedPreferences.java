package com.Roshiappstudio.batterrycharging.Avtivities;

import android.content.Context;

import com.airbnb.lottie.LottieAnimationView;
import com.Roshiappstudio.batterrycharging.R;

public class SharedPreferences {

    android.content.SharedPreferences ShredRef;

    public SharedPreferences(Context context) {

        ShredRef = context.getSharedPreferences("myRef", Context.MODE_PRIVATE);
    }

    public void setbubbllottie1(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble1);
        editor.commit();
    }

    public int getbubbllottie1() {
        int Brand_id = ShredRef.getInt("b1", 0);

      //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbool(String key, boolean value) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    public boolean getbool(String key) {
        boolean status = ShredRef.getBoolean(key, false);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  status;

    }
    public void setbubbllottie2(LottieAnimationView id) {
         android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble2);
        editor.commit();
    }

    public int getbubbllottie2() {
          int Brand_id = ShredRef.getInt("b1", 0);

      //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie3(LottieAnimationView id) {
         android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.two);
        editor.commit();
    }

    public int getbubbllottie3() {
          int Brand_id = ShredRef.getInt("b1", 0);

      //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie4(LottieAnimationView id) {
         android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble7);
        editor.commit();
    }

    public int getbubbllottie4() {
          int Brand_id = ShredRef.getInt("b1", 0);

      //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    } public void setbubbllottie5(LottieAnimationView id) {
         android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.five);
        editor.commit();
    }

    public int getbubbllottie5() {
          int Brand_id = ShredRef.getInt("b1", 0);

      //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setbubbllottie6(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble5);
        editor.commit();
    }

    public int getbubbllottie6() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie7(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble6);
        editor.commit();
    }

    public int getbubbllottie7() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie8(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bubble7);
        editor.commit();
    }

    public int getbubbllottie8() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie9(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.three);
        editor.commit();
    }

    public int getbubbllottie9() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setbubbllottie10(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl1);
        editor.commit();
    }

    public int getbubbllottie10() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie11(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl2);
        editor.commit();
    }

    public int getbubbllottie11() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setbubbllottie12(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl3);
        editor.commit();
    }

    public int getbubbllottie12() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie13(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl4);
        editor.commit();
    }

    public int getbubbllottie13() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setbubbllottie14(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl5);
        editor.commit();
    }

    public int getbubbllottie14() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie15(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl6);
        editor.commit();
    }

    public int getbubbllottie15() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie16(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl8);
        editor.commit();
    }

    public int getbubbllottie16() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie17(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl9);
        editor.commit();
    }

    public int getbubbllottie17() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie18(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl10);
        editor.commit();
    }

    public int getbubbllottie18() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie19(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl11);
        editor.commit();
    }

    public int getbubbllottie19() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie20(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl12);
        editor.commit();
    }

    public int getbubbllottie20() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie21(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl13);
        editor.commit();
    }

    public int getbubbllottie21() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie22(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl14);
        editor.commit();
    }

    public int getbubbllottie22() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie23(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl15);
        editor.commit();
    }

    public int getbubbllottie23() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setbubbllottie24(LottieAnimationView id) {
        android.content.SharedPreferences.Editor editor = ShredRef.edit();
        editor.putInt("b1", R.raw.bbl16);
        editor.commit();
    }

    public int getbubbllottie24() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

//// FOR DEFAULT ANIMATION

public void setdefaultottie1(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.splash);
    editor.commit();
}

    public int getdefaultlottie1() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }


    public void setdefaultottie2(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.splash2);
    editor.commit();
}

    public int getdefaultlottie2() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie3(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df7);
    editor.commit();
}

    public int getdefaultlottie3() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie4(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.two);
    editor.commit();
}

    public int getdefaultlottie4() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie5(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.five);
    editor.commit();
}

    public int getdefaultlottie5() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie6(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.three);
    editor.commit();
}

    public int getdefaultlottie6() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie7(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df14);
    editor.commit();
}

    public int getdefaultlottie7() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie8(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df1);
    editor.commit();
}

    public int getdefaultlottie8() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie9(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df2);
    editor.commit();
}

    public int getdefaultlottie9() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie10(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df9);
    editor.commit();
}

    public int getdefaultlottie10() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }

    public void setdefaultottie11(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df5);
    editor.commit();
}

    public int getdefaultlottie11() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }


    public void setdefaultottie12(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.six);
    editor.commit();
}

    public int getdefaultlottie12() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie13(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df12);
    editor.commit();
}

    public int getdefaultlottie13() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie14(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df13);
    editor.commit();
}

    public int getdefaultlottie14() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie15(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df14);
    editor.commit();
}

    public int getdefaultlottie15() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie16(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df15);
    editor.commit();
}

    public int getdefaultlottie16() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }
    public void setdefaultottie17(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.df3);
    editor.commit();
}

    public int getdefaultlottie17() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }   public void setdefaultottie18(LottieAnimationView id) {
    android.content.SharedPreferences.Editor editor = ShredRef.edit();
    editor.putInt("b1", R.raw.eight);
    editor.commit();
}

    public int getdefaultlottie18() {
        int Brand_id = ShredRef.getInt("b1", 0);

        //  String Brand_name = ShredRef.getString("Brand_name", "No Brand_name");
        return  Brand_id;

    }






}