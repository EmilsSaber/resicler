package com.example.resicler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolderPerson> {
    ArrayList<String> list;

    public PersonaAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolderPerson onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderPerson(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPerson holder, int position) {
      holder.bind(list.get(position));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolderPerson extends RecyclerView.ViewHolder {
        private TextView textView;
        public ViewHolderPerson(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.number);
        }

        public void bind(String s) {
            textView.setText(s);

        }
    }
}
