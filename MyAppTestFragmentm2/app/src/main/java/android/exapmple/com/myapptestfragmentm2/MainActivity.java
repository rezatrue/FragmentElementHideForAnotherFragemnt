package android.exapmple.com.myapptestfragmentm2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity implements FragmentOne.MyPakageListener{
    public ViewPager pager;
    public static boolean noGuardianStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        assert pager != null;
        pager.setAdapter(new EmptyPagerAdapter(getSupportFragmentManager(), pager));
    }

    @Override
    public void getGuardianStatus(boolean noGuardianStatus) {
        Log.e("noGuardianStatus", "--Main--" + noGuardianStatus);
            this.noGuardianStatus = noGuardianStatus;
    }
}
