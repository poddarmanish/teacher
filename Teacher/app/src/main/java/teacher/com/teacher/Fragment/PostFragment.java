package teacher.com.teacher.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import teacher.com.teacher.Activity.MainActivity;
import teacher.com.teacher.R;

/**
 * Created by manish on 28/11/15.
 */
public class PostFragment extends Fragment{
    private MainActivity mContext;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.post_fragment, container, false);


        return view;

    }

}
