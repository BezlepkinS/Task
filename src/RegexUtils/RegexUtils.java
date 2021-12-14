package RegexUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    /**
     This method finds matches by pattern and returns list of matched items
     **/
    public static List<String> getListByPattern(String string, Pattern pattern){//находит совпадения по патерну и -->лист
        Matcher mather = pattern.matcher(string);//Находит совпадения по шаблону

        List<String> prices = new ArrayList<>();//Создали структуру данных ArrayList
        while (mather.find()){//Пока находятся совпадения, добавляем в лист
            prices.add(mather.group());
        }

        return prices;
    }

    public static boolean checkConditionByPattern(String string, Pattern pattern){
        Matcher matcher = pattern.matcher(string);
        return matcher.find();//Есть ли совпадение, возвращаем булевую логику
    }


    public static boolean isPasswordSave(String pass){//Проверка на безопасность пароля (Последнее задание)

        if (validatePassword(pass)) {
            Pattern passPattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}");
            Matcher passMatcher = passPattern.matcher(pass);
            return passMatcher.matches();
        }
        return false;
    }

    private static boolean validatePassword(String pass){//Проверка на наличие символов латинского алфавита, цифр и знака подчеркивания
        for (char ch : pass.toCharArray()){
            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '_')){
                return false;
            }
        }
        return true;
    }
}
