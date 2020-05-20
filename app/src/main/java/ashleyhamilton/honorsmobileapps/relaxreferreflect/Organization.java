package ashleyhamilton.honorsmobileapps.relaxreferreflect;

public class Organization {
    private String mTitle;
    private String mName;
    private String mUrl;
    public Organization(String t, String n, String u){
        mTitle=t;
        mName=n;
        mUrl=u;
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
    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String u) {
        mUrl=u;
    }

}
