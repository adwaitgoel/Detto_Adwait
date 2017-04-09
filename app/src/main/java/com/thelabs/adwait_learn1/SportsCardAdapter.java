package com.thelabs.adwait_learn1;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Detto on 31-03-2017.
        */

public class SportsCardAdapter extends RecyclerView.Adapter<SportsCardAdapter.OurViewHolder>
{
    private Context mContext;
    private List<String> SportsList;

    public class OurViewHolder extends RecyclerView.ViewHolder
    {
        public TextView sportsname;

        public OurViewHolder(View itemView) {
            super(itemView);
            sportsname = (TextView) itemView.findViewById(R.id.sportsname);
        }
    }
    public SportsCardAdapter(Context mContext,List<String> SportsList)
    {
        this.mContext = mContext;
        this.SportsList = SportsList;
    }


    @Override
    public OurViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sport_list_row, parent, false);

        return new OurViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(OurViewHolder holder, int position) {
        SportsName sport = SportsList.get(position);
        holder.sportsname.setText(sport.getSport());
    }

    @Override
    public int getItemCount() {
        return SportsList.size();
    }


}
