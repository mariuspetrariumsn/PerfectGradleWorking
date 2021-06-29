package viewportutils.sample.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import viewportutils.sample.ViewportUtilsSample;

public class DesktopLauncher
    {
        public static void main ( String[] arg )
            {
                System.out.println ( "DesktopLauncher.main() called -begin" );
                Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration ();
                config.setWindowSizeLimits ( 480 , 800 , 480 , 800 );
                new Lwjgl3Application ( new ViewportUtilsSample () , config );
                System.out.println ( "DesktopLauncher.main() called -end" );
            }
    }
