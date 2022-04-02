class Biodata {
        String name;
        String bPlace;
        String bDate;
        String hobby;
        String zodiac;
        String favFood;
        String goal;
        
       
        
        public void name(){
         name = "Zayidan Ilham";
         System.out.println("Name = "+name);
     }
        public void birthPlace(){
         bPlace = "Depok";
         System.out.println("Birt Place = "+bPlace);
        }
        public void birthDate(){
         bDate = "14-04-2003";
         System.out.println("Birth Date = "+bDate);
        }
        public void hobby(){
         hobby = "Playing Games";
         System.out.println("Hobby = "+hobby);
        }
        public void zodiac(){
         zodiac = "Taurus";
         System.out.println("Zodiac = "+zodiac);
        }
        public void favFood(){
         favFood = "Dim-sum";
         System.out.println("Favourite Food = "+favFood);
        }
        public void goal(){
         goal = "Game Designer";
         System.out.println("Goal = "+goal);
        }
    }
class Main {
public static void main(String[] args) {
    
        Biodata List = new Biodata();
        List.name();
        List.birthPlace();
        List.birthDate();
        List.hobby();
        List.zodiac();
        List.favFood();
        List.goal();}
}