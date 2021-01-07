package main.java.home.netology.collections.treeset.headhunter;

import main.java.home.netology.collections.treeset.headhunter.comparators.InterviewResultComparator;
import main.java.home.netology.collections.treeset.headhunter.comparators.RelevanceComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<Candidate> candidates = initTreeSet();

        while (true) {
            fillCandidatesBase(scanner, candidates);
            printSortedCandidates(candidates);
            break;
        }

    }

    private static void printSortedCandidates(TreeSet<Candidate> candidates) {
        System.out.println("Список кандидатов:");
        for (Candidate candidate : candidates) {
            System.out.printf("ФИО %s %s %s релевантность резюме %d оценка собеседования %d \n", candidate.getFirstName(),
                    candidate.getLastName(), candidate.getSurName(), candidate.getResumeRelevance(), candidate.getInterviewResult());
        }
    }

    private static TreeSet<Candidate> initTreeSet() {
        InterviewResultComparator interviewResultComparator = new InterviewResultComparator();
        RelevanceComparator relevanceComparator = new RelevanceComparator();
        return new TreeSet<>(relevanceComparator.thenComparing(interviewResultComparator));
    }

    private static void fillCandidatesBase(Scanner scanner, TreeSet<Candidate> candidates) {

        ArrayList<String> parsedDate;

        while (true) {
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):\n" +
                    "  Фамилия Имя Отчество, пол, возраст, релевантность резюме, оценка на собеседовании:");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            try {
                parsedDate = parseInputData(input);
            } catch (NumberFormatException ex) {
                System.err.println("Возраст, оценки - это числа. Пробелы в числа так же недопустимы. Повторите ввод");
                continue;
            } catch (IllegalArgumentException ex) {
                System.err.println(ex.getMessage());
                continue;
            }

            Candidate candidate = makeCandidate(parsedDate);
            candidates.add(candidate);

        }
    }

    private static Candidate makeCandidate(ArrayList<String> parsedDate) {
        CandidateBuilder candidateBuilder = new CandidateBuilder();
        String[] name = parsedDate.get(0).split(" ");
        String gender = parsedDate.get(1);
        byte age = Byte.parseByte(parsedDate.get(2));
        byte resumeRelevance = Byte.parseByte(parsedDate.get(3));
        byte interviewResult = Byte.parseByte(parsedDate.get(4));

        return candidateBuilder.withFirstName(name[0])
                .withLastName(name[1])
                .withSurName(name[2])
                .withGender(gender)
                .withAge(age)
                .withResumeRelevance(resumeRelevance)
                .withInterviewResult(interviewResult)
                .build();
    }

    private static ArrayList<String> parseInputData(String input) throws IllegalArgumentException, NumberFormatException {
        ArrayList<String> parsedData = new ArrayList<>(Arrays.asList(input.split(",")));
        validateCandidateData(parsedData);

        return parsedData;
    }

    private static boolean validateCandidateData(ArrayList<String> parsedData) throws IllegalArgumentException, NumberFormatException {

        if (parsedData.size() != 5) {
            throw new IllegalArgumentException("Вы указали не все параметры. Повторите ввод");
        }
        byte resumeRelevance = Byte.parseByte(parsedData.get(3));
        byte interviewResult = Byte.parseByte(parsedData.get(4));
        byte age = Byte.parseByte(parsedData.get(2));

        return true;
    }
}
