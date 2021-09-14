package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Model>userlist;
    public Adapter (List<Model>userlist){
        this.userlist=userlist;
    }

    @NonNull

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        int res=userlist.get(position).getImageview1();
        String name=userlist.get(position).getTextview1();
        String time=userlist.get(position).getTextview2();
        String msg=userlist.get(position).getTextview3();
        String line=userlist.get(position).getDivider();
        holder.setData(res,name,time,msg,line);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;



        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
            divider=itemView.findViewById(R.id.divider);


        }

        public void setData(int res, String name, String time, String msg, String line) {

            imageView.setImageResource(res);
            textView.setText(name);
            textView2.setText(time);
            textView3.setText(msg);
            divider.setText(line);
        }
    }
}
