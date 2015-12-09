package teacher.com.teacher.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import teacher.com.teacher.Activity.MainActivity;
import teacher.com.teacher.Adapter.ArticleAdapter;
import teacher.com.teacher.R;

/**
 * Created by manish on 28/11/15.
 */
public class ArticlesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ArticleAdapter mAdapter;
    private MainActivity mContext;
    private View view;
    private int page;
    private static String title;



    public static ArticlesFragment newInstance(int page , String Title){
        ArticlesFragment articlesFragment = new ArticlesFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        articlesFragment.setArguments(args);
        return articlesFragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page =  getArguments().getInt("someint",0);
        title = getArguments().getString("Trending");
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.articles_fragment, container, false);


        mRecyclerView = (RecyclerView) view.findViewById(R.id.articleList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new ArticleAdapter();

        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        return view;

    }

}
