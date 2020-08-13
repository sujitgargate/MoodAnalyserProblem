
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
   public String analyseMood(String moodMessage) throws MoodAnalysisException {

      //try/catch is for handling NullPointerException
      try {
         if(moodMessage.length() == 0) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please Enter Proper Message");
         }
         if (moodMessage.contains("Sad")) {
            return "SAD";
         } else if (moodMessage.contains("Happy")) {
            return "SAD";

            //This Else Is For No Mood, returns Happy
         } else {
            return "HAPPY";
         }
      } catch (NullPointerException e) {
         throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please Enter Proper Message");
      }
   }
}