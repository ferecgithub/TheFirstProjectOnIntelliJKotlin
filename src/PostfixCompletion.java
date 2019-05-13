import java.util.Collection;

public class PostfixCompletion {

    public void methodA(Collection<String> list) {
        for (String temp : list) {

        }

        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        synchronized (list) {

        }

        try {
            list.add("Course");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (list == null) {

        }

        if (list != null) {

        }


    }
}
