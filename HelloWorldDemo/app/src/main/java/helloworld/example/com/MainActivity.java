package helloworld.example.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Administrator on 4/22/2015.
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
