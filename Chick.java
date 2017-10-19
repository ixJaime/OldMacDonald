class Chick implements Animal {

  private String myType;
  private String mySound;
  private String mySecondSound;

  public Chick(String type, String sound, String sound2) {
    myType = type;
    mySound = sound;
    mySecondSound = sound2;
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