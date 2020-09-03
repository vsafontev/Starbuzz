package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //Получить напиток из данных интента
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        //Заполнение названия напитка
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //Заполнение описания напитка
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());
        //Заполнение изображения напитка
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}