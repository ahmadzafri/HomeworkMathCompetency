import java.util.ArrayList;

public class ListOfSchool {

    String[] schoolList = new String[5];

    void keepName(String s, int index){
        schoolList[index-1] = s;

        System.out.println(schoolList[0]);
    }
}
