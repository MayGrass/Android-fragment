package tw.org.iii.android_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
    private View mainView;
    private TextView title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f2, container, false);
            title = mainView.findViewById(R.id.f2_title);
        }
        return mainView;
    }

    public void  chTitle(String newtitle) {
        title.setText(newtitle);
    }

}
