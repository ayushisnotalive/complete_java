package basics;
class computer{
    public void playmusic()
    {
        System.out.println("music playing");
    }

    public String getMeApen(int cost)
    {
        if(cost>=10){
            return "pen";
        }
            return "10 rupiya ke niche pen nahi milega saale";
        
        
    }
}



public class play_m {
    public static void main(String[] args) {
        computer comp = new computer();

        comp.playmusic();

        String pen = comp.getMeApen(10);
        System.out.println(pen);
    }
}
