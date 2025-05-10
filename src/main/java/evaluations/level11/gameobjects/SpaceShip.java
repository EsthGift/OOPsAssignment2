package evaluations.level11.gameobjects;
import evaluations.level11.GameObject;
import evaluations.level11.Movable;
//
// package evaluations.level11.gameobjects;
// package evaluations.level11.gameobjects;

public class SpaceShip extends GameObject implements Movable{
    private String name;
    private int fuelLevel;
    private boolean isAlive;
    public SpaceShip(String  name, int fuelLevel, int positionX, int positionY){
        super(positionX,positionY);
        this.name=name;
        this.fuelLevel=fuelLevel;
        this.isAlive=true;
    }

    @Override
    public void moveUp() {
        if(fuelLevel >0){
            setPosition(getPositionX(),getPositionY() + 1);
            fuelLevel--;
        }
    }
    @Override
    public void moveDown() {
        if (fuelLevel > 0) {
            setPosition(getPositionX(), getPositionY() - 1);
            fuelLevel--;
        }
    }
    @Override
    public void moveLeft(){
        if (fuelLevel > 0) {
            setPosition(getPositionX() - 1, getPositionY());
            fuelLevel--;
        }
    }
    @Override
    public void moveRight(){
        if (fuelLevel > 0) {
            setPosition(getPositionX() + 1, getPositionY());
            fuelLevel--;
        }
    }
    public void displayStatus(){
        System.out.println(("The fuel level is: " + fuelLevel + "and the position is (" + getPositionX() + ", " + getPositionY() + ")"));
    }
    public void refuel(int amount){
        fuelLevel += amount;
    }
    @Override
    public void display(){
        System.out.println("Spaceship Name: " + name);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Position: (" + getPositionX() + ", " + getPositionY() + ")");
        System.out.println("Status: " + (isAlive ? "Alive" : "Destroyed"));
    }
}
