package tw.org.iii.android_fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    private View mainView;
    private TextView lottery;
    private Button btnLottery;
    private Button btnTest2;
    private Button btnTest3;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Log.v("DCH","F1"); 每次呼叫都會從新執行一次
        //mainView初始是null，執行一次後就不再重新執行
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);

            lottery = mainView.findViewById(R.id.f1_lottery);
            btnLottery = mainView.findViewById(R.id.f1_btn);
            btnLottery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lottery.setText("" + (int) (Math.random() * 49 + 1));
                }
            });

            btnTest2 = mainView.findViewById(R.id.f1_btn2);
            btnTest2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.setMyTitle("Hi, It's a new title");
                }
            });

            btnTest3 = mainView.findViewById(R.id.f1_btn3);
            btnTest3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.getF2().chTitle("New New Title2");
                }
            });

        }
        return mainView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*
        if (context instanceof MainActivity) {
            Log.v("DCH","OH YA");
        }*/
        mainActivity = (MainActivity)context;
    }
}
