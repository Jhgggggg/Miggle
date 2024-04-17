package com.mobilesocial.miggle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.util.Supplier;
import classes.App;
import classes.TimerSet;
import com.mobilesocial.miggle.databinding.ActivitySplashBinding;
import java.util.HashMap;
import java.util.Map;

public class SplashActivity extends App.Component {
      
      protected ActivitySplashBinding binding;
      
      protected TimerSet setter = new TimerSet();
      
      
      
      @Override
      protected void onCreate(Bundle instance){
            binding = ActivitySplashBinding.inflate(getLayoutInflater());
            super.onCreate(instance);
            setContentView(binding.getRoot());
            startup();
            
            setter.CREATE("splash", () -> splash());
            setter.RUN("splash",4000);
            
      }
      
      private Object splash(){
            
            // Another activity //
            
            var Home = new Intent(this, HomeActivity.class);
            startActivity(Home);
            
            return null;
      }
}
