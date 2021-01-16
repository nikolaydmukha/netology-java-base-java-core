package home.javamentor.roles;

import java.util.ArrayList;

public class RolesParser {
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "ЯЯЯЯЯ"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Артемий Филиппович: Вот не было заботы, так подай11111111111!",
                "Аммос Федорович: Вот те Городничий: на!111111111111112",
                "Артемий Филиппович: Вот не было заботы, так подай!2222222222221",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!1111111111111111"

        };
        rolesParser(roles, textLines);
    }

    public static String rolesParser(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> roleAndText = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < roles.length; i++) {
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].substring(0, textLines[j].indexOf(":")).equals(roles[i]) && (j < textLines.length)) {
                    int m = j + 1;
                    roleAndText.add(m + ")" + textLines[j]);
                    k++;
                } else if (j == textLines.length) {
                    int m = j + 1;
                    roleAndText.add(m + ")" + roles[i]);
                    k++;
                }
            }
        }
        System.out.println(roleAndText);
        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i] + ":\n");
            for (int j = 0; j < roleAndText.size(); j++) {
                if ((roleAndText.get(j) != null) && roleAndText.get(j).substring(roleAndText.get(j).indexOf(")") + 1, roleAndText.get(j).indexOf(":")).equals(roles[i])) {
                    result.append(roleAndText.get(j).replaceFirst(roles[i], "").replaceFirst(":", "")).append("\n");
                }
            }
            result.append("\n");
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
