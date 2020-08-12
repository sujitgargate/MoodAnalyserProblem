
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

      if (moodMessage.contains("Sad")) {
         return "SAD";
      } else if(moodMessage.contains("Happy")) {
         return "HAPPY";

         //This Else Is For No Mood, returns Happy
      } else {
         return "SAD";
      }
   }
}