import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-_][A-Za-z]+)+))(\\b|(?=\\s))";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

//        1 . (^|(?<=\s)) (positive lookBehind)- Искаме да проверим дали има начало на стринг ИЛИ ( " | ") дали има празно място (това прави първа група)
//        2.   ([a-zA-Z0-9]+)([\.\-_]?)([A-Za-z0-9]+)(@)  - търсим :
//        (дума , която съдържа букви и цифри)
//        (после търсим някой от разрешените символи АКО има някое от тях , затова използваме "?")
//        (после пак дума , която съдържа букви и цифри)
//        тука броя на думите може да бъде 1
//        3. (слагаме @)
//        4. ([a-zA-Z]+([\.\-_][A-Za-z]+)+) - започваме с търсенето на дума ,
//              но задължително след първата дума трябва да има някой от разрешените символи "." ,
//              "-" или "_" , иначе ще имаш грешката да имаш само една дума , а по условие се искат
//               поне 2 думи и между тях да има един от разрешените символи и накрая domain - a (.bg , .net  и т.н).
//                  например: @mail.uu.net
//                ([a-zA-Z]+([\.\-_][A-Za-z]+)+) - плюсът е важен за група 8 ,
//                              тъй като търси още съвпадения ... това ти позволява да имаш маркираш още думи ,
//                               но задължително да започват със един от разрешените символи
//        5. (\b|(?=\s)) (positive lookAhead)  Същото като 1. - търси за boundery \b
//
// (?!) - negative lookahead
// (?=) - positive lookahead
// (?<=) - positive lookbehind
// (?<!) - negative lookbehind
    }
}
