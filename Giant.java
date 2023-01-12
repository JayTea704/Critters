import java.awt.*;
public class Giant extends Critter {
    private int outerCount;
    private int count;
    public Giant() {
        outerCount = 1;
        count = 2;

    }
    public Color getColor (){
        return Color.GRAY;
    }

    public String toString(){
        if(outerCount % 7 == 0){
            if(count > 5){
                count = 2;
            }
            else{
                count++;
            }

        }
        if(count % 2 == 0){
            outerCount++;
            return "fee";

        }
        else if(count % 3 == 0){
            outerCount++;
            return "fie";

        }
        else if(count % 4 == 0){
            outerCount++;
            return "foe";

        }
        else {
            outerCount++;
            return "fum";

        }


    }

    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;

        }
        else{
            return Action.RIGHT;
        }
    }

}
