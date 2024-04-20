package classes;

import java.util.Map;
import java.util.HashMap;

public class FirebaseStorageConfig {

public static String defaultProfileImg = "Dynamic";
public static Map defaultUserConfig = new HashMap<String, Object>(){{

put("Theme","Light");
put("Animations",true);
put("LowMode",false);
put("Third screens",false);
  
}};

public void updatePrefs(static String key, static Object value){

  static Map<String,Object> swapper = new HashMap<>(defaultUserConfig.sizd());

  if(defaultUserConfig.containsKey(key)){

  swapper.put(key, value);
  this.defaultUserConfig.updateChildrens(swapper);
  }
  
  

}
