package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

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
        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(1000, 2000);
        roof.moveHorizontal(75);
        roof.moveVertical(-200);
        roof.makeVisible();

        wall = new Square();
        wall.moveVertical(110);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(130);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(100);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(215);
        sun.moveVertical(200);
        sun.changeSize(40);
        sun.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(-5);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(5);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(15);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(-15);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(25);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(35);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(45);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(55);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(65);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(75);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(85);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(-25);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(-35);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(-45);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(95);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(105);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(105);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(115);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(125);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(135);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(145);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(155);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(165);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(175);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(185);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(195);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(205);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(215);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(225);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(235);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(175, 80);
        roof.moveHorizontal(245);
        roof.moveVertical(220);
        roof.makeVisible();

        roof = new Triangle(); //trackor beam
        roof.changeColor("magenta");
        roof.changeSize(140, 80);
        roof.moveHorizontal(195);
        roof.moveVertical(155);
        roof.makeVisible();

        roof = new Triangle();//Spaceship
        roof.changeSize(40, 120);
        roof.moveHorizontal(195);
        roof.moveVertical(155);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(206);
        sun.moveVertical(180);
        sun.changeSize(40);
        sun.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
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
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
