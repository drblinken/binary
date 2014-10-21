import greenfoot.*;

/**
 * This class creates a world for Kara. It contains settings for height and 
 * width of the world and initializes the Actors.
 * 
 * @author Marco Jakob (majakob@gmx.ch)
 * @version 1.3 (2012-07-04)
 */
public class KaraWorld extends World 
{   
    private static final int WORLD_WIDTH = 20;  // Number of horizontal cells
    private static final int WORLD_HEIGHT = 20;  // Number of vertical cells

    private static final int CELL_SIZE = 28; // Size of one cell

    /**
     * Creates a world for Kara.
     */
    public KaraWorld() 
    {
        // Create the new world
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);

        setPaintOrder(Kara.class, Tree.class, Mushroom.class, Leaf.class);
        Greenfoot.setSpeed(20);

        // Initialize actors
        prepare();
    }

    /**
     * Prepare the world, i.e. create all initial actors.
     * 
     * Hint:
     * First create and position all Actors with the mouse in the world.
     * Then right-click on the world and choose 'Save the World'. This will
     * automatically generate the content of this method.
     */
    private void prepare() 
    {

        KaraNumberCreator karanumbercreator = new KaraNumberCreator();
        addObject(karanumbercreator, 16, 6);
        karanumbercreator.turnLeft();
        karanumbercreator.turnLeft();
        Tree tree = new Tree();
        addObject(tree, 0, 6);
        KaraNumberCreator karanumbercreator2 = new KaraNumberCreator();
        addObject(karanumbercreator2, 16, 7);

        karanumbercreator2.turnLeft();
        karanumbercreator2.turnLeft();
        Tree tree2 = new Tree();
        addObject(tree2, 0, 7);

        MyKara mykara = new MyKara();
        addObject(mykara, 1, 5);

        mykara.setLocation(16, 8);

        mykara.turnLeft();
        mykara.turnLeft();
        Tree tree3 = new Tree();
        addObject(tree3, 0, 8);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, 15, 5);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2, 6, 5);
    }
}
