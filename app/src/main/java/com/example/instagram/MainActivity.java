package com.example.instagram;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.Toolbar;

import com.example.instagram.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.instagram.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextView instagram;
    MenuBuilder menuBuilder,menuBuilder1;

    ImageView plusreactangle;
    private ActivityMainBinding binding;

    TextView follow1,follow2,follow3,follow4,follow5;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        follow1=findViewById(R.id.followid1);
        follow1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                follow1.setTextColor(getResources().getColor(R.color.black));
                follow1.setText("Following");
                follow1.setBackground(getResources().getDrawable(R.drawable.follow_bg));
            }
        });
        follow2=findViewById(R.id.followid2);
        follow2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                follow2.setTextColor(getResources().getColor(R.color.black));
                follow2.setText("Following");
                follow2.setBackground(getResources().getDrawable(R.drawable.follow_bg));
            }
        });
        follow3=findViewById(R.id.followid3);
        follow3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                follow3.setTextColor(getResources().getColor(R.color.black));
                follow3.setText("Following");
                follow3.setBackground(getResources().getDrawable(R.drawable.follow_bg));
            }
        });
        follow4=findViewById(R.id.followid4);
        follow4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                follow4.setTextColor(getResources().getColor(R.color.black));
                follow4.setText("Following");
                follow4.setBackground(getResources().getDrawable(R.drawable.follow_bg));
            }
        });
        follow5=findViewById(R.id.followid5);
        follow5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                follow5.setTextColor(getResources().getColor(R.color.black));
                follow5.setText("Following");
                follow5.setBackground(getResources().getDrawable(R.drawable.follow_bg));
            }
        });
        instagram=findViewById(R.id.instagramtextid);
        menuBuilder=new MenuBuilder(this);
        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_instagram,menuBuilder);

        //set item click listener
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuPopupHelper menuPopupHelper=new MenuPopupHelper(MainActivity.this,menuBuilder,view);
                menuPopupHelper.setForceShowIcon(true);

                menuBuilder.setCallback(new MenuBuilder.Callback() {
                    @Override
                    public boolean onMenuItemSelected(@NonNull MenuBuilder menu, @NonNull MenuItem item) {

                        switch(item.getItemId())
                        {
                            case  R.id.item1:
                                Toast.makeText(MainActivity.this, "Following selected", Toast.LENGTH_SHORT).show();
                                return  true;
                            case R.id.item2:
                                Toast.makeText(MainActivity.this, "Favorites selected", Toast.LENGTH_SHORT).show();
                                return  true;
                            default:
                                return  false;
                        }

                    }

                    @Override
                    public void onMenuModeChange(@NonNull MenuBuilder menu) {

                    }
                });
                menuPopupHelper.show();
            }
        });

          plusreactangle=findViewById(R.id.plustreact);
        menuBuilder1=new MenuBuilder(this);
        MenuInflater menuInflater1=new MenuInflater(this);
        menuInflater1.inflate(R.menu.menu_post,menuBuilder1);

        //set item click listener
        plusreactangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuPopupHelper menuPopupHelper1=new MenuPopupHelper(MainActivity.this,menuBuilder1,view);
                menuPopupHelper1.setForceShowIcon(true);

                menuBuilder1.setCallback(new MenuBuilder.Callback() {
                    @Override
                    public boolean onMenuItemSelected(@NonNull MenuBuilder menu, @NonNull MenuItem item) {

                        switch(item.getItemId())
                        {
                            case  R.id.postid:
                                Toast.makeText(MainActivity.this, "Post selected", Toast.LENGTH_SHORT).show();
                                return  true;
                            case R.id.storyid:
                                Toast.makeText(MainActivity.this, "Story selected", Toast.LENGTH_SHORT).show();
                                return  true;
                            case  R.id.reelid:
                                Toast.makeText(MainActivity.this, "Reel selected", Toast.LENGTH_SHORT).show();
                                return  true;
                            case R.id.liveid:
                                Toast.makeText(MainActivity.this, "Live selected", Toast.LENGTH_SHORT).show();
                                return  true;

                            default:
                                return  false;
                        }

                    }

                    @Override
                    public void onMenuModeChange(@NonNull MenuBuilder menu) {

                    }
                });
                menuPopupHelper1.show();
            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        ImageView addpost=toolbar.findViewById(R.id.plustreact);
//        addpost.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Post your story...", Toast.LENGTH_SHORT).show();
//            }
//        });

        ImageView send=toolbar.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Message Friends...", Toast.LENGTH_SHORT).show();
            }
        });
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.navigation_home)
                {
                    HomeFragment homeFragment=new HomeFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.nav_host_fragment_activity_main,homeFragment);
                    transaction.commit();
                }
                else if (item.getItemId()==R.id.navigation_search)
                {
                    Toast.makeText(MainActivity.this, "Search Fragment", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
public void heartid1(View view)
{
    Toast.makeText(this, "You Liked the Post", Toast.LENGTH_SHORT).show();

}
    public void commentid1(View view)
    {
        Toast.makeText(this, "Comment the Post", Toast.LENGTH_SHORT).show();

    }
    public void shareid1(View view)
    {
        Toast.makeText(this, "Share the Post", Toast.LENGTH_SHORT).show();

    }
    public void saveid1(View view)
    {
        Toast.makeText(this, "Save the Post", Toast.LENGTH_SHORT).show();

    }
}