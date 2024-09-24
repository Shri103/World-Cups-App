package com.example.worldcupsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Debug;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
public class CustomAdapter extends ArrayAdapter<String> {
    ArrayList<String> names;
    public TextView textView2;
    public String n;
    public int p;
    List list;
    public ListView listView;
    Context context;
    int xmlResource;
    public ImageView image;
    public Switch s;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        xmlResource = resource;
        list = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View adapterLayout = layoutInflater.inflate(xmlResource, null);
        p = position;
        TextView wcs = adapterLayout.findViewById(R.id.textView);
        image = adapterLayout.findViewById(R.id.imageView);
        Button remove = adapterLayout.findViewById(R.id.button);
        listView = adapterLayout.findViewById(R.id.list_id);
        s = adapterLayout.findViewById(R.id.switch1);
        n = wcs.getText().toString();
        remove.setText("X");
        remove.setBackgroundColor(Color.rgb(255, 0, 0));
        switch(list.get(position).toString()){
            case "Uruguay (1930)":
                image.setImageResource(R.drawable.poster_1930);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.estadio_centenario);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1930);
                        }
                    }
                });
                break;
            case "Sweden (1958)":
                image.setImageResource(R.drawable.poster_1958);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.rasunda_stadium);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1958);
                        }
                    }
                });
                break;
            case "Chile (1962)":
                image.setImageResource(R.drawable.poster_1962);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.estadio_nacional);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1962);
                        }
                    }
                });
                break;
            case "Mexico (1970)":
                image.setImageResource(R.drawable.poster_1970);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.estadio_azteca);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1970);
                        }
                    }
                });
                break;
            case "Mexico (1986)":
                image.setImageResource(R.drawable.poster_1986);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.estadio_azteca1986);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1986);
                        }
                    }
                });
                break;
            case "USA (1994)":
                image.setImageResource(R.drawable.poster_1994);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.rose_bowl);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_1994);
                        }
                    }
                });
                break;
            case "Japan and South Korea (2002)":
                image.setImageResource(R.drawable.poster_2002);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.nissan_stadium);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_2002);
                        }
                    }
                });
                break;
            case "Qatar (2022)":
                image.setImageResource(R.drawable.poster_2022);
                s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.lusail);
                        }else{
                            ImageView i = adapterLayout.findViewById(R.id.imageView);
                            i.setImageResource(R.drawable.poster_2022);
                        }
                    }
                });
                break;

        }
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(position);
                notifyDataSetChanged();
            }
        });
        wcs.setText(list.get(position) + "");
        return adapterLayout;
    }
}
