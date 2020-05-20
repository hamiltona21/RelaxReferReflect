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
        orgs.add(new Organization("Family and Consumer Sciences Programs", "4-H National Headquarters/NIFA", "https://nifa.usda.gov/office/division-family-consumer-sciences"));
        orgs.add(new Organization("Mental Health Speakers", "Active Minds", "https://www.activeminds.org/programs/am-speakers/"));
        orgs.add(new Organization("Child and Teen Psychiatrist Finder", "American Academy of Child and Adolescent Psychiatry", "https://www.aacap.org/aacap/Families_and_Youth/Resources/CAP_Finder.aspx"));
        orgs.add(new Organization("Symptom Checker", "Child Mind Institute", "https://childmind.org/symptomchecker/"));
        orgs.add(new Organization("Resources for Campus Professionals ", "The Jed Foundation", "https://www.jedfoundation.org/?s=Resources+for+campus+professionals"));
        orgs.add(new Organization("Online Learning Center", "NCCTS", "https://learn.nctsn.org/"));
        orgs.add(new Organization("Fact Sheets", "National Federation of Families for Children's Mental Health", "https://www.ffcmh.org/resources/families"));
        orgs.add(new Organization("Educator and Parent Resources", "The Trevor Project", "https://www.thetrevorproject.org/education/"));
        orgs.add(new Organization("Find a Local Chapter", "Youth M.O.V.E. National", "https://www.thetrevorproject.org/education/"));
        orgs.add(new Organization("Commission on Youth at Risk", "American Bar Association", "https://www.americanbar.org/groups/public_interest/child_law/staff1/commission-on-youth-at-risk/"));
        mAdapter=new OrganizationAdapter(orgs);
        mRecyclerView.setAdapter(mAdapter);
    }
}
