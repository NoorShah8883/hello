//package com.Roshiappstudio.batterrycharging.Avtivities;
//
//import android.app.Activity;
//import android.app.WallpaperManager;
//import android.content.Context;
//import android.content.Intent;
//import android.content.res.Resources;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.GridLayout;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.Roshiappstudio.batterrycharging.R;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static androidx.appcompat.graphics.drawable.DrawableContainer.Api21Impl.getResources;
//
//public class mainAdapter extends RecyclerView.Adapter<mainAdapter.mainViewHolder> {
//    Context mContext;
//    String[] data;
////    InterstitialAd mInterstitialAd;
//    List<ItemList> listitems=new ArrayList<>();
//    public mainAdapter(String[] data){
//        this.data=data;
//
//    }
//
//    public mainAdapter(MainActivity mainActivity, ArrayList<ItemList> items) {
//        this.mContext=mainActivity;
//        this.listitems=items;
//    }
//
//    @NonNull
//    @Override
//    public mainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//      View view=LayoutInflater.from(mContext).inflate(R.layout.recycleritems,parent,false);
//        //View view=inflater.inflate(R.layout.recycler_items,parent,false);
//        return new mainViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull mainViewHolder holder, int position) {
//        final ItemList itemlist=listitems.get(position);
//        //String title= data[position];
//
//     holder.img.setImageResource(itemlist.getImg());
//        holder.gridLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (position == 0) {
//                    Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.wallpaper1);
//                    WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
//
//                    try {
//                        wallpaperManager.setBitmap(bitmap);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//
//                } else {
//
//                }
//
//
//            }
//
//
//        });}
//
//    @Override
//    public int getItemCount() {
//        return listitems.size();
//    }
//
//    public class mainViewHolder extends RecyclerView.ViewHolder {
//
//        ImageView img;
//        GridLayout gridLayout;
//
//        public mainViewHolder(@NonNull View itemView) {
//            super(itemView);
////            discription=itemView.findViewById(R.id.discription);
//            img = itemView.findViewById(R.id.image);
//            gridLayout = itemView.findViewById(R.id.r1);
//        }
//    }
//    }
