package mds.practice.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Birthdays {
    public static void main(String[] args) {
        Map<Friends, String> hm = new HashMap<Friends, String>();
        hm.put(new Friends("Nalan"), "Summer 2009");
        hm.put(new Friends("Chris"), "Spring 2002");
        Friends f = new Friends(args[0]);
        System.out.println(hm.get(f));
    }
}
class Friends {
    String name;

    Friends(String n) {
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friends friends = (Friends) o;
        return Objects.equals(name, friends.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
