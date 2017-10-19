class NamedCow extends Cow
{
  private String myName;
  private String myType;
  private String mySound;
  
  public NamedCow(String name, String type, String sound) {
    myName = name;
    myType = type;
    mySound = sound;
  }
  
  public NamedCow() {
    myType = "Cow";
    myName = "Elsie";
    mySound = "moo";
  }
  
  public String getName() {
    return myName;
  }
}