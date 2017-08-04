package android.exapmple.com.myapptestfragmentm2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    public static ViewPager pager;
    private boolean noGuardianStatus;
    TextView textintwo;
//    public FragmentTwo() {
//        // Required empty public constructor
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        textintwo = (TextView) view.findViewById(R.id.textintwo);
        return view;
    }

    public static FragmentTwo newInstance(int page, boolean isLast, ViewPager pager) {
        FragmentTwo.pager =pager;
        Bundle args = new Bundle();
        args.putInt("page", page);
        if (isLast)
            args.putBoolean("isLast", true);
        final FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }

    //
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.noGuardianStatus = MainActivity.noGuardianStatus;
        if(textintwo != null){
            if(noGuardianStatus) textintwo.setVisibility(View.GONE);
            else textintwo.setVisibility(View.VISIBLE);
        }
    }

}
