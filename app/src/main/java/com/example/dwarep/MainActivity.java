package com.example.dwarep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MainActivity extends AppCompatActivity {

    public SpaceNavigationView navigationView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.space_navigation);
        navigationView.initWithSaveInstanceState(savedInstanceState);
        navigationView.addSpaceItem(new SpaceItem("Home", R.drawable.ic_home_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("CHAT", R.drawable.ic_chat_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("NOTIFICATION", R.drawable.ic_notifications_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("PERSON", R.drawable.ic_person_black_24dp));
        navigationView.showIconOnly();
        getSupportFragmentManager().beginTransaction().add(R.id.drawer_frame,new Home()).commit();
        navigationView.setCentreButtonSelectable(true);
        navigationView.setCentreButtonSelected();
        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            Fragment selected_fragment;
            @Override
            public void onCentreButtonClick() {
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_frame,new Home()).commit();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemIndex){
                    case 0 : selected_fragment = new Search(); break;
                    case 1 : selected_fragment = new Chat(); break;
                    case 2 : selected_fragment = new Notification(); break;
                    case 3 : selected_fragment = new Profile(); break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_frame,selected_fragment).commit();
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
            }
        });

    }

}
