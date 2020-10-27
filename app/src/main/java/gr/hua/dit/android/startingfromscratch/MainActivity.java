package gr.hua.dit.android.startingfromscratch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        Button button = findViewById(R.id.mybutton);
        textView = findViewById(R.id.mytextview);*/
//        MyButtonClickListener myButtonClickListener = new MyButtonClickListener(this);
//        button.setOnClickListener(myButtonClickListener);
//        button.setOnClickListener(this);
/*        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("World");
            }
        });*/
        String [] items = {"one","two","three"};
        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_activated_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

/*  public void onClick(View v) {
        textView.setText("World");
    }*/
}
