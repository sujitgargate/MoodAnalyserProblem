
public class MoodAnalyser {
   String moodMessage;

   //Parameterised Constructor
   public MoodAnalyser(String moodMessage) {
      this.moodMessage = moodMessage;
   }

   //Default Constructor
   public  MoodAnalyser() {
   }

   //This Method Will Check whether the Mood is Happy or Sad
   public String analyseMood(String moodMessage) {

      try {
         if (moodMessage.contains("Sad")) {
            return "SAD";
         } else if (moodMessage.contains("Happy")) {
            return "SAD";

            //This Else Is For No Mood, returns Happy
         } else {
            return "HAPPY";
         }
      } catch (NullPointerException e) {
         System.out.println("Enter Valid Input");
         return null;
      }
   }
}