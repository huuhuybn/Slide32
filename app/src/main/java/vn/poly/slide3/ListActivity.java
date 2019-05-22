package vn.poly.slide3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {


    private ListView lvList;


    private String fruit[] = {"Apple","Blackberry","Lemon","Watermelon","Banana","Mango","Coconut","PipeApple",
    "Cherry","Orange","Tomato","Potato","Grape","Bean","Durian","Strawberry","Peaches"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvList = findViewById(R.id.lvList);


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
//                ListActivity.this,android.R.layout.simple_list_item_1,fruit);


        FruitAdapter fruitAdapter = new FruitAdapter(ListActivity.this,fruit);

        lvList.setAdapter(fruitAdapter);


    }
}
