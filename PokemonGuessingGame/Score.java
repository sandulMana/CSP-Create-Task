public class Score {
    public int points;
    public String name;


public Score(int p, String n){
    points = p;
    name = n;
}

public int getPoints(){
    return points;
}
public String getName(){
    return name;
}
public String scoreToString(){
    String result = name + " " + String.valueOf(points) + ",";
    return result;
}
}
