/*
 * Tictac83App.java
 */

package tictac83;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Tictac83App extends SingleFrameApplication {
    public Tictac83App(){}
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Tictac83View(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Tictac83App
     */
    public static Tictac83App getApplication() {
        return Application.getInstance(Tictac83App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Tictac83App.class, args);
    }
}
