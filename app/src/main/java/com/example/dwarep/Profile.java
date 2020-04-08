package com.example.dwarep;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.MaterialToolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {

    public Profile() {
        // ur previous code
        //
        //import android.content.Intent;
        //import android.os.Bundle;
        //import android.util.Log;
        //import android.view.Menu;
        //import android.view.MenuInflater;
        //import android.view.MenuItem;
        //import android.view.View;
        //import android.widget.TextView;
        //
        //import androidx.annotation.NonNull;
        //import androidx.appcompat.app.AppCompatActivity;
        //
        //import com.google.android.gms.tasks.OnSuccessListener;
        //import com.google.android.material.appbar.MaterialToolbar;
        //import com.google.firebase.auth.FirebaseAuth;
        //import com.google.firebase.firestore.DocumentReference;
        //import com.google.firebase.firestore.DocumentSnapshot;
        //import com.google.firebase.firestore.FirebaseFirestore;
        //
        //public class MainActivity extends AppCompatActivity {
        //    TextView fullName,email,phone;
        //    public static final String TAG = "TAG";
        //    String mName,mEmail,mPhone;
        //    FirebaseAuth fAuth;
        //    FirebaseFirestore fStore;
        //    String userId;
        //    MaterialToolbar toolbar;
        //    @Override
        //    protected void onCreate(Bundle savedInstanceState) {
        //        super.onCreate(savedInstanceState);
        //        setContentView(R.layout.activity_main2);
        //        toolbar = findViewById(R.id.toolbar);
        //        setSupportActionBar(toolbar);
        //        getSupportActionBar().setTitle("Profile");
        //
        //      /*  Toolbar toolbar = findViewById(R.id.toolbar);
        //        setSupportActionBar(toolbar);
        //        getSupportActionBar().setTitle("Profil");
        //        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        //
        //       /* profilImg = findViewById(R.id.profileImage);
        //        username = findViewById(R.id.username);
        //
        //        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        //         reference = FirebaseDatabase.getInstance().getReference("Users").child(firebaseUser.getUid());
        //         reference.addValueEventListener(new ValueEventListener() {
        //             @Override
        //             public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        //                 User user = dataSnapshot.getValue(User.class);
        //                 username.setText(user.getUsername());
        //                 if(user.getImage().equals("Default")){
        //
        //                     profilImg.setImageResource(R.mipmap.ic_launcher);
        //                 } else {
        //                     Glide.with(MainActivity.this).load(user.getImage()).into(profilImg);
        //                 }
        //             }
        //
        //             @Override
        //             public void onCancelled(@NonNull DatabaseError databaseError) {
        //
        //             }
        //         });
        //
        //
        //    }
        //
        //    @Override
        //    public boolean onCreateOptionsMenu(Menu menu) {
        //        getMenuInflater().inflate(R.menu.menu,menu);
        //        return true;
        //    }
        //
        //    @Override
        //    public boolean onOptionsItemSelected(MenuItem item) {
        //        switch (item.getItemId()){
        //            case R.id.logout:
        //                FirebaseAuth.getInstance().signOut();
        //                Intent myIntent = new Intent(this, StartActivity.class);
        //                startActivity(myIntent);
        //                finish();
        //                return true;
        //        }
        //        return false;*/
        //
        //
        //        phone = findViewById(R.id.profilePhone);
        //        fullName = findViewById(R.id.profileFullName);
        //        email    = findViewById(R.id.profileEmail);
        //
        //        fAuth = FirebaseAuth.getInstance();
        //        fStore = FirebaseFirestore.getInstance();
        //
        //        // userId = fAuth.getCurrentUser().getUid();
        //
        //        DocumentReference docRef =fStore.collection("Users").document(fAuth.getCurrentUser().getUid());
        //        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
        //            @Override
        //            public void onSuccess(DocumentSnapshot documentSnapshot) {
        //                if(documentSnapshot.exists()){
        //                    mName = documentSnapshot.getString("first") + " " + documentSnapshot.getString("last");
        //                    mEmail = documentSnapshot.getString("email");
        //                    mPhone = fAuth.getCurrentUser().getPhoneNumber();
        //
        //                    fullName.setText(mName);
        //                    email.setText(mEmail);
        //                    phone.setText(mPhone);
        //                }else {
        //                    Log.d(TAG, "Retrieving Data: Profile Data Not Found ");
        //                }
        //            }
        //        });
        //    }
        //
        //    @Override
        //    public boolean onCreateOptionsMenu(Menu menu) {
        //        MenuInflater inflater = getMenuInflater();
        //        inflater.inflate(R.menu.menu,menu);
        //        return super.onCreateOptionsMenu(menu);
        //    }
        //
        //    @Override
        //    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //        if(item.getItemId() == R.id.logout){
        //            FirebaseAuth.getInstance().signOut();
        //            startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
        //            finish();
        //        }
        //        return true;
        //
        //
        //    }
        //
        //    public void logout(View view) {
        //        FirebaseAuth.getInstance().signOut();//logout
        //        startActivity(new Intent(getApplicationContext(),LogActivity.class));
        //        finish();
        //    }
        //}
        /*

         */
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_profile, container, false);
        MaterialToolbar toolbar = v.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profile");
        return v;
    }

}
