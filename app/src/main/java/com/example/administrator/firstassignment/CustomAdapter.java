package com.example.administrator.firstassignment;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 11/3/2015.
 */
public class CustomAdapter extends BaseAdapter{
      private  MainActivity mainActivity;
      private LayoutInflater mInflater;
      public static int i =0;
      int count=0;
    CustomAdapter(MainActivity mainActivity,int count)
    {
        this.mainActivity=mainActivity;
        this.count=count;
        mInflater=(LayoutInflater)mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String a[]={"1","2","3","4","5","6","7","8","9","0","+","-","*","=","(",")","<",">","@","#","%","^"};
        System.out.println(position);
        convertView=mInflater.inflate(R.layout.activity_main,null);
        Button b1=(Button) convertView.findViewById(R.id.button);
        TextView text=(TextView)convertView.findViewById(R.id.editText);
        b1.setVisibility(View.VISIBLE);
        text.setVisibility(View.INVISIBLE);
        b1.setText(a[position]+"");
        return convertView;
    }

}
