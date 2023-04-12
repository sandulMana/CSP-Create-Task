import java.io.IOException;

public class quizMaker {
    
    public String printAnswers(String[] listA){
        String result = "";
        for (int index = 0; index < listA.length; index++){
            result += listA[index] + " ";
        }
        return result;
    }
    public boolean checkAnswer(String[] listB, String choice, String answer){
        for (int index = 0; index < listB.length; index++){
        if(choice.toLowerCase().equals(answer.toLowerCase())){
            return true;
        }
        }
        return false;
    }
}
