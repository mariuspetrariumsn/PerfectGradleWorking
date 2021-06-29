package viewportutils.sample;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class ViewportUtilsSample extends ApplicationAdapter
    {
        private static final float         WORLD_WIDTH  = 6;
        private static final float         WORLD_HEIGHT = 10;
        private              Viewport      viewport;
        private              ShapeRenderer renderer;

        @Override
        public void create ()
            {
                OrthographicCamera camera = new OrthographicCamera ();
                viewport = new FitViewport ( WORLD_WIDTH , WORLD_HEIGHT , camera );
                renderer = new ShapeRenderer ();
            }

        @Override
        public void resize ( int width , int height )
            {
                viewport.update ( width , height , true );
            }

        @Override
        public void render ()
            {
                GdxUtils.clearScreen ();
                ViewportUtils.drawGrid ( viewport , renderer , 1 );
                //                ViewportUtils.drawGrid ( viewport , renderer );
            }

        @Override
        public void dispose ()
            {
                renderer.dispose ();
            }
    }
