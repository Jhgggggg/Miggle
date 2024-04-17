package classes;

import android.graphics.drawable.Drawable;

public class EntertaimentTab {
  private String text;
  private Drawable icon;
      
  private int iconInt;
  private int identifier;

  public EntertaimentTab(String text, Drawable icon, int identifier) {
    this.text = text;
    this.icon = icon;
    this.identifier = identifier;
  }
      
  public EntertaimentTab(String text, int icon, int identifier){
        this.text = text;
        this.iconInt = icon;
        this.identifier = identifier;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Drawable getIcon() {
    return this.icon;
  }

  public void setIcon(Drawable icon) {
    this.icon = icon;
  }
      
  public int getIconInt(){
        return this.iconInt;
  }
      
  public void setIconInt(int icon){
        this.iconInt = icon;
  }
      
  public int getIdentifier(){
        return this.identifier;
  }
      
  public void setIdentifier(int identifier){
        this.identifier = identifier;
  }
}
