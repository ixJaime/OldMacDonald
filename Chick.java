class Chick implements Animal {

  private String myType;
  private String mySound;
  private String mySecondSound;

  public Chick(String type, String sound) {
    myType = type;
    if(Math.random() < 0.5) {
    mySound = sound;
    }
    else mySecondSound = sound;
  }

  public Chick() {
    myType = "Chick";
    mySound = "cluck";
    mySecondSound = "cheep";
  }

  public String getSound() {
    if (Math.random() < .5) {
      return mySound;
    }
      else return mySecondSound;
    }

    public String getType () {
      return myType;
    }
  }