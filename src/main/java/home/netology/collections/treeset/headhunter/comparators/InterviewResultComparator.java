package main.java.home.netology.collections.treeset.headhunter.comparators;

import main.java.home.netology.collections.treeset.headhunter.Candidate;

import java.util.Comparator;

public class InterviewResultComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate candidate1, Candidate candidate2) {
        if (candidate1.getInterviewResult() + candidate1.getResumeRelevance() + candidate1.getAge() >
                candidate2.getInterviewResult() + candidate2.getResumeRelevance() + candidate2.getAge())
            return -1;
        else if (candidate1.getInterviewResult() + candidate1.getResumeRelevance()  + candidate1.getAge() <
                candidate2.getInterviewResult() + candidate2.getResumeRelevance() + candidate2.getAge())
            return 1;
        else
            return 0;
    }
}
