void setup() {
  
  Cow c = new Cow("Cow", "Moo");
  System.out.println(c.getType() + " goes " + c.getSound());
  
  Chick h = new Chick("Chick", "Cluck");
  System.out.println(h.getType() + " goes " + h.getSound());
  
  Pig p = new Pig("Pig", "Oink");
  System.out.println(p.getType() + " goes " + p.getSound());
}