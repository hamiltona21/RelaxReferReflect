package ashleyhamilton.honorsmobileapps.relaxreferreflect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ReferActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private OrganizationAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer);
        mRecyclerView=(RecyclerView)findViewById(R.id.myRecyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        ArrayList<Organization> orgs = new ArrayList<>();
        orgs.add(new Organization("Family and Consumer Sciences Programs", "4-H National Headquarters/NIFA"));
        orgs.add(new Organization("Mental Health Speakers", "Active Minds"));
        orgs.add(new Organization("Child and Teen Psychiatrist Finder", "American Academy of Child and Adolescent Psychiatry"));
        orgs.add(new Organization("Symptom Checker", "Child Mind Institute"));
        orgs.add(new Organization("Resources for Campus Professionals ", "The Jed Foundation"));
        orgs.add(new Organization("Online Learning Center", "NCCTS"));
        orgs.add(new Organization("Fact Sheets", "National Federation of Families for Children's Mental Health"));
        orgs.add(new Organization("Educator and Parent Resources", "The Trevor Project"));
        orgs.add(new Organization("Find a Local Chapter", "Youth M.O.V.E. National"));
        orgs.add(new Organization("Commission on Youth at Risk", "Health Law Section"));
        mAdapter=new OrganizationAdapter(orgs);
        mRecyclerView.setAdapter(mAdapter);
    }
}
