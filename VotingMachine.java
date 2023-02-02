package Homework.hw2;

public class VotingMachine {

    private static int numberYesVotes;
    private static int numberNoVotes;
    private String issueVotedOn;

    public VotingMachine(int numberYesVotes, int numberNoVotes, String issueVotedOn)
    {
        this.numberYesVotes = 0;
        this.numberNoVotes = 0;
        this.issueVotedOn = issueVotedOn;
    }

    public static void voteYes()
    {
        numberYesVotes++;
    }

    public static void voteNo()
    {
        numberNoVotes++;
    }

    public static int returnYesCount()
    {
        return VotingMachine.numberYesVotes;
    }

    public static int returnNoCount()
    {
        return VotingMachine.numberNoVotes;
    }

    public static void clearMachine()
    {
        numberYesVotes = 0;
        numberNoVotes = 0;
    }

    public String toString()
    {
        return "There are " + numberYesVotes + " yes votes and " + numberNoVotes + " no votes.";
    }

}
