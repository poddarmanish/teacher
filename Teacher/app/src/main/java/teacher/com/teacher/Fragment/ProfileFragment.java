package teacher.com.teacher.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import teacher.com.teacher.Activity.MainActivity;
import teacher.com.teacher.R;

/**
 * Created by manish on 1/12/15.
 */
public class ProfileFragment extends Fragment {
    private View view;
    private MainActivity mContext;
    private int page;
    private static String title;

    public static ProfileFragment newInstance(int page , String Title){
        ProfileFragment profileFragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        profileFragment.setArguments(args);
        return profileFragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page =  getArguments().getInt("someint",2);
        title = getArguments().getString("Profile");
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.profile_fragment, container, false);


        return view;

    }

}
