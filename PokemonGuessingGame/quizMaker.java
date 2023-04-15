
public class quizMaker {
    
    
    public String printAnswers(String[] listA){
        String result = "";
        for (int index = 0; index < listA.length; index++){
            result += listA[index] + " ";
        }
        return result;
    }
// public String checkFirstPlace(ArrayList<Score> ExList){
//     String msg = "";
//     String noWinner = "No perfect scores!";
//     for(int index = 0; index < ExList.size(); index++){
//         if(ExList.get(index).getPoints() == 3){
//             msg += String.valueOf(ExList.get(index)); 
//         }
//         else{
//             return noWinner;
//         }
//         return msg;
//         } 
// return msg;
//         }
public boolean checkAnswer(String[] listA, String answer){
    for(int index = 0; index < listA.length; index++){
    if(answer.toLowerCase().equals(listA[index].toLowerCase())){
        return true;
    }
    }
    return false;
}

}
        

