package team4player;

import battlecode.common.GameActionException;
import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class FulfillmentCenter extends Building {
    static int numRounds = 0;
    public int numDrones = 0;

    public FulfillmentCenter(RobotController rc) throws GameActionException {
        super(rc);
				bc.broadcastFCCreation();
    }

    public void takeTurn() throws GameActionException {
        super.takeTurn();
        numRounds++;

        if (numDrones < 3) {
            if (tryBuild(RobotType.DELIVERY_DRONE, Util.randomDirection())) {
                numDrones++;
            }
        }
    }//TODO:
}
