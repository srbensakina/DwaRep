package com.example.dwarep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MainActivity extends AppCompatActivity {

    protected SpaceNavigationView navigationView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.space_naviguation);
        navigationView.initWithSaveInstanceState(savedInstanceState);
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_search_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_chat_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_notifications_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_person_black_24dp));
        navigationView.setCentreButtonSelectable(true);
        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                if(itemIndex==1){
                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
            }
        });

    }

}
