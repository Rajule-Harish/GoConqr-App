package com.example.puc_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    public ArrayList<CustomListPOJO> arraylistListener;
    private List<CustomListPOJO> mListenerList;
    Context mContext;

    public CustomListAdapter(List<CustomListPOJO> mListenerList, quizCustomList mContext) {

        this.mListenerList = mListenerList;
        this.mContext = mContext;
        this.arraylistListener= new ArrayList<CustomListPOJO>();
        this.arraylistListener.addAll(mListenerList);
    }


    public class ViewHolder
    {
        ImageView mItemPic;
        TextView mGameName;
        Button mbutton;
    }



    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if(convertView==null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.customlistview_layout,null);
            holder= new ViewHolder();
            holder.mItemPic= (ImageView) convertView.findViewById(R.id.imageView2);
            holder.mGameName= (TextView) convertView.findViewById(R.id.textView7);
            holder.mbutton= (Button) convertView.findViewById(R.id.button8);

            convertView.setTag(holder);

        }

        else
        {
            holder= (ViewHolder) convertView.getTag();
        }

        try{
            int image= mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mGameName.setText(mListenerList.get(position).getGameName());

            holder.mGameName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"You clicked on "+ holder.mGameName.getText(),Toast.LENGTH_SHORT).show();
                }
            });

            holder.mbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"Loading "+ holder.mGameName.getText() + " questions",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(mContext,Q1.class);
                    mContext.startActivity(intent);
                }
            });


        }catch (Exception ex){

        }

        return convertView;
    }
}

