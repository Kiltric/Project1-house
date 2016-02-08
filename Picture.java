/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square sky;
    private Circle earthorbit;
    private Circle earthorbitcover;
    private Circle earth;
    private Circle sun;
    private Circle moon;
    private Circle moonshadow;
    private Person alien;

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
        sky = new Square();
        sky.changeColor("black");
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeSize(500);
        sky.makeVisible();
        
        earthorbit = new Circle();
        earthorbit.changeColor("red");
        earthorbit.moveHorizontal(-100);
        earthorbit.moveVertical(-40);
        earthorbit.changeSize(200);
        earthorbit.makeVisible();
        
        earthorbitcover = new Circle();
        earthorbitcover.changeColor("black");
        earthorbitcover.moveHorizontal(-98);
        earthorbitcover.moveVertical(-38);
        earthorbitcover.changeSize(196);
        earthorbitcover.makeVisible();
        
        earth = new Circle();
        earth.changeColor("blue");
        earth.moveHorizontal(70);
        earth.moveVertical(-5);
        earth.changeSize(30);
        earth.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-30);
        sun.moveVertical(20);
        sun.changeSize(68);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(90);
        moon.moveVertical(-25);
        moon.changeSize(15);
        moon.makeVisible();
        
        moonshadow = new Circle();
        moonshadow.changeColor("black");
        moonshadow.moveHorizontal(93);
        moonshadow.moveVertical(-23);
        moonshadow.changeSize(15);
        moonshadow.makeVisible();
        
        alien = new Person();
        alien.changeColor("green");
        alien.changeSize(20, 10);
        alien.moveHorizontal(47);
        alien.moveVertical(-138);
        alien.makeVisible();
    }
}
