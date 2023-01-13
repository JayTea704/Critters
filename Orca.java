import java.awt.*;

public class Orca extends Critter{

    public Orca () {

    }

    public Color getColor(){
        return Color.BLUE;
    }

    public String toString(){

        return ">--:)";

    }

    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER || info.getBack() == Neighbor.OTHER || info.getLeft() == Neighbor.OTHER || info.getRight() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else if (info.getLeft() == Neighbor.EMPTY){
            return Action.LEFT;
        }
        else if(info.getRight() == Neighbor.EMPTY) {
            return Action.RIGHT;
        }
        else {
            return Action.HOP;
        }

    }
}
