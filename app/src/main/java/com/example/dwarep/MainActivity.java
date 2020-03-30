package com.example.dwarep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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
            Fragment selectedfragment;
            @Override
            public void onCentreButtonClick() {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainfrag,).commit();

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemIndex){
                    case 0 : selectedfragment = new Search(); break;
                    case 1 : selectedfragment = new Chat(); break;
                    case 2 : selectedfragment = new Notification(); break;
                    case 3 : selectedfragment = new Profile(); break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.mainfrag,selectedfragment).commit();
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
            }
        });

    }

}
