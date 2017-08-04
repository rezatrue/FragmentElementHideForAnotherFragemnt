package android.exapmple.com.myapptestfragmentm2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
    public class FragmentOne extends Fragment {
    RadioButton radioShow, radioHide;
    Button btn;
    public static ViewPager pager;

    private MyPakageListener myPakageListener;

//    public FragmentOne() {
//        // Required empty public constructor
//    }

    public static FragmentOne newInstance(int page, boolean isLast, ViewPager pager) {
        FragmentOne.pager =pager;
        Bundle args = new Bundle();
        args.putInt("page", page);
        if (isLast)
            args.putBoolean("isLast", true);
        final FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        radioShow = (RadioButton) view.findViewById(R.id.radioShow);
        radioHide = (RadioButton) view.findViewById(R.id.radioHide);
        btn = (Button) view.findViewById(R.id.btn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        myPakageListener = (MyPakageListener) getContext();

        radioShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPakageListener.getGuardianStatus(false);
            }
        });
        radioHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPakageListener.getGuardianStatus(true);
            }
        });

    }



    public interface MyPakageListener{
        void getGuardianStatus(boolean noGuardianStatus);
    }

}
