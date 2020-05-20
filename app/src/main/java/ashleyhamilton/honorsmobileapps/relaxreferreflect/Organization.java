package ashleyhamilton.honorsmobileapps.relaxreferreflect;

public class Organization {
    private String mTitle;
    private String mName;
    public Organization(String t, String n){
        mTitle=t;
        mName=n;
    }
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String t) {
        mTitle=t;
    }
    public String getName() {
        return mName;
    }

    public void setName(String n) {
        mName=n;
    }

}
