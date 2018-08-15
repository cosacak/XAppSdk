package cosacak.com.xapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import cosacak.com.xappmodule.XAppDataProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> dataList = XAppDataProvider.parse("erer");

        for (int i = 0; i < dataList.size() ; i++)
        {
            Log.i("Test", dataList.get(i).toString() );

        }
    }
}
