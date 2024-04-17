package classes;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class TimerSet extends Timer {
      private Map<String, TimerTask> times = new HashMap<>();
      
      public TimerSet(){
            
      }
      
      public void CREATE(String tag, Runnable run){
            var handler = (Handler) new Handler();
            var task = new TimerTask(){
                  public void run(){
                        handler.post(run);
                  }
            };
            
            
            times.put(tag, task);
      }
      
      public void RUN(String tag, long delay){
            
            
            this.schedule(times.get(tag), delay);
      }
}
