import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split(", +"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"course start".equals(input)) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            if ("Add".equals(command)) {
                if (!courses.contains(lessonTitle)) {
                    courses.add(lessonTitle);
                }
            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(tokens[2]);
                if (!courses.contains(lessonTitle)) {
                    courses.add(index, lessonTitle);
                }
            } else if ("Remove".equals(command)) {
                String nameOfExercise = lessonTitle + "-Exercise";
                if (courses.contains(lessonTitle)) {
                    int indexOfExerciseToRemove = courses.indexOf(lessonTitle);
                    courses.remove(lessonTitle);
                    if (courses.contains(nameOfExercise)) {
                        courses.remove(indexOfExerciseToRemove);
                    }
                }
            } else if ("Swap".equals(command)) {
                String swapLessonTitle = tokens[2];
                String nameOfExercise = lessonTitle + "-Exercise";
                String swapNameOfExercise = swapLessonTitle + "-Exercise";

                if (courses.contains(lessonTitle) && courses.contains(swapLessonTitle)) {
                    int indexOfLessonTitle = courses.indexOf(lessonTitle);
                    int indexOfLessonTitleSwap = courses.indexOf(swapLessonTitle);
                    courses.set(indexOfLessonTitle, swapLessonTitle);
                    courses.set(indexOfLessonTitleSwap, lessonTitle);

                    if (courses.contains(nameOfExercise) && courses.contains(swapNameOfExercise)) {
                        int indexOfExersice = courses.indexOf(nameOfExercise);
                        int indexOfSwapExersise = courses.indexOf(swapNameOfExercise);
                        courses.set(indexOfExersice, swapNameOfExercise);
                        courses.set(indexOfSwapExersise, nameOfExercise);

                    } else if (courses.contains(swapNameOfExercise)){
                        courses.remove(swapNameOfExercise);
                        courses.add(indexOfLessonTitle + 1, swapNameOfExercise);

                }

                }
            } else if ("Exercise".equals(command)) {
                String nameOfExercise = lessonTitle + "-Exercise";
                if (courses.contains(lessonTitle) && !courses.contains(nameOfExercise)) {
                    int indexOfLessonTitle = courses.indexOf(lessonTitle);
                    courses.add((indexOfLessonTitle + 1), nameOfExercise);
                } else if (!courses.contains(lessonTitle)) {
                    courses.add(lessonTitle);
                    courses.add(nameOfExercise);
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i + 1 + "." + courses.get(i));

        }
    }
}
