package com.best4u.vladimir.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //for first commit just added
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINK_ID);
        Drink drink = Drink.drinks[drinkId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());


    }

}
