package tw.org.iii.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;
    private FragmentManager fmgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1(); f2 = new F2(); f3 = new F3(); f4 = new F4();

        fmgr = getSupportFragmentManager();
        FragmentTransaction transaction = fmgr.beginTransaction();
        //交易機制
        transaction.add(R.id.container,f1);
        transaction.commit();
    }

    public void toF1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }

    public void toF2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }

    public void toF3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }

    public void toF4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f4);
        transaction.commit();
    }

}
