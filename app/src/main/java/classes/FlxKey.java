package classes;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class FlxKey extends KeyEvent {
      public FlxKey(long a, long b, int ai, int bi, int ci, int di){
            super(a, b, ai, bi, ci, di);
      }
      
      public FlxKey create(String key){
            
            Map<String, FlxKey> keys = new HashMap<>();
            
            if(keys.containsKey(key)){
                  return keys.get(key);
            }
            
            return this;
            
            
      }
      
}
