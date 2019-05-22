package vn.poly.slide3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FruitAdapter extends BaseAdapter {


    private String[] fruits;
    private Context context;

    public FruitAdapter(Context context,String[] fruits) {

        this.fruits = fruits;
        this.context = context;

    }

    @Override
    public int getCount() {
        return fruits.length;
    }

    @Override
    public Object getItem(int position) {
        return fruits[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).
                inflate(R.layout.item,parent,false);

        TextView tvName = view.findViewById(R.id.tvName);

        tvName.setText(fruits[position]);

        return view;
    }
}
