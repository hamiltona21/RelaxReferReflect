package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrganizationAdapter extends RecyclerView.Adapter<OrganizationViewHolder> {
    private ArrayList<Organization> mOrgs;
    public OrganizationAdapter(ArrayList<Organization> orgs){
        mOrgs=orgs;
    }
    @Override
    public OrganizationViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View rootView=layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        OrganizationViewHolder newViewHolder=new OrganizationViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(OrganizationViewHolder currentViewHolder, int position){
        Organization currentOrg=mOrgs.get(position);
        currentViewHolder.bindOrganization(currentOrg);
    }
    @Override
    public int getItemCount(){
        return mOrgs.size();
    }
}
