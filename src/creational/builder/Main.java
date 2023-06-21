package creational.builder;

public class Main {

    public static void main(String[] args) {
        RobotEngineer robotEngineer = new RobotEngineer();
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built...");
        System.out.println("Robot Head type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms type: " + firstRobot.getRobotArms());
        System.out.println("Robot Legs type: " + firstRobot.getRobotLegs());
    }
}
