package enumExamples;
// enum can implement as many interface but cannot extend classes
public class enums
{
    enum Week
    {
        monday ,tuesday , wednesday , thursday , friday , saturday;
        // these are enum constants
        // by default they are public static and final
        // since they are final we cannot create child enum
        // type is week

        Week()
        {
            System.out.println("constructor called for " + this);
        }
        // this is not public or protected , only private or default
        // why ? bcz we do not create new objects
        // internally = public static final week monday = new week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.saturday;
//        for(Week day : Week.values())
//        {
//            System.out.println(day);
//        }
    }
}
