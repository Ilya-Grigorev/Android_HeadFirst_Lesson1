package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }


    public void onClickFindBeer(View view) {

//        Button myB = (Button) findViewById(R.id.find_beer);
//        myB.setText(myB.getText()+"!");

        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String SelIt =  String.valueOf(color.getSelectedItem());

        List <String> brandsList = BeerExpert.getBrands(SelIt);


        StringBuilder brandsFornatted = new StringBuilder();

        for (String br: brandsList){
            brandsFornatted.append(br).append('\n');
        }

        String color_val = String.valueOf(brandsFornatted);
        brands.setText(color_val);

    }
}
