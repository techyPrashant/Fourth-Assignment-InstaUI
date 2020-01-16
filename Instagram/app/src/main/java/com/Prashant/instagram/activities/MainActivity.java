package com.Prashant.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.Prashant.instagram.models.PostModel;
import com.Prashant.instagram.R;
import com.Prashant.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
//    Fragment selectedFragment = null;

    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);


        listPosts.add(new PostModel("1","Achyut Pandey", "Looking back to old days", R.drawable.post5, R.drawable.post6));
        listPosts.add(new PostModel("2","Good Shoe", "Lets play.", R.drawable.post7, R.drawable.post7));
        listPosts.add(new PostModel("3","Stadium", "What a wonderfull stadium it is my friends", R.drawable.post4, R.drawable.profilepic));
        listPosts.add(new PostModel("4","Tony Starc", "I am done with this.", R.drawable.profilepic2, R.drawable.profilepic2));
 listPosts.add(new PostModel("5","Achyut Pandey", "Looking back to old days", R.drawable.post5, R.drawable.post6));
        listPosts.add(new PostModel("6","Good Shoe", "Lets play.", R.drawable.post7, R.drawable.post7));
        listPosts.add(new PostModel("7","Stadium", "What a wonderfull stadium it is my friends", R.drawable.post4, R.drawable.profilepic));
        listPosts.add(new PostModel("8","Tony Starc", "I am done with this.", R.drawable.profilepic2, R.drawable.profilepic2));
 listPosts.add(new PostModel("9","Achyut Pandey", "Looking back to old days", R.drawable.post5, R.drawable.post6));


        listStories.add(new StoryModel("1","Me", R.drawable.post1, 0));
        listStories.add(new StoryModel("Cool", R.drawable.post3));
        listStories.add(new StoryModel("1","Me Prashant", R.drawable.post1, 0));
        listStories.add(new StoryModel("good gu.", R.drawable.post7));
//        listStories.add(new StoryModel("2","Add", R.drawable.add, 0));
//        listStories.add(new StoryModel("3","Aryan Rajbhandari", R.drawable.home, 0));
//        setUpStories();
    }




}
