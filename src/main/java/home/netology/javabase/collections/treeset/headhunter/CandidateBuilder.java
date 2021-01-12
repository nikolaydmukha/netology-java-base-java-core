package main.java.home.netology.javabase.collections.treeset.headhunter;

public class CandidateBuilder {
    Candidate newCandidate;

    public CandidateBuilder() {
        this.newCandidate = new Candidate();
    }

    public CandidateBuilder withFirstName(String firstName) {
        newCandidate.firstName = firstName;
        return this;
    }

    public CandidateBuilder withLastName(String lastName) {
        newCandidate.lastName = lastName;
        return this;
    }

    public CandidateBuilder withSurName(String surName) {
        newCandidate.surName = surName;
        return this;
    }

    public CandidateBuilder withGender(String gender) {
        newCandidate.gender = gender;
        return this;
    }

    public CandidateBuilder withAge(byte age) {
        newCandidate.age = age;
        return this;
    }

    public CandidateBuilder withResumeRelevance(byte resumeRelevance) {
        newCandidate.resumeRelevance = resumeRelevance;
        return this;
    }

    public CandidateBuilder withInterviewResult(byte interviewResult) {
        newCandidate.interviewResult = interviewResult;
        return this;
    }

    public Candidate build(){
        return newCandidate;
    }
}
