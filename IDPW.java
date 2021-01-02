import java.util.*;

public class IDPW {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDPW(){
        //Add IDs and PWs here
        logininfo.put("Hello","World");
        logininfo.put("user","password");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }

}
