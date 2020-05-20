package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class OrganizationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView mTitleTextView;
    private TextView mNameTextView;
    private Organization mOrg;
    public OrganizationViewHolder(View rootView){
        super(rootView);
        rootView.setOnClickListener(this);
        mTitleTextView=rootView.findViewById(R.id.textViewTitle);
        mNameTextView=rootView.findViewById(R.id.textViewName);
    }
    public void bindOrganization(Organization o){
        mOrg=o;
        mTitleTextView.setText(mOrg.getTitle());
        mNameTextView.setText(mOrg.getName());
    }

    @Override
    public void onClick(View v) {
        Context mContext=v.getContext();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mOrg.getUrl()));
        mContext.startActivity(browserIntent);
    }
}
