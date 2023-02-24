package org.example;

import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {
    protected Map<String, String> loginInfo;

    public IDandPasswords() {
        loginInfo = new HashMap<>();
    }

    protected Map<String, String> getLoginInfo() {
        return loginInfo;
    }


}
