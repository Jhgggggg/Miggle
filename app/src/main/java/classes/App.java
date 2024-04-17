package classes;
import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import org.json.JSONObject;

public class App {
      public static class Component extends AppCompatActivity {
            
            public void startup(BottomNavigationView nav){
                  
                  try {
                  
                  getWindow().setNavigationBarColor(Color.WHITE);
                  getWindow().setStatusBarColor(Color.WHITE);
                  
                  nav.setItemActiveIndicatorEnabled(false);
                  nav.setItemRippleColor(null);
                        
                  
                  requestPermissions(new String[]{Manifest.permission.MANAGE_EXTERNAL_STORAGE},0);
                  
                  var userConfig = new String("{   config: {  'uiMode': 'dark','userDebug':true  }  }");
                  var configJson = new JSONObject(userConfig);
                        
                  throw new RuntimeException("test");
                  
                        
                  }catch(Exception exc){
                        var stack = (StackTraceElement[]) exc.getStackTrace();
                        
                        if(stack.length > 0){
                              var line = stack[0].getLineNumber();
                              var classC = stack[0].getClassName();
                              var method = stack[0].getMethodName();
                              
                             
                              
                              var javaAlert = new AlertDialog.Builder(this);
                              javaAlert.setTitle("Error at "+classC);
                              javaAlert.setMessage(exc.toString() + " at line "+line+" Caused by method "+method);
                              javaAlert.show();
                              
                              javaAlert.setOnDismissListener(new DialogInterface.OnDismissListener(){
                                    public void onDismiss(DialogInterface i){
                                          throw new RuntimeException(exc.getMessage());
                                    }
                              });
                              
                        }
                  }
            }
            
            public void startup(){
                  getWindow().setNavigationBarColor(Color.WHITE);
                  getWindow().setStatusBarColor(Color.WHITE);
                  
                  
            }
            
      }
}
