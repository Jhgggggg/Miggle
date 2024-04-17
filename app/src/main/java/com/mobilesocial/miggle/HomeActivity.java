package com.mobilesocial.miggle;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import classes.App;
import classes.EntertaimentTab;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.mobilesocial.miggle.databinding.ActivityHomeBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HomeActivity extends App.Component {
      
      protected ActivityHomeBinding binding;
      
      ArrayList<EntertaimentTab> tab_item_list = new ArrayList<>(Arrays.asList(
            
           new EntertaimentTab("Lives",null, 0),
           new EntertaimentTab("Games",R.drawable.gamer, 1),
           new EntertaimentTab("Play",null, 2),
           new EntertaimentTab("Entertainment",null, 3)
                  
                  
      ));
      
      
      @Override
      protected void onCreate(Bundle savedInstanceState) {
            binding = ActivityHomeBinding.inflate(getLayoutInflater());
            super.onCreate(savedInstanceState);
            setContentView(binding.getRoot());
            
            BottomNavigationView navigation = binding.nav;
            TabLayout tab = binding.tabLayout;
            
            tab.setTabRippleColor(null);
            
            tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
                  public void onTabReselected(TabLayout.Tab tab){
                        
                  }
                         
                  public void onTabUnselected(TabLayout.Tab tab){
                        
                  }
                        
                  public void onTabSelected(TabLayout.Tab tab){
                        if(tab.getText().equals("Play")){
                              
                        }
                  }
            });
            
            tab_item_list.forEach( bit -> { 
                  
            switch(bit.getIdentifier()){
                  case 0: tab.addTab(tab.newTab().setText(bit.getText()));
                  break;
                  case 1: tab.addTab(tab.newTab().setText(bit.getText()).setIcon(R.drawable.gamer));
                  break;
                  case 2: tab.addTab(tab.newTab().setText(bit.getText()));
                  break;
                  case 3: tab.addTab(tab.newTab().setText(bit.getText()));
            }
                        
                        
            });
            
            
            startup(navigation);
      }
}
