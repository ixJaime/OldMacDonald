class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new Cow("Cow","Moo");           
      aBunchOfAnimals[1] = new Chick("Chick","Cluck");       
      aBunchOfAnimals[2] = new Pig("Pig","Oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      }    
    } 
} 