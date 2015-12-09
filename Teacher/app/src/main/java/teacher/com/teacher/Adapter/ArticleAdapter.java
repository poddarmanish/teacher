package teacher.com.teacher.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import teacher.com.teacher.R;

/**
 * Created by manish on 28/11/15.
 */
public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.CustomViewHolder>{

    private Context mContext;
    @Override
    public ArticleAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_row,parent, false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ArticleAdapter.CustomViewHolder holder, int position) {
        holder.title.setText("First post with first heading and it also has a description, so please read it");
        holder.description.setText("This is the short description of the first post");

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected RelativeLayout mainContainer;
        protected LinearLayout post;
        protected TextView title,description;

        public CustomViewHolder(View view) {
            super(view);
            this.mainContainer=(RelativeLayout) view.findViewById(R.id.main_container);
            this.post = (LinearLayout) view.findViewById(R.id.post);
            this.title = (TextView) view.findViewById(R.id.heading);
            this.description = (TextView) view.findViewById(R.id.description);
        }
    }
}
