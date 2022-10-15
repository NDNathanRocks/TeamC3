package com.example.sfusocials;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Event> list;

    public MyAdapter(Context context, ArrayList<Event> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.evententry, viewGroup, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Event event = list.get(i);
        myViewHolder.eventName.setText(event.getEventName());
        myViewHolder.hostName.setText(event.getHostName());
        myViewHolder.duration.setText(event.getDuration());
        myViewHolder.startTime.setText(event.getStartTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView eventName, hostName, duration, startTime;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.textEventName);
            hostName = itemView.findViewById(R.id.textHostName);
            duration = itemView.findViewById(R.id.textDuration);
            startTime = itemView.findViewById(R.id.textStartTime);

        }
    }
}
