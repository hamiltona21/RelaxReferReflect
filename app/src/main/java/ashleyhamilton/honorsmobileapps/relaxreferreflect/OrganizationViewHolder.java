package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class OrganizationViewHolder extends RecyclerView.ViewHolder {
    private TextView mTitleTextView;
    private TextView mNameTextView;
    private Organization mOrg;
    public OrganizationViewHolder(View rootView){
        super(rootView);
        mTitleTextView=rootView.findViewById(R.id.textViewTitle);
        mNameTextView=rootView.findViewById(R.id.textViewName);
    }
    public void bindOrganization(Organization o){
        mOrg=o;
        mTitleTextView.setText(mOrg.getTitle());
        mNameTextView.setText(mOrg.getName());
    }
}
