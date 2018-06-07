package com.example.android.cardapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CustomPagerAdapter extends PagerAdapter{

    Context context;
    //int images[];
    LayoutInflater layoutInflater;

    Integer images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};

    public CustomPagerAdapter(Context context)
    {
        this.context = context;
       // this.images = images;
        Log.d("Entering in ","Constructor of CustomPagerAdapter");

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object ;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
       // return super.instantiateItem(container, position);

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = layoutInflater.inflate(R.layout.activity_main,container,false);
        ImageView imageView = itemView.findViewById(R.id.imageview);
        imageView.setImageResource(images[position]);

        //container.addView(imageView);

        ViewPager vp = (ViewPager)container;
        vp.addView(itemView,0);


        imageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(context,"I am image no."+(position+1),Toast.LENGTH_LONG).show();
            }
        });
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

