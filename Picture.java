/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square field;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Person person1;
    private Person person2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        field= new Square();
        field.changeColor("green");
        field.moveHorizontal(-500);
        field.moveVertical(50);
        field.changeSize(800);
        field.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(120);
        sun.makeInvisible();
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.changeSize(40);
        moon.moveHorizontal(-150);
        moon.moveVertical(-20);
        moon.makeVisible();
    }

    public void amanecer()
    {
        moon.makeInvisible();
        sun.makeVisible();
        sun.slowMoveVertical(-120);
        person1 = new Person();
        person1.moveVertical(0);
        person1.moveHorizontal(-300);
        person1.makeVisible();
        person1.slowMoveHorizontal(150);
        person2 = new Person();
        person2.moveVertical(0);
        person2.moveHorizontal(200);
        person2.makeVisible();
        person2.slowMoveHorizontal(-150);
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
